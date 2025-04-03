idade = int(input("Informe a idade do atleta: "))

if idade <= 0:
    print("Idade invalida")
elif idade < 5:
    print("Categoria indefinida")
elif idade <= 7:
    print("Categoria infantil")
elif idade <= 10:
    print("Categoria Juvenil")
elif idade <= 15:
    print("Categoria adolescente")
elif idade <= 30:
    print("Categoria adulto")
else:
    print("Categoria senior")
