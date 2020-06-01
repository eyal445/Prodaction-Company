
public abstract class Employy extends Person {
	private int sallery;

	public Employy(String firstname, String lastname, int age, int sallery) {
		super(firstname, lastname, age);
		this.sallery = sallery;
	}

	public int getSallery() {
		return sallery;
	}

	public void setSallery(int sallery) {
		this.sallery = sallery;
	}

	@Override
	public String toString() {
		return "Employy [sallery=" + sallery + ", toString()=" + super.toString() + "]";
	}


}
