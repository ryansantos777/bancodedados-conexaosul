
package clientesDAO;

import clientes.clientes;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class clientesDAO {
     private conexao conexao;
private Connection conn;
public clientesDAO() {
this. conexao = new conexao () ;
this.conn = this. conexao.getConexao ();
}

public void inserir(clientes clientes) {
    String sql = "INSERT INTO clientes (cpf, email, nome, telefone) VALUES (?, ?, ?, ?)";
    
    try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
        stmt.setString(1, clientes.getCpf());
        stmt.setString(2, clientes.getEmail());
        stmt.setString(3, clientes.getNome());
        stmt.setString(4, clientes.getTelefone());
        
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao inserir clientes: " + e.getMessage());
    }
}

public void alterar(clientes clientes) {
    String sql = "UPDATE clientes SET Cpf=?, Email=?, Nome=?, Telefone=? WHERE id=?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, clientes.getCpf());
        stmt.setString(2, clientes.getEmail());
        stmt.setString(3, clientes.getNome());
        stmt.setString(4, clientes.getTelefone());
        stmt.setInt(5, clientes.getId());
        stmt.executeUpdate();
    } catch(SQLException e) {
        System.out.println("Erro ao atualizar clientes: " + e.getMessage());
    }
}

public void excluir(int id) {
    String sql = "DELETE FROM clientes WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao excluir clientes: " + e.getMessage());
    }
}

public clientes getClientes(int id) {
    String sql = "SELECT * FROM clientes WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            clientes clientes = new clientes();
            clientes.setId(rs.getInt("id"));
            clientes.setCpf(rs.getString("Cpf"));
            clientes.setEmail(rs.getString("Email"));
            clientes.setNome(rs.getString("Nome"));
            clientes.setTelefone(rs.getString("Telefone"));
            return clientes;
        } else {
            System.out.println("Cliente não encontrado com ID: " + id);
            return null;
        }
        
    } catch (SQLException e) {
        System.out.println("Erro ao obter cliente: " + e.getMessage());
        return null;
    }
}

public List<clientes> getClientes() {
    String sql = "SELECT * FROM clientes";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        List<clientes> listaClientes = new ArrayList<>();
        while (rs.next()) {
            clientes p = new clientes();
            p.setId(rs.getInt("id"));
            p.setCpf(rs.getString("Cpf"));
            p.setEmail(rs.getString("Email"));
            p.setNome(rs.getString("Nome"));
            p.setTelefone(rs.getString("Telefone"));
            listaClientes.add(p);
        }
        return listaClientes;
    } catch (SQLException e) {
        System.out.println("Erro ao listar cliente: " + e.getMessage());
        return null;
    }
}

}
