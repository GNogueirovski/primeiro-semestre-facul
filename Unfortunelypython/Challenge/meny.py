def menu() -> int:
    print("1) Adicionar um médico ao sistema")
    print("2) Adicionar um paciente ao sistema")
    print("3) Marcar a consulta de um paciente")
    print("4) a preencher")
    print("5) Sair")
    return int(input("Opção desejada: "))

opcao = 0

def criar_medico(repositorio: list):
    nome_medico = input("Digite nome completo do médico: ")
    data_nascimento = input("Digite a data de nascimento do médico: ")
    cpf = input("Digite o CPF do médico: ")
    crm = input("Digite o CRM do médico: ")
    especialidade = input("Digite a especialidade do médico: ")
    telefone = input("Digite o telefone do médico: ")
    email = input("Digite o e-mail institucional que será criado para o médico: ")

    medico = [nome_medico, data_nascimento, cpf, crm, especialidade, telefone, email]
    repositorio.append(medico)

def criar_paciente(repositorio: list):
    nome_paciente = input("Digite nome completo do paciente: ")
    data_nascimento = input("Digite a data de nascimento do paciente: ")
    cpf = input("Digite o CPF do paciente: ")
    telefone = input("Digite o telefone do paciente: ")
    email = input("Digite o e-mail do paciente: ")
    print("**********************************")
    print("Preenchendo o prontuário")
    print("**********************************")
    diagnostico = input("Qual o diagnostico do paciente: ")
    meta = input("Digite a meta final do paciente: ")
    medicacao = input("O paciente toma medicação? Se sim quais: ")
    evolucao = input("Qual o quadro de evolução do paciente?: ")
    alergia = input("O paciente possui alguma alergia?: ")
    apoio_locomocao = input("O paciente precisa de apoio de locomocao? Se sim, qual: ")
    fase_tratamento = input("Qual a fase do tratamento que o paciente se encontra? ")

    paciente = [nome_paciente, data_nascimento, cpf, telefone, email, diagnostico,meta, medicacao, evolucao, alergia, apoio_locomocao,fase_tratamento]
    repositorio.append(paciente)

def exibir_paciente(repositorio: list):
    i = 0
    while i < len(repositorio):
        paciente = repositorio[i]
        print("**********************************")
        print("********  Dados pessoais  ********")
        print("**********************************")
        print(f"Nome: {paciente[i+0]}")
        print(f"Data de nascimento: {paciente[i+1]}")
        print(f"CPF: {paciente[i+2]}")
        print(f"Telefone: {paciente[i+3]}")
        print("**********************************")
        print("***** Prontuário do Paciente *****")
        print("**********************************")
        print(f"Diagnostico: {paciente[i+4]}")
        print(f"Meta: {paciente[i+5]}")
        print(f"Medicação: {paciente[i+7]}")
        print(f"Evolução atual: {paciente[i+8]}")
        print(f"Alergia: {paciente[i+9]}")
        print(f"Apoio de Locomoção: {paciente[i+10]}")
        print(f"Fase atual do tratamento: {paciente[i+11]}")

        print("")
        i += 1
    print("**********************************")

def marcar_consulta_paciente(repositorio: list ,repositorio_pacientes: list,repositorio_medicos: list, cpf: str):
    paciente_encontrado = None
    medico_encontrado = None
    for paciente in repositorio_pacientes:
        if paciente[2] == cpf:
            paciente_encontrado = paciente
            break
    if not paciente_encontrado:
        print("Paciente não encontrado")
        return
    especialidade = input("Digite a especialidade da consulta:")
    for medico in repositorio_medicos:
        if medico[4].lower() == especialidade.lower():
            medico_encontrado = medico
            break
    if not medico_encontrado:
        print("Nenhum medico com a especialidade procurada")
        return
    data = input("Digite a data da consulta: ")
    hora = input("Digite a hora da consulta: ")
    local = input("Digite o local/link da consulta: ")
    status = "Agendado"

    consulta = [paciente_encontrado, medico_encontrado, data, hora, local, status]

    repositorio.append(consulta)


pacientes = []
medicos = []
consultas = []
while opcao!= 5:
    opcao = menu()
    if opcao == 1:
        print("Crie um médico")
        criar_medico(medicos)

    elif opcao == 2:
        print("Crie um paciente")
        criar_paciente(pacientes)
        exibir_paciente(pacientes)

    elif opcao == 3:
        cpf = input("Digite o cpf do paciente que deseja marcar a consulta: ")
        marcar_consulta_paciente(consultas, pacientes, medicos, cpf)

    elif opcao == 4:
        print("quarta opcao")

    else:
        print("Opção inválida, tente novamente")