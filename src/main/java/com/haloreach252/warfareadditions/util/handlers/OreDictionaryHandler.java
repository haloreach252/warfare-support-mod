package com.haloreach252.warfareadditions.util.handlers;

import com.haloreach252.warfareadditions.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		OreDictionary.registerOre("ingotSteel", ModItems.CREDIT_ONE);
	}
	
}
