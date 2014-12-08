import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCondiciones extends JFrame{
	
	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja2;
	
	public VentanaCondiciones() {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Introduce un numero positivo");
		etiqueta1.setBounds(10, 29, 151, 14);
		contentPane.add(etiqueta1);
		
		Caja1 = new JTextField();
		Caja1.setBounds(10, 54, 123, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		JLabel etiqueta2 = new JLabel("Mensaje");
		etiqueta2.setBounds(10, 85, 102, 14);
		contentPane.add(etiqueta2);
		
		Caja2 = new JTextField();
		Caja2.setEditable(false);
		Caja2.setBounds(10, 110, 271, 20);
		contentPane.add(Caja2);
		Caja2.setColumns(10);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String TxtCaja1="";
				int numCaja1=0;
				
				TxtCaja1=Caja1.getText();
				numCaja1=Integer.parseInt(TxtCaja1);
				
				System.out.println(numCaja1);
				
				//condicion
				if (numCaja1 >=0){
					
					//si es cierto
					Caja2.setText("ok");
				}else{
					//si no es cierto
					Caja2.setText("No es un numero positivo");
				}
			}
		});
		btnComprobar.setBounds(259, 53, 89, 23);
		contentPane.add(btnComprobar);
	}

}
