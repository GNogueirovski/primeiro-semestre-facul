function converterParaFahrenheit(temperaturaCelcius) {
    return (temperaturaCelcius * 9/5) + 32;
}

const temperaturaCelcius = parseFloat(prompt("Digite a temperatura em Celsius: "));
const temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelcius);

alert(`A temperatura em Fahrenheit é: ${temperaturaFahrenheit.toFixed(2)}°F`);