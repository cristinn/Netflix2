package herenciaypolimorfismo;

public class Pelicula extends Datos implements Visualizable{
	
	private int anho;
	
	public Pelicula(){
	}
	public Pelicula(String titulo, String creador){
		super(titulo, creador);
	}
	public Pelicula(String titulo, String genero, String creador, String duracion, int anho){
		super(titulo, genero, creador, duracion);
		this.anho = anho;
	}
	
	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	} 
	
//Sobreescribimos el metodo toString
	@Override
	public String toString() {
		return super.toString() + "\n" + 
		"ANHO: " + this.anho;
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
