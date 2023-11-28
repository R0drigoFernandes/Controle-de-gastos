
public class ControleDeGastos{

public static void main(String[] args){
        Total total = new Total();
        Gasto gasto = new Gasto();
        Double x , y;
        x = total.getTotal();
        y = gasto.getGasto();
        
      
        
        screen screen = new screen();
        

        while (true) { 
            
            screen.screen();
            
            try {
                Thread.sleep(1000/60);
            } catch (Exception e) {
             e.printStackTrace();
 
            }
            
         }
        
        
           
        
        
        
    }
    
    
    

    }

   


    

