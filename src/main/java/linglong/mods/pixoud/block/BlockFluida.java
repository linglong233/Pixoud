package linglong.mods.pixoud.block;

import linglong.mods.pixoud.CreativeTabs.CreativeTabsLoader;
import linglong.mods.pixoud.Fluid.FluidLoader;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluida extends BlockFluidClassic
{
	public IIcon still;
	public IIcon flow;
    public BlockFluida()
    {
        super(FluidLoader.fluida, Material.water);
        this.setBlockName("fluida");
        this.setBlockTextureName("pixoud:fluida");
        this.setCreativeTab(CreativeTabsLoader.tablinglong);
    }
	@Override
	public void registerBlockIcons(IIconRegister register) {
		this.still = register.registerIcon("pixoud:fluida");
		this.flow = register.registerIcon("pixoud:fluida_flow");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return side < 2 ? this.flow : this.still;
	}

	@Override
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return side < 2 ? this.flow : this.still;
	}
}