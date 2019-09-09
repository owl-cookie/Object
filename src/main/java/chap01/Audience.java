package chap01;

public class Audience {

	private Bag bag;


	public Audience(Bag bag) {
		this.bag = bag;
	}

	public boolean hasInvitation(){
		return bag.hasInvitation();
	}

	public void receiveTicket(Ticket ticket){
		bag.setTicket(ticket);
	}

	public Bag getBag() {
		return bag;
	}

	public void pay(long fee){
		bag.minusAmount(fee);
	}

}
