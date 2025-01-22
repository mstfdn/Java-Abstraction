package org.example.rpg;

import org.example.rpg.utils.Constant;

public interface Poisonable {
    default double poison(){
        return Constant.POISON_PERCENTAGE;
    }
}
