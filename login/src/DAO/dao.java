package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dao {
	// Tạo ra một đối tượng connect
    private Connection connect;

    public dao() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/doancuoiki";
        String user = "root";
        String password = "naruto523";
        connect = DriverManager.getConnection(url,user,password);
        // System.out.println("connect successful.....");
    }
    // Tạo ra một phương thức trả về kết nối
    public Connection getConnect() {
        return connect;
    }
}
