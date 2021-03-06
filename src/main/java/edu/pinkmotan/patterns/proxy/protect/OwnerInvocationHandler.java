package edu.pinkmotan.patterns.proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        if(method.getName().equals("setHotOrNotRaiting")){
            throw new IllegalAccessException();
        } else {
            try {
                return method.invoke(proxy, args);
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
