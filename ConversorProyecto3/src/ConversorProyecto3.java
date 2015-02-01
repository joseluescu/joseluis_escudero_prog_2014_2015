



public class ConversorProyecto3  {

//metodo principal

	
	public static void main(String[] args) {
		float valorConversion=1.25f;
		VentanaConversor ventana=new VentanaConversor(valorConversion);
		ventana.setVisible(true);
	/*	EventQueue.invokeLater(new Runnable() {
	*	public void run() {
	*	try {
	*				ConversorProyecto3 frame = new ConversorProyecto3();
	*				frame.setVisible(true);
	*			} catch (Exception e) {
	*				e.printStackTrace();
	*			}
	*		}
	*	});
	*/
		}

}
