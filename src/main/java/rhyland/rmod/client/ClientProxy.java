package rhyland.rmod.client;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rhyland.rmod.client.event.EventHandler;
import rhyland.rmod.client.key.RmodKeyBindings;
import rhyland.rmod.common.CommonProxy;
import rhyland.rmod.common.block.RmodBlocks;
import rhyland.rmod.common.item.RmodItems;

public class ClientProxy extends CommonProxy
{
    public static KeyBinding[] keyBindings;

    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        RmodItems.clientInit();
        RmodBlocks.clientInit();
        RmodKeyBindings.clientInit();
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        // MinecraftForge.EVENT_BUS.register(EventHandler.class);
    }
}
