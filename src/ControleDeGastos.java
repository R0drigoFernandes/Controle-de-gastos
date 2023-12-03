
public class ControleDeGastos{

public static void main(String[] args){
        Total total = new Total();
        Gasto gasto = new Gasto();
        screen screen = new screen();
        Grafico grafico = new Grafico();
        

        while (true) { 
            if(total.getTotal() > 0){
            grafico.anguloGreen = 360;

        }
        if(gasto.getGasto() > 0){
            grafico.anguloRed = (int) (gasto.getGasto() * 3.6);
        }
            
            screen.screen();
            grafico.grafico(screen.frame.getGraphics());
            
            
            try {
                Thread.sleep(1000/60);
            } catch (Exception e) {
             e.printStackTrace();
 
            }
        
            
         }
         
         
        
        
           
        
        
        
    }
    
    
    

    }

   


    

