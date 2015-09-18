package com.funes.santiago.minecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static SantiagoItem santiagoItem;

	public static final void init() {
		santiagoItem = new SantiagoItem();
		GameRegistry.registerItem(santiagoItem, "santiagoItem");
		
	}
}
