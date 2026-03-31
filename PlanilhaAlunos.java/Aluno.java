public class Aluno{
    private String nome;
    private String matricula;
    private double notaGrauA;
    private double notaGrauB;
    
    public Aluno(String nome, String matricula, double notaGrauA, double notaGrauB){
        this.nome = nome;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getNotaGrauA(){
        return notaGrauA;
    }
    
    public double getNotaGrauB(){
        return notaGrauB;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNotaGrauA(double notaGrauA){
        this.notaGrauA = notaGrauA;
    }
    
    public void setNotaGrauB(double notaGrauB){
        this.notaGrauB = notaGrauB;
    }
    
    public double calculaMediaFinal(){
       return (notaGrauA * 0.33) + (notaGrauB * 0.67);
    }
    
    public void imprimeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Nota do grau A: %.2f%n", notaGrauA);
        System.out.printf("Nota do grau B:  %.2f%n", notaGrauB);
        System.out.printf("Média final:  %.2f%n", calculaMediaFinal());
        System.out.println();
    }
}