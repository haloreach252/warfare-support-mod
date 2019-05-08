package com.haloreach252.warfareadditions.block.vault;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class VaultLight extends VaultBase{

	public VaultLight(String name, Material mat) {
		super(name, mat);
		
		setSoundType(SoundType.GLASS);
		setLightLevel(1.0f);
	}
	
}
