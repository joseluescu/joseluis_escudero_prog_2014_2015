import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame{


	private JPanel contentPane;
	private JTextField cajaEuros;
	private JTextField cajaDolares;
	private JTextField textoMsg;
	
	public VentanaConversor(float valorConversion) {
		
		//contenedor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//etiquetas
		JLabel lblIntroducirUnValor = new JLabel("INTRODUCIR UN VALOR DE EUROS ENTRE 0 Y 500 EUROS");
		lblIntroducirUnValor.setBounds(10, 24, 391, 14);
		contentPane.add(lblIntroducirUnValor);
		
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 49, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("DOLARES");
		lblDolares.setBounds(10, 114, 133, 14);
		contentPane.add(lblDolares);
		
		JLabel lblMensajeControl = new JLabel("MENSAJE CONTROL");
		lblMensajeControl.setBounds(10, 187, 268, 14);
		contentPane.add(lblMensajeControl);
		
		//cajas
		cajaEuros = new JTextField();
		cajaEuros.setBounds(10, 71, 86, 20);
		contentPane.add(cajaEuros);
		cajaEuros.setColumns(10);
		
		cajaDolares = new JTextField();
		cajaDolares.setBounds(10, 144, 86, 20);
		contentPane.add(cajaDolares);
		cajaDolares.setColumns(10);
		
		textoMsg = new JTextField();
		textoMsg.setEditable(false);
		textoMsg.setBounds(10, 212, 360, 20);
		contentPane.add(textoMsg);
		textoMsg.setColumns(10);
		
		//BOTON Y CODIGO
		JButton btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				
			
				//excepcion
				try {
					euros=Float.parseFloat(cajaEuros.getText());
				
				//condicional
				if ((euros>=0) && (euros<=500)) {	
					cajaDolares.setText(String.valueOf(euros*valorConversion));
					textoMsg.setText("TODO CORRECTO");
					
				}else{
					textoMsg.setText("DEBE ESTAR ENTRE 0 Y 500 EUROS");
				}
				}catch (Exception e){
					textoMsg.setText("ERROR EN CONVERSION");
				}
			}
		});
		btnConvertir.setBounds(171, 143, 158, 23);
		contentPane.add(btnConvertir);
		
		
		
		
	}
}
