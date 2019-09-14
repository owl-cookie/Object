package chap05;

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


    public Money calculateAmountFee(Screening screening, int audienceCount) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountFee()).times(audienceCount);
        }
        return fee;
    }

    private Money calculateDiscountFee() {
        if (movieType == MovieType.AMOUNT_DISCOUNT) {
            return discountAmount;
        } else if (movieType == MovieType.PERCENT_DISCOUNT) {
            return fee.times(discountPercent);
        }
        return Money.ZERO;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .anyMatch(discountCondition -> discountCondition.isDiscountable(screening));
    }
}
