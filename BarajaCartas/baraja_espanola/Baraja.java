package baraja_espanola;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baraja {

	private Integer numCartas = 48;
	private ArrayList<Carta> baraja = new ArrayList<>();
	private ArrayList<Carta> monton = new ArrayList<>();
	
	
	public Baraja() {
		super();
		int i = 0;
		while (i < numCartas) {
			Carta c = new Carta();
			if (!baraja.contains(c)) {
				baraja.add(c);
				i++;
			}
		}
	}

	
	public void barajar() {
		for (int j = 0; j < numCartas; j ++) {
			Collections.swap(baraja, randomNumber(), randomNumber());
		}
		
	}

	@Override
	public String toString() {
		return baraja.toString() + "\n"
				+ baraja.size();
	}
	
	
	public int randomNumber() {
		return (int)(Math.random() * numCartas);
	}
}
