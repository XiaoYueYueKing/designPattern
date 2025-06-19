package src.main.Strategy;

import java.math.BigDecimal;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.Strategy
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  21:41
 * @Description: TODO
 * @Version: 1.0
 */
public interface ICouponDiscount<T> {
    /**
     * @description:
     * @author: yueyueking 
     * @date: 2025/6/19 22:21
     * @param: couponInfo
     * @param: skuPrice 
     * @return: java.math.BigDecimal
     **/
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
