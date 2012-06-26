package net.minecraft.src;

import java.util.Random;

public class mod_SickMod extends BaseMod{

	public static final Block emeraldBlock = new EmeraldBlock(179, Material.wood).setBlockName("Emerald Block").setHardness(8F);
	
	public static final Item emeraldItem = new Item(2000).setItemName("Emerald");
	
	@Override
	public String getVersion() {
		return "SickMod v Alpha 1.0";
	}

	@Override
	public void load() {
		//Blocks
		ModLoader.registerBlock(emeraldBlock);
		
		//Names
		ModLoader.addName(emeraldBlock,"Emerald Block");
		ModLoader.addName(emeraldItem, "Emerald");
		
		//Textures
		emeraldBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "EmeraldOre.png");
		emeraldItem.iconIndex = ModLoader.addOverride("/gui/items.png", "Emerald.png");
		
		//Recipes
		/*
		 *EDIT THE EMERALD BLOCK RECIPE!!!!!!!!!!!! 
		 */
		ModLoader.addRecipe(new ItemStack(emeraldBlock, 64), new Object[]{
			"xx", "xx", Character.valueOf('x'), Block.dirt
		});

		//Smelting
		ModLoader.addSmelting(emeraldBlock.blockID, new ItemStack(emeraldItem, 1));
	}

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		//Coal is 15
		for(int i = 0; i < 25; i++){
			int randPosX = chunkX +rand.nextInt(8);
			int randPosY = rand.nextInt(30);
			int randPosZ = chunkZ + rand.nextInt(8);
			(new WorldGenMinable(emeraldBlock.blockID, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}
	
}
