package chap05.discount;

import chap05.Money;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AmountDiscount implements Discount {

    private Money discountAmount;

    @Override
    public Money calculateDiscount() {
        return discountAmount;
    }
}
