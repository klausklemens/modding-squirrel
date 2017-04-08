package net.vincent.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MOD_ID, name = Tutorial.MOD_NAME, version = Tutorial.VERSION)
public class Tutorial {
  public static final String MOD_ID = "tutorial";
  public static final String MOD_NAME = "Mein erster test Mod!";
  public static final String VERSION = "0.1";
  public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
  
  //@Instance(MOD_ID)
  //public static Tutorial instance;
  
  @EventHandler
  public void preinit(FMLPreInitializationEvent event) {
	  
  }
  
  @EventHandler
  public void init(FMLInitializationEvent event) {
	  
  }
  
  @EventHandler
  public void postinit(FMLPostInitializationEvent event) {
	  
  }
}
