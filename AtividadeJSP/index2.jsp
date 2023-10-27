<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="Luis Guilherme de Oliveira Carvalho e Neillane de Carvalho Sa Barreto">
    <meta name="keywords" content="web">
    <meta name="description" content="Atividades sobre JSP">
    <title>JSP - Formulário</title>
</head>
<body>
    <h1>Formulário JSP</h1>
    <form action="resposta2.jsp" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required>
        <br>
        <label for="estadoCivil">Estado Civil:</label>
        <select id="estadoCivil" name="estadoCivil" required>
            <option value="Solteiro(a)">Solteiro(a)</option>
            <option value="Casado(a)">Casado(a)</option>
            <option value="Divorciado(a)">Divorciado(a)</option>
            <option value="Viúvo(a)">Viúvo(a)</option>
        </select>
        <br>
        <label for="faixaEtaria">Faixa Etária:</label>
        <select id="faixaEtaria" name="faixaEtaria" required>
            <option value="3 a 10 anos">3 a 10 anos</option>
            <option value="11 a 25 anos">11 a 25 anos</option>
            <option value="36 a 55 anos">36 a 55 anos</option>
            <option value="56 a 100 anos">56 a 100 anos</option>
        </select>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
