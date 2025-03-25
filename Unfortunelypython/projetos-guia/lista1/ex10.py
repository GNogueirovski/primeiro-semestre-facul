distancia = float(input("Distância em Metros: "))
tempo = float(input("Tempo em segundos: "))

velocidade_ms = distancia / tempo
distancia_km = distancia / 1000
velocidade_kh = velocidade_ms * 3.6

print (f"Velocidade Média em M/S: {velocidade_ms} m/s")

print(f"Velocidade Média em KM/H: {velocidade_kh} km/h")
