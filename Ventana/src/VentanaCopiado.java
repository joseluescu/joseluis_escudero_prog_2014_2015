import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame{
	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja2;
	
	public VentanaCopiado() {
		
		//Contenedor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiquetas
		JLabel Etiqueta1 = new JLabel("Campo1");
		Etiqueta1.setBounds(10, 32, 87, 14);
		contentPane.add(Etiqueta1);
		
		JLabel Etiqueta2 = new JLabel("Campo2");
		Etiqueta2.setBounds(10, 105, 87, 14);
		contentPane.add(Etiqueta2);
		
		//Cajas
		Caja1 = new JTextField();
		Caja1.setBounds(0, 57, 86, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		Caja2 = new JTextField();
		Caja2.setBounds(0, 130, 86, 20);
		contentPane.add(Caja2);
		Caja2.setColumns(10);
		
		//Boton
		JButton btnNewButton = new JButton("Copiado");
		btnNewButton.addActionListener(new ActionListener() {
			
			//Codigo del boton
			public void actionPerformed(ActionEvent arg0) {
				Caja2.setText(Caja1.getText());
			}
		});
		btnNewButton.setBounds(126, 56, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
