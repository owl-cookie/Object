package chap01;

public class TicketSeller {

	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}

	public void exchange(Audience audience) {
		Ticket ticket = ticketOffice.getTicket();
		audience.receiveTicket(ticket);
	}

	public void sellTo(Audience audience) {
		Ticket ticket = ticketOffice.getTicket();
		audience.pay(ticket.getFee());
		ticketOffice.plusAmount(ticket.getFee());
		audience.receiveTicket(ticket);
	}
}
