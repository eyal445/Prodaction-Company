import java.util.ArrayList;
import java.util.List;

public class ArtistManeger extends Employy {
	private List<Artist>artists = new ArrayList<Artist>();

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public ArtistManeger(String firstname, String lastname, int age, int sallery, List<Artist> artists) {
		super(firstname, lastname, age, sallery);
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "Maneger [artists=" + artists + ", toString()=" + super.toString() + "]";
	}

}
