package rhyland.rmod.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import rhyland.rmod.common.creativetab.CreativeTabsRmod;

public class ItemGlassArmor extends ItemArmor {
    public ItemGlassArmor(ItemArmor.ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn,
                          String regName ,String unlocalizedName)
    {
        super(materialIn,0,equipmentSlotIn);
        setRegistryName(regName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabsRmod.tabRmod);
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RmodItems.itemGlassHelmet)
        {
            if (!world.isRemote) {
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 0));
            }
        }
    }
}
