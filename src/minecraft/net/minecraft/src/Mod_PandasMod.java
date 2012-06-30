package net.minecraft.src;

public class Mod_PandasMod extends BaseMod{
	
	public static final Block tutorialBlock = new BlockTutorialBlock(279, Material.wood);

	@Override
	public String getVersion() {
		return "Tutorial v1.0";
	}

	@Override
	public void load() {
		ModLoader.registerBlock(tutorialBlock);
		
		//Pandas likes dick
		ModLoader.addName(tutorialBlock, "Tutorial Block");
		
		tutorialBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/EbonyBlock.png");
		
		ModLoader.addRecipe(new ItemStack(tutorialBlock,64), new Object []{
			"DDD", "DDD", "DDD", Character.valueOf('D'), Block.dirt
		});
	}

}
