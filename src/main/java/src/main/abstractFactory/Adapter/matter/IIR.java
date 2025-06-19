package src.main.abstractFactory.Adapter.matter;

import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.abstractFactory.Adapter.matter
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  15:22
 * @Description: TODO
 * @Version: 1.0
 */
public class IIR {
    public String get(String key){
        return "gain";
    }
    public String set(String key, String value){
        return "gain";
    }
    public String setExpire(String key, String value, long timeOut, TimeUnit timeUnit){
        return "setExpire";
    }
    public String del(String key){
        return "del";
    }
}
