package fattapposta;

import java.util.LinkedList;
import java.util.List;

public enum MP3Player
{

	//	private static MP3Player MP3instance = null;
//
//	public static MP3Player getInstance()
//	{
//		if (MP3instance == null)
//			MP3instance = new MP3Player();
//
//		return MP3instance;
//	}
	INSTANCE;

	private List<Canzone> canzoni = new LinkedList<>();

	public List<Canzone> getCanzoni()
	{
		List<Canzone> res = new LinkedList<>(canzoni);
		return res;
	}

	public void addCanzoni(Canzone c)
	{
		canzoni.add(c);
	}

	public void removeCanzoni(Canzone c)
	{
		canzoni.remove(c);
	}


}
