/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author king
 */
public class test {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        String[][] array2 = {
            {"Name", "age", "point"},
            {"John", "8", "10"}
        };
        // duyệt mảng
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i][0]);System.out.print(" ");
            System.out.print(array2[i][1]);System.out.print(" ");
            System.out.print(array2[i][2]);System.out.print(" ");
            System.out.print(" ");
            System.out.println();
        }
    }

}
