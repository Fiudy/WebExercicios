<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resposta</title>
</head>
<body>
    <h1>Resposta</h1>
    <%
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");
    %>
    <p>Nome: <%= nome %></p>
    <p>Estado Civil: <%= estadoCivil %></p>
    <p>Faixa Etária: <%= faixaEtaria %></p>
    <p>Concatenação: <%= nome + " - " + estadoCivil + " - " + faixaEtaria %></p>
</body>
</html>
