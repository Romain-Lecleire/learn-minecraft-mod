package com.nanoplastorias.learningmod.init;

import com.google.common.eventbus.Subscribe;
import com.nanoplastorias.learningmod.LearningMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
@Mod.EventBusSubscriber(modid = LearningMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD) //forge check subscribe event
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MODID);

    public static final List<Supplier<? extends ItemLike>> LEARNINGMOD_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> LEARNINGMOD_TAB = TABS.register("learningmod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.learningmod_tab"))
                    .icon(ItemInit.LV_CIRCUIT.get()::getDefaultInstance)
                    .displayItems((displayParameters,output) ->{
                        LEARNINGMOD_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        LEARNINGMOD_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    //add mod item in vanilla tab
    @SubscribeEvent // target function to check important : (BuildCreativeModeTabContentsEvent event)
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ItemInit.STEEL_BLOCK_ITEM);
        }
    }
}
