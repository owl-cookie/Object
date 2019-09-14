package chap05;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
public class DiscountCondition {

    private DiscountConditionType discountConditionType;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isDiscountable(Screening screening) {
        if (discountConditionType == DiscountConditionType.PERIOD) {
            return isPeriodDiscountable(screening);
        } else if (discountConditionType == DiscountConditionType.SEQUENCE) {
            return isSequenceDiscountable(screening);
        }
        return false;
    }

    private boolean isSequenceDiscountable(Screening screening) {
        return sequence == screening.getSequence();
    }

    private boolean isPeriodDiscountable(Screening screening) {
        return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek)
                && startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0
                && endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }

}
