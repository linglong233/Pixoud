package linglong.mods.pixoud.side;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import linglong.mods.pixoud.Crafting.CraftingLoader;
import linglong.mods.pixoud.CreativeTabs.CreativeTabsLoader;
import linglong.mods.pixoud.Fluid.FluidLoader;
import linglong.mods.pixoud.block.BlockFluida;
import linglong.mods.pixoud.item.item;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CommonProxy {
	public static item i = new item();
	public static Item item1;
	public static Item item2;
	public static Item item3;
	public static Item item4;
	public static Item item5;
	public static Item item6;
	public static Item item7;
	public static Item item8;
	public static Item item9;
	public static Item item10;
	public static Item item11;
	public static Item item12;
	public static Item item13;
	public static Item item14;
	public static Item item15;
	public static Item item16;
	public static Item item17;
	public static Item item18;
	public static Item item19;
	
	public static Item firewood;
	
	public static Item brick0;
	public static Item brick1;
	public static Item coin6;
	public static Item coin7;
	public static Item coin8;
	
	public static Item plane_body;
	public static Item plane_bronze;
	public static Item plane_iron;
	public static Item plane_steel;
	
	public static BlockFluida BlockFluida;

	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsLoader(event);
		new FluidLoader(event);

		item1 = i.new item1();
		GameRegistry.registerItem(item1, "stick_pin");

		item2 = i.new item2();
		GameRegistry.registerItem(item2, "bone_needle");

		item3 = i.new item3();
		GameRegistry.registerItem(item3, "thread_bone_needle");

		item4 = i.new item4();
		GameRegistry.registerItem(item4, "steel_needle");

		item5 = i.new item5();
		GameRegistry.registerItem(item5, "thread_steel_needle");

		item6 = i.new item6();
		GameRegistry.registerItem(item6, "unfired_pottery_tray");

		item7 = i.new item7();
		GameRegistry.registerItem(item7, "pottery_plate");

		item8 = i.new item8();
		GameRegistry.registerItem(item8, "spindle");

		item9 = i.new item9();
		GameRegistry.registerItem(item9, "yarn_ball");

		item10 = i.new item10();
		GameRegistry.registerItem(item10, "wool_cloth");

		item11 = i.new item11();
		GameRegistry.registerItem(item11, "leather_belt");

		item12 = i.new item12();
		GameRegistry.registerItem(item12, "tanned_leather_belt");

		item13 = i.new item13();
		GameRegistry.registerItem(item13, "mineral_berry_seeds");

		item14 = i.new item14();
		GameRegistry.registerItem(item14, "magic_powder");

		item15 = i.new item15();
		GameRegistry.registerItem(item15, "refined_wooden_board");

		item16 = i.new item16();
		GameRegistry.registerItem(item16, "refined_wooden_slats");

		item17 = i.new item17();
		GameRegistry.registerItem(item17, "refined_large_wooden_board");

		item18 = i.new item18();
		GameRegistry.registerItem(item18, "wooden_wedge");

		item19 = i.new item19();
		GameRegistry.registerItem(item19, "group_legs");

		firewood = i.new firewood();
		GameRegistry.registerItem(firewood, "firewood");

		brick0 = i.new brick0();
		GameRegistry.registerItem(brick0, "brick0");

		brick1 = i.new brick1();
		GameRegistry.registerItem(brick1, "brick1");

		coin6 = i.new coin6();
		GameRegistry.registerItem(coin6, "coin6");

		coin7 = i.new coin7();
		GameRegistry.registerItem(coin7, "coin7");

		coin8 = i.new coin8();
		GameRegistry.registerItem(coin8, "coin8");

		plane_body = i.new plane_body();
		GameRegistry.registerItem(plane_body, "plane_body");

		plane_bronze = i.new plane_bronze();
		GameRegistry.registerItem(plane_bronze, "plane_bronze");

		plane_iron = i.new plane_iron();
		GameRegistry.registerItem(plane_iron, "plane_iron");

		plane_steel = i.new plane_steel();
		GameRegistry.registerItem(plane_steel, "plane_steel");

		BlockFluida = new BlockFluida();
		this.register(BlockFluida, "BlockFluida");
	}

	private static void register(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}

	public void init(FMLInitializationEvent event) {
		new CraftingLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}