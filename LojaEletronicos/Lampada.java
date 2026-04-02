public class Lampada{
    private boolean lampadaLigada;
    
    public Lampada(boolean lampadaLigada){
        this.lampadaLigada = lampadaLigada;
    }
    
    public boolean isLigada(){
        return lampadaLigada;
    }
    
    public void setGLampadaLigada(boolean lampadaLigada){
        this.lampadaLigada = lampadaLigada;
    }
}