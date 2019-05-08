package com.haloreach252.warfareadditions.block.vault;

import com.haloreach252.warfareadditions.block.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VaultBase extends BlockBase{

	public VaultBase(String name, Material mat) {
		super(name, mat);
		
		setSoundType(SoundType.METAL);
		// Hand/Pickaxe breaking speed
		setHardness(75.0f);
		// Explosion resistance
		setResistance(10000.0f);
		// The level required to mine this block
		setHarvestLevel("pickaxe",3);
		// Sets the light emitted by this block
		//setLightLevel(6.0f);
		// How easy it is for light to pass through a block, 1 is all, 0 is none
		//setLightOpacity(1);
		// Makes the block unbreakable (duh), ex: bedrock, end portal
		//setBlockUnbreakable();
	}

}
