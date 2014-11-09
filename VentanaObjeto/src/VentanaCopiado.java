import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCampo;
	private JTextField textField_1;
	private JLabel lblCampo_1; 
	private JButton btnNewButton;
	
	public VentanaCopiado() {
	
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas de texto
		textField = new JTextField();
		textField.setBounds(0, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//Etiquetas
		lblCampo = new JLabel("Campo1");
		lblCampo.setBounds(0, 29, 86, 20);
		contentPane.add(lblCampo);
		
		
		lblCampo_1 = new JLabel("Campo2");
		lblCampo_1.setBounds(0, 90, 86, 14);
		contentPane.add(lblCampo_1);
		
		//Boton
		btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			
	    //Codigo boton
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(textField.getText());
			}
		});
		btnNewButton.setBounds(128, 44, 89, 23);
		contentPane.add(btnNewButton);
	}
}
