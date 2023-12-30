package com.nanoplastorias.learningmod.init;

import com.nanoplastorias.learningmod.LearningMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MODID);

    public static final RegistryObject<Item> LV_CIRCUIT = CreativeTabInit.addToTab(ITEMS.register("lv_circuit",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> STEEL_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("steel_block",
            () -> new BlockItem(BlockInit.STEEL_BLOCK.get(),
                    new Item.Properties()
                        .rarity(Rarity.COMMON))));
}
