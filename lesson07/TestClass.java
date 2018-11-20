package ru.kravchenko.se;

import ru.kravchenko.se.annotation.AfterSuite;
import ru.kravchenko.se.annotation.BeforeSuite;
import ru.kravchenko.se.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {
    public static void start (Class x) throws InvocationTargetException, IllegalAccessException {
        int count = 0;
        Method[] methods = x.getDeclaredMethods();

        for (Method o : methods) {
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                o.invoke(null);
                count++;
                if (count > 1) { throw new RuntimeException(); }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (Method o : methods) {
                if (o.isAnnotationPresent(Test.class)) {
                    if (o.getAnnotations(Test.class).prior() == i) {
                        o.invoke(null);
                    }
                }
            }
        }

        count = 0;

        for (Method o : methods) {
            if (o.isAnnotationPresent(AfterSuite.class)) {
                o.invoke(null);
                count++;
                if (count > 1) { throw new RuntimeException(); }
            }
        }

    }
}
