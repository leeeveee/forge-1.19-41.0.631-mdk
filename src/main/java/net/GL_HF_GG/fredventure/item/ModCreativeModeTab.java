package net.GL_HF_GG.fredventure.item;

import net.GL_HF_GG.fredventure.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COLORFUL_BLOCKS_TAB = new CreativeModeTab("Colorful_Blocks_Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.LIME_PLANKS.get());
        }
    };
}
