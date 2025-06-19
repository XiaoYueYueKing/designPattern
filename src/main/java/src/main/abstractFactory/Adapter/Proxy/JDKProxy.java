package src.main.abstractFactory.Adapter.Proxy;

import src.main.abstractFactory.Adapter.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.abstractFactory.Adapter.Proxy
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  15:46
 * @Description: TODO
 * @Version: 1.0
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
