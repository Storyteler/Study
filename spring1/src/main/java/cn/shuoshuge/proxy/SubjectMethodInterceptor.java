package cn.shuoshuge.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SubjectMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before-------");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("after---------");
        return result;
    }
}
