package com.haloreach252.warfareadditions;

import com.haloreach252.warfareadditions.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabWarfare extends CreativeTabs{

	public TabWarfare(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.VAULT_WALL);
	}

}
