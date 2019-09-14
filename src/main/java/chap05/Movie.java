package chap05;

import chap05.discount.Discount;
import chap05.discountcondition.DiscountCondition;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Movie {
    private String titile;
    private Duration runningTime;
    private Money fee;
    private DiscountCondition discountConditions;

    private Discount discount;


    public Money calculateAmountFee(Screening screening, int audienceCount) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountFee()).times(audienceCount);
        }
        return fee;
    }

    private Money calculateDiscountFee() {
        return discount.calculateDiscount();
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.isDiscountable(screening);
    }
}
