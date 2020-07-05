def NumeroPerfecto(num):
    num_list = []
    suma = 0
    ban = True
    counter = 0
    while ban:
    	if num <= counter:
    		ban = False
    	else:
    		counter += 1
    		for i in range(1,counter):
    			if (counter % i == 0):
    				suma += i
    		if counter == suma:
    			num_list.append(counter)
    		suma = 0

    return(num_list)
 
num = int(input("introduzca el rango en cual quiere buscar numeros perfectos:"))
 
print(NumeroPerfecto(num))