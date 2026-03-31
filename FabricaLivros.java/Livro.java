public class Livro{
  private String titulo;  
  private String autor;
  private int anoPublicacao;
  private int quantidadePgs;
  private double preco;
  
  public Livro(String titulo, String autor, int anoPublicacao, int quantidadePgs, double preco){
         this.titulo = titulo;
         this.autor = autor;
         this.anoPublicacao = anoPublicacao;
         this.quantidadePgs = quantidadePgs;
         this.preco = preco;
  }
     
  public String getTitulo(){
      return titulo;
  }
  
  public String getAutor(){
      return autor;
  }
  
  public int getAnoPublicacao(){
      return anoPublicacao;
  }
  
  public int getQuantidadePgs(){
      return quantidadePgs;
  }
 
  public double getPreco(){
      return preco;
  }
  
  
  public void setTitulo(String titulo){
      this.titulo = titulo;
  } 
  
   public void setAutor(String autor){
      this.autor = autor;
  }
  
  public void setAnoPublicacao(int anoPublicacao){
      this.anoPublicacao = anoPublicacao;
  }
   
  public void setQuantidadePgs(int quantidadePgs){
      this.quantidadePgs = quantidadePgs;
  }
  
  public void setPreco(double preco){
      this.preco = preco;
  }
    
  
  public double calcularPrecoPorPagina(){
    return preco / quantidadePgs;
  }
  
  public void imprimirInfoLivro(){
      System.out.println("Título: "+ titulo);
      System.out.println("Autor: "+ autor);
      System.out.println("Ano de publicação do livro: "+anoPublicacao);
      System.out.println("Quantidade de páginas: "+quantidadePgs);
      System.out.printf("Preco: R$ %.2f%n", preco);
      System.out.println();
  }
}
  