package rhyland.rmod.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import rhyland.rmod.common.item.RmodItems;

public class CreativeTabsRmod extends CreativeTabs
{
    public static CreativeTabsRmod tabRmod = new CreativeTabsRmod();
    public CreativeTabsRmod()
    {
        super("rmod");
    }
    public ItemStack getTabIconItem()
    {
        return new ItemStack(RmodItems.itemRhylandSword);
    }
}
