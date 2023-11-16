import java.util.Scanner;

public class Gasto extends Main {
    Scanner scanner = new Scanner(System.in);
    
    private double gasto;
    private String nomeDoGasto;
    private boolean botãoGasto;
    

    public boolean isBotãoGasto() {
        return botãoGasto;
    }

    public void setBotãoGasto(boolean botãoGasto) {
        this.botãoGasto = botãoGasto;
    }

    public void setGasto(double gasto){
        
        this.gasto = gasto;
    }
    
    public double getGasto(){
        return gasto;
    }

    public String getNomeDoGasto() {
        return nomeDoGasto;
    }

    public void setNomeDoGasto(String nomeDoGasto) {
        this.nomeDoGasto = nomeDoGasto;
    }
    public void gasto(){
        System.out.println("Qual o nome do gasto?");
            setNomeDoGasto(scanner.nextLine());
            System.out.println("Qual o valor de gasto?");
            setGasto(scanner.nextDouble());
            System.out.println("O gasto" + getNomeDoGasto() + " foi de: " + getGasto());
            
            
    }
    
}
