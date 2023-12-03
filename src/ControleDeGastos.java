
public class ControleDeGastos{

public static void main(String[] args){
        screen screen = new screen();
        Grafico grafico = new Grafico();
        

        while (true) { 
        
            
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

   


    

