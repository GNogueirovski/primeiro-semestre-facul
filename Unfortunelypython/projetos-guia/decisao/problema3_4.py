#Calculo do INSS
salario = float(input("Salario: "))

if salario <= 1693.72:
    inss = salario * 0.08
elif salario <= 2822.00:
    inss = salario * 0.09
elif salario <= 5645.80:
    inss = salario * 0.10

elif salario > 5645.80:
        inss = salario * 0.11

print(f"A contribuição do INSS é de R${inss:.2f}")