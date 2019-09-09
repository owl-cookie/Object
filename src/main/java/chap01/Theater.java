package chap01;

public class Theater {

	private TicketSeller ticketSeller;

	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	public void enter(Audience audience) {
		if (audience.hasInvitation()) {
			ticketSeller.exchange(audience);
			return;
		}
		ticketSeller.sellTo(audience);
	}
}