package linglong.mods.pixoud;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import linglong.mods.pixoud.side.CommonProxy;

@Mod(modid = PixoudMain.MODID, name = PixoudMain.NAME, version = PixoudMain.VERSION, acceptedMinecraftVersions = "1.7.10")
public class PixoudMain
{
    public static final String MODID = "pixoud";
    public static final String NAME = "pixoud";
    public static final String VERSION = "1.0.0";
    @SidedProxy(clientSide = "linglong.mods.pixoud.side.ClientProxy", 
            serverSide = "linglong.mods.pixoud.side.CommonProxy")
    public static CommonProxy proxy;
    @Instance(PixoudMain.MODID)
    public static PixoudMain instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}