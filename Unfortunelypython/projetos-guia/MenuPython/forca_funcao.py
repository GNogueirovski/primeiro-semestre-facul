def gera_segredo(palav: str, letras: str) -> str:
    resposta = ""
    for c in palav.lower():
        if c in letras:
            resposta = resposta + c + '  '
        else:
            resposta = resposta + '_'
    return resposta


def imprime_tela(secret: str, letras: str, erros: int):
    print(secret)
    print(f"Erros:{erros}")
    print(f"Letras chutadas:{letras}")


def enforcado(erros: int) -> bool:
    if erros < 6:
        return False
    else:
        return True


def descobriu_palavra(secret: str) -> bool:
    if "_" in secret:
        return False
    else:
        return True


erros = 0
letras_chutadas = " "

palavra = "The Shawshank Redemption"

segredo = gera_segredo(palavra, letras_chutadas)

while not enforcado(erros) and not descobriu_palavra(segredo):
    imprime_tela(segredo, letras_chutadas, erros)
    letra = input("Letra: ")
    letras_chutadas = letras_chutadas + letra.lower()

    if not letra.lower() in palavra.lower():
        erros = erros + 1

    segredo = gera_segredo(palavra, letras_chutadas)

if enforcado(erros):
    print(f"Você perdeu, a palavra era {palavra}")
else:
    print(f"Parabéns você acertou o filme {palavra}")
