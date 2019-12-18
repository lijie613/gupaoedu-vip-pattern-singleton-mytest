package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyDoubleCheckSingleton;

import java.lang.reflect.Constructor;

public class LazyDoubleCacheSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyDoubleCheckSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            LazyDoubleCheckSingleton l1 = (LazyDoubleCheckSingleton) c.newInstance();
            System.out.println(l1);
            LazyDoubleCheckSingleton l2 = LazyDoubleCheckSingleton.getInstance();
            System.out.println(l2);
            System.out.println(l1 == l2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
