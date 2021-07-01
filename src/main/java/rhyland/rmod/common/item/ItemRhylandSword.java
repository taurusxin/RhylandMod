package rhyland.rmod.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import rhyland.rmod.common.creativetab.CreativeTabsRmod;

public class ItemRhylandSword extends ItemSword {
    public ItemRhylandSword() {
        super(RmodItems.CHROME);
        this.setCreativeTab(CreativeTabsRmod.tabRmod);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {
                int count = 0;
                for (int i = 0; i < 36; ++i) {
                    ItemStack stack = (ItemStack) playerIn.inventory.mainInventory.toArray()[i];
                    if (stack != null && stack.getItem() == RmodItems.itemChromeIngot) count += stack.getCount();
                }
                int requiredToRemove = 2;
                if (count >= requiredToRemove) {
                    int i = 0;
                    while (requiredToRemove > 0) {
                        ItemStack stack = (ItemStack) playerIn.inventory.mainInventory.toArray()[i];
                        if (stack != null && stack.getItem() == RmodItems.itemChromeIngot) {
                            if (requiredToRemove >= stack.getCount())
                                playerIn.inventory.mainInventory.toArray()[i] = null;
                            else stack.setCount(stack.getCount() - requiredToRemove);
                            requiredToRemove -= stack.getCount();
                        }
                        ++i;
                    }
                    playerIn.sendMessage(new TextComponentTranslation("rhyland.sword.effects.enabled", new Object[0]));
                    playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1200, 1));
                    playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 1));
                    playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1200, 1));
                    playerIn.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 1));
                } else {
                    playerIn.sendMessage(new TextComponentTranslation("rhyland.sword.effects.failed", new Object[0]));
                }
            }
            return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
        }
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
