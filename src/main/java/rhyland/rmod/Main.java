package rhyland.rmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.core.Logger;
import rhyland.rmod.common.CommonProxy;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "rmod";
    public static final String NAME = "Rhyland Mod";
    public static final String VERSION = "1.1.0.2";

    @SidedProxy(clientSide = "rhyland.rmod.client.ClientProxy",
            serverSide = "rhyland.rmod.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static Main instance;

    private Logger logger;

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

    public Logger getLogger()
    {
        return logger;
    }
}
