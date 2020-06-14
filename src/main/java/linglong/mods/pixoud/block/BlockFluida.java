package linglong.mods.pixoud.block;

import linglong.mods.pixoud.CreativeTabs.CreativeTabsLoader;
import linglong.mods.pixoud.Fluid.FluidLoader;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluida extends BlockFluidClassic
{
    public BlockFluida()
    {
        super(FluidLoader.fluida, Material.water);
        this.setBlockName("fluida");
        this.setCreativeTab(CreativeTabsLoader.tablinglong);
    }
}