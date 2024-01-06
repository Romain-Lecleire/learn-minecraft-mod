package com.nanoplastorias.learningmod.init.tiers;

import com.nanoplastorias.learningmod.LearningMod;
import com.nanoplastorias.learningmod.init.tiers.builder.ModArmorMaterialBuilder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorMaterial implements ArmorMaterial {

    private final int[] durabilityForType;
    private final int[] defenseForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    public ModArmorMaterial(ModArmorMaterialBuilder modArmorMaterialBuilder) {
        this.durabilityForType = modArmorMaterialBuilder.getDurabilityForType();
        this.defenseForType = modArmorMaterialBuilder.getDefenseForType();
        this.enchantability = modArmorMaterialBuilder.getEnchantability();
        this.equipSound = modArmorMaterialBuilder.getEquipSound();
        this.repairMaterial = modArmorMaterialBuilder.getRepairMaterial();
        this.name = LearningMod.MODID + ":" + modArmorMaterialBuilder.getName();
        this.toughness = modArmorMaterialBuilder.getToughness();
        this.knockbackResistance = modArmorMaterialBuilder.getKnockbackResistance();
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.durabilityForType[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.defenseForType[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
