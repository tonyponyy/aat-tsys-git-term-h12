
public class main_app {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4");
		
		Raices dos_sol = new Raices(3,10,8);
		
		System.out.println(dos_sol.calcular());
		dos_sol.obtenerRaices();
		
		Raices una_sol = new Raices(1,4,4);
		
		System.out.println(una_sol.calcular());
		dos_sol.obtenerRaiz();
		
		Raices sin_sol = new Raices(1,2,3);
		
		System.out.println(sin_sol.calcular());
	}
}
