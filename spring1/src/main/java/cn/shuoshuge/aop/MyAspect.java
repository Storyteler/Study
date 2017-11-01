package cn.shuoshuge.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* cn.shuoshuge.service..*.*(..))")
    public void pt() {}

    @Before("pt()")
    public void asBefore() {
        System.out.println("前置通知");
    }
    @AfterReturning("pt()")
    public void asAfter() {
        System.out.println("后置通知");
    }
    @AfterThrowing("pt()")
    public void asException() {
        System.out.println("异常通知");
    }
    @After("pt()")
    public void asFinally() {
        System.out.println("最终通知");
    }


}
