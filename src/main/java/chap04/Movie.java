package chap04;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Getter
@Setter
public class Movie {
    private String titile;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

}
