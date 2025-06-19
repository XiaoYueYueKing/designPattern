package src.main.abstractFactory.Adapter.Proxy;

import src.main.abstractFactory.Adapter.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.abstractFactory.Adapter.Proxy
 * @Author: yueyueking
 * @CreateTime: 2025-06-15  15:46
 * @Description: TODO
 * @Version: 1.0
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
        return null;
    }
}

