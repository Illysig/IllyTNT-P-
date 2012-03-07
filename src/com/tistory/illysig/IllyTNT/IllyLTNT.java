package com.tistory.illysig.IllyTNT;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class IllyLTNT extends GenericCubeCustomBlock{

	public IllyLTNT(Plugin plugin) {
		super(plugin, "IllyTest", "http://dl.dropbox.com/u/40491841/nuclearExplosiveSide.png", 16);
		
	}
    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId)
    {
    	
        Location location = new Location(world, x, y, z);
        
        SpoutBlock block = (SpoutBlock)location.getBlock();
        
        if(block.isBlockPowered())
        	
        	block.getWorld().createExplosion(block.getLocation(), 5F);
            block.getWorld().strikeLightning(block.getLocation());
         
    }
    
   
}
