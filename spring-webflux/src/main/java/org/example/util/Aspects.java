package org.example.util;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect @Component
public class Aspects {

    @Pointcut("execution(public String org.example.*.*.get*())")
    public void allGettersPointcut() { }

    @Before("allGettersPointcut()")
    public void getterBeforeAdvice() {
        System.out.println("Getter is called");
    }

    @After("allGettersPointcut()")
    public void getterAfterAdvice() {
        System.out.println("Getter returning");
    }

    @Before("execution(public void org.example.*.*.set*(*))")
    public void setterBeforeAdvice() {
        System.out.println("Setter is called");
    }
}
