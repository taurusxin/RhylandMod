package rhyland.rmod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import rhyland.rmod.common.creativetab.CreativeTabsRmod;

public class BlockChromite extends Block
{
    public BlockChromite()
    {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        //表示方块踩上去的声音
        this.setHardness(30.0f);
        //表示方块硬度 黑曜石的硬度为50
        this.setHarvestLevel("pickaxe", 3);
        //pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）
        this.setCreativeTab(CreativeTabsRmod.tabRmod);
    }
}
