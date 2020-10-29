package com.papaya.singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class IsraelNdsResolverSingleton {
    private static IsraelNdsResolverSingleton instance = new IsraelNdsResolverSingleton();

    public static IsraelNdsResolverSingleton getInstance() {
        return instance;
    }

    public double getNds(){
        return 18;
    }
}
