package chap02;

import chap02.discount.policy.DiscountPolicy;
import lombok.AllArgsConstructor;

import java.time.Duration;

@AllArgsConstructor
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
