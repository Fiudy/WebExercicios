// Autores: Luis Guilherme de Oliveira Carvalho e Neillane Carvalho Sa Barreto do Rosario
// Palavras-chave: web, 200013749
// Descrição: Atividades sobre JavaScript

document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const login = document.getElementById("login").value;
    const password = document.getElementById("password").value;
    const message = document.getElementById("message");

    if (login.trim() === "" || password.trim() === "") {
        message.innerText = "Por favor, preencha todos os campos.";
    } else {
        // Aqui você pode adicionar lógica para autenticação, se necessário.
        message.innerText = "Login bem-sucedido!";
        // Redirecionar ou executar ação desejada após o login.
    }
});
