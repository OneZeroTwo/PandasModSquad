package net.minecraft.src;

import java.util.Arrays;

public class EbonyItemTool extends Item{
	private Block blocksEffectiveAgainst[];
	public float efficiencyOnPropertMaterial;
	public int damageVsEntity;
	protected EbonyMaterial toolMaterial;
	
	protected EbonyItemTool(int i, int j, EbonyMaterial tm, Block block[]){
		super(i);
		toolMaterial = tm;
		blocksEffectiveAgainst = block;
		maxStackSize = 24;
		setMaxDamage(tm.getMaxUses());
		efficiencyOnPropertMaterial = tm.getEfficiencyOnProperMaterial();
		damageVsEntity = j + tm.getDamageVsEntity();
	}
	
	public float getStrVsBlock(ItemStack is, Block block){
		for(int i = 0; i < blocksEffectiveAgainst.length; i++){
			if(blocksEffectiveAgainst[i] == block){
				return efficiencyOnPropertMaterial;
			}
		}
		
		return 1.0F;
	}
	
	public boolean hitEntity(ItemStack is, EntityLiving el, EntityLiving el2){
		is.damageItem(2, el2);
		return true;
	}
	
	public boolean onBlockDestroyed(ItemStack is, int i, int j, int k, int l, EntityLiving el){
		is.damageItem(1, el);
		return true;
	}
	
	public int getDamageVsEntity(Entity e){
		return damageVsEntity;
	}
	
	public boolean isFull3D(){
		return true;
	}
	
	public int getItemEnchantability(){
		return toolMaterial.getEnchantability();
	}
	
}
