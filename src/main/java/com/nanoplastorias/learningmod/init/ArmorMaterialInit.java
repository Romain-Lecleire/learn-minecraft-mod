package com.nanoplastorias.learningmod.init;

import com.nanoplastorias.learningmod.init.tiers.ModArmorMaterial;
import com.nanoplastorias.learningmod.init.tiers.builder.ModArmorMaterialBuilder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial STEEL_ARMOR_MATERIAL = new ModArmorMaterialBuilder()
            .durabilityForType(new int[]{200, 400, 400, 200})
            .defenseForType(new int[]{3, 7, 5, 3})
            .enchantability(18)
            .equipSound(SoundEvents.ARMOR_EQUIP_IRON)
            .repairMaterial(() -> Ingredient.of(ItemInit.LV_CIRCUIT::get))
            .name("steel_armor_material")
            .toughness(1f)
            .knockbackResistance(0.05f)
            .build();
}