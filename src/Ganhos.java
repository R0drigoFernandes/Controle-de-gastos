import java.util.Scanner;
public class Ganhos extends screen {
    Scanner scanner = new Scanner(System.in);
private double ganhos;
private String nomeDoGanho;


 
    public void setGanhos(double ganhos){
        this.ganhos = ganhos;
    }
    public double getGanhos(){
        return ganhos;
    }
    public String getNomeDoGanho() {

        return nomeDoGanho;

    }
    public void setNomeDoGanho(String nomeDoGanho) {
        this.nomeDoGanho = nomeDoGanho;
    }
    
    
    
    
}
