package herenciaypolimorfismo;

public class Serie extends Datos implements Visualizable{
	
	private int nro_temporadas = 1;
	
	//constructores
	public Serie(){
		
	}
	public Serie(String titulo, String creador){
		super(titulo, creador);
	}
	public Serie(String titulo, String genero, String creador, String duracion, int nro_temporadas){
		super(titulo, genero, creador, duracion);
		this.nro_temporadas = nro_temporadas;
	}
	
	//Metodo GET y SET de nro_temporadas
	public int getNro_temporadas() {
		return nro_temporadas;
	}

	public void setNro_temporadas(int nro_temporadas) {
		this.nro_temporadas = nro_temporadas;
	}
	
	//Sobreescribimos el metodo toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+
		"NRO. de TEMPORADAS: " + this.nro_temporadas;
	}

	//Metodos del Interfaz Visualizable
	@Override
	public void marcarVisto() {
		super.visto = true;
	}

	@Override
	public boolean esVisto() {
		return super.visto;
	}

	@Override
	public String tiempoVisto(int minutos, int segundos) {
		String mensaje;
		mensaje = minutos+" minuto(s), "+segundos+ " segundo(s)";
		return mensaje;
	}
}