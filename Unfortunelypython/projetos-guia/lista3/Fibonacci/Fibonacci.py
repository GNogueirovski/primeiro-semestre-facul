n = int(input("Informe o N: "))
ant = 1
atual = 1
contador = 2

while contador < n :
    prox = atual + ant
    ant = atual
    atual = prox
    contador = contador + 1

print(atual)