/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author king
 */
public class checkValidate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet checkValidate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet checkValidate at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        String inputName = request.getParameter("inputName");
        String radio1 = request.getParameter("inputRadio1");
        String radio2 = request.getParameter("inputRadio2");
        String radio3 = request.getParameter("inputRadio3");
        String sex = request.getParameter("sex");

        PrintWriter out = response.getWriter();
//        out.println("inputName="+inputName);
//        out.println("inputRadio1="+radio1);
//        out.println("inputRadio2="+radio2);
//        out.println("inputRadio3="+radio3);
//        out.println("Sex="+sex);
        String table = "";
        String head = "<table>\n"
                + "            <tr>\n"
                + "                <th>No</th>\n"
                + "                <th>Name</th>\n"
                + "                <th>Radio1</th>\n"
                + "                <th>Radio2</th>\n"
                + "                <th>Radio3</th>\n"
                + "                <th>Sex</th>\n"
                + "            </tr>\n";
        String body = "";
        String[][] data = {
            {"1", "admin", "Yes", null, null, "male"},
            {"2", "user1", null, "Yes", null, "female"},
            {"3", "user2", "Yes", null, "Yes", "male"},
            {"4", "user3", null, null, "Yes", "female"},
            {"5", "user4", "Yes", "Yes", null, "male"},
            {"6", "user5", null, null, null, "female"},
            {"7", "user6", "Yes", "Yes", "Yes", "male"},
            {"8", "user7", null, null, "Yes", "female"},
            {"9", "user8", "Yes", null, "Yes", "male"},
            {"10", "user9", null, "Yes", null, "female"}
        };
        // Thu do mang 2 chieu vao table
        for (int i = 1; i <= 10; i++) {
            String value = "            <tr>\n"
                    + "                <td>1</td>\n"
                    + "                <td>" + inputName + "</td>\n"
                    + "                <td>" + radio1 + "</td>\n"
                    + "                <td>" + radio2 + "</td>\n"
                    + "                <td>" + radio2 + "</td>\n"
                    + "                <td>" + sex + "</td>\n"
                    + "            </tr>\n";
        }
        table = head + body + "    </table>";

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet checkValidate</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(table);
        out.println("</body>");
        out.println("</html>");

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
