ladoA = float(input("Digite o Lado A do triângulo: "))
ladoB = float(input("Digite o Lado B do triângulo: "))
ladoC = float(input("Digite o Lado C do triângulo: "))

if ladoA + ladoB > ladoC and ladoB + ladoC > ladoA and ladoC + ladoA > ladoB:
    if ladoA == ladoB == ladoC:
        print("Triângulo Equilátero")
    elif ladoA == ladoB or ladoB == ladoC or ladoA == ladoC:
        print("Triângulo Isósceles")
    else:
        print("Triângulo Escaleno")
else:
    print("Não é um triângulo")
