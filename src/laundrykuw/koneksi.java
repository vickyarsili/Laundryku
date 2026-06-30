package laundrykuw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static Connection conn;

    public static Connection getKoneksi() {

        if (conn == null) {
            try {

                String url = "jdbc:mysql://127.0.0.1:3306/laundryku";
                String user = "root";
                String pass = "123456";   // Ganti menjadi "123456" jika root memakai password

                Class.forName("com.mysql.jdbc.Driver");

                conn = DriverManager.getConnection(url, user, pass);

                System.out.println("Koneksi database berhasil");

            } catch (ClassNotFoundException e) {

                System.out.println("Driver MySQL tidak ditemukan!");

            } catch (SQLException e) {

                System.out.println("Koneksi database gagal!");
                System.out.println(e.getMessage());

            }
        }

        return conn;
    }

}