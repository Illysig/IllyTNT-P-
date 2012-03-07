package com.tistory.illysig.IllyTNT;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class IllyTNTMain extends JavaPlugin{

	Logger log = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		log.info("[IllyTNT] Disable!");
		
	}

	public void onEnable() {
		log.info("[IllyTNT] Enable! by Illysig");
		
		IllyTNT illytnt = new IllyTNT(this);
		IllyNuke illynuke = new IllyNuke(this);
		IllyLTNT illyltnt = new IllyLTNT(this);
		
		 SpoutItemStack illytnti = new SpoutItemStack(illytnt);
	     SpoutItemStack illynukei = new SpoutItemStack(illynuke);
	     SpoutItemStack illyltnti = new SpoutItemStack(illyltnt);   
	     
	     SpoutShapedRecipe IllyTNT = new SpoutShapedRecipe(illytnti);
	     SpoutShapedRecipe IllyNuke = new SpoutShapedRecipe(illynukei);
	     SpoutShapedRecipe IllyLTNT = new SpoutShapedRecipe(illyltnti);
	     
	     IllyTNT.shape(new String[] {
		            "aa ", "aa ", "   "
		        });
		        
		 IllyNuke.shape(new String[] {
		            "aaa", "aba", "aaa"
		        });
		 IllyLTNT.shape(new String[] {
		            "aaa", " b ", "   "
		        });
		 
		        IllyTNT.setIngredient('a', MaterialData.tnt);
		        IllyNuke.setIngredient('a', MaterialData.tnt);
		        IllyNuke.setIngredient('b', illytnt);
		        
		        IllyLTNT.setIngredient('a', MaterialData.tnt);
		        IllyLTNT.setIngredient('b', MaterialData.blazeRod);
		        
		        
		        SpoutManager.getMaterialManager().registerSpoutRecipe(IllyTNT);
		        SpoutManager.getMaterialManager().registerSpoutRecipe(IllyNuke);
		        SpoutManager.getMaterialManager().registerSpoutRecipe(IllyLTNT);
	}

}
