
import DAO.ConnectDB;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author king
 */
public class test {
    public static void main(String[] args) throws SQLException {
        // khoi tao 1 connectDB object
        ConnectDB  conn=new ConnectDB();
        Connection h=conn.Connect();
        Statement stmt=h.createStatement();
        stmt.executeQuery("select * from SinhVien");
        ResultSet s= stmt.getResultSet();
       
//        PreparedStatement stmt=h.prepareStatement("select * from SinhVien");
//        stmt.execute();
//        ResultSet s= stmt.getResultSet();
  
        while (s.next()) {
                    System.out.println("ID: " + s.getInt("MaSinhVien"));
                    System.out.println("Tên: " + s.getString("HoTen"));
//                    System.out.println("Tuổi: " + s.getInt("HoTen"));
                    System.out.println("-------------------");
                }
   
//        System.out.println(stmt);
        // thuc hien phuong thuc ket noi
        // tao statemen
        
        
       
    }
    
}
