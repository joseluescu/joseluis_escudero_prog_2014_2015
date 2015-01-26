import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class VentanaSuperMejorado  extends JFrame{
	private JPanel contentPane;
	private JTextField cajaEuros;
	private JTextField cajaCambio;
	private JTextField textoMsg;
	
	//creamos el contenedor
	public VentanaSuperMejorado(float valorConversion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiquetas
		JLabel lblIntroducirUnValor = new JLabel("INTRODUCIR UN VALOR ENTRE 0 Y 500 EUROS");
		lblIntroducirUnValor.setBounds(10, 11, 348, 14);
		contentPane.add(lblIntroducirUnValor);
		
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 42, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblMensajeDeControl = new JLabel("MENSAJE DE CONTROL");
		lblMensajeDeControl.setBounds(10, 202, 179, 14);
		contentPane.add(lblMensajeDeControl);
		
		//Cajas
		cajaEuros = new JTextField();
		cajaEuros.setBounds(10, 68, 86, 20);
		contentPane.add(cajaEuros);
		cajaEuros.setColumns(10);
		
		cajaCambio = new JTextField();
		cajaCambio.setBounds(10, 159, 86, 20);
		contentPane.add(cajaCambio);
		cajaCambio.setColumns(10);
		
		//caja de texto de control
		textoMsg = new JTextField();
		textoMsg.setEditable(false);
		textoMsg.setBounds(10, 227, 348, 20);
		contentPane.add(textoMsg);
		textoMsg.setColumns(10);
		
		//desplegable de items
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 115, 122, 20);
		contentPane.add(comboBox);
		
		//colocamos items y hacemos un array
		
		comboBox.addItem("DOLARES");
		comboBox.addItem("LIBRAS");
		comboBox.addItem("YENES");
		comboBox.addItem("MARCOS");
		comboBox.addItem("PESETAS");
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		
		
			
		

		//boton y codigo
		JButton btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros=0;
				float libras=0.74f;
				float yenes=133f;
				//excepcion
				try{				
				
				euros=Float.parseFloat(cajaEuros.getText());
				
				//estructura if (editable(false)) la conversion dentro del if para que actue
				   //si es correcto
				if ((euros>=0) && (euros<=500)){
				
				textoMsg.setText("TODO CORRECTO");
				}else{
					textoMsg.setText("NO ESTA ENTRE 0 Y 500 EUROS");
				}
				}catch(Exception e){
					textoMsg.setText("HA HABIDO UN ERROR DE CONVERSION");
				}
				//CReamos el switch
				
				switch((String)comboBox.getSelectedItem())
				{
				case "DOLARES":
					cajaCambio.setText(String.valueOf(euros*valorConversion));
					break;
				case "LIBRAS":
					cajaCambio.setText(String.valueOf(euros*libras));
					break;
				case "YENES":
					cajaCambio.setText(String.valueOf(euros*yenes));
					break;
					
					
				}
				}
			
		});
		btnConvertir.setBounds(213, 158, 145, 23);
		contentPane.add(btnConvertir);
		
		
	}
}
