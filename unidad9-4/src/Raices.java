
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
	
	
}
