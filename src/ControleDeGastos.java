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
public class ControleDeGastos {

public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
       JOptionPane jOptionPane = new JOptionPane();
        
        screen screen = new screen();

        screen.screen();

        
        char opcao;
        double total = 0;
        Gasto gasto = new Gasto();
        Ganhos ganhos = new Ganhos();


        opcao = scanner.nextLine().charAt(0);
    
         
        if (opcao == 'g') {
            ganhos.setBotãoGanho(true);
        }else if (opcao == 'h') {
            gasto.setBotãoGasto(true);
        }
        
       
        if (ganhos.isBotãoGanho()) {
           ganhos.ganhos();
        }

        if(gasto.isBotãoGasto()) {
            gasto.gasto();
            
            total = ganhos.getGanhos() - gasto.getGasto();
            if(total < 0) {
                System.out.println("Voce ultrapassou o orcamento");
            }else{
                System.out.println("Voce tem um total de: " + total + "para guardar");
            }
            

        }
       
       scanner.close();
    }
    
    

    }

   


    

