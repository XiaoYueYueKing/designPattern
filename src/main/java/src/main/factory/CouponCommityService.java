package src.main.factory;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;


/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: factory
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  12:23
 * @Description: TODO
 * @Version: 1.0
 */

@Slf4j
public class CouponCommityService implements ICommodity{
    @Override
    public void sendCommodity(){
        log.info("优惠券");
    }
}
