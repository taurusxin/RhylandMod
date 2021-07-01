package rhyland.rmod.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rhyland.rmod.common.block.RmodBlocks;
import rhyland.rmod.common.item.RmodItems;
import rhyland.rmod.common.world.gen.OreGenEventHandler;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        RmodItems.init();
        RmodBlocks.init();
    }

    public void init(FMLInitializationEvent event)
    {
        RmodItems.addSmelting();
        OreGenEventHandler.init();
    }
}
