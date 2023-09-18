// Autores: Luis Guilherme de Oliveira Carvalho e Neillane Carvalho Sa Barreto do Rosario
// Palavras-chave: web, 200013749
// Descrição: Atividades sobre JavaScript

document.getElementById("ageForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const age = parseInt(document.getElementById("age").value);
    let result = "";

    if (age >= 3 && age <= 10) {
        result = "3 a 10 anos";
    } else if (age >= 11 && age <= 25) {
        result = "11 a 25 anos";
    } else if (age >= 36 && age <= 55) {
        result = "36 a 55 anos";
    } else if (age >= 56 && age <= 100) {
        result = "56 a 100 anos";
    } else {
        result = "Idade fora das faixas especificadas.";
    }

    document.getElementById("result").innerText = `Sua faixa etária é: ${result}`;
});
