package src.main.factory;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: factory
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  13:04
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
public class GoodCommodityService implements ICommodity{
    @Override
    public void sendCommodity(){
        log.info("实物");
    }
}
