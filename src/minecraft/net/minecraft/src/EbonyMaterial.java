package net.minecraft.src;

public enum EbonyMaterial {
	EBONY("EBONY", 5, 40, 500, 4F, 6, 9);
	
	private final int harvestLevel, maxUses, damageVsEntity, enchantability;
	private final float efficiencyOnProperMaterial;
	private static final EbonyMaterial allToolMaterials[];
	
	private EbonyMaterial(String s, int i, int j, int k, float f, int l, int i1){
		harvestLevel = i;
		maxUses = k;
		efficiencyOnProperMaterial = f;
		damageVsEntity = l;
		enchantability = i1;
		
	}
	
	public int getMaxUses(){
		return maxUses;
	}
	
	public float getEfficiencyOnProperMaterial(){
		return efficiencyOnProperMaterial;
	}
	
	public int getDamageVsEntity(){
		return damageVsEntity;
	}
	
	public int getHarvestLevel(){
		return harvestLevel;
	}
	
	public int getEnchantability(){
		return enchantability;
	}
	
	static{
		allToolMaterials = (new EbonyMaterial[] {
				EBONY,
		});
	}
}
