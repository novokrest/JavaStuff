package my.learning.servlets.web;

import my.learning.servlets.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CoffeeSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, 
                      HttpServletResponse response)
                      throws IOException, ServletException {
        String color = request.getParameter("color");
        CoffeeExpert coffeeExpert = new CoffeeExpert();
        List<String> coffeeBrands = coffeeExpert.getBrands(color);

        // response.setContentType("text/html");
        // PrintWriter out = response.getWriter();
        // out.println("<p>Coffee Selection Advice</p>");
        
        // for (String brand: coffeeBrands) {
        //     out.println("<br>" + brand);
        // }

        request.setAttribute("styles", coffeeBrands);
        RequestDispatcher view = request.getRequestDispatcher("results.jsp");
        view.forward(request, response);
    }
}