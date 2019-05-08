package com.haloreach252.warfareadditions.util.handlers;

import com.haloreach252.warfareadditions.block.container.ContainerFissionGenerator;
import com.haloreach252.warfareadditions.block.gui.GuiFissionGenerator;
import com.haloreach252.warfareadditions.block.tileentity.TileEntityFissionGenerator;
import com.haloreach252.warfareadditions.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_FISSION_GENERATOR) return new ContainerFissionGenerator(player.inventory, (TileEntityFissionGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_FISSION_GENERATOR) return new GuiFissionGenerator(player.inventory, (TileEntityFissionGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
}
