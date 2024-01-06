package com.nanoplastorias.learningmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier STEEL_TIERS = new ForgeTier(
            2,
            1000,
            7,
            3,
            18,
            TagInit.NEEDS_STEEL_TOOL,
            () -> Ingredient.of(ItemInit.LV_CIRCUIT::get)
    );
}
