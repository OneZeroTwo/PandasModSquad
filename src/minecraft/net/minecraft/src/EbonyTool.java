package net.minecraft.src;

public class EbonyTool extends EbonyItemTool{
	private static Block blocksEffectiveAgainst[];
	
	protected EbonyTool(int i, EbonyMaterial tm){
		super(i, 3, tm, blocksEffectiveAgainst);
	}
	
	static{
		blocksEffectiveAgainst = (new Block[]{
				Block.wood
		});
	}
}
