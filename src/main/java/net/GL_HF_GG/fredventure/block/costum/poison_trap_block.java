package net.GL_HF_GG.fredventure.block.costum;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class poison_trap_block extends Block {
    public poison_trap_block(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_, Entity p_152434_) {
        if(!p_152431_.isClientSide()){
            if(p_152434_ instanceof LivingEntity){
                LivingEntity entity = ((LivingEntity) p_152434_);
                entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 3));
            }
        }
        super.stepOn(p_152431_, p_152432_, p_152433_, p_152434_);
    }



    @Override
    public void fallOn(Level p_152426_, BlockState p_152427_, BlockPos p_152428_, Entity p_152429_, float p_152430_) {
        if(!p_152426_.isClientSide()){
            if(p_152429_ instanceof LivingEntity) {
                LivingEntity entity = ((LivingEntity) p_152429_);
                entity.addEffect(new MobEffectInstance(MobEffects.HARM, 5, 5));
            }
        }
        super.fallOn(p_152426_, p_152427_, p_152428_, p_152429_, p_152430_);
    }
}
