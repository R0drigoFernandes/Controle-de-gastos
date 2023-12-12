import javax.swing.SwingUtilities;

public class ControleDeGastos{

public static void main(String[] args){
        screen screen = new screen();
        Grafico grafico = new Grafico();
        Ganhos ganhos = new Ganhos();
        Gasto gasto = new Gasto();

        while (true) { 
        
            
            screen.screen();
            grafico.grafico(250, 250, 360, ganhos.getGanhos(), gasto.getGasto());
            grafico.drawPieChart(screen.frame.getGraphics());
           
            
            
            try {
                Thread.sleep(1000/120);
            } catch (Exception e) {
             e.printStackTrace();
 
            }
        
            
         }
         
         
        
        
           
        
        
        
    }
    
    
    

    }

   


    

