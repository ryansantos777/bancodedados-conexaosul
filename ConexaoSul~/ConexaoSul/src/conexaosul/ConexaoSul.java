
package conexaosul;

import conexao.conexao;

public class ConexaoSul {

    public static void main(String[] args) {
    try {
        conexao a = new conexao();
        a.getConexao();
        System.out.println("Conectado com sucesso");
        
    } catch (Exception e) {
        System.out.println("Não conectado");
        
    }
    }
    
}
