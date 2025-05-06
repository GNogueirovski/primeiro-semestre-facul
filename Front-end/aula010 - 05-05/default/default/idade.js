
const anoNascimento = parseInt(prompt("Digite o ano de nascimento:"));

function calcularIdadeEmDias(anoNascimento) {
    const anoAtual = new Date().getFullYear();

    const idade = anoAtual - anoNascimento;

    const idadeEmDias = idade * 365;
}

calcularIdadeEmDias(anoNascimento);
alert(`Sua idade aproximada em dias é: ${idadeEmDias}`);
