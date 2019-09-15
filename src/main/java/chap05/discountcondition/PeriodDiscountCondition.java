package chap05.discountcondition;

import chap05.Money;
import chap05.Screening;
import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
public class PeriodDiscountCondition extends DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;


    public PeriodDiscountCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isDiscountable(Screening screening) {
        return isPeriodDiscountable(screening);
    }

    @Override
    public Money calculateDiscountAmount() {
        return null;
    }


    private boolean isPeriodDiscountable(Screening screening) {
        return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek)
                && startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0
                && endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }

}
