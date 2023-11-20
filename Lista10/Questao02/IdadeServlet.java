package Questao02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IdadeServlet")
public class IdadeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtém os parâmetros do formulário
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        boolean fezAniversarioEsteAno = "sim".equals(request.getParameter("fezAniversario"));

        // Calcula a idade usando o modelo (Model)
        int idade = IdadeCalculator.calcularIdade(anoNascimento, fezAniversarioEsteAno);

        // Exibe os resultados
        response.getWriter().println("<html><head><title>Resultado</title></head><body>");
        response.getWriter().println("<h2>Idade Atual:</h2>");
        response.getWriter().println("Idade: " + idade + " anos");
        response.getWriter().println("</body></html>");
    }
}
