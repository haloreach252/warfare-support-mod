package com.haloreach252.warfareadditions.block.tileentity;

import com.haloreach252.warfareadditions.energy.CustomEnergyStorage;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;

public class TileEntityEnergyVaultGenerator extends TileEntity implements ITickable{

	private CustomEnergyStorage storage = new CustomEnergyStorage(25000000);
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if(capability == CapabilityEnergy.ENERGY) return (T)this.storage;
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if(capability == CapabilityEnergy.ENERGY) return true;
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public void update() {
		this.storage.receiveEnergy(500, false);
		this.storage.extractEnergy(2500, false);
	}

}
