public class Cliente{
    private String nome;
    private String email;
    private String senha;
    private char sexo;
    private int idade;
    
    public Cliente(String nome, int idade, char sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }    
    
    public String getNome(){
        return nome;  
    }
    
    public String getEmail(){
        return email;
    }
   
    public String getSenha(){
        return senha;
    }
    
    public char getSexo(){
        return sexo;
    }
        public int getIdade(){
        return idade;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
     
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    

    public void imprimirInfoCliente(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Sexi: "+ sexo);
        System.out.println("E-mail: "+ email);
        System.out.println("Senha: "+ senha);
        System.out.println();
    }
}