def potencia_recursivo(num, pot):
	val = num*(num**(pot - 1))
	return val

numero = int(input("Numero: "))
potencia = int(input("Elevar a la potencia: "))

print(potencia_recursivo(numero, potencia))