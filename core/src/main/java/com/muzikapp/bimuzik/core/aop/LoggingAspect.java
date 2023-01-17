package com.muzikapp.bimuzik.core.aop;


import com.muzikapp.bimuzik.core.entity.ServiceLogger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
@Slf4j
@Component
@RequiredArgsConstructor
public class LoggingAspect {


    @Before("execution(* com.muzikapp.bimuzik.accountservice.service.Impl.UserServiceImpl..*(..))")
    public void logAccountService(JoinPoint joinPoint){
        log.info("[LOG] ({}) - ({}) called with args: {}",joinPoint.getSignature().getDeclaringType().getSimpleName(),joinPoint.getSignature().getName(),
        joinPoint.getArgs());

    }
}
