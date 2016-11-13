package herenciaypolimorfismo;

public class TareaSemana2 {
	public static void main(String[] args) {
		
		int var_posicion_pelicula = 0;
		int var_posicion_serie = 0;
		int var_anho_reciente = 0;
		int var_mas_temporadas = 0;
		Pelicula[] Peliculas = new Pelicula[5];
		Serie[] Series = new Serie[5];
		//Instanciamos las peliculas
		Peliculas[0] = new Pelicula("El libro de la vida", "Anime", "Anonimo", "01:23:15", 2015);
		Peliculas[1] = new Pelicula("Los vengadores", "Accion");
		Peliculas[2] = new Pelicula("Dia después de mañana", "Ficcion", "Steven Spielberg", "01:55:08", 2014);
		Peliculas[3] = new Pelicula("Los 3 chiflados", "Comedia", "John Hamburg", "01:30:02", 2004);
		Peliculas[4] = new Pelicula("Interstellar", "Ciencia Ficcion", "Christopher Nolan", "03:20:10", 2014);
		//Instanciamos las series
		Series[0] = new Serie("Dragon Super", "Anime", "Marta Kauffman y David Crane", "00:35:00", 10);
		Series[1] = new Serie("El libro de la muerte", "Anime", "Chuck Lorre", "00:32:00", 12);
		Series[2] = new Serie("Prision Break", "Accion", "Marcos brazil", "00:27:00", 8);
		Series[3] = new Serie("The Walking Dead", "Frank darabont");
		Series[4] = new Serie("Everybody Loves Raymond", "Comedia", "Ray Romano", "00:29:15", 9);
		Peliculas[0].marcarVisto();
		Peliculas[2].marcarVisto();
		Peliculas[4].marcarVisto();
		
		Series[0].marcarVisto();
		Series[1].marcarVisto();
		Series[2].marcarVisto();

		System.out.println("-----------------Peliculas vistas------------------");
		for (int i = 0; i < Peliculas.length; i++) {
			if (Peliculas[i].esVisto()) {
			System.out.println("Pelicula: " + Peliculas[i].getTitulo());
			System.out.println("Tiempor Visto: "+ Peliculas[i].tiempoVisto((int)Math.floor(Math.random()*(0-(115+1))+115), (int)Math.floor(Math.random()*(0-(59+1))+59)));
				System.out.println("-----------------------------");
			}
		}
	
		System.out.println("-----------------Series vistas------------------");
		for (int i = 0; i < Series.length; i++) {
			if (Series[i].esVisto()) {
				System.out.println("Serie: "+ Series[i].getTitulo());
				System.out.println("Tiempo Visto: "+ Series[i].tiempoVisto((int)Math.floor(Math.random()*(1-(27+1))+27), (int)Math.floor(Math.random()*(0-(59+1))+59)));
				System.out.println("-----------------------------");
			}
		}
		
		//Imprimos la pelicula del anho mas reciente y la serie con mas temporadas
		for (int i = 0; i < Peliculas.length; i++) {
			if (Peliculas[i].getAnho() > var_anho_reciente) {
				var_anho_reciente = Peliculas[i].getAnho();
				var_posicion_pelicula = i;
			}
		}
		
		for (int i = 0; i < Series.length; i++) {
			if (Series[i].getNro_temporadas() > var_mas_temporadas ) {
				var_mas_temporadas = Series[i].getNro_temporadas();
				var_posicion_serie = i;
			}
		}
		//Imprimos los Resultados
		System.out.println("Pelicula Reciente");
		System.out.println(Peliculas[var_posicion_pelicula].toString());
		System.out.println("************************************************");
		System.out.println("Serie con mas Temporadas");
		System.out.println(Series[var_posicion_serie].toString());
		System.out.println("************************************************");
	}

}