package src.main.Strategy.event;

import src.main.Strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.Strategy.event
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  21:41
 * @Description: TODO
 * @Version: 1.0
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }
}
