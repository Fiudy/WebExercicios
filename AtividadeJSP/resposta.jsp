<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resposta</title>
</head>
<body>
    <h1>Resultado</h1>
    <%
        String palavra = request.getParameter("palavra");
        String mensagem = "";
        
        if (palavra != null && !palavra.isEmpty()) {
            // Remove espaços e converte para minúsculas para facilitar a verificação
            palavra = palavra.replaceAll(" ", "").toLowerCase();
            
            // Inverte a palavra
            String palavraInvertida = new StringBuilder(palavra).reverse().toString();
            
            if (palavra.equals(palavraInvertida)) {
                mensagem = "A palavra '" + palavra + "' é um palíndromo!";
            } else {
                mensagem = "A palavra '" + palavra + "' não é um palíndromo.";
            }
        } else {
            mensagem = "Nenhuma palavra foi inserida.";
        }
    %>
    <p><%= mensagem %></p>
</body>
</html>
