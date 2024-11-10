
package funcionariosDAO;

import funcionarios.funcionarios;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class funcionariosDAO {
         private conexao conexao;
private Connection conn;
public funcionariosDAO() {
this. conexao = new conexao () ;
this.conn = this. conexao.getConexao ();
}
public void inserir(funcionarios funcionarios) {
    String sql = "INSERT INTO funcionarios (cpf, email, nome, telefone) VALUES (?, ?, ?, ?)";
    
    try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
        stmt.setString(1, funcionarios.getCpf());
        stmt.setString(2, funcionarios.getEmail());
        stmt.setString(3, funcionarios.getNome());
        stmt.setString(4, funcionarios.getTelefone());
        
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao inserir funcionario: " + e.getMessage());
    }
}

public void alterar(funcionarios funcionarios) {
    String sql = "UPDATE funcionarios SET Cpf=?, Email=?, Nome=?, Telefone=? WHERE id=?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, funcionarios.getCpf());
        stmt.setString(2, funcionarios.getEmail());
        stmt.setString(3, funcionarios.getNome());
        stmt.setString(4, funcionarios.getTelefone());
        stmt.setInt(5, funcionarios.getId());
        stmt.executeUpdate();
    } catch(SQLException e) {
        System.out.println("Erro ao atualizar funcionario: " + e.getMessage());
    }
}

public void excluir(int id) {
    String sql = "DELETE FROM funcionarios WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao excluir funcionario: " + e.getMessage());
    }
}

public funcionarios getFuncionarios(int id) {
    String sql = "SELECT * FROM funcionarios WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            funcionarios funcionarios = new funcionarios();
            funcionarios.setId(rs.getInt("id"));
            funcionarios.setCpf(rs.getString("Cpf"));
            funcionarios.setEmail(rs.getString("Email"));
            funcionarios.setNome(rs.getString("Nome"));
            funcionarios.setTelefone(rs.getString("Telefone"));
            return funcionarios;
        } else {
            System.out.println("Funcionario não encontrado com ID: " + id);
            return null;
        }
        
    } catch (SQLException e) {
        System.out.println("Erro ao obter funcionario: " + e.getMessage());
        return null;
    }
}

public List<funcionarios> getFuncionarios() {
    String sql = "SELECT * FROM funcionarios";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        List<funcionarios> listaFuncionarios = new ArrayList<>();
        while (rs.next()) {
            funcionarios p = new funcionarios();
            p.setId(rs.getInt("id"));
            p.setCpf(rs.getString("Cpf"));
            p.setEmail(rs.getString("Email"));
            p.setNome(rs.getString("Nome"));
            p.setTelefone(rs.getString("Telefone"));
            listaFuncionarios.add(p);
        }
        return listaFuncionarios;
    } catch (SQLException e) {
        System.out.println("Erro ao listar funcionario: " + e.getMessage());
        return null;
    }
}
    
}
