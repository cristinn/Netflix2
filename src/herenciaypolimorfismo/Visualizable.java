package herenciaypolimorfismo;

public interface Visualizable {
	//Modifica el valor booleano del atributo visto
	public void marcarVisto();
	//Devuelve el estado del atributo Visto
	public boolean esVisto();
	//Devuelve el tiempo minutos/segundos en el que se visualizo el video
	public String tiempoVisto(int minutos, int segundos);
}

