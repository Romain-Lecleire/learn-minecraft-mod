package com.nanoplastorias.learningmod;

import com.mojang.logging.LogUtils;
import com.nanoplastorias.learningmod.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(LearningMod.MODID)
public class LearningMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "learningmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public LearningMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);

        LOGGER.info("LearningMod start successfully");
        MinecraftForge.EVENT_BUS.register(this);
    }
}
