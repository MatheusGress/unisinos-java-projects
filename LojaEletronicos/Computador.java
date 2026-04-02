public class Computador{
    private String marca;
    private int velocidade;
    private int anoFabricacao;
    private boolean computadorNovo;
    
    public Computador(String marca, int velocidade, int anoFabricacao, boolean computadorNovo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.computadorNovo = computadorNovo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;

    }
    
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
    public boolean computadorNovo(){
        return computadorNovo;
    }
    
    public void setComputadorNovo(boolean computadorNovo){
        this.computadorNovo = computadorNovo;
    }
}