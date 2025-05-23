def menu() -> int:
    print("1) Adicionar um médico ao sistema")
    print("2) Adicionar um paciente ao sistema")
    print("3) Marcar a consulta de um paciente")
    print("4) Procurar paciente por CPF")
    print("5) Sair do sistema")

    while True:
        try:
            opcao = int(input("Digite a opção desejada: "))
            if 1 <= opcao <= 5:
                return opcao
            else:
                print("Opção inválida. Digite uma opção válida ente 1 e 5")
        except ValueError:
            print("Entrava inválida. Por favor, digite um número entre 1 e 5.")



def criar_medico(repositorio: list):
    nome_medico = input("Digite nome completo do médico: ")
    data_nascimento = input("Digite a data de nascimento do médico: ")
    cpf = ""
    while True:
        cpftentativa = input("Digite o CPF do médico (apenas números): ")
        if len(cpftentativa) == 11 and cpftentativa.isdigit():
            cpf = cpftentativa
            break
        else:
            print("CPF inválido. Digite 11 digítos válidos para o documento")

    crm = input("Digite o CRM do médico: ")
    especialidade = input("Digite a especialidade do médico: ")
    telefone = input("Digite o telefone do médico: ")
    email = input("Digite o e-mail institucional que será criado para o médico: ")

    medico = [nome_medico, data_nascimento, cpf, crm, especialidade, telefone, email]
    repositorio.append(medico)

def criar_paciente(repositorio: list):
    print("***************************************")
    print("Preenchendo dados pessoais do Paciente")
    print("***************************************")
    nome_paciente = input("Digite nome completo do paciente: ")
    data_nascimento = input("Digite a data de nascimento do paciente: ")
    cpf = ""
    while True:
        cpftentativa = input("Digite o CPF do médico (apenas números): ")
        if len(cpftentativa) == 11 and cpftentativa.isdigit():
            cpf = cpftentativa
            break
        else:
            print("CPF inválido. Digite 11 digítos válidos para o documento")

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

def exibir_paciente(repositorio_consultas:list, repositorio_pacientes: list, cpf: str):
    paciente_encontrado = None
    consulta_encontrada = None
    for paciente in repositorio_pacientes:
        if paciente[2] == cpf:
            paciente_encontrado = paciente
            break
    if not paciente_encontrado:
        print("Paciente não encontrado")
        return
    for consulta in repositorio_consultas:
        if paciente_encontrado == consulta[0]:
            consulta_encontrada = consulta
            break
    if not consulta_encontrada:
        print("Nenhuma consulta marcada para o paciente")
        return

    input("1) Dados pessoais \n2) Consultas")
    opcao = input("Deseja ver: ")
    if opcao == "1":
        print("**********************************")
        print("********  Dados pessoais  ********")
        print("**********************************")
        print(f"Nome: {paciente_encontrado[0]}")
        print(f"Data de nascimento: {paciente_encontrado[1]}")
        print(f"CPF: {paciente_encontrado[2]}")
        print(f"Telefone: {paciente_encontrado[3]}")
        print("**********************************")
        print("***** Consulta do Paciente *****")
        print("**********************************")
        print(f"Diagnostico: {paciente_encontrado[4]}")
        print(f"Meta: {paciente_encontrado[5]}")
        print(f"Medicação: {paciente_encontrado[7]}")
        print(f"Evolução atual: {paciente_encontrado[8]}")
        print(f"Alergia: {paciente_encontrado[9]}")
        print(f"Apoio de Locomoção: {paciente_encontrado[10]}")
        print(f"Fase atual do tratamento: {paciente_encontrado[11]}")
        print("**********************************")
    elif opcao == "2":
        print(f"A consulta com o {consulta_encontrada[0]}")


def marcar_consulta(repositorio: list ,repositorio_pacientes: list,repositorio_medicos: list, cpf: str):
    paciente_encontrado = None
    medico_encontrado = None
    especialidade_consulta = None

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
            especialidade_consulta = especialidade
            break
    if not medico_encontrado:
        print("Nenhum medico com a especialidade procurada")
        return

    data = input("Digite a data da consulta: ")
    hora = input("Digite a hora da consulta: ")
    local = input("Digite o local/link da consulta: ")
    status = "Agendado"

    consulta = [paciente_encontrado, medico_encontrado,especialidade_consulta, data, hora, local, status]

    repositorio.append(consulta)


pacientes = []
medicos = []
consultas = []
opcao = 0

while opcao!= 5:
    opcao = menu()
    if opcao == 1:
        criar_medico(medicos)

    elif opcao == 2:
        criar_paciente(pacientes)

    elif opcao == 3:
        cpf = input("Digite o cpf do paciente que deseja marcar a consulta: ")
        marcar_consulta(consultas, pacientes, medicos, cpf)

    elif opcao == 4:
        exibir_paciente(pacientes)

    else:
        print("Opção inválida, tente novamente")