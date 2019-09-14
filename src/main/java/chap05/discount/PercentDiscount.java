package chap05.discount;

import chap05.Money;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PercentDiscount implements Discount {
    private double discountPercent;
    private Money fee;


    @Override
    public Money calculateDiscount() {
        return fee.times(discountPercent);
    }
}
