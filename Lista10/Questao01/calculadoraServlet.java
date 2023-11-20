import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Obtém os parâmetros do formulário
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int numero3 = Integer.parseInt(request.getParameter("numero3"));

        // Realiza as operações
        int soma = numero1 + numero2 + numero3;
        int subtracao = numero1 - numero2 - numero3;
        int multiplicacao = numero1 * numero2 * numero3;
        int divisao = numero1 / numero2 / numero3;
        int restoDivisao = numero1 % numero2 % numero3;

        // Exibe os resultados
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Resultado</title></head><body>");
        out.println("<h2>Resultados:</h2>");
        out.println("Soma: " + soma + "<br>");
        out.println("Subtração: " + subtracao + "<br>");
        out.println("Multiplicação: " + multiplicacao + "<br>");
        out.println("Divisão: " + divisao + "<br>");
        out.println("Resto da Divisão: " + restoDivisao + "<br>");
        out.println("</body></html>");
    }
}
