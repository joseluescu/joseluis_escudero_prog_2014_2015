import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConver extends JFrame{
	//ventana
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public VentanaConver(float valorConversion) {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CAJA DE TEXTO
		

		textField = new JTextField();
		textField.setBounds(10, 46, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 106, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//ETIQUETAS
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 21, 109, 14);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("DOLARES");
		lblDolares.setBounds(10, 81, 109, 14);
		contentPane.add(lblDolares);
		
		//BOTON Y CODIGO
		
		JButton btnNewButton = new JButton("CONVERTIR");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros =Float.parseFloat(textField.getText());
				textField_1.setText(String.valueOf(euros*valorConversion));
			}
		});
		btnNewButton.setBounds(130, 45, 120, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
