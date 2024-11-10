
package veiculosDAO;

import veiculos.veiculos;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class veiculosDAO {
    private conexao conexao;
private Connection conn;
public veiculosDAO() {
this. conexao = new conexao () ;
this.conn = this. conexao.getConexao ();
}

public void inserir(veiculos veiculos) {
    String sql = "INSERT INTO veiculos (modelo, marca, ano, quilometragem, preço) VALUES (?, ?, ?, ?, ?)";
            
    try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
        stmt.setString(1, veiculos.getModelo());
        stmt.setString(2, veiculos.getMarca());
        stmt.setInt(3, veiculos.getAno());
        stmt.setInt(4, veiculos.getQuilometragem());
        stmt.setString(5, veiculos.getPreço());
        
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao inserir veiculos: " + e.getMessage());
    }
}

public void alterar(veiculos veiculos) {
    String sql = "UPDATE veiculos SET Modelo=?, Marca=?, Ano=?, Quilometragem=?, Preço=? WHERE id=?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, veiculos.getModelo());
        stmt.setString(2, veiculos.getMarca());
        stmt.setInt(3, veiculos.getAno());
        stmt.setInt(4, veiculos.getQuilometragem());
        stmt.setString(5, veiculos.getPreço());
        stmt.setInt(6, veiculos.getId());
        stmt.executeUpdate();
    } catch(SQLException e) {
        System.out.println("Erro ao atualizar veiculos: " + e.getMessage());
    }
}

public void excluir(int id) {
    String sql = "DELETE FROM veiculos WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    } catch(SQLException e) {
        System.out.println("Erro ao excluir veiculos: " + e.getMessage());
    }
}

public veiculos getVeiculos(int id) {
    String sql = "SELECT * FROM veiculos WHERE id = ?";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            veiculos veiculos = new veiculos();
            veiculos.setId(rs.getInt("id"));
            veiculos.setModelo(rs.getString("Modelo"));
            veiculos.setMarca(rs.getString("Marca"));
            veiculos.setAno(rs.getInt("Ano"));
            veiculos.setQuilometragem(rs.getInt("Quilometragem"));
            veiculos.setPreço(rs.getString("Preço"));
            return veiculos;
        } else {
            System.out.println("Veiculo não encontrado com ID: " + id);
            return null;
        }
        
    } catch (SQLException e) {
        System.out.println("Erro ao obter veiculo: " + e.getMessage());
        return null;
    }
}

public List<veiculos> getVeiculos() {
    String sql = "SELECT * FROM veiculos";
    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        List<veiculos> listaVeiculos = new ArrayList<>();
        while (rs.next()) {
            veiculos p = new veiculos();
            p.setId(rs.getInt("id"));
            p.setModelo(rs.getString("Modelo"));
            p.setMarca(rs.getString("Marca"));
            p.setAno(rs.getInt("Ano"));
            p.setQuilometragem(rs.getInt("Quilometragem"));
            p.setPreço(rs.getString("Preço"));
            listaVeiculos.add(p);
        }
        return listaVeiculos;
    } catch (SQLException e) {
        System.out.println("Erro ao listar veiculos: " + e.getMessage());
        return null;
    }
}

} 
