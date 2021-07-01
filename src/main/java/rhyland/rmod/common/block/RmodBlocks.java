package rhyland.rmod.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import rhyland.rmod.Main;

public class RmodBlocks {

    public static Block blockChromite = new BlockChromite().setUnlocalizedName("chromite");
    public static Block blockChrome = new BlockChrome().setUnlocalizedName("chrome");

    public static void init()
    {
        ForgeRegistries.BLOCKS.register(blockChromite.setRegistryName("chromite"));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockChromite).setRegistryName(blockChromite.getRegistryName()));
        OreDictionary.registerOre("oreChromite", blockChromite);

        ForgeRegistries.BLOCKS.register(blockChrome.setRegistryName("chrome"));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockChrome).setRegistryName(blockChrome.getRegistryName()));

    }

    @SideOnly(Side.CLIENT)
    public static void clientInit()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockChromite), 0,
                new ModelResourceLocation(blockChromite.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockChrome), 0,
                new ModelResourceLocation(blockChrome.getRegistryName(), "inventory"));
    }
}
