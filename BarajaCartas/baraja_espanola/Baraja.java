package baraja_espanola;

import java.util.ArrayList;
import java.util.Collections;

/**
 * NOTA: Todos los métodos menos el de barajar devuelven un String para
 * facilitar la comprobación de los mismos.
 * 
 * 
 * @author Jorge García Molina
 *
 */
public class Baraja {

	private ArrayList<Carta> baraja = new ArrayList<>();
	private ArrayList<Carta> monton = new ArrayList<>();

	@SuppressWarnings("serial")
	private ArrayList<String> palos = new ArrayList<String>() {
		{
			add("bastos");
			add("oros");
			add("copas");
			add("espadas");
		}
	};

	// Constructor
	public Baraja() {
		super();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 12; j++) {
				baraja.add(new Carta(palos.get(i), j));
			}
		}
	}

	// Metodos
	/**
	 * Cambia, de manera aleatoria, todas las cartas de posición.
	 */
	public void barajar() {
		for (int j = 0; j < baraja.size(); j++) {
			Collections.swap(baraja, (int) (Math.random() * baraja.size()), (int) (Math.random() * baraja.size()));
		}

	}

	/**
	 * devuelve la siguiente carta que se encuentra en la parte superior de la
	 * baraja. Cuando no haya más, se indicará al usuario.
	 */
	public String siguienteCarta() {
		String result = "";
		if (baraja.size() > 0) {
			Carta c = baraja.get(baraja.size() - 1);
			monton.add(c);
			baraja.remove(c);
			result += "La siguiente carta es: " + c.toString();
		} else {
			result += "No quedan cartas en la baraja";
		}
		return result;
	}

	/**
	 * Indicará el número de cartas que aún se pueden repartir
	 */
	public String cartasDisponibles() {
		return "En la baraja quedan " + baraja.size() + " cartas.";
	}

	/**
	 * Devolveremos el número de cartas solicitado, siempre que sea posible. En caso
	 * de que haya menos cartas de las pedidas, no devolveremos nada, pero se deberá
	 * indicar al usuario.
	 */
	public String darCartas(int n) {
		String result = "";
		if (baraja.size() >= n) {
			for (int i = 1; i <= n; i++) {
				Carta c = baraja.get(baraja.size() - 1);
				monton.add(c);
				baraja.remove(c);
				result += "La " + i + "ª carta es: " + c.toString() + "\n";
			}
		} else {
			result += "No quedan suficientes cartas en la baraja.";
		}

		return result;
	}

	/**
	 * Mostramos aquellas cartas que ya han salido; si no ha salido ninguna, lo
	 * indicamos convenientemente.
	 */
	public String cartasMonton() {
		String cartas = "";
		if (monton.size() > 0) {
			for (int i = 0; i < monton.size(); i++) {
				if (i != monton.size() - 1) {
					cartas += monton.get(i).toString() + ", ";
				} else {
					cartas += monton.get(i).toString();
				}
			}
		} else {
			cartas += "No hay cartas en el montón";
		}
		return "Cartas del montón: " + cartas;
	}

	/**
	 * Muestra todas las cartas que quedan en la baraja.
	 */
	public String mostrarBaraja() {
		String cartas = "";
		if (baraja.size() > 0) {
			for (int i = 0; i < baraja.size(); i++) {
				if (i != baraja.size() - 1) {
					cartas += baraja.get(i).toString() + ", ";
				} else {
					cartas += baraja.get(i).toString();
				}
			}
		} else {
			cartas += "No quedan cartas en la baraja";
		}
		return "Cartas de la baraja: " + cartas;
	}
}
