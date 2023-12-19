
import java.awt.Canvas;

public class ControleDeGastos extends Canvas implements Runnable {
    
 screen screen = new screen();
        Grafico grafico = new Grafico();
        Ganhos ganhos = new Ganhos();
        Gasto gasto = new Gasto();
    @Override
    public void run() {
        while (true) { 
            screen.screen();
            grafico.grafico(250, 200, 60, ganhos.getGanhos(), gasto.getGasto());
            grafico.drawPieChart(screen.frame.getGraphics());
            try {
                Thread.sleep(1000/60);
            } catch (Exception e) {
             e.printStackTrace();
 
            }
            
         }
    }

public static void main(String[] args) throws Exception {
    new Thread(new ControleDeGastos()).start();
       
        
        
    }
    
    
    

    }

   


    

