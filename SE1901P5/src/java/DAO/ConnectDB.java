/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author king
 */
public class ConnectDB {
//    Connection luom ;

//    public ConnectDB(Connection luom) {
//        this.luom = luom;
//    }
    public Connection Connect(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=FU_example;trustServerCertificate=true;";
        // kieu du lieu Connection 
        Connection luom ;
        try {
            luom = DriverManager.getConnection(url, "sa", "abc@1234");
            System.out.println("Kết nối thành công");
            return luom;

        } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
            e.printStackTrace();
            return  null;
            
        }
        // khi ket noi thanh cong rooi thi tao moi statment
//         Statement stmt= luom.createStatement();
//         ResultSet result= stmt.executeQuery("SELECT * FROM Student");
//         System.out.println(result);
    }

}
