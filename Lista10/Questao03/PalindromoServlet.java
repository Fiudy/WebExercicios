package Questao03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PalindromoServlet")
public class PalindromoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtém o parâmetro do formulário
        String palavra = request.getParameter("palavra");

        // Verifica se a palavra é palíndroma usando o modelo (Model)
        boolean isPalindromo = PalindromoChecker.verificarPalindromo(palavra);

        // Exibe os resultados
        response.getWriter().println("<html><head><title>Resultado</title></head><body>");
        response.getWriter().println("<h2>Verificação de Palíndromo:</h2>");
        response.getWriter().println("Palavra/Frase: " + palavra + "<br>");
        response.getWriter().println("É palíndromo? " + (isPalindromo ? "Sim" : "Não") + "<br>");
        response.getWriter().println("</body></html>");
    }
}

