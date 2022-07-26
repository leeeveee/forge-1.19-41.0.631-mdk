package net.GL_HF_GG.fredventure.block.costum;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class posion_trap_block extends Block {
    public posion_trap_block(Properties p_49795_) {
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
}
