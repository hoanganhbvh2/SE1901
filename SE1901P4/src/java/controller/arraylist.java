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
//        array
//               linklist
//                tree
//                        queue
//                        stack
//                                grap
// ? tại sao cần :? lưu trữ ?- không
//Quản lý dữ liệu : sắp xếp - thao tác element dễ dàng hơn
// cấu trúc array  -- tập hợp các dữ liệu có cùng kiểu
//    string [] a={3,4,5,3,2,4}
// object chua nhieu kieu (from class-oop)
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        String[][] array2 = {
            {"Name", "age", "point"},
            {"John", "8", "10"},
            {"Jack", "9", "7"}
//            Name | Age | point
//            John |  8  | 10
        };
        //Khai bao ra 1 doi tuong
//        Student s1=new Student("John",8,9);
//        Student s2=new Student("Jack",8,11);
        ArrayList<Student> array3 = new ArrayList<>();
        array3.add(new Student("John", 8, 9));
        array3.add(new Student("Jack", 8, 11));
        array3.add(new Student("Hery", 10, 3));
        // duyệt mảng
//        PrintWriter out = response.getWriter();
//        for (int i = 0; i < array2.length; i++) {
//            out.print(array2[i][0] + " ");
//            out.print(array2[i][1] + " ");
//            out.print(array2[i][2] + "  \n");
//        }
        String table_1 = "<table border='1px solid'>\n"
                + "            <tr>\n"
                + "                <th>No</th>\n"
                + "                <th>Name</th>\n"
                + "                <th>Age</th>\n"
                + "                <th>Point</th>\n"
                + "                <th>Edit</th>\n"
                + "                <th>Delete</th>\n"
                + "            </tr>\n";

        String table_2 = "            <tr>\n"
                + "                <td>Cell1</td>\n"
                + "                <td>Cell1</td>\n"
                + "                <td>Cell1</td>\n"
                + "                <td><input type='button' value='Edit'></td>\n"
                + "                <td><input type='button' value='Delete'></td>\n"
                + "                <td>Cell2</td>\n"
                + "            </tr>\n";

        String table_3 = "        </table>";
//        String table=table_1+table_2+table_3;
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet arraylist</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(table_1);
        int count = 1;
        for (Student s : array3) {
            out.println("            <tr>\n"
                    + "                <td> " + count + "</td>\n"
                    + "                <td>" + s.getName() + "</td>\n"
                    + "                <td>" + s.getAge() + "</td>\n"
                    + "                <td>" + s.getPoint() + "</td>\n"
                    + "                <td><a href=url'>Edit</a></td>\n"
                    + "                <td><a href='delete'>Delete</a></td>\n"
                    + "            </tr>\n");
            count++;
        }
        out.println(table_3);
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
