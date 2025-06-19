package src.main.Strategy;

import java.math.BigDecimal;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.Strategy
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  21:40
 * @Description: 策略控制类
 * @Version: 1.0
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    //要什么实现类（子类），就把他当作参数赋值给Context的成员变量couponDiscount
    public Context(ICouponDiscount<T> couponDiscount){
        this.couponDiscount = couponDiscount;
    }

    //调用这个成员变量的方法
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
