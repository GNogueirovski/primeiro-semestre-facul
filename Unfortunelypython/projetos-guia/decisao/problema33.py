# Ler 2 números e uma string representando um operador

num1 = float(input("Digite o 1° número: "))
op = input("Digite a operação (+ - / *): ")
num2 = float(input("Digite o 2° número: "))

if op == "+":
    resultado = num1 + num2
elif op == "-":
    resultado = num1 - num2
elif op == "/":
    if num2!= 0:
        resultado = num1 / num2
    else:
        resultado = None
        print("Impossível de fazer a divisao por 0.")
elif op == "*":
    resultado = num1 * num2
else:
    print("Operador inválido")
    resultado = None
if resultado != None:
    print(f"O resultado da operação  {num1} {op} {num2} = {resultado}")