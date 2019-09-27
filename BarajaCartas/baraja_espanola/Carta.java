package baraja_espanola;

import java.util.HashMap;

public class Carta {

	private String palo;
	private Integer num;

	@SuppressWarnings("serial")
	private HashMap<Integer, String> cartasEspeciales = new HashMap<Integer, String>() {
		{
			put(1, "as");
			put(10, "sota");
			put(11, "caballo");
			put(12, "rey");
		}
	};

	// Constructor
	public Carta(String palo, Integer num) {
		super();
		this.palo = palo;
		this.num = num;
	}

	@Override
	public String toString() {
		String result;
		if (cartasEspeciales.containsKey(num)) {
			result = cartasEspeciales.get(num) + " de " + palo;
		} else {
			result = num + " de " + palo;
		}
		return result;
	}

}
