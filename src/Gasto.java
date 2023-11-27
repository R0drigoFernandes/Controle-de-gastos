import java.util.Scanner;

public class Gasto extends screen {
    Scanner scanner = new Scanner(System.in);
    
    private double gasto;
    private String nomeDoGasto;
    private boolean botãoGasto;
    

    

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
   
    
}
