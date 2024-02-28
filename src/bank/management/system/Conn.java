
package bank.management.system;

import java.sql.*;
public class Conn {
    
    Connection c;
   static  Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///atmsimulatorsystem","root", "root123");
            s= c.createStatement();
            System.out.println("Conn intilized");
        }catch(Exception e){
            System.out.println("my code exception:=="+e);
        }
    }
        public  Statement getStatement()
        {
            return s;
        }
    
}
