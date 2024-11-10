
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
    
    public Connection getConexao(){
       try {
         
           return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/concessionaria", "root", "");
           
       } catch(SQLException e) {
           
           JOptionPane.showMessageDialog(null, "Erro de conexao");
           return null;
           
       }
       }
}
