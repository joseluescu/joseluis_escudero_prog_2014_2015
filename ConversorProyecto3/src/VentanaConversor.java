import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame{
	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorCambio;
	private JTextField textoMsj;
	private JComboBox moneda;
	private float valorConversionPasado;
	private String tipoMonedas[]={"DOLARES","LIBRAS","YENES"};
	private float valoresConversion[]={1.25f, 1.5f, 2.1f};
	private JButton btnConvertir;
	

	//contenedor
	public VentanaConversor(float valorConversion) {
		valorConversionPasado= valorConversion;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//etiquetas
		JLabel lblIntroducirUnValor = new JLabel("INTRODUCIR UN VALOR ENTRE 0 Y 500 EUROS");
		lblIntroducirUnValor.setBounds(10, 11, 367, 14);
		contentPane.add(lblIntroducirUnValor);
		
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 36, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblMensajeDeControl = new JLabel("MENSAJE DE CONTROL");
		lblMensajeDeControl.setBounds(10, 179, 367, 14);
		contentPane.add(lblMensajeDeControl);
		
		//cajas
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 61, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		valorCambio = new JTextField();
		valorCambio.setBounds(10, 140, 86, 20);
		contentPane.add(valorCambio);
		valorCambio.setColumns(10);
		
		textoMsj = new JTextField();
		textoMsj.setEditable(false);
		textoMsj.setBounds(10, 204, 321, 20);
		contentPane.add(textoMsj);
		textoMsj.setColumns(10);
		
		//BOTON
		btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					float euros;
					euros=Float.parseFloat(valorEuros.getText());
					if(euros<0){
						textoMsj.setText("LOS EUROS DEBEN ESTAR ENTRE 0 Y 500");
					}else if (euros>500){
						textoMsj.setText("LOS EUROS DEBEN ESTAR ENTRE 0 Y 500");
					}else{
						textoMsj.setText("TODO CORRECTO");
						switch((String)moneda.getSelectedItem()){
						case "DOLARES":
							valorConversionPasado =valoresConversion[0];
							break;
						case "LIBRAS":
							valorConversionPasado =valoresConversion[1];
							break;
						case "YENES":
							valorConversionPasado =valoresConversion[2];
							break;
							
						}
						valorCambio.setText(String.valueOf(euros*valorConversionPasado));
					}
				}catch(Exception e1){
					textoMsj.setText("SE HA PRODUCIDO UN ERROR");
				}
			}
		});
		btnConvertir.setBounds(185, 139, 146, 23);
		contentPane.add(btnConvertir);
		
		
		//jcombox
		moneda = new JComboBox();
		moneda.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				moneda.getSelectedItem();
				
			}
		});
		moneda.setBounds(10, 92, 135, 20);
		contentPane.add(moneda);
		
		moneda.addItem(tipoMonedas[0]);
		moneda.addItem(tipoMonedas[1]);
		moneda.addItem(tipoMonedas[2]);
	}
}
		
				
				
	
										
				
	
		
							
	
		
			
		
	

		
	
						
					
	
		
						
