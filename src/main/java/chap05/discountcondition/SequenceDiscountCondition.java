package chap05.discountcondition;

import chap05.Money;
import chap05.Screening;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SequenceDiscountCondition extends DiscountCondition {

    private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isDiscountable(Screening screening) {
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
