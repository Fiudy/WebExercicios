// Autores: Luis Guilherme de Oliveira Carvalho e Neillane Carvalho Sa Barreto do Rosario
// Palavras-chave: web, 200013749
// Descrição: Atividades sobre JavaScript - DOM

document.getElementById("imcForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const weight = parseFloat(document.getElementById("peso").value);
    const height = parseFloat(document.getElementById("altura").value);
    const result = document.getElementById("result");

    if (isNaN(weight) || isNaN(height) || weight <= 0 || height <= 0) {
        result.innerText = "Preencha corretamente o peso e a altura.";
        return;
    }

    const imc = weight / (height * height);

    let classification = "";

    if (imc < 16.9) {
        classification = "Muito abaixo do peso";
    } else if (imc >= 17 && imc <= 18.4) {
        classification = "Abaixo do peso";
    } else if (imc >= 18.5 && imc <= 24.9) {
        classification = "Peso normal";
    } else if (imc >= 25 && imc <= 29.9) {
        classification = "Acima do peso";
    } else {
        classification = "Obesidade";
    }

    result.innerText = `Seu IMC é ${imc.toFixed(2)} (${classification}).`;
});
