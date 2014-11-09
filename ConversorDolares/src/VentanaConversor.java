import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame {
	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorDolares;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public VentanaConversor(float valorConversion) {
		
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas de texto
		valorEuros = new JTextField();
		valorEuros.setBounds(0, 60, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		valorDolares = new JTextField();
		valorDolares.setBounds(0, 116, 86, 20);
		contentPane.add(valorDolares);
		valorDolares.setColumns(10);
		
		
		//Etiquetas
		lblNewLabel = new JLabel("Euros");
		lblNewLabel.setBounds(0, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
	    lblNewLabel_1 = new JLabel("Dolares");
		lblNewLabel_1.setBounds(0, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		//Boton
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			
			//Codigo boton
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros = Float.parseFloat(valorEuros.getText());
				valorDolares.setText(String.valueOf(euros*valorConversion));
			}
		});
		btnNewButton.setBounds(102, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
