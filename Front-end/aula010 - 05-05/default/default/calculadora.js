function soma(a, b) {
    return a + b
  }
  
  const subtracao = (a, b) => a - b
  
  const multiplicacao = (a, b) => {
    return a * b
  }
  
  const divisao = (a, b) => a / b
  
  const num1 = parseFloat(prompt('Digite o primeiro número:'))
  const num2 = parseFloat(prompt('Digite o segundo número:'))
  const operacao = prompt('Digite a operação desejada: +, -, *, /')
  
  function calcular(num1, num2, operacao) {
    let resultado
    switch (operacao) {
      case '+':
        resultado = soma(num1, num2)
        break
      case '-':
        resultado = subtracao(num1, num2)
        break
      case '*':
        resultado = multiplicacao(num1, num2)
        break
      case '/':
        resultado = divisao(num1, num2)
        break
      default:
        alert('Operação inválida')
    }
    return resultado
  }
  
  const resultado = calcular(num1, num2, operacao)
  if (resultado !== undefined && resultado !== null) {
    alert(`O resultado da operação ${num1} ${operacao} ${num2} é ${resultado}`)
  }