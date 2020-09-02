package com.papaya.test_runners;

/**
 * @author Evgeny Borisov
 */
public class MyTestClass {


    public MyTestClass() {
        System.out.println("test obj was created");
    }

    public void zyx(){
        System.out.println("zyxzyxzyxzyx");
    }

    @MyTest
    public void abc(){
        System.out.println("abc");
    }

    public void testAbc(){
        System.out.println("test 1");
    }
    public void test2(){
        System.out.println("test 2");
    }
}
