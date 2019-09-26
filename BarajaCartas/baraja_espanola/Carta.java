package baraja_espanola;

import java.util.ArrayList;

public class Carta {
	
	private String palo;
	private Integer num;
	
	@SuppressWarnings("serial")
	private ArrayList<String> palos = new ArrayList<String>() {
		{
			add("oros");
			add("bastos");
			add("espadas");
			add("copas");
		}
	};
	
	
	//Constructor
	public Carta() {
		super();
		this.num = (int)(Math.random() * 12 + 1);
		this.palo = palos.get((int)(Math.random() * 4));
	}


	@Override
	public String toString() {
		return num + " de " + palo;
	}
	
	
	
	
}
