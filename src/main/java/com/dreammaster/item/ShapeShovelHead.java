package com.dreammaster.item;

import com.dreammaster.lib.Refstrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShapeShovelHead {

    public static void mainRegistry() {
        inizializedItem();
        registerItem();
    }

    public static Item ShapeShovelHead;

    public static void inizializedItem(){
        ShapeShovelHead = new Item().setUnlocalizedName("ShapeShovelHead")
                .setCreativeTab(CreativeTabs.tabMisc)
                .setTextureName(Refstrings.MODID + ":itemShapeShovelHead");

    }

    public static void registerItem(){
        GameRegistry.registerItem(ShapeShovelHead, ShapeShovelHead.getUnlocalizedName());

    }

}
