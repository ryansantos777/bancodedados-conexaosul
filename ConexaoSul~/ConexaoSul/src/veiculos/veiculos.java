
package veiculos;

public class veiculos {
            private int id;
    private String modelo;
    private String marca;
    private int ano;
    private int quilometragem;
    private String preço;
    
    public int getId() {
        return id;
      }  
    public void setId(int id) {
            this.id = id;
            
        }
     public String getModelo() {
        return modelo;
        
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
        
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
        
    }
    public void setAno(int ano) {
        this.ano = ano;
         
    }
        public int getQuilometragem() {
        return quilometragem;
        
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public String getPreço() {
        return preço;
    }
    public void setPreço(String preço) {
        this.preço = preço;
    }
}
