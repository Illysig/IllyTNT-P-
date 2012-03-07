package com.tistory.illysig.IllyTNT;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class IllyTNT extends GenericCubeCustomBlock{

	public IllyTNT(Plugin plugin) {
		super(plugin, "IllyTNT", "http://dl.dropbox.com/u/40491841/c4Side.png", 16);
		
	
	}
    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId)
    {
        Location location = new Location(world, x, y, z);
        SpoutBlock block = (SpoutBlock)location.getBlock();
        if(block.isBlockPowered())
            block.getWorld().createExplosion(block.getLocation(), 10F);
        	
    }
}
