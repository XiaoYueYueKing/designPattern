package src.main;

import org.junit.Test;
import src.main.factory.ICommodity;
import src.main.factory.StoreFactory;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.man
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  13:13
 * @Description: TODO
 * @Version: 1.0
 */
public class FactoryTest {
    /**
     * @description: 工厂模式
     * @author: yueyueking 
     * @date: 2025/6/15 13:25
     **/
    @Test
    public void factoryCommodityTest(){
        StoreFactory storeFactory = new StoreFactory();
        ICommodity commodityService = storeFactory.getCommodityService(2);
        commodityService.sendCommodity();
    }
}
