import java.util.Scanner;
public class Ganhos extends ControleDeGastos {
    Scanner scanner = new Scanner(System.in);
private double ganhos;
private String nomeDoGanho;
private boolean botãoGanho;

    public boolean isBotãoGanho() {
    return botãoGanho;
}
public void setBotãoGanho(boolean botãoGanho) {
    this.botãoGanho = botãoGanho;
}
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
    
    public void ganhos(){
        System.out.println("Qual o nome do ganho?");
           setNomeDoGanho(scanner.nextLine());
            System.out.println("Qual o valor de ganho?");
            setGanhos(scanner.nextDouble());
            System.out.println( getNomeDoGanho() + " foi de: " + getGanhos());  
    }
    
    
}
