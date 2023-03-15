option=""
precioBT=5000000
diccionario={}

while (option!=0):
    option=(input("MENU \n1-Entrar\n2-Salir\n"))
    
    if option=="1":
        
        optionTemporada= (input("Digite la temporada en las que vas a  volar ")).lower()
        optionCompañia= (input("Digite la compañia en la que va volar ")).lower()
        optionEdad = int(input("Digite su edad "))
        optionEstudiante = (input("Digite Si es estudiante o no ")).lower()
        if(optionTemporada=="alta"):
            if(optionCompañia=="volar"):
                precioBT= precioBT * (1 + 0.2)
                if(optionEdad<18):
                    precioBT= precioBT/2
                elif(optionEdad>60):
                    precioBT+=100000
            elif(optionCompañia=="alas"):
                precioBT= precioBT * (1 + 0.3)
                if(optionEdad<18):
                    precioBT= precioBT/2
            diccionario["temporada"] = optionTemporada
            diccionario["compania"] = optionCompañia
            diccionario["edad"] = optionEdad
            diccionario["estudiante"] = optionEstudiante  
            print(precioBT)             
                
        elif(optionTemporada=="baja"):
            
            if(optionCompañia=="volar"):
                
                if(optionEdad<18):
                    precioBT= precioBT/2
                elif(optionEdad>60):
                    precioBT+=100000
            elif(optionCompañia=="alas"):
                
                if(optionEdad<18):
                    precioBT= precioBT/2
                elif(optionEdad>18):
                    descuento = precioBT*0.1
                    precioBT= precioBT-descuento
                    
                
            diccionario["temporada"] = optionTemporada
            diccionario["compania"] = optionCompañia
            diccionario["edad"] = optionEdad
            diccionario["estudiante"] = optionEstudiante 
            print(precioBT)   
        
        
    if option=="2":
        print("Gracias Hasta la proxima")
        break
    if (option!="1" and option!="2"):
        print("Fuera del menu")
