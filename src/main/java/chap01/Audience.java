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
		return bag.hold(ticket);

	}
}
