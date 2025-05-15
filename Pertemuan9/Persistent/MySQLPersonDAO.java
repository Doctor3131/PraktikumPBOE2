

package Pertemuan9.Persistent;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jbdc.Driver");
        Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/pbo", "root", "Profesor_31");

        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}


