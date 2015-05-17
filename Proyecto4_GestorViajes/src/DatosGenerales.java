
public class DatosGenerales {
	//LISTADO DE MONEDAS Y VALORES CONSTANTES
	final static String MONEDA_DOL ="Dolares";
	final static String MONEDA_LIB ="Libras";
	final static String MONEDA_YEN ="Yenes";
	final static float VALOR_DOL=1.14f;
	final static float VALOR_LIB=0.80f;
	final static float VALOR_YEN=2.14f;
	private String tiposMonedas[]={MONEDA_DOL, MONEDA_LIB, MONEDA_YEN};
	private float valorMonedas[]={VALOR_DOL, VALOR_LIB, VALOR_YEN};
	
	
	
	public DatosGenerales() {
	
	}
	
		//metodos publicos para devolver
		public String[] getMonedas(){
			return tiposMonedas;
		}
		public float[] getValoresAEuros(){
			return valorMonedas;
		}
	}

	
