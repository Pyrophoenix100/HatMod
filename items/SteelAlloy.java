package com.hatmod.item;

import com.hatmod.main.MainRegistry;

import net.minecraft.item.Item;

public class SteelAlloy extends Item {

	public SteelAlloy() {
		this.setCreativeTab(MainRegistry.HatBase);
		this.setTextureName(MainRegistry.modid + ":Steel_Alloy_Ingot");
		this.setUnlocalizedName("SteelAlloy");
	}
}
