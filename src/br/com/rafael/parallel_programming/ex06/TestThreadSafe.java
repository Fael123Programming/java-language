package br.com.rafael.parallel_programming.ex06;

import java.util.*;

public class TestThreadSafe {
    public synchronized void aMethod(){
        //Do something but never can be accessed by multiple threads a time...
        //Critic region!!!
        //This method is locked when a thread is on it avoiding other ones
        //of trying access it.
    }

    public void anotherMethod(){
        synchronized(this) {
            //The same of the method above but using another syntax...
        }
    }

    public static void aStaticMethod(){
        synchronized(TestThreadSafe.class) {
            //The usage of thread-safety to static methods...
        }
    }

    public static synchronized void anotherStaticMethod(){
        //A different syntax for it...
    }
}
