package net.xciator.message.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.xciator.message.Client.ClientLogin;

public class LoginSystem {
        {
            Connection connection;
            try {
                String url = "jdbc:mysql://localhost:3306/MySQLDatabase";
                String user = "root";
                String password = "";
                connection = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                e.printStackTrace();
                //throw new RuntimeException(e);

            }
        }
}
