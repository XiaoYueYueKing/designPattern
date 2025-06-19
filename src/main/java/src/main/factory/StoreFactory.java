package src.main.factory;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: factory
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  13:06
 * @Description: TODO
 * @Version: 1.0
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType){
        if (commodityType == null) return null;
        switch (commodityType){
            case 1:
                return new CouponCommityService();
            case 2:
                return new GoodCommodityService();
            case 3:
                return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
