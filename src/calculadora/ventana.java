package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {

    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField("");
    JTextField txtValor2 = new JTextField("");
     JLabel lblResultado = new JLabel("Total");
      int valor1=0;
    public ventana() {
        this.setVisible(true);//Hacer vivible la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Finalizar ejecucion
    
    }
//crear panel

    public void insertarPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setBackground(Color.GRAY);
        panelInicio.setLayout(null);//Desactivar la organizacion automatica
    }

    public void insertarEtiquetas() {
        JLabel lblValor1 = new JLabel("Ingrese el primer valor");
        lblValor1.setBounds(20, 10, 180, 15);
        panelInicio.add(lblValor1);
        JLabel lblValor2 = new JLabel("Ingrese el segundo valor");
        lblValor2.setBounds(20, 30, 180, 10);
        panelInicio.add(lblValor2);
       
        lblResultado.setBounds(100, 80, 200, 25);
        panelInicio.add(lblResultado);
    }

    public void insertarTextos() {

        txtValor1.setBounds(190, 10, 150, 25);
        panelInicio.add(txtValor1);
        txtValor1.repaint();

        txtValor2.setBounds(190, 30, 150, 25);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
    }

    public void insetarBotones() {
        JButton btnSumar = new JButton("Suma");
        btnSumar.setBounds(120, 100, 80, 30);
        panelInicio.add(btnSumar);
        btnSumar.repaint();

        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")||txtValor2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Dede de llenar los campos");
                    
                }else{
                    int resultadosSuma=Integer.parseInt(txtValor1.getText())+Integer.parseInt(txtValor2.getText());
                    lblResultado.setText("Total"+String.valueOf(resultadosSuma));
                }
            }
        };
        btnSumar.addActionListener(sumando);
        
        JButton btnSum = new JButton("+");
        panelInicio.add(btnSum);
        btnSum.setBounds(230, 130, 80, 30);
        ActionListener suma2=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtValor1.getText().equals("")) {
                   JOptionPane.showMessageDialog(null,"Debe de ingresar un valor"); 
                    
                }else{
                     valor1 +=Integer.parseInt(txtValor1.getText());
                    txtValor1.setText("");
                }
               }
        };
         btnSum.addActionListener(suma2);
         
    }
}
