
public class Hilos {

	public static void main(String[] args) {
		new OtroHilo("Tornado").start();
		new OtroHilo("Pegaso").start();
		new OtroHilo("Socrates").start();
		
	}

}
