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

	private void plusAmount(long amount) {
		this.amount += amount;
	}

	public void minusAmount(long amount) {
		this.amount -= amount;
	}

	public void sellTicketTo(Audience audience) {
		// ticketOffice 와 audience 간의 의존성이 추가됨
		// 의존성 vs 결합도 무엇을 선택할 것인가  ? (그때 그때 논의를 통해 도출한다.)
		plusAmount(audience.buy(getTicket()));
	}
}
