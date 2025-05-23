def menu() -> int:
    print("\nSeja bem-vindo ao Menu do Colaborador do ELO IMREA")
    print("Você deseja:")
    print("1) Adicionar um médico ao sistema")
    print("2) Adicionar um paciente ao sistema")
    print("3) Marcar a consulta de um paciente")
    print("4) Procurar paciente por CPF")
    print("5) Sair do sistema")

    while True:
        try:
            opcao = int(input("Digite sua opção: "))
            if 1 <= opcao <= 5:
                return opcao
            else:
                print("Opção inválida. Digite uma opção entre 1 e 5")
        except ValueError:
            print("Entrada inválida. Por favor, digite um número entre 1 e 5")


def criar_medico(repositorio: list):
    print("\n***************************************")
    print("Preenchendo dados do Médico")
    print("***************************************")
    nome_medico = input("Digite nome completo do médico: ")
    data_nascimento = input("Digite a data de nascimento do médico: ")
    cpf = ""
    while True:
        cpftentativa = input("Digite o CPF do médico (apenas números): ")
        if len(cpftentativa) == 11 and cpftentativa.isdigit():
            cpf = cpftentativa
            break
        else:
            print("CPF inválido. Digite 11 dígitos válidos para o documento.")

    crm = input("Digite o CRM do médico: ")
    especialidade = input("Digite a especialidade do médico: ")
    telefone = input("Digite o telefone do médico: ")
    email = input("Digite o e-mail institucional que será criado para o médico: ")

    medico = [nome_medico, data_nascimento, cpf, crm, especialidade, telefone, email]
    repositorio.append(medico)
    print("Médico cadastrado com sucesso!\n")

def criar_paciente(repositorio: list):
    print("\n***************************************")
    print("Preenchendo dados pessoais do Paciente")
    print("***************************************")
    nome_paciente = input("Digite nome completo do paciente: ")
    data_nascimento = input("Digite a data de nascimento do paciente: ")
    cpf = ""
    while True:
        cpftentativa = input("Digite o CPF do paciente (apenas números): ")
        if len(cpftentativa) == 11 and cpftentativa.isdigit():
            cpf = cpftentativa
            break
        else:
            print("CPF inválido. Digite 11 dígitos válidos para o documento.")

    telefone = input("Digite o telefone do paciente: ")
    email = input("Digite o e-mail do paciente: ")
    print("************************************")
    print("Preenchendo o prontuário do Paciente")
    print("************************************")
    diagnostico = input("Qual o diagnostico do paciente: ")
    meta = input("Digite a meta final do paciente: ")
    medicacao = input("O paciente toma medicação? Se sim quais: ")
    evolucao = input("Qual o quadro de evolução do paciente?: ")
    alergia = input("O paciente possui alguma alergia?: ")
    apoio_locomocao = input("O paciente precisa de apoio de locomocao? Se sim, qual: ")
    fase_tratamento = input("Qual a fase do tratamento que o paciente se encontra? ")

    paciente = [nome_paciente, data_nascimento, cpf, telefone, email, diagnostico,meta, medicacao, evolucao, alergia, apoio_locomocao,fase_tratamento]
    repositorio.append(paciente)
    print(f"Paciente {nome_paciente} adicionado com sucesso!")


def exibir_paciente(repositorio_consultas:list, repositorio_pacientes: list, cpf: str):
    paciente_encontrado = None
    for paciente in repositorio_pacientes:
        if paciente[2] == cpf:
            paciente_encontrado = paciente
            break

    if not paciente_encontrado:
        print(f"Paciente com CPF {cpf} não encontrado.")
        return

    print(f"Detalhes do Paciente: {paciente_encontrado[0]}")
    opcao = input("1) Dados Pessoais \n2) Prontuário \n3) Consultas (NÃO IMPLEMENTADO) \nEscolha uma opção: ")

    if opcao == "1":
        print("**********************************")
        print("******** Dados Pessoais  ********")
        print("**********************************")
        print(f"Nome: {paciente_encontrado[0]}")
        print(f"Data de nascimento: {paciente_encontrado[1]}")
        print(f"CPF: {paciente_encontrado[2]}")
        print(f"Telefone: {paciente_encontrado[3]}")
        print(f"Email: {paciente_encontrado[4]}")
    elif opcao == "2":
        print("**********************************")
        print("***** Prontuário do Paciente *****")
        print("**********************************")
        print(f"Diagnóstico: {paciente_encontrado[5]}")
        print(f"Meta: {paciente_encontrado[6]}")
        print(f"Medicação: {paciente_encontrado[7]}")
        print(f"Evolução atual: {paciente_encontrado[8]}")
        print(f"Alergia: {paciente_encontrado[9]}")
        print(f"Apoio de Locomoção: {paciente_encontrado[10]}")
        print(f"Fase atual do tratamento: {paciente_encontrado[11]}")
        print("**********************************")
    elif opcao == "3":
        print("A ser implementado")

    else:
        print("Opção inválida, Por favor entre as opções 1 ou 2.")


def marcar_consulta(repositorio_consultas: list ,repositorio_pacientes: list,repositorio_medicos: list, cpf_busca: str): # Renomeado
    paciente_encontrado = None
    medico_encontrado = None
    especialidade_consulta = None

    for paciente in repositorio_pacientes:
        if paciente[2] == cpf_busca:
            paciente_encontrado = paciente
            break
    if not paciente_encontrado:
        print(f"Paciente com CPF {cpf_busca} não encontrado.")
        return

    print(f"A consulta será marcada para o paciente: {paciente_encontrado[0]}")
    especialidade = input("Digite a especialidade da consulta: ")
    for medico_atual in repositorio_medicos:
        if medico_atual[4].lower() == especialidade.lower():
            medico_encontrado = medico_atual
            especialidade_consulta = medico_atual[4]
            break
    if not medico_encontrado:
        print(f"Nenhum médico encontrado com a especialidade solicitada.")
        return

    print(f"Médico encontrado: Dr(a). {medico_encontrado[0]} ({medico_encontrado[4]})")
    data = input("Digite a data da consulta: ")
    hora = input("Digite a hora da consulta: ")
    local = input("Digite o local/link da consulta: ")
    status = "Agendada"

    consulta = [paciente_encontrado, medico_encontrado, especialidade_consulta, data, hora, local, status]
    repositorio_consultas.append(consulta)
    print(f"Consulta de {especialidade_consulta} marcada com sucesso para o paciente: {paciente_encontrado[0]}\n")


pacientes = []
medicos = []
consultas = []
opcao = 0

while opcao != 5:
    opcao = menu()
    if opcao == 1:
        criar_medico(medicos)
    elif opcao == 2:
        criar_paciente(pacientes)
    elif opcao == 3:
        if not pacientes:
            print("\nNenhum paciente cadastrado. Adicione um paciente antes de marcar uma consulta.")
        elif not medicos:
            print("\nNenhum médico cadastrado. Adicione um médico antes de marcar uma consulta.")
        else:
            cpf = input("\nDigite o CPF do paciente que deseja marcar a consulta:")
            marcar_consulta(consultas, pacientes, medicos, cpf)
    elif opcao == 4:
        if not pacientes:
            print("\nNenhum paciente cadastrado para procurar.")
        else:
            cpf = input("\nDigite o CPF do paciente que deseja procurar no sistema: ")
            exibir_paciente(consultas, pacientes, cpf)
    elif opcao == 5:
        print("Obrigado por utilizar o Elo IMREA!")
