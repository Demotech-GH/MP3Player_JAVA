package fattapposta;


import java.util.Objects;

public class Canzone
{

	private String titolo;
	private double durata;

	public Canzone(){}

	public Canzone(String titolo, double durata)
	{
		this.titolo = titolo;
		this.durata = durata;
	}

	public String getTitolo()
	{
		return titolo;
	}

//	public void setTitolo(String titolo)
//	{
//		if (titolo==null || titolo.isBlank())
//		{
//			throw new NullPointerException("Titolo non trovato");
//		}
//
//		this.titolo = titolo;
//	}

	public void setTitolo(String titolo)
	{
		if (Objects.requireNonNull(titolo, "il titolo è nullo").isBlank())
			throw new IllegalArgumentException("Titolo non trovato");

		this.titolo = titolo;
	}

	public double getDurata()
	{
		return durata;
	}

	public void setDurata(double durata)
	{
		if (durata <= 0)
		{
			throw new IllegalArgumentException("Durata non conforme");
		}

		this.durata = durata;
	}

	@Override
	public String toString()
	{
		return
				"titolo:" + titolo + "\n" +
						"durata:" + durata + "\n" +
						"";
	}


}
