primeiroValor = int(input("Digite o primeiro valor inteiro: "))
segundoValor = int(input("Digite o segundo valor inteiro: "))

if primeiroValor == segundoValor:
    print("Deu empate")
elif primeiroValor < segundoValor:
    print(f"O {segundoValor} é maior que {primeiroValor}")
else:
    print(f"O {primeiroValor} é maior que {segundoValor}")