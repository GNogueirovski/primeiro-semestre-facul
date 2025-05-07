#Vamos descascar os digitos de um numero

numero = int(input("Digite um número: "))

while numero != 0:
    resto = numero % 10
    numero = numero // 10
    print(resto)
