package com.nanoplastorias.learningmod.init;

import com.nanoplastorias.learningmod.LearningMod;
import net.minecraft.world.item.*;
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


    public static final RegistryObject<SwordItem> STEEL_SWORD = CreativeTabInit.addToTab(ITEMS.register("steel_sword",
            () -> new SwordItem(
                    TierInit.STEEL_TIERS,
                    3,        // 0 => 1 attack damage
                    -2.4f,              // 0 => 4 attack speed
                    new Item.Properties())
    ));



    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = CreativeTabInit.addToTab(ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(
                    TierInit.STEEL_TIERS,
                    1,
                    -2.4f,
                    new Item.Properties())
    ));



    public static final RegistryObject<ArmorItem> STEEL_HELMET = CreativeTabInit.addToTab(ITEMS.register("steel_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )
    ));

    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = CreativeTabInit.addToTab(ITEMS.register("steel_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )
    ));

    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = CreativeTabInit.addToTab(ITEMS.register("steel_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )
    ));

    public static final RegistryObject<ArmorItem> STEEL_BOOTS = CreativeTabInit.addToTab(ITEMS.register("steel_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.STEEL_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )
    ));
}
