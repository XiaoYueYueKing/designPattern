package src.main.Strategy;

import lombok.extern.slf4j.Slf4j;
import src.main.Strategy.event.MJCouponDiscount;
import src.main.Strategy.event.ZJCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.Strategy
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  22:41
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
public class StrategyTest {
    public static void main(String[] args) {
        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        log.info("测试结果：直减优惠后金额 {}", discountAmount);

        Map<String, String> mapReq = new HashMap<>();
        mapReq.put("x", "100");
        mapReq.put("o", "10");
        Context<Map<String, String>> context1 = new Context<>(new MJCouponDiscount());
        discountAmount = context1.discountAmount(mapReq, new BigDecimal("100"));
        log.info("测试结果：满减优惠后金额 {}", discountAmount);
    }
}
