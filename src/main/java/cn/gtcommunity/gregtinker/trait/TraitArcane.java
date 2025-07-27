package cn.gtcommunity.gregtinker.trait;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.ToolHelper;

public class TraitArcane extends AbstractTrait {

    public TraitArcane() {
        super("arcane", TextFormatting.DARK_PURPLE);
    }

    @Override
    public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player, boolean wasEffective) {
        int time = (int) world.getWorldTime();
        if (random.nextFloat() <= 0.1 && isNight(time)) {
            ToolHelper.healTool(tool, random.nextInt(15) + 1, null);
        }
    }

    @Override
    public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, boolean wasCritical, boolean wasHit) {
        int time = (int) player.getEntityWorld().getWorldTime();
        if (random.nextFloat() <= 0.1 && isNight(time)) {
            ToolHelper.healTool(tool, random.nextInt(15) + 1, null);
        }
    }


    public boolean isNight(int time) {
        return time > 12500;
    }
}
