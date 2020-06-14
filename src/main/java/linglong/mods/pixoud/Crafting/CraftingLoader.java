package linglong.mods.pixoud.Crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import linglong.mods.pixoud.side.CommonProxy;
import net.minecraft.item.ItemStack;

public class CraftingLoader
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {

    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(CommonProxy.brick1, new ItemStack(CommonProxy.brick0), 0.5F);
        GameRegistry.addSmelting(CommonProxy.item6, new ItemStack(CommonProxy.item7), 0.5F);
    }

    private static void registerFuel()
    {

    }
}