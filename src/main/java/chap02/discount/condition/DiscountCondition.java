package chap02.discount.condition;

import chap02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}