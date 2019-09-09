package chap01;

import java.util.Arrays;
import java.util.List;

public class TicketOffice {

	private long amount;
	private List<Ticket> tickets;

	public TicketOffice(long amount, Ticket... tickets) {
		this.amount = amount;
		this.tickets = Arrays.asList(tickets);
	}

	public Ticket getTicket() {
		return tickets.remove(0);
	}

	public void plusAmount(long amount) {
		this.amount += amount;
	}

	public void minusAmount(long amount) {
		this.amount -= amount;
	}
}
