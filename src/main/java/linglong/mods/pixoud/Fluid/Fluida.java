package linglong.mods.pixoud.Fluid;

import linglong.mods.pixoud.PixoudMain;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class Fluida extends Fluid
{
    public Fluida()
    {
        super("a");
        this.setUnlocalizedName("fluida");
        this.setDensity(13600);
        this.setViscosity(1000);
        this.setLuminosity(0);
        this.setTemperature(300);
    }
}