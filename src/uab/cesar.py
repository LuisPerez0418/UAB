
import string


abc = []

for i in range(65, 91):
    abc.append(chr(i))


for i in range(97, 127):
    
    
    
    
    
    
    
    
    abc.append(chr(i))
    

palabra = input("Digite El mensaje Olculto \n")

correrse = int(input("Digite El CORRIMIENTO \n"))
word = ""
for i in range(len(palabra)):
    for j in range(len(abc)):
        if palabra[i]==abc[j]:
            letraFinal = j-correrse
            word +=abc[letraFinal]
print(word)

