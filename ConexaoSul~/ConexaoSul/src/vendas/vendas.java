
package vendas;


public class vendas {
    private int id;
    private int id_cliente;
    private int id_funcionario;
    private int id_veiculo;
    private String data_venda;
    private int valor_venda;
    
    public int getId() {
        return id;
      }  
    public void setId(int id) {
            this.id = id;
            
        }
     public int getId_cliente() {
        return id_cliente;
        
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
        
    }
    public int getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public int getId_veiculo() {
        return id_veiculo;
        
    }
    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
         
    }
    public String getData_venda() {
        return data_venda;
        
    }
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
    
        public int getValor_venda() {
        return valor_venda;
        
    }
    public void setValor_venda(int valor_venda) {
        this.valor_venda = valor_venda;
    }
}
