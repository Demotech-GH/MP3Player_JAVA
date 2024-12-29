package fattapposta;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LettoreMusica
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		String cmd = "";//comando dato da utente
		boolean goOn = false;//condizione di ripetizione del ciclo

		System.out.println("Benvenuto nel MP3 Music Player!");

		canzoniere();

		do
		{
			System.out.println
					(
							"Seleziona una opzione: " + "\n" +
									"1. play" + "\n" +
									"2. prossima" + "\n" +
									"3. precedente" + "\n" +
									"4. mostra album" + "\n"
					);
			cmd = sc.nextLine().toLowerCase();

			switch (cmd)
			{
				case "play" -> playMusica();
				case "prossima" -> prossimaCanzone();
				case "precedente" -> precedenteCanzone();
				case "mostra album" -> mostraAlbum();
				case "quit" -> System.out.println("evidentemente non sei una baddie");
				default -> System.out.println("Non stiamo pettinando le foche, fai il serio e scrivi il comando giusto");
			}
			goOn = !cmd.equals("quit");
		} while (goOn);
		sc.close();
	}

	private static int contatore = 0;


	/**
	 * Chiamando questo metodo riproduci la canzone attualmente selezionata
	 */
	private static void playMusica()
	{
//		List<Canzone> tutteCanzoni = MP3Player.getInstance().getCanzoni();

		List<Canzone> tutteCanzoni = MP3Player.INSTANCE.getCanzoni();

		System.out.println(tutteCanzoni.get(contatore));
	}

	/**
	 * Chiamando questo metodo selezioni la prossima canzone, se ultima canzone dell'elenco riparte da prima posizione
	 */
	private static void prossimaCanzone()
	{

//		if (contatore==MP3Player.getInstance().getCanzoni().size()-1)
//		{contatore=0;}else
//		{contatore++;}

//		contatore = (contatore == MP3Player.getInstance().getCanzoni().size() - 1) ? 0 : contatore + 1;

		contatore = (contatore == MP3Player.INSTANCE.getCanzoni().size() - 1) ? 0 : contatore + 1;

	}


	/**
	 * Chiamando questo metodo selezioni la canzone precedente, se prima canzone dell'elenco riparte da ultima posizione
	 */
	private static void precedenteCanzone()
	{
//		if (contatore==0)
//		{contatore=MP3Player.getInstance().getCanzoni().size()-1;}else
//		{contatore--;}

//		contatore = (contatore == 0) ? MP3Player.getInstance().getCanzoni().size() - 1 : contatore - 1;

		contatore = (contatore == 0) ? MP3Player.INSTANCE.getCanzoni().size() - 1 : contatore - 1;
	}

	/**
	 * Chiamando questo metodo mostri tutte le canzoni presenti nell'album
	 */
	private static void mostraAlbum()
	{

//		List<Canzone> tutteCanzoni = MP3Player.getInstance().getCanzoni();
//
//		for (Canzone c : tutteCanzoni)
//			System.out.println(c.toString());

//		for (Canzone c : MP3Player.getInstance().getCanzoni())
//			System.out.println(c.toString());

		for (Canzone c : MP3Player.INSTANCE.getCanzoni())
			System.out.println(c.toString());

	}

	private static void canzoniere()
	{
//		MP3Player m = MP3Player.getInstance();
//		Canzone BBE = new Canzone("BBE", 3.18);
//		Canzone YourDog = new Canzone("YourDog", 2.53);
//		Canzone Boxer = new Canzone("Boxer", 2.20);
//		Canzone Hope = new Canzone("Hope", 4.24);

//		MP3Player m = MP3Player.getInstance();

		MP3Player m = MP3Player.INSTANCE;

		m.addCanzoni(new Canzone("BBE", 3.18));
		m.addCanzoni(new Canzone("YourDog", 2.53));
		m.addCanzoni(new Canzone("Boxer", 2.20));
		m.addCanzoni(new Canzone("Hope", 4.24));
	}

}
