package chap05.discountcondition;

import chap05.DiscountConditionType;
import chap05.Money;
import chap05.Screening;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SequenceDiscountCondition extends DiscountCondition {

    private DiscountConditionType discountConditionType;

    private int sequence;

    public SequenceDiscountCondition(DiscountConditionType discountConditionType, int sequence) {
        super(discountConditionType);
        this.sequence = sequence;
    }

    public boolean isDiscountable(Screening screening) {
        if (discountConditionType != DiscountConditionType.SEQUENCE) {
            throw new IllegalArgumentException();
        }
        return isSequenceDiscountable(screening);
    }

    @Override
    public Money calculateDiscountAmount() {
        return null;
    }

    private boolean isSequenceDiscountable(Screening screening) {
        return sequence == screening.getSequence();
    }

}
