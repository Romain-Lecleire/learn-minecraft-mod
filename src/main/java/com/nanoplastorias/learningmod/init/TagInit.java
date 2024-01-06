package com.nanoplastorias.learningmod.init;

import com.nanoplastorias.learningmod.LearningMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("need_steel_tool");

    private static TagKey<Block> tag(String name){
        return BlockTags.create(new ResourceLocation(LearningMod.MODID,name));
    }
}
