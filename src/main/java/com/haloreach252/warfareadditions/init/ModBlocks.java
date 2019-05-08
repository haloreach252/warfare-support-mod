package com.haloreach252.warfareadditions.init;

import java.util.ArrayList;
import java.util.List;

import com.haloreach252.warfareadditions.block.BlockBase;
import com.haloreach252.warfareadditions.block.BlockFissionGenerator;
import com.haloreach252.warfareadditions.block.vault.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Vault Blocks
	public static final Block VAULT_WALL = new VaultWall("vault_wall", Material.IRON);
	public static final Block VAULT_FLOOR = new VaultBase("vault_floor", Material.IRON);
	
	public static final Block VAULT_GLASS = new VaultGlass("vault_glass", Material.GLASS);
	public static final Block VAULT_GLASS_WALKTHROUGH = new VaultGlassWalkthrough("vault_glass_walkthrough", Material.GLASS);
	
	public static final Block VAULT_LIGHT = new VaultLight("vault_light", Material.REDSTONE_LIGHT);
	
	// Fission Generation Stuff
	
	public static final Block FISSION_GENERATOR = new BlockFissionGenerator("block_fission_generator");
	
}
