package by.htp.test1.main;

public class EqTriangle {
	private double n; // сторона равностороннего треугольника
	private double p; // периметр
	private double s; // площадь

	public EqTriangle() {

	}

	public EqTriangle(double n) {
		this.n = n;

	}

	public double calcPerimeter() {

		p = 3 * n;
		return p;

	}

	public double calcArea() {

		s = n * n * Math.sqrt(3.0) / 4;
		return s;

	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public double getP() {
		return p;
	}

	public double getS() {
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(n);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(p);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(s);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqTriangle other = (EqTriangle) obj;
		if (Double.doubleToLongBits(n) != Double.doubleToLongBits(other.n))
			return false;
		if (Double.doubleToLongBits(p) != Double.doubleToLongBits(other.p))
			return false;
		if (Double.doubleToLongBits(s) != Double.doubleToLongBits(other.s))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EqTriangle [n = " + n + ", p = " + p + ", s = " + s + "]";
	}

}
