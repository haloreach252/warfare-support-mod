package com.haloreach252.warfareadditions.block;

import com.haloreach252.warfareadditions.Main;
import com.haloreach252.warfareadditions.init.ModBlocks;
import com.haloreach252.warfareadditions.init.ModItems;
import com.haloreach252.warfareadditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material mat) {
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabWarfare);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
