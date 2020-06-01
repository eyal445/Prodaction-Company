import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Artist a1 = new Artist("Berri", "Saharof", 58, 10000, "vocalist+guitar");
		Artist a2 = new Artist("Gabi", "Levi", 44, 7000, "drums");
		Artist a3 = new Artist("Dor", "Levi", 30, 6500, "kyboard");
		Artist a4 = new Artist("Shalom", "Raz", 46, 7000, "bass");
		Artist a5 = new Artist("Omri", "Chen", 35, 6000, "guitar");
		List<Artist>berriBend = new ArrayList<Artist>();
		berriBend.add(a1);
		berriBend.add(a2);
		berriBend.add(a3);
		berriBend.add(a4);
		berriBend.add(a5);
		ArtistManeger ar1 = new ArtistManeger("David", "Ron", 50, 12000, berriBend);
		System.out.println(ar1);

	}

}
