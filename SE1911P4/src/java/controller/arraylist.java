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
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author king
 */
public class arraylist extends HttpServlet {

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
            out.println("<title>Servlet arraylist</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet arraylist at " + request.getContextPath() + "</h1>");
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
        // mảng là tập hợp các dữ liệu giống nhau kiểu dữ liệu
        String[][] array = {
            {"John", "8", "10"},
            {"Heny", "9", "11"}
        };
        
        ArrayList<String> arr1=new ArrayList<String>();
        // object
        ArrayList<Student> arr=new ArrayList<Student>();
        arr.add(new Student("John", 8, 10));
        arr.add(new Student("Heny",9, 11));
        arr.add(new Student("Jack",9, 7));
        //object from class  - nhieu kieu dl khac nhau
//        int [][] array2={
//            {1,2,3},
//            {4,5,6}
//        };
        // duyêt mảng
//        for (int i = 0; i < array.length; i++) {
//            for(int j=0;i<array.;i++)

//        }
        String table_p1 = "    <table border='1px'>\n"
                + "        <tr>\n"
                + "            <th>No</th>\n"
                + "            <th>Name</th>\n"
                + "            <th>Age</th>\n"
                + "            <th>Point</th>\n"
                + "        </tr>\n";

        String table_p2 = "        <tr>\n"
                + "            <td>Cell1</td>\n"
                + "            <td>Cell2</td>\n"
                + "            <td>Cell1</td>\n"
                + "            <td>Cell1</td>\n"
                + "        </tr>\n";

        String table_p3 = "    </table>";
        String table = table_p1 + table_p2 + table_p2 + table_p3;
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet arraylist</title>");
        out.println("</head>");
        out.println("<body>");
        // chen table vao
        out.print(table_p1);
        int count=1;
        for (Student s:arr) {
            out.println("      <tr>\n"
                    + "            <td>"+count+"</td>\n"
                    + "            <td>"+s.getName()+"</td>\n"
                    + "            <td>"+s.getAge()+"</td>\n"
                    + "            <td>"+s.getPoint()+"</td>\n"
                    + "        </tr>\n");
            count++;
        }
        out.print(table_p3);

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
