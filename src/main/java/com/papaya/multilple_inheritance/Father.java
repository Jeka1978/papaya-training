package com.papaya.multilple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void talkToChildren(){
       System.out.println("children, come to me, please");
   }
}
