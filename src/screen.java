import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class screen implements ActionListener{
             private String gastos, nomeDoGasto, nomeDoGanho, ganho;
             Total total = new Total();
             JFrame frame = new JFrame("Controle de gastos");
             
        public void screen(){
               frame.setVisible(true);
               frame.setSize(500, 500);
               frame.getContentPane().setBackground(Color.white);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setResizable(false);
               frame.setLocationRelativeTo(null);
               frame.setLayout(null);
               JLabel label1 = new JLabel();
               label1.setText("Controle de Gastos");
               label1.setBounds(100, 20, 300, 50);
               label1.setFont(new Font("Arial", Font.BOLD, 30));
               frame.add(label1);
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
               JTextField textField = new JTextField("Total: " + total.getTotal());
               textField.setBounds(100, 300, 100, 50);
               frame.add(textField);
               
               
               



           
    
        }

        public void gasto(ActionEvent actionEvent) {
             nomeDoGasto = JOptionPane.showInputDialog("Qual o nome do gasto?");
             gastos = JOptionPane.showInputDialog("Qual o valor de gasto?");
             Gasto gasto = new Gasto();
             
             gasto.setGasto(Double.parseDouble(gastos));
             gasto.setNomeDoGasto(nomeDoGasto);
             JOptionPane.showMessageDialog(null, "Seu gasto com " + nomeDoGasto + " foi de: " + gasto.getGasto() + " reais");
             total.setTotal(total.getTotal() - gasto.getGasto());
             
            
            
            
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            
             nomeDoGanho = JOptionPane.showInputDialog("Qual o nome do ganho?");
             ganho = JOptionPane.showInputDialog("Qual o valor de ganho?");
               Ganhos ganhos = new Ganhos();
             ganhos.setGanhos(Double.parseDouble(ganho));
            ganhos.setNomeDoGanho(nomeDoGanho);

             JOptionPane.showMessageDialog(null, "Seu ganho com " + nomeDoGanho + " foi de: " + ganhos.getGanhos() + " reais");
             
             total.setTotal(ganhos.getGanhos());
             
               
               
             
        
            
        }

        
        
        
        
    }
