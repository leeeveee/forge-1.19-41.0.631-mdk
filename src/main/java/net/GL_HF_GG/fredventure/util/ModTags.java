package net.GL_HF_GG.fredventure.util;

import net.GL_HF_GG.fredventure.fredventure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {

    public static final TagKey<Block> WOODEN_FENCE_GATE = tag("wooden_fence_gate");
    public static  TagKey<Block> tag(String name){
        return BlockTags.create(new ResourceLocation(fredventure.MOD_ID, name));
    }
    public static TagKey<Block> forgeTag(String name){
        return BlockTags.create(new ResourceLocation("forge", name));
    }
    }
    public static class Items{
        public static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(fredventure.MOD_ID, name));
        }
        public static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
