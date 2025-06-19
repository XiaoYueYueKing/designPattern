package src.main.Strategy.event;

import src.main.Strategy.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.Strategy.event
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  21:40
 * @Description: TODO
 * @Version: 1.0
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    @Override
    public BigDecimal discountAmount(Map<String, String > couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("o");

        // 小于商品金额条件的，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;
        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;

        return discountAmount;
    }
}
