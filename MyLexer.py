listaTokens =[]

palClaves={"Get","next","input","Put","to","output","if","elseif","else","while",
"for","integer","float","array","Function","returns","SquareRoot","RaiseToPower","AbsoluteValue",
"RandomNumber","SeedRandomNumbers","with","decimal","places","size","Main","or","and","nothing","not","evaluates"}


simbolos={
        ".":"tkn_period",
        ",":"tkn_comma",
        ";":"tkn_semicolon",
        "[":"tkn_opening_bra",
        "]":"tkn_closing_bra",
        "(":"tkn_opening_par",
        ")":"tkn_closing_par",
        "?":"tkn_question_mark"
}

operadores={
    "=":"tkn_assign",
    "+":"tkn_plus",
    "-":"tkn_minus",
    "*":"tkn_times",
    "/":"tkn_div",
    "%":"tkn_mod",
    "==":"tkn_equal",
    "!=":"tkn_neq",
    "<":"tkn_less",
    ">":"tkn_greater",
    ">=":"tkn_geq",
    "<=":"tkn_leq",
    }
ilegales={
        "ñ",
        "á", 
        "é",
        "í",
        "ó",
        "ú",
        "ü",
        "ç",
}
        
def Classify(buffer,fila,columna):
    currCol=(columna-len(buffer))+1
    if buffer.isnumeric():
       if "." in buffer:
        listaTokens.append(["tkn_float",buffer,fila,currCol])
       else:
        listaTokens.append(["tkn_integer",buffer,fila,currCol])
    elif buffer in simbolos:
        listaTokens.append(["simbol",simbolos[buffer],fila,currCol])
    elif buffer in operadores:
        listaTokens.append(["operator",operadores[buffer],fila,currCol])
    elif buffer[0].isalpha() and buffer[0] not in ilegales:
        if buffer in palClaves:
            listaTokens.append(["pal_clave",buffer,fila,currCol])
        else:
            listaTokens.append(["id",buffer,fila,currCol])
    elif buffer[0]=="\"" and buffer[-1]=="\""  and len(buffer)>1 and buffer[-2]!="\\":
        if len(buffer)>2:
            if(buffer[-2]!="\\"):
                buffer=buffer[1:]
                buffer=buffer[:-1]
                listaTokens.append(["tkn_str",buffer,fila,currCol])
            else:
                print(">>> Error lexico (","linea: ",fila,", posicion: ",currCol,")",sep="")
                quit()
        else:
            buffer=buffer[1:]
            buffer=buffer[:-1]
            listaTokens.append(["tkn_str",buffer,fila,currCol])

    else:
        try:
            float(buffer)
            listaTokens.append(["tkn_float",buffer,fila,currCol])
        except ValueError:
            print(">>> Error lexico (","linea: ",fila,", posicion: ",currCol,")",sep="")
            quit()

