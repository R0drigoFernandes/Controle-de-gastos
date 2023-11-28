import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

   


    

