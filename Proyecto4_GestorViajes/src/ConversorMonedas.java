import java.awt.BorderLayout;
import java.awt.EventQueue;

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


public class ConversorMonedas extends JFrame {

	private JPanel contentPane;
	private JLabel lblIntroducirEurosEntre;
	private JLabel lblEuros;
	private JLabel lblMensajeDeControl;
	private JTextField valorEuros;
	private JTextField textMsg;
	private JTextField valorCambio;
	private JButton botonConvertir;
	private JComboBox monedas;
	
	//datos
	DatosGenerales datos=new DatosGenerales();
	
	//seleccionamos moneda
	private float valorMonedaSeleccionada=0f;
	
	public ConversorMonedas() {
	
		
		//Generamos la ventana y le añadimos elementos
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//etiquetas
		lblIntroducirEurosEntre = new JLabel("INTRODUCIR EUROS ENTRE 0 Y 500");
		lblIntroducirEurosEntre.setBounds(10, 11, 284, 14);
		contentPane.add(lblIntroducirEurosEntre);
		
		lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 47, 46, 14);
		contentPane.add(lblEuros);
		
		lblMensajeDeControl = new JLabel("MENSAJE DE CONTROL");
		lblMensajeDeControl.setBounds(10, 176, 189, 14);
		contentPane.add(lblMensajeDeControl);
		
		//cajas
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 73, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		textMsg = new JTextField();
		textMsg.setEditable(false);
		textMsg.setBounds(10, 201, 284, 20);
		contentPane.add(textMsg);
		textMsg.setColumns(10);
		
		valorCambio = new JTextField();
		valorCambio.setBounds(10, 144, 86, 20);
		contentPane.add(valorCambio);
		valorCambio.setColumns(10);
		
		//accion del boton
		botonConvertir = new JButton("CONVERTIR");
		botonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try{
					float euros;
				euros=Float.parseFloat(valorEuros.getText());
				if ((euros>=0)&&(euros<=500)){
					textMsg.setText("TODO ES CORRECTO");
				}else{
					textMsg.setText("TE HAS PASADO DEL VALOR");
						
					}	
				valorCambio.setText(String.valueOf(euros*valorMonedaSeleccionada));	
			}catch (Exception e){
				textMsg.setText("CUIDADIN ALGO VA MAL");
			
			}
				
			}
		});
			botonConvertir.setBounds(179, 142, 115, 23);
			contentPane.add(botonConvertir);
			
			monedas = new JComboBox();
			monedas.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
			switch((String)monedas.getSelectedItem()){
			case DatosGenerales.MONEDA_DOL:
				valorMonedaSeleccionada=datos.getValoresAEuros()[0];
				break;
			case  DatosGenerales.MONEDA_LIB:
				valorMonedaSeleccionada=datos.getValoresAEuros()[1];
				break;
			case  DatosGenerales.MONEDA_YEN:
				valorMonedaSeleccionada=datos.getValoresAEuros()[2];
				break;
			}
					
		}
		});
			//Cargar datos comboBox//de la clase datos
			monedas.setBounds(10, 104, 136, 20);
			contentPane.add(monedas);
			for (int i=0;i<datos.getMonedas().length;i++)
			
				monedas.addItem(datos.getMonedas()[i]);
			
			}
	}
			
	
			


		
		
		
	

