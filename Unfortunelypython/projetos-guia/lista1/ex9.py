preco = int(input("Digite o preço do produto: "))
desconto = float(input("Digite o percentual de desconto: "))

preco = preco - (preco * desconto) // 100

print(f"O novo preço com desconto é: R${preco}")
