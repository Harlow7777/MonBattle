package com.monbattle.items;

import com.monbattle.inventory.Item;

public class HyperPotion extends Item {
    public HyperPotion() {
        this.setName("Hyper Potion");
        this.setQuantity(1);
        this.setPrice(1500);
    }

    @Override
    public boolean use() {
        super.use();
        int prevHP = target.getHP();
        if(target.getHP() == target.getMaxHP())
            return false;
        else
            target.setHP(Math.min(target.getHP() + 120, target.getMaxHP()));
        System.out.println(target.getNickname() + " healed " + (target.getHP()-prevHP));
        return true;
    }
}
