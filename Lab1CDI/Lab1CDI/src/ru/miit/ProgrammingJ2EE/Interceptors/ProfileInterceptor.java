package ru.miit.ProgrammingJ2EE.Interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ProfileInterceptor {
    @AroundInvoke
    public Object profile(InvocationContext ic) throws Exception {
        long initTime = System.nanoTime();
        try {
            return ic.proceed();
        } finally {
            Double diffTime = ((System.nanoTime() - initTime)/1000000.0);
            System.out.println(ic.getMethod() + " took " + diffTime + " millis");
        }
    }

}
