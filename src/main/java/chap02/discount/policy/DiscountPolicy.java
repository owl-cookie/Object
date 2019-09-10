package chap02.discount.policy;

import chap02.Money;
import chap02.Screening;
import chap02.discount.condition.DiscountCondition;

import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private final List<DiscountCondition> conditions;

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) { // 처음 만족하는 조건에 대해, 할인을 진행한다.
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
