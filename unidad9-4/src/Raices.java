
public class Raices {

	protected int a;
	protected int b;
	protected int c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getDiscriminante() {
		return (b*b)-4*a*c; 
	}
	public boolean tieneRaices(){
	 return this.getDiscriminante() > 0;
	}
	
	public boolean tieneRaiz() {
        if (this.getDiscriminante()== 0) {
        	return true;
        }else {
        	return false;
        }
    }
	
	public int calcular() {
		if (this.tieneRaices()) {
			return 2;
		}else {
			if (this.tieneRaiz()) {
				return 1;
				}
		}
		return 0;
	}
	
	
	public void obtenerRaices() {
		double f1 = (-this.b+ Math.sqrt(this.getDiscriminante()))/2*a;
		double f2 = (-this.b- Math.sqrt(this.getDiscriminante()))/2*a;
		System.out.println("Las dos posibles soluciones son: " + f1 + ", "+f2);
	}

	public void obtenerRaiz() {
		double f1 = (-this.b+ Math.sqrt(this.getDiscriminante()))/2*a;
		System.out.println("La solucion es: " + f1);
	}



	
}
