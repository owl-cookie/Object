package chap05;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;


    public Reservation reserve(Customer customer, int audienceCount) {

        Money fee = movie.calculateAmountFee(this, audienceCount);

        return new Reservation(customer, this, fee, audienceCount);
    }

}
