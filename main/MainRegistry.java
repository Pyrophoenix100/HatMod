package com.hatmod.main;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@Mod(modid = MainRegistry.modid, version = MainRegistry.version, name = MainRegistry.name)
public class MainRegistry {

	public static final String modid = "hatmod";
	public static final String version = "Alpha v0.1";
	public static final String name = "H.A.T Mod";

	//Items
  //public static Item BlahBlahBlah;
	public static Item SteelAlloy;
	public static Item Wax;
	public static CreativeTabs HatBase;
	//Crops
		//None

	//Fluids
		//None

	//Machines
		//None

	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		HatBase = new CreativeTabs("HatBase") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return MainRegistry.SteelAlloy;
			}
		};


		//Initializations
		
		//Items
		SteelAlloy = new com.hatmod.item.SteelAlloy();
		Wax = new com.hatmod.item.Wax();
		
		//Blocks
		
		//Tools and Weapons
		
		//Fluids
		
		//Crafting Tables

		//Registers
		
		//Items		
		GameRegistry.registerItem(SteelAlloy, "SteelAlloy");
		GameRegistry.registerItem(Wax, "Wax");
		
		//Renderers
		

	}
	@SidedProxy(clientSide = "com.hatmod.main.ClientProxy", serverSide = "com.hatmod.main.ServerProxy")
	public static ServerProxy HatProxy;
	
	@EventHandler
	public void Init(FMLInitializationEvent event){

		


		//Recipes
		GameRegistry.addShapedRecipe(new ItemStack(SteelAlloy, 2), new Object[]{"IC", "CI", 'I', Items.iron_ingot, 'C', Items.coal});
		GameRegistry.addSmelting(Items.reeds, new ItemStack(Wax), 0);

		//Entities
		
		
		//Tile Entities
		
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){

	}


}
