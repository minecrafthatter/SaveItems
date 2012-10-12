package com.incognitodev.SaveItems.Plugin.ChestList;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.plugin.Plugin;

import com.incognitodev.SaveItems.Plugin.utils.TurretModLoader;

public class ChestList {
	public static Map<BlockState, String> chests = new HashMap<BlockState,String>();
	public static void onDisable(Plugin parent)
	  {
		  try {
			TurretModLoader.save(chests, parent.getDataFolder().getPath()+"chests.bin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  public static void onEnable(Plugin parent)
	  {
		  try {
				chests = (Map<BlockState, String>) TurretModLoader.load(parent.getDataFolder().getPath()+"chests.bin");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
}
