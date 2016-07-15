<%@ page import="java.util.*" %>

<html>
    <body>
        <h1 align="center">Coffee Recommendations JSP</h1>
        <p>
            <%
                List<String> styles = (List<String>)request.getAttribute("styles");
                for (String style: styles) {
                    out.println("<br>" + style);
                }
            %>
        </p>
    </body>
</html>