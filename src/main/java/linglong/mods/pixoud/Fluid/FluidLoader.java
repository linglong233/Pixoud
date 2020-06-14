package linglong.mods.pixoud.Fluid;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import linglong.mods.pixoud.PixoudMain;
import linglong.mods.pixoud.side.CommonProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidLoader {
    public static Fluid fluida = new Fluida();

    public FluidLoader(FMLPreInitializationEvent event)
    {
        if (FluidRegistry.isFluidRegistered(fluida))
        {
            event.getModLog().info("Found fluid {}, the registration is canceled. ", fluida.getName());
            fluida = FluidRegistry.getFluid(fluida.getName());
        }
        else
        {
            FluidRegistry.registerFluid(fluida);
        }
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerFluidRender((BlockFluidBase) CommonProxy.BlockFluida, "fluid_a");
    }

    @SideOnly(Side.CLIENT)
    public static void registerFluidRender(BlockFluidBase blockFluid, String blockStateName)
    {
        final String location = PixoudMain.MODID + ":" + blockStateName;
        final Item itemFluid = Item.getItemFromBlock(blockFluid);
        
        
    }
}