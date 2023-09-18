// Autores: Luis Guilherme de Oliveira Carvalho e Neillane Carvalho Sa Barreto do Rosario
// Palavras-chave: web, 200013749
// Descrição: Atividades sobre JavaScript

document.getElementById("dataForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const name = document.getElementById("name").value;
    const maritalStatus = document.getElementById("maritalStatus").value;
    const ageRange = document.getElementById("ageRange").value;
    const result = document.getElementById("result");

    const concatenatedData = `Nome: ${name}, Estado Civil: ${maritalStatus}, Faixa Etária: ${ageRange}`;
    result.innerText = `Dados Concatenados: ${concatenatedData}`;
});