def Tokenize(linea,fila,columna):
    #Buffer es quien usaremos para clasificar el token, o arrojar error.
    buffer=""
    #Este es para ver si el numero ya tiene un punto decimal
    alreadyDot=False
    #Guarda la columna en donde empieza el token
    tokenCol=0
    
    while True:
        #Primero, revisar que la fila no sea vacia.
        if columna<len(linea):
            #Si es espacio, arrojar el buffer, y empezar a leer lo que siga.
            if linea[columna]==" " and buffer!="" and buffer[0]!="\"":
                Classify(buffer,fila,columna)
                buffer=""
                alreadyDot=False
                #Si el espacio no esta al final, pasar a la siguiente columna
                if columna<len(linea)-1:
                    columna+=1
                #Si esta al final, pasar a la siguiente linea
                else:
                    return True
            if linea[columna]==" " and buffer =="":
                if columna<len(linea)-1:
                   columna+=1
                else: 
                    return True
            #Si lo que llega no es espacio, y el buffer esta vacio
            #llenar la primer posicion del buffer
            elif buffer =="" and linea[columna]!=" ":
                 buffer+=linea[columna]
                 tokenCol=columna
                 columna+=1
            #Aqui es donde se empieza a leer y a clasificar.
            else:
                if buffer[0].isnumeric():
                    if linea[columna].isnumeric():
                        #Si el siguiente en llegar es numero, guardelo en buffer y siga.
                        buffer+=linea[columna]
                        columna+=1
                    #Si llega un punto, ver si le siguen numeros
                    #Si, guardar el punto dentro de buffer
                    #Si no, punto es token aparte
                    elif linea[columna]=="." and alreadyDot==False:
                        if(columna<len(linea)-1):
                            if linea[columna+1].isnumeric():
                                buffer+=linea[columna]
                                alreadyDot=True
                                columna+=1
                            else:
                                Classify(buffer,fila,columna)
                                buffer=""
                                buffer+=linea[columna]
                                alreadyDot=False
                                columna+=1 
                        else:
                            Classify(buffer,fila,columna)
                            buffer=""
                            buffer+=linea[columna]
                            Classify(buffer,fila,columna+1)
                            alreadyDot=False
                            return True
                    elif alreadyDot or linea[columna].isnumeric()==False:
                        Classify(buffer,fila,columna)
                        buffer=""
                        buffer+=linea[columna]
                        alreadyDot=False
                        columna+=1
                #Ahora revisar si es simbolo u operador.
                elif buffer[0] in operadores or buffer[0]=="!":
                    #Si actual tambien es operador
                    if linea[columna] in operadores:
                        if buffer+linea[columna] in operadores:
                            buffer+=linea[columna]
                            columna+=1
                        else:
                            #REVISAR ESTO CON MUCHO CUIDADO!
                            if buffer[0]=="!" and buffer[1] not in operadores:
                                print(">>> Error lexico (","linea: ",fila,", posicion: ",tokenCol,")",sep="")
                                return False
                            else:
                                Classify(buffer,fila,columna)
                                buffer=""
                                buffer+=linea[columna]
                                columna+=1
                    else:
                        Classify(buffer,fila,columna)
                        buffer=""
                        buffer+=linea[columna]
                        columna+=1 
                #Revisar simbolos
                elif buffer[0] in simbolos:
                     Classify(buffer,fila,columna)
                     buffer=""
                     buffer+=linea[columna]
                     columna+=1
                #Revisar letras, ver si es palabra reservada, si no, identificador. 
                elif buffer[0].isalpha() and buffer[0] not in ilegales:
                    if (linea[columna]=="_" or linea[columna].isalpha() or linea[columna].isnumeric()) and linea[columna]!=" " and linea[columna] not in ilegales:
                        buffer+=linea[columna]
                        columna+=1
                    else:
                        #Aqui sale el token, por tanto, se debe clasificar.
                        #Si es palabra reservada
                        if buffer in palClaves:
                            Classify(buffer,fila,columna)
                            buffer=""
                            buffer+=linea[columna]
                            columna+=1
                        #Si no
                        else:
                            Classify(buffer,fila,columna)
                            buffer=""
                            buffer+=linea[columna]
                            columna+=1
                #Detectar si es un string, llenar todo, ignorando las comillas
                elif buffer[0]=="\"":
                    if columna<len(linea)-1:
                        #Llenar lo que sea hasta encontrar las otras comillas.
                        if linea[columna]=="\\" and linea[columna+1]=="\"":
                            buffer+=linea[columna]
                            buffer+=linea[columna+1]
                            columna+=2
                        elif linea[columna]=="\"" and not buffer[-1]=="\\":
                            buffer+=linea[columna]
                            Classify(buffer,fila,columna)
                            buffer=""
                            columna+=1
                        elif linea[columna]!="\"":
                             buffer+=linea[columna]
                             columna+=1
                    else:
                        if linea[columna]!="\"":
                            print(">>> Error lexico (","linea: ",fila,", posicion: ",(columna-len(buffer))+1,")",sep="")
                            return False
                        elif linea[columna]=="\"" and linea[columna-1]!="\\":
                            buffer+=linea[columna]
                            Classify(buffer,fila,columna)
                            buffer=""
                            columna+=1
                            return True
                elif linea[columna] in ilegales and buffer[0]!="\"":
                    print(">>> Error lexico (","linea: ",fila,", posicion: ",columna,")",sep="")
                    return False            
                else:
                    print(">>> Error lexico (","linea: ",fila,", posicion: ",columna,")",sep="")
                    return False            

                        
        else:
            #Aqui, debemos clasificar el ultimo buffer guardado, segun parece.
            Classify(buffer,fila,columna)
            buffer=""
            return True


def isDeclaration(listaTokens,tokenIndex):
    jumper=tokenIndex
    if(listaTokens[jumper][1]=="integer" or listaTokens[jumper][1]=="float"):
        jumper+=1
        if(listaTokens[jumper][0]=="id"):
            jumper+=1
            return True,jumper
        else:
            return False,0
    else:
        return False,0

#0 Tipo
#1 Value
#2 Fila
#3 Columna
def parserize(listaTokens):
    #Multiples Universos
    flag=True
    tokenIndex=0
    offset=0
    question=False
    while flag and tokenIndex<len(listaTokens):
        #Detect declaration
        question,offset=isDeclaration(listaTokens,tokenIndex)
        if(question):
            print("Offset:",offset)
            tokenIndex=offset
        else:
            print("not declaration",listaTokens[tokenIndex])
            tokenIndex+=1
    print("El analisis sintactico ha finalizado exitosamente.")
    return 1




flag=True
fila=1
checker=""
comment=False
#python es mas flexible, mejor tratamiento string y char array
while flag:
    try:
        linea=input()
        comment=False
        if len(linea)>=2:
            checker=linea
            checker=checker.lstrip()
            if len(checker)>=2:
                if(checker[0]=="/" and checker[1]=="/"):
                    comment=True
            if len(linea)>0 and not comment:
                flag=Tokenize(linea,fila,0)
                fila+=1
            else:
                if len(linea)<=0 or comment:
                    fila+=1
        else:
            if len(linea)>0:
                flag=Tokenize(linea,fila,0)
                fila+=1
            else:
                fila+=1

    except EOFError as e:
        parserize(listaTokens)
        quit()
    