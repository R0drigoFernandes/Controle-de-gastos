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
public class screen extends JPanel implements ActionListener{
             private String gastos, nomeDoGasto, nomeDoGanho, ganho;
            
        public void screen(){
               
                JFrame frame = new JFrame("Controle de gastos");
               frame.setVisible(true);
               frame.setSize(500, 500);
               frame.getContentPane().setBackground(Color.white);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setResizable(false);
               frame.setLocationRelativeTo(null);
               frame.setLayout(null);
               JButton botãoGasto = new JButton("Gasto");
               JButton botãoGanho = new JButton("Ganho");
               botãoGanho.setBounds(300, 380, 100, 70);
               botãoGasto.setBounds(100, 380, 100, 70);
               Font font = new Font("Arial", Font.BOLD, 20);
               botãoGanho.setFont(font);
               botãoGasto.setFont(font);
               botãoGanho.setBackground(Color.green);
               botãoGasto.setBackground(Color.RED);
               botãoGanho.setForeground(Color.BLACK);
               botãoGasto.setForeground(Color.BLACK);
               frame.add(botãoGasto);
               frame.add(botãoGanho);

               botãoGanho.addActionListener(this);
               botãoGasto.addActionListener(this:: gasto);

                
             
    
             
    
        }

        public void gasto(ActionEvent actionEvent) {
             nomeDoGasto = JOptionPane.showInputDialog("Qual o nome do gasto?");
             gastos = JOptionPane.showInputDialog("Qual o valor de gasto?");
                Gasto gasto = new Gasto();
             gasto.setGasto(Double.parseDouble(gastos));

             JOptionPane.showMessageDialog(null, "Seu gasto com " + nomeDoGasto + " foi de: " + gasto.getGasto() + " reais");

            

            
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            
             nomeDoGanho = JOptionPane.showInputDialog("Qual o nome do ganho?");
             ganho = JOptionPane.showInputDialog("Qual o valor de ganho?");
                Ganhos ganhos = new Ganhos();
             ganhos.setGanhos(Double.parseDouble(ganho));

             JOptionPane.showMessageDialog(null, "Seu ganho com " + nomeDoGanho + " foi de: " + ganhos.getGanhos() + " reais");
             

             
        
            
        }

        

        
        
    }
