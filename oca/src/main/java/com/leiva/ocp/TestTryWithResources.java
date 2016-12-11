package com.leiva.ocp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTryWithResources {

    public static void main(String[] args) throws IOException {
        printFileJava7();
    }

    private static void printFileJava7() throws IOException {
        try (FileInputStream input = new FileInputStream("D:\\PruebasMirth\\20511908745\\01\\input\\error\\20511908745_01_F001-111.txt");
                BufferedInputStream bufferedInput = new BufferedInputStream(input)) {
            int data = bufferedInput.read();
            while (data != -1) {
                System.out.print((char) data);
                data = bufferedInput.read();
            }
        }
    }

    private static void getData() {
        final String query = "Select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

        Connection conn = null;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " + price + ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
