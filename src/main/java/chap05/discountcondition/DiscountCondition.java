package chap05.discountcondition;

import chap05.DiscountConditionType;
import chap05.Money;
import chap05.Screening;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DiscountCondition {

    private DiscountConditionType discountConditionType;

    public DiscountCondition(DiscountConditionType discountConditionType) {
        this.discountConditionType = discountConditionType;
    }

    public abstract boolean isDiscountable(Screening screening);

    public abstract Money calculateDiscountAmount();

}
