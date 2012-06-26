package net.minecraft.src;

import java.util.Random;

public class EmeraldBlock extends Block{

	protected EmeraldBlock(int i, Material material) {
		super(i, material);
 	}

	public int idDropped(int i, Random random){
		return mod_SickMod.emeraldBlock.blockID;
	}
	
}
