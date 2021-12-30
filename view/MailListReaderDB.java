/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;


/**
 *
 * @author Rebe
 */


public class MailListReaderDB {

    static String url = "jdbc:sqlite:KATA5.db";

    public static List<Mail> readBD() {
        List<Mail> mailList = new ArrayList<>();
        
        String selectAllSQL = "SELECT MAIL FROM EMAIL";
        try ( Connection conn = connect();  
                Statement stmt = conn.createStatement();  
                ResultSet rs = stmt.executeQuery(selectAllSQL)) {
            while (rs.next()) {
                mailList.add(new Mail(rs.getString("Mail")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return mailList;
    }

    private static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
