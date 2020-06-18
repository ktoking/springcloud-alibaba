package com.atguigu.springcloud.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerTest {

    @Pointcut("execution(* com.atguigu.springcloud.service.*.*(..))")
    private void pt1(){};

    @Before("pt1()")
    public void beforePtr(){
        System.out.println("前置通知");
    }

    @AfterReturning("pt1()")
    public void afterPtr(){
        System.out.println("后置通知");
    }

    @AfterThrowing("pt1()")
    public void exceptionPtr(){
        System.out.println("异常通知");
    }

    @After("pt1()")
    public void finalPtr(){
        System.out.println("最终通知");
    }

}