package upse.poo.proyecto;

import java.util.ArrayList;
import java.util.Collections;

 /**
  * 
  * @author Blas Benites y Marlon Sojos 
  *
  */

public class SimuladorProyecto {
 static int c;
 static int d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<VideoJuegos> registrarJuego = new ArrayList <>();
		ArrayList<Serie> registrarSerie = new ArrayList <>();
		ArrayList<Peliculas> registrarPelicula = new ArrayList <>();
		
		System.out.println(""
				+ "     ╔═══════╗╔═════╗╔═══════╗╔═══╗    ╔═════╗╔═══════╗╔════════╗╔══════╗╔═══════╗╔═════════╗\n"
				+ "     ║▓▓▓╔╗▓▓║╚╗▓▓▓╔╝║▓▓▓╔╗▓▓║║▓▓▓║    ╚╗▓▓▓╔╝║▓▓╔═╗▓▓║║▓╔╗▓▓╔╗▓║║▓▓▓ ╔═╝║▓▓▓╔╗▓▓║║▓▓▓╔═╗▓▓▓║\n"
				+ "     ║▓▓▓╚╝╔═╝█║▓▓▓║█║▓▓▓╚╝╔═╝║▓▓▓║    █║▓▓▓║█║▓▓║ ║▓▓║╚═╝║▓▓║╚═╝║▓▓▓ ╚═╗║▓▓▓║╚══╝║▓▓▓╚═╝▓▓▓║\n"
				+ "     ║▓▓▓╔╗╚═╗█║▓▓▓║█║▓▓▓╔╗╚═╗║▓▓▓║╔══╗█║▓▓▓║█║▓▓║ ║▓▓║███║▓▓║███║▓▓▓ ╔═╝║▓▓▓║╔══╗║▓▓╔═══╗▓▓║\n"
				+ "     ║▓▓▓╚╝▓▓║╔╝▓▓▓╚╗║▓▓▓╚╝▓▓║║▓▓▓╚╝▓▓║╔╝▓▓▓╚╗║▓▓╚═╝▓▓║███║▓▓║███║▓▓▓ ╚═╗║▓▓▓╚╝▓▓║║▓╔╝███╚╗▓║\n"
				+ "     ╚═══════╝╚═════╝╚═══════╝╚═══════╝╚═════╝╚═══════╝▀▀▀╚══╝▀▀▀╚══════╝╚═══════╝╚═╝▀▀▀▀▀╚═╝\n");
				
	     VideoJuegos ASC = new VideoJuegos("Assasin Creed", Generos.Accion, 22, "Ubisoft");
	     VideoJuegos MD5 =new VideoJuegos("Modern Combat", Generos.Guerra, 24, "Gameloft");
	     VideoJuegos SMB = new VideoJuegos("Super Mario", Generos.Accion, 27, "Nintendo");
	     VideoJuegos PES =new VideoJuegos("PES 2016", Generos.Accion, 23, "Konami");
	     VideoJuegos RE6 =new VideoJuegos("Resident Evil 6", Generos.Terror, 24, "Gameloft");
	     registrarJuego.add(ASC);
	     registrarJuego.add(MD5);
	     registrarJuego.add(SMB);
	     registrarJuego.add(PES);
	     registrarJuego.add(RE6);
	     RE6.entregar();
	     PES.entregar();
	     
	     Collections.sort(registrarJuego);
	     System.out.println("\n\t********* JUEGOS REGISTRADOS POR HORAS/DURACION *********");  
	 	 System.out.println("-----------------------------------------------------------------------------------\n");
	     registrarJuego.forEach(System.out::println);
	 	
	 	
	 	ArrayList<VideoJuegos> juegosEntregados = new ArrayList<>();	
		for(VideoJuegos v:registrarJuego){
				
				if(v.entregado==true){
					c++;
					juegosEntregados.add(v);
									}
						}
		
		System.out.println("\n");
		System.out.println("\n\t********* TOTAL DE JUEGOS PRESTADOS: " + c + " *********");
		System.out.println("-----------------------------------------------------------------------------------\n");
		juegosEntregados.forEach(System.out::println);
	 		     
		Serie GA = new Serie("Greys Anatomy", Generos.Teatro, 12, "Sasha emilis");
		Serie OP=new Serie("One Piece", Generos.Accion, 13, "Anonimo");
		Serie DB =new Serie("Dragon Ball Z", Generos.Accion, 11, "Resis Mels");
		Serie DN =new Serie("Death Note", Generos.Teatro, 10, "Sasha Greys");
		Serie MR =new Serie("Mr. Robot", Generos.Drama, 19, "Milton Case");
		 
		registrarSerie.add(GA);
		registrarSerie.add(OP);
		registrarSerie.add(DB);
		registrarSerie.add(DN);
		registrarSerie.add(MR);
		DB.entregar();
		MR.entregar();
				
		Collections.sort(registrarSerie); 
	    System.out.println("\n\t********* SERIES REGISTRADAS POR ORDEN/TEMPORADA *********");  
	 	System.out.println("-----------------------------------------------------------------------------------\n");
	    registrarSerie.forEach(System.out::println);
			    	
		ArrayList<Serie> seriesEntregadas = new ArrayList<>();	
		for(Serie z:registrarSerie){
				
				if(z.entregado==true){
					d++;
					seriesEntregadas.add(z);
									}
						}
		System.out.println("\n");
		System.out.println("\n\t********* TOTAL DE SERIES PRESTADAS: " + c + " *********");
		System.out.println("-----------------------------------------------------------------------------------\n");
		seriesEntregadas.forEach(System.out::println);
		
		DB.devolver();
		MR.devolver();
		
		ArrayList<Serie> seriesDevueltas = new ArrayList<>();	
		for(Serie g:seriesEntregadas){
				
				if(g.entregado==false){
					d++;
					seriesDevueltas.add(g);
									}
						}
		System.out.println("\n");
		System.out.println("\n\t********* TOTAL DE SERIES DEVUELTAS DESPUES DE UN TIEMPO DE ESTAR PRESTADAS: " + c + " *********");
		System.out.println("-----------------------------------------------------------------------------------\n");
		seriesDevueltas.forEach(System.out::println);
			
		for(Serie f:registrarSerie){
			f.isEntregado();
				d++;
				}
		System.out.println("\n");
		System.out.println("\n\t********* TOTAL DE SERIES EN LA BIBLIOTECA *********");
		System.out.println("-----------------------------------------------------------------------------------\n");
		registrarSerie.forEach(System.out::println);

		
		Peliculas AB =new Peliculas("Angry Birds", Generos.Comedia, 2);
		Peliculas SG =new Peliculas("Sangre y Gloria", Generos.Guerra, 1);
		Peliculas AL =new Peliculas("Arma letal", Generos.Accion, 3);
		Peliculas BT =new Peliculas("Huevos Cartoon", Generos.Comedia, 2);
		Peliculas RM =new Peliculas("Recor Mird", Generos.Accion, 1);
		registrarPelicula.add(AB);
		registrarPelicula.add(SG);
		registrarPelicula.add(AL);
		registrarPelicula.add(BT);
		registrarPelicula.add(RM);
		
		Collections.sort(registrarPelicula); 
	    System.out.println("\n\t********* PELICULAS REGISTRADAS POR NOMBRE/GENERO *********");  
	 	System.out.println("-----------------------------------------------------------------------------------\n");
	    registrarPelicula.forEach(System.out::println);
		
		System.out.println("\nVideo juego con mas horas estimadas es: " + Collections.max(registrarJuego) );
		System.out.println("\nPelicula con mayor duracion es: " + Collections.max(registrarPelicula) );
	}
}
