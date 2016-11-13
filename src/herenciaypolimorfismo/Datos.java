package herenciaypolimorfismo;

public class Datos {
	private String titulo;
	private String genero;
	private String creador;
	private String duracion;
	protected boolean visto;
	
//Constructores
public Datos(){}
public Datos(String tit, String cre){
		this.titulo = tit;
		this.creador = cre;
	}
	public Datos(String tit, String gen, String cre, String dura){
		this.titulo = tit;
		this.genero = gen;
		this.creador = cre;
		this.duracion = dura;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	//Metodo toString
	@Override
	public String toString() {
		String mensaje;
		mensaje = this.titulo+"\n"+
		"GENERO: "+ this.genero + "\n"+
		"CREADOR: "+ this.creador + "\n"+
		"DURACION: " + this.duracion + "\n" +
		"VISTO: " + this.visto;
		return mensaje;
	}
}


