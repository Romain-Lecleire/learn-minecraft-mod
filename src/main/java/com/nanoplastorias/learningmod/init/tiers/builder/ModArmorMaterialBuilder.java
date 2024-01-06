package com.nanoplastorias.learningmod.init.tiers.builder;

import com.nanoplastorias.learningmod.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorMaterialBuilder {
    private int[] durabilityForType;
    private int[] defenseForType;
    private int enchantability;
    private SoundEvent equipSound;
    private Supplier<Ingredient> repairMaterial;
    private String name;
    private float toughness;
    private float knockbackResistance;

    public ModArmorMaterialBuilder durabilityForType(int[] durabilityForType) {
        this.durabilityForType = durabilityForType;
        return this;
    }

    public ModArmorMaterialBuilder defenseForType(int[] defenseForType) {
        this.defenseForType = defenseForType;
        return this;
    }

    public ModArmorMaterialBuilder enchantability(int enchantability) {
        this.enchantability = enchantability;
        return this;
    }

    public ModArmorMaterialBuilder equipSound(SoundEvent equipSound) {
        this.equipSound = equipSound;
        return this;
    }

    public ModArmorMaterialBuilder repairMaterial(Supplier<Ingredient> repairMaterial) {
        this.repairMaterial = repairMaterial;
        return this;
    }

    public ModArmorMaterialBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ModArmorMaterialBuilder toughness(float toughness) {
        this.toughness = toughness;
        return this;
    }

    public ModArmorMaterialBuilder knockbackResistance(float knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
        return this;
    }

    public ModArmorMaterial build() {
        return new ModArmorMaterial(this);
    }

    public int[] getDurabilityForType() {
        return durabilityForType;
    }

    public int[] getDefenseForType() {
        return defenseForType;
    }

    public int getEnchantability() {
        return enchantability;
    }

    public SoundEvent getEquipSound() {
        return equipSound;
    }

    public Supplier<Ingredient> getRepairMaterial() {
        return repairMaterial;
    }

    public String getName() {
        return name;
    }

    public float getToughness() {
        return toughness;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}