package br.edu.usj.ads.lpii;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculadora")
public class calculadora extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String operacao = request.getParameter("oper");
        int numero1 = Integer.parseInt(request.getParameter("num1"));
        int numero2 = Integer.parseInt(request.getParameter("num2"));

        int resultado = 0;
        switch(operacao.charAt(0)){
            case '+': {
                resultado = numero1 + numero2;
                break;
            }
            case '-': {
                resultado = numero1 - numero2;
                break;
            }
            case '*': {
                resultado = numero1 * numero2;
                break;
            }
            case '/': {
                resultado = numero1 / numero2;
                break;
            }

        }

        PrintWriter saida = response.getWriter();
        saida.println("<html>");
        saida.println("<body>");
        saida.print(numero1);
        saida.print(operacao);
        saida.print(numero2);
        saida.print(" ");
        saida.print("RESULTADO  = " + resultado);
        saida.println("</body>");
        saida.println("</html>");


    }
}
