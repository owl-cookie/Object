package chap01;

public class Bag {

	private long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Bag(long amount) {
		this.amount = amount;
	}

	public Bag(long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}

	public boolean hasInvitation() {
		return invitation != null;
	}

	public boolean hasTicket() {
		return ticket != null;
	}

	public void minusAmount(long amount) {
		this.amount -= amount;
	}

	public void plusAmount(long amount) {
		this.amount += amount;
	}

	public long getAmount() {
		return amount;
	}

	public Invitation getInvitation() {
		return invitation;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
