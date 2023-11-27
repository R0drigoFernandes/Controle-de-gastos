import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class ControleDeGastos{

public static void main(String[] args){
    
        
       
      
        
        screen screen = new screen();

         while (true) { 
           screen.screen();
           
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
            e.printStackTrace();

           }
           
        }
        
        
    }
    
    
    

    }

   


    

