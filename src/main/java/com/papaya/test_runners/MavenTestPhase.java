package com.papaya.test_runners;

import java.io.File;

/**
 * @author Evgeny Borisov
 */
public class MavenTestPhase {
    public static void main(String[] args) throws Exception {


        TestRunner.runAllTests("com.papaya.test_runners.MyTestClass");

//        File[] files = new File("c:\\").listFiles();
//
//        for (File file : files) {
//            TestRunner.runAllTests(file.getName());
//        }
    }
}
