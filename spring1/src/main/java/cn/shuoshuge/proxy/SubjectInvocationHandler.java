package cn.shuoshuge.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectInvocationHandler implements InvocationHandler {

    private Object target;
    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--Before--");
        Object result = method.invoke(target,args);
        System.out.println("--After--");
        return result;
    }
}
