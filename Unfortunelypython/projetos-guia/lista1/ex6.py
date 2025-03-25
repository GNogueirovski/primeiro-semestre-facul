# pi = 3.141592
# D = raio * 2
# A = pi * raio²
# P/C = 2*pi*raio

pi = 3.141592

raio = input("Digite o raio da circunferência: ")
raio = int(raio)

diametro = raio * 2
area = pi * (raio*raio)
perimetro = 2 * pi * raio

print(f"Diametro: {raio} * {2} = {diametro}")
print (f"Area: {pi} * {raio * raio} = {area:.2f}")
print (f"Perimetro: {2} * {pi} * {raio} = {perimetro:.2f}")


