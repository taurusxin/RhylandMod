package rhyland.rmod.common.world.gen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rhyland.rmod.common.block.RmodBlocks;

public class OreGenEventHandler {
    public static void init()
    {
        MinecraftForge.ORE_GEN_BUS.register(OreGenEventHandler.class);
    }

    private static WorldGenerator worldGenMinable
            = new WorldGenMinable(RmodBlocks.blockChromite.getDefaultState(), 4);

    @SubscribeEvent
    public static void onGenerateMinable(OreGenEvent.GenerateMinable event)
    {
        for (int i = 0; i < 2; i++)
        {
            if (event.getRand().nextInt(5) > 3) {
                int posX = event.getPos().getX() + event.getRand().nextInt(16);
                int posY = 8 + event.getRand().nextInt(12);
                int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                worldGenMinable.generate(event.getWorld(), event.getRand(), blockpos);
            }
        }
    }
}
