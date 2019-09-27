package baraja_espanola;

public class Test {

	public static void main(String[] args) {
		Baraja b = new Baraja();
		System.out.println(b.mostrarBaraja());
		b.barajar();
		System.out.println(b.mostrarBaraja());
		System.out.println();
		System.out.println(b.cartasMonton());
		System.out.println();
		System.out.println(b.darCartas(13));
		System.out.println();
		System.out.println(b.cartasDisponibles());
		System.out.println();
		System.out.println(b.cartasMonton());
		System.out.println();
		System.out.println(b.mostrarBaraja());
		System.out.println();
		System.out.println(b.siguienteCarta());
		System.out.println();
		System.out.println(b.darCartas(50));
		
		
	}

}
