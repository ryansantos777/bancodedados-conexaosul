
package vendasDAO;

import conexao.conexao;
import vendas.vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class vendasDAO {
    private conexao conexao;
private Connection conn;
public vendasDAO() {
this. conexao = new conexao () ;
this.conn = this. conexao.getConexao ();
}

public void inserir(vendas vendas) {
    String sql = "INSERT INTO vendas (id_cliente, id_funcionario, id_veiculo, data_venda, valor_venda) VALUES (?, ?, ?, ?, ?)";
    
            
    try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
        stmt.setInt(1, vendas.getId_cliente());
        stmt.setInt(2, vendas.getId_funcionario());
        stmt.setInt(3, vendas.getId_veiculo());
        stmt.setString(4, vendas.getData_venda());
        stmt.setInt(5, vendas.getValor_venda());
        
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao inserir venda: " + e.getMessage());
    }
}

public void alterar(vendas vendas) {
    String sql = "UPDATE vendas SET id_cliente=?, id_funcionario=?, id_veiculo=?, data_venda=?, valor_venda=? WHERE id=?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, vendas.getId_cliente());
        stmt.setInt(2, vendas.getId_funcionario());
        stmt.setInt(3, vendas.getId_veiculo());
        stmt.setString(4, vendas.getData_venda());
        stmt.setInt(5, vendas.getValor_venda());
        stmt.setInt(6, vendas.getId());
        stmt.executeUpdate();
    } catch(SQLException e) {
        System.out.println("Erro ao atualizar venda: " + e.getMessage());
    }
}

public void excluir(int id) {
    String sql = "DELETE FROM vendas WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao excluir venda: " + e.getMessage());
    }
}

public vendas getVendas(int id) {
    String sql = "SELECT * FROM vendas WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            vendas vendas = new vendas();
            vendas.setId(rs.getInt("id"));
            vendas.setId_cliente(rs.getInt("id_cliente"));
            vendas.setId_funcionario(rs.getInt("id_funcionario"));
            vendas.setId_veiculo(rs.getInt("id_veiculo"));
            vendas.setData_venda(rs.getString("data_venda"));
            vendas.setValor_venda(rs.getInt("valor_venda"));
            return vendas;
        } else {
            System.out.println("venda não encontrado com ID: " + id);
            return null;
        }
        
    } catch (SQLException e) {
        System.out.println("Erro ao obter venda: " + e.getMessage());
        return null;
    }
}

public List<vendas> getVendas() {
    String sql = "SELECT * FROM vendas";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        List<vendas> listaVendas = new ArrayList<>();
        while (rs.next()) {
            vendas p = new vendas();
            p.setId(rs.getInt("id"));
            p.setId_cliente(rs.getInt("id_cliente"));
            p.setId_funcionario(rs.getInt("id_funcionario"));
            p.setId_veiculo(rs.getInt("id_veiculo"));
            p.setData_venda(rs.getString("data_venda"));
            p.setValor_venda(rs.getInt("Valor_venda"));
            listaVendas.add(p);
        }
        return listaVendas;
    } catch (SQLException e) {
        System.out.println("Erro ao listar venda: " + e.getMessage());
        return null;
    }
}
}
