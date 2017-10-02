
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listaProducto extends HttpServlet {
    //aqui deberia de leerse los productos de una base de datos
    //pero eso escapa de este ejercicio
    Producto p1;
    Producto p2;
    Producto p3;
    @Override
    public void init() throws ServletException {
        p1 = new Producto(1, "Zapato", 10000);
        p2 = new Producto(2, "Remera", 5000);
        p3 = new Producto(3, "Cartera", 7000);
    }

    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listaProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table width='500' height='300' bgcolor='skyblue' align='center' border='1'>");
            
            out.println("<tr>");
            out.println("<td>Quiero</td><td>Lista de producto </td><td>Precio</td><td>Cantidad</td>");
            out.println("</tr>");
            out.println("<form method='post' action='carritoCompra'>");
            out.println("<tr>");
            out.println("<td><input type='checkbox' value='"+p1.id+"' name='prod1'></td><td>" +p1.descripcion+" </td><td>"+p1.precio+"</td><td><input type='number' name='cant1' value=1></td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td><input type='checkbox' value='"+p2.id+"' name='prod2'></td><td>" +p2.descripcion+" </td><td>"+p2.precio+"</td><td><input type='number' name='cant2' value=1></td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td><input type='checkbox' value='"+p3.id+"' name='prod3'></td><td>" +p3.descripcion+" </td><td>"+p3.precio+"</td><td><input type='number' name='cant3' value=1></td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td colspan='4'><input type='submit' value='Agregar al carrito'></td>");
            out.println("</tr>");
            
            out.println("</form>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
