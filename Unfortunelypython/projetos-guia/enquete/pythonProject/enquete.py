def cadastra_pergunta(repositorio: list):
    numero = int(input("Número: "))
    enunciado = input("Enunciado: ")
    tipo = input("Tipo: ")
    if tipo == "unica" or tipo == "multipla":
        alternativas = []
        print("Alternativas ou enter para finalizar")
        num = 1
        item = input(f"Alternativa {num}: ")
        while item != '':
            alternativas.append(item)
            num = num + 1
            item = input(f"Alternativa {num}: ")
        print("Finalizando os itens!")
    else:
        alternativas = None
        repositorio.append(numero)
        repositorio.append(enunciado)
        repositorio.append(tipo)
        repositorio.append(alternativas)


def apaga_perguntas(repositorio):
    num = int(input("Digite o n° da pergunta que deseja apagar: "))
    i = 0
    while i < len(repositorio) and repositorio[i] != num:
        i = i + 4
    if repositorio[i] == num:
        repositorio.pop(i)
        repositorio.pop(i)
        repositorio.pop(i)
        repositorio.pop(i)
    else:
        print("Nenhuma pergunta foi encontrada")


def menu() -> int:
    print("1) Cadastro de Perguntas")
    print("2) Aplica enquete")
    print("3) Visualiza a pergunta")
    print("4) Apagar a pergunta")
    print("5) Sair")


perguntas = []
opcao = 0

while opcao != 5:
    opcao = menu()
    if opcao == 1:
        cadastra_pergunta(perguntas)
    elif opcao == 2:
        print("Aplciando a enquete")
    elif opcao == 3:
        print(perguntas)
    elif opcao == 4:
        print("Apagando pergunta")
