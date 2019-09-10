package chap01;

public class Audience {

	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	// for Test
	protected Bag getBag() {
		return bag;
	}

	public long buy(Ticket ticket) {
		if (bag.hasInvitation()) {
			bag.setTicket(ticket);
			return 0L;
		}
		bag.minusAmount(ticket.getFee());
		bag.setTicket(ticket);
		return ticket.getFee();

	}
}
