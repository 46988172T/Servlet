import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 46988172t on 12/04/16.
 */
public class Cesar extends HttpServlet {


    public Cesar() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/cesarGet.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String valueString = req.getParameter("value");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Encriptado Cesar</h1>");
        out.println("<p>Texto original: " + valueString + "</p>");
        for (int i = 0; i < 26; i++) {
            out.println("<p>" + encriptCesar(valueString, i) + "</p>");
        }
    }

    private String encriptCesar(String valueString, int i) {
        int l, j;
        char fraseCifrada[] = new char[valueString.length()];
        fraseCifrada = valueString.toCharArray();

        for (l = 0; l < valueString.length(); l++) {
            for (j = 0; j < i; j++) {
                if ((fraseCifrada[l] >= 65 && fraseCifrada[l] < 90) || (fraseCifrada[l] >= 97 && fraseCifrada[l] < 122)) {
                    fraseCifrada[l]++;
                } else if (fraseCifrada[l] == 90)
                    fraseCifrada[l] = 'A';
                else if (fraseCifrada[l] == 122)
                    fraseCifrada[l] = 'a';
            }
        }
        valueString = String.valueOf(fraseCifrada);
        return valueString;
    }
}