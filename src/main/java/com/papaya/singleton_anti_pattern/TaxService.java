package com.papaya.singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class TaxService {


    public double withNds(double price) {
        return price + IsraelNdsResolverSingleton.getInstance().getNds() * price / 100;
    }
}
