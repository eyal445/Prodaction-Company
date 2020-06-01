
public class Artist extends Employy {
	private String instrument;

	public Artist(String firstname, String lastname, int age, int sallery, String instrument) {
		super(firstname, lastname, age, sallery);
		this.instrument = instrument;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Artist [instrument=" + instrument + ", toString()=" + super.toString() + "]";
	}

}
