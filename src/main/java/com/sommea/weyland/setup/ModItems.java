package com.sommea.weyland.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> HAMMER = Registration.ITEMS.register("hammer", () ->
            new Item(new Item.Properties().group(ItemGroup.TOOLS)));
    static void register(){

    }
}
