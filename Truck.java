public class Truck extends Vehicle {
	public double load = 0;
	public double tow = 0;
	
	public Truck() {}
	public Truck(String m, int c, String oName, double l, double t) {
		super(m, c, oName);
		load = l;
		tow = t;
		}
	
	public void setLoad(double l) {
		load = l;
		}
	public double getLoad() {
		return load;
		}
	public void setTow(double t) {
		tow = t;
		}
	public double getTow() {
		return tow;
		}
	
	public boolean equals(Truck other) {
		return this.manu == other.manu && this.cyl == other.cyl && this.owner.name.equalsIgnoreCase(other.owner.name)
		&& this.load == other.load && this.tow == other.tow;
		}
	public static void main(String[] args) {
		Truck demo1 = new Truck("carz", 4, "Otis", 9001, 9002);
		Truck demo2 = new Truck("carz", 4, "Otis", 9001, 9002);
		System.out.println(demo1.equals(demo2));
		}						
	}
