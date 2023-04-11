package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankSystem", "admin", "123456654321");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
