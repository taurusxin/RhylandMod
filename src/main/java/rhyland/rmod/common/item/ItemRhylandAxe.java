package rhyland.rmod.common.item;

import net.minecraft.item.ItemAxe;
import rhyland.rmod.common.creativetab.CreativeTabsRmod;

public class ItemRhylandAxe extends ItemAxe
{
    public ItemRhylandAxe()
    {
        super(RmodItems.CHROME, 13f, -3f);
        this.setCreativeTab(CreativeTabsRmod.tabRmod);
    }
}
