
public class ControleDeGastos{

public static void main(String[] args){
        Total total = new Total();
        Gasto gasto = new Gasto();
        Double x , y;
        x = total.getTotal();
        y = gasto.getGasto();
        
      
        
        screen screen = new screen();
        Grafico grafico = new Grafico(x, y);

        while (true) { 
            screen.screen();
            grafico.grafico(screen.frame.getGraphics());
            try {
                Thread.sleep(0);
            } catch (Exception e) {
             e.printStackTrace();
 
            }
            
         }
        
        
           
        
        
        
    }
    
    
    

    }

   


    

