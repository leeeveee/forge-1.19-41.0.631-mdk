package net.GL_HF_GG.fredventure.item.costum;

import com.google.common.collect.ImmutableMap;
import net.GL_HF_GG.fredventure.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
;

public class Stone_Crystal_Extractor extends Item {
    private static final Map<Block, Item> Stone_Crystal_Get =
            new ImmutableMap.Builder<Block, Item>().put(Blocks.BEDROCK, ModItems.STONE_CRYSTAL.get()).build();
    public Stone_Crystal_Extractor(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        if(!p_41427_.getLevel().isClientSide()){
            Level level = p_41427_.getLevel();
            BlockPos positionClicked = p_41427_.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if(canBlowTorch(blockClicked)){
                ItemEntity entityItem = new ItemEntity(level, positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                        new ItemStack(Stone_Crystal_Get.get(blockClicked), 1));

                level.addFreshEntity(entityItem);
                p_41427_.getItemInHand().hurtAndBreak(1, p_41427_.getPlayer(), p -> {
                    p.broadcastBreakEvent(p_41427_.getHand( ));

                });
                level.destroyBlock(positionClicked, false);
            }

        }
        return InteractionResult.SUCCESS;
    }
    private boolean canBlowTorch(Block block){
        return Stone_Crystal_Get.containsKey(block);
    }
}
