package com.haloreach252.warfareadditions.item;

import com.haloreach252.warfareadditions.Main;
import com.haloreach252.warfareadditions.init.ModItems;
import com.haloreach252.warfareadditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabWarfare);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}

	
	
}
