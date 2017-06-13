import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;


/**
 * Created by alina on 13.06.17.
 */
public class SummaryServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String first_arg = req.getParameter("first_arg");
        String second_arg = req.getParameter("second_arg");
        int sum = Integer.parseInt(first_arg) + Integer.parseInt(second_arg);
        req.setAttribute("sum", sum);

        getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);

    }
}
