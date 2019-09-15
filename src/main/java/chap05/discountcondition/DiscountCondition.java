package chap05.discountcondition;

import chap05.Money;
import chap05.Screening;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DiscountCondition {

    public DiscountCondition() {
    }

    public abstract boolean isDiscountable(Screening screening);

    public abstract Money calculateDiscountAmount();

}
