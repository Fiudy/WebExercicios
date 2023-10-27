<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Tabuada em JSP</title>
</head>
<body>
  <h1>Tabuada em JSP</h1>
  <form action="tabuada.jsp" method="post">
    <label for="numero">Digite um número inteiro:</label>
    <input type="number" id="numero" name="numero" required>
    <input type="submit" value="Mostrar Tabuada">
  </form>

  <%
    String numeroStr = request.getParameter("numero");
    if (numeroStr != null && !numeroStr.isEmpty()) {
      int numero = Integer.parseInt(numeroStr);
  %>
  <h2>Tabuada do número <%= numero %> :</h2>
  <table>
    <tr>
      <th>Multiplicador</th>
      <th>Resultado</th>
    </tr>
    <%
      for (int i = 1; i <= 10; i++) {
    %>
    <tr>
      <td><%= i %></td>
      <td><%= numero * i %></td>
    </tr>
    <%
      }
    %>
  </table>
  <%
    }
  %>
</body>
</html>
