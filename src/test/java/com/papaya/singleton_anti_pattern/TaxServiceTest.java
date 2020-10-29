package com.papaya.singleton_anti_pattern;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxServiceTest {

    @Test
    public void withNds() {
        NdsResolver mock = Mockito.mock(NdsResolver.class);
        Mockito.when(mock.getNds()).thenReturn(20.0);
//        TaxService taxService = new TaxService(mock);
//        double withNds = taxService.withNds(100);
//        Assert.assertEquals(120,withNds,0.0);

    }
}