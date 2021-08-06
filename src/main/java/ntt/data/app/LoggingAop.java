package ntt.data.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAop {

    @Around("execution(public String ntt.data.controller.TestController..*(..))")
    public Object executionAround(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getName();
        try {
            System.out.println("コード（001）：execution-Around-Before-" + name);
            Object object = joinPoint.proceed();
            System.out.println("コード（002）：execution-Around-After-" + name);
            return object;
        } catch (Exception e) {
            System.out.println("コード（003）：execution-Around-Exception-" + name);
            e.printStackTrace();
            throw e;
        }
    }

}
