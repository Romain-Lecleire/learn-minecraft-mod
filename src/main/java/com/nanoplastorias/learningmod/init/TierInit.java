package com.nanoplastorias.learningmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier STEEL_TIERS = new ForgeTier(
            2,              // mining level
            1023,                  // durability
            7,                     // mining speed
            3,                     // bonus attack damage
            18,                    // enchantability
            TagInit.NEEDS_STEEL_TOOL,
            () -> Ingredient.of(ItemInit.LV_CIRCUIT::get)  //repair ingredient
    );
}
