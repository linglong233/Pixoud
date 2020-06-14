package linglong.mods.pixoud.CreativeTabs;

import linglong.mods.pixoud.side.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabspixoud extends CreativeTabs
{
    public CreativeTabspixoud()
    {
        super("pixoud");
    }

    @Override
    public Item getTabIconItem()
    {
        return CommonProxy.item1;
    }
}