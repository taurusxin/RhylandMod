package rhyland.rmod.common.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rhyland.rmod.common.block.RmodBlocks;


public class RmodItems {
    public static final Item.ToolMaterial CHROME
            = EnumHelper.addToolMaterial("CHROME", 4, 2163, 15.0F, 7.0F, 15);

    public static final ItemArmor.ArmorMaterial GLASS_MATERIAL
            = EnumHelper.addArmorMaterial("GLASS", "rmod:glass", 16, new int[]{4, 6, 8, 5}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

    public static Item itemRhylandSword = new ItemRhylandSword().setUnlocalizedName("rhylandSword");
    public static Item itemChromeIngot = new ItemChromeIngot().setUnlocalizedName("chromeIngot");
    public static Item itemRhylandAxe = new ItemRhylandAxe().setUnlocalizedName("rhylandAxe");
    public static Item itemRhylandPickaxe = new ItemRhylandPickaxe().setUnlocalizedName("rhylandPickaxe");
    public static Item itemGlassHelmet = new ItemGlassArmor(GLASS_MATERIAL,EntityEquipmentSlot.HEAD,
            "glass_helmet","glassHelmet");



    public static void init()
    {
        ForgeRegistries.ITEMS.register(itemRhylandSword.setRegistryName("rhyland_sword"));
        ForgeRegistries.ITEMS.register(itemChromeIngot.setRegistryName("chrome_ingot"));
        ForgeRegistries.ITEMS.register(itemRhylandAxe.setRegistryName("rhyland_axe"));
        ForgeRegistries.ITEMS.register(itemRhylandPickaxe.setRegistryName("rhyland_pickaxe"));
        ForgeRegistries.ITEMS.register(itemGlassHelmet);

    }

    @SideOnly(Side.CLIENT)
    public static void clientInit()
    {
        ModelLoader.setCustomModelResourceLocation(itemRhylandSword, 0,
                new ModelResourceLocation(itemRhylandSword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemChromeIngot, 0,
                new ModelResourceLocation(itemChromeIngot.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemRhylandAxe,0,
                new ModelResourceLocation(itemRhylandAxe.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(itemRhylandPickaxe,0,
                new ModelResourceLocation(itemRhylandPickaxe.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(itemGlassHelmet,0,
                new ModelResourceLocation(itemGlassHelmet.getRegistryName(),"inventory"));
    }

    public static void addSmelting()
    {
        GameRegistry.addSmelting(RmodBlocks.blockChromite, new ItemStack(itemChromeIngot), 0.5f);
    }
}
