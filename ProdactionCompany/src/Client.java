
public class Client extends Person {
	private String show;
	private int NumberOfTickets;
	private int TicketCost;
	public Client(String firstname, String lastname, int age, String show, int numberOfTickets, int ticketCost) {
		super(firstname, lastname, age);
		this.show = show;
		NumberOfTickets = numberOfTickets;
		TicketCost = ticketCost;
	}
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public int getNumberOfTickets() {
		return NumberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		NumberOfTickets = numberOfTickets;
	}
	public int getTicketCost() {
		return TicketCost;
	}
	public void setTicketCost(int ticketCost) {
		TicketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "Client [show=" + show + ", NumberOfTickets=" + NumberOfTickets + ", TicketCost=" + TicketCost
				+ ", toString()=" + super.toString() + "]";
	}

}
