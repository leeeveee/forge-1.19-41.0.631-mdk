package net.GL_HF_GG.fredventure.item.costum;

import com.google.common.collect.ImmutableMap;
import net.GL_HF_GG.fredventure.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.network.chat.contents.TranslatableFormatException;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
;

public class Stone_Crystal_Extractor extends Item {
    private static final Map<Block, Item> Stone_Crystal_Get =
            new ImmutableMap.Builder<Block, Item>().put(Blocks.BEDROCK, ModItems.STONE_CRYSTAL.get()).build();
    public Stone_Crystal_Extractor(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_,
                                List<Component> p_41423_, TooltipFlag p_41424_) {
        p_41423_.add(Component.translatable("fredventure:Tooltip/stone_crystal_extractor").withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
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
