public class Vehicle {
	public String manu = "";
	public int cyl = 0;
	public Person owner;
	
	public Vehicle() {}
	public Vehicle(String m, int c, String oName) {
		manu = m;
		cyl = c;
		owner = new Person(oName);
		}
	
	public void setManu(String m) {
		manu = m;
		}
	public String getManu() {
		return manu;
		}
	public void setCyl(int s) {
		cyl = s;
		}
	public int getCyl() {
		return cyl;
		}
	public void setOwner(String name) {
		owner = new Person(name);
		}
	public String getOwnerName() {
		return owner.name;
		}
	
	public boolean equals(Vehicle other) {
		boolean isEqual = false;
		if (this.manu == other.manu && this.cyl == other.cyl && this.owner.name.equalsIgnoreCase(other.owner.name)) {
			isEqual = true;
			}
		return isEqual;	
		}
	public static void main(String[] args) {
		Vehicle demo1 = new Vehicle("Carz", 4, "Jimmy");
		Vehicle demo2 = new Vehicle("Carz", 4, "Jimmy");
		System.out.println(demo1.equals(demo2));
		}								
	}
