import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/calculator")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount_percent"));
        double discount_amount = price * discount_percent * 0.01;
        double discount_price = price - discount_amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Product Discount Calculator</h1>" +"<br>" +
                "<label>Product Description: </label>" + name + "<br>" +
                "<label>Discount Amount: </label>" + discount_amount + "<br>" +
                "<label>Discount Price: </label>" + discount_price);
        writer.println("</body>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
