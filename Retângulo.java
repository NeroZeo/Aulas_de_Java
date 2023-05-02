
public class Retângulo {

	public double A;
	public double L;

	public double area() {
		double area = this.A * this.L;
		return area;
	}

	public double peri() {
		double p = 2 * (this.A * this.L);
		return p;
	}
	
	public double diag() {
		double diag = Math.sqrt((this.A * this.L) + (this.A * this.L));
		return diag;
	}
}
