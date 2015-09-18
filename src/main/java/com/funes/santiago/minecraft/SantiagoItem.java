package com.funes.santiago.minecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SantiagoItem extends Item {

	private final String name = "santiagoItem";

	public SantiagoItem() {
		setUnlocalizedName(SantiagoMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	public String getName() {
		return name;
	}
}
