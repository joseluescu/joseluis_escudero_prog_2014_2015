import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaMejorado2 extends JFrame {
	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorDolares;
	private JTextField mensaje;

		//Creamos panel trayandolo del metodo main
	
	public VentanaMejorado2(float valorConversion) {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//creamos etiquetas
		
		JLabel Etiqueta1 = new JLabel("INTRODUCIR UN VALOR ENTRE 0 Y 500E");
		Etiqueta1.setBounds(10, 11, 235, 14);
		contentPane.add(Etiqueta1);
		
		JLabel Etiqueta2 = new JLabel("EUROS");
		Etiqueta2.setBounds(10, 36, 46, 14);
		contentPane.add(Etiqueta2);
		
		JLabel Etiqueta3 = new JLabel("DOLARES");
		Etiqueta3.setBounds(10, 81, 86, 14);
		contentPane.add(Etiqueta3);
		
		JLabel Etiqueta4 = new JLabel("MENSAJE CONTROL");
		Etiqueta4.setBounds(10, 126, 207, 14);
		contentPane.add(Etiqueta4);
		
		//creamos Cajas
		
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 50, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		valorDolares = new JTextField();
		valorDolares.setBounds(10, 95, 86, 20);
		contentPane.add(valorDolares);
		valorDolares.setColumns(10);
		
		mensaje = new JTextField();
		mensaje.setEditable(false);
		mensaje.setBounds(10, 151, 296, 20);
		contentPane.add(mensaje);
		mensaje.setColumns(10);
		
		//creamos boton
		JButton btnNewButton = new JButton("CONVERTIR");
		btnNewButton.addActionListener(new ActionListener() {
			
			//codigo boton
			
			public void actionPerformed(ActionEvent arg0) {
				//definimos excepciones
				
				
				try{
					//creamos variable tipo float
				float euros;
				
				//damos el valor de euros pasando de string a float
				
				euros=Float.parseFloat(valorEuros.getText());
				
				//definimos if dentro de try
				
				if ((euros>=0) && (euros<=500)) {
					valorDolares.setText(String.valueOf(euros*valorConversion));
					mensaje.setText("Ok");
				
					}else{
						//si no es correcto
					
					mensaje.setText("Se ha producido un error en la conversion");
				//cerramos excepciones
			
					}	
				}catch(Exception e){
					mensaje.setText("No es un numero");
					
				}
					}	
			
			
		});
		btnNewButton.setBounds(106, 94, 121, 23);
		contentPane.add(btnNewButton);
		
		}
	}

		
			
		
			
