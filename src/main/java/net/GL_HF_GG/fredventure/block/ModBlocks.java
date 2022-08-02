package net.GL_HF_GG.fredventure.block;

import net.GL_HF_GG.fredventure.block.costum.poison_trap_block;
import net.GL_HF_GG.fredventure.fredventure;
import net.GL_HF_GG.fredventure.item.ModCreativeModeTab;
import net.GL_HF_GG.fredventure.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, fredventure.MOD_ID);
    public static final RegistryObject<Block> POISON_TRAP_DIRT =registerBlock("poison_trap_dirt",
            () -> new poison_trap_block(BlockBehaviour.Properties.of(Material.DIRT).strength(1f)), CreativeModeTab.TAB_BREWING, "fredventure:Tooltip/poison_trap_dirt");

    public static final RegistryObject<Block> LIME_PLANKS = registerBlock("lime_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GREEN_PLANKS = registerBlock("green_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> RED_PLANKS = registerBlock("red_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> PINK_PLANKS = registerBlock("pink_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> YELLOW_PLANKS = registerBlock("yellow_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> ORANGE_PLANKS = registerBlock("orange_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> WHITE_PLANKS = registerBlock("white_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BROWN_PLANKS = registerBlock("brown_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> MAGENTA_PLANKS = registerBlock("magenta_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GRAY_PLANKS = registerBlock("gray_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLUE_PLANKS = registerBlock("blue_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLACK_PLANKS = registerBlock("black_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> PURPLE_PLANKS = registerBlock("purple_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> CYAN_PLANKS = registerBlock("cyan_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GREEN_WOODEN_STAIRS = registerBlock("green_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GREEN_WOODEN_FENCE = registerBlock("green_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GREEN_WOODEN_FENCE_GATE = registerBlock("green_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GREEN_WOODEN_SLAB = registerBlock("green_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);

    public static final RegistryObject<Block> RED_WOODEN_STAIRS = registerBlock("red_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> RED_WOODEN_FENCE = registerBlock("red_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> RED_WOODEN_FENCE_GATE = registerBlock("red_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> RED_WOODEN_SLAB = registerBlock("red_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);

    public static final RegistryObject<Block> BLACK_WOODEN_STAIRS = registerBlock("black_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLACK_WOODEN_FENCE = registerBlock("black_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLACK_WOODEN_FENCE_GATE = registerBlock("black_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLACK_WOODEN_SLAB = registerBlock("black_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BROWN_WOODEN_STAIRS = registerBlock("brown_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BROWN_WOODEN_FENCE = registerBlock("brown_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BROWN_WOODEN_FENCE_GATE = registerBlock("brown_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BROWN_WOODEN_SLAB = registerBlock("brown_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
        public static final RegistryObject<Block> YELLOW_WOODEN_STAIRS = registerBlock("yellow_wooden_stairs",
                () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
        public static final RegistryObject<Block> YELLOW_WOODEN_FENCE = registerBlock("yellow_wooden_fence",
                () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
        public static final RegistryObject<Block> YELLOW_WOODEN_FENCE_GATE = registerBlock("yellow_wooden_fence_gate",
                () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
        public static final RegistryObject<Block> YELLOW_WOODEN_SLAB = registerBlock("yellow_wooden_slab",
                () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);

    public static final RegistryObject<Block> ORANGE_WOODEN_STAIRS = registerBlock("orange_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> ORANGE_WOODEN_FENCE = registerBlock("orange_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> ORANGE_WOODEN_FENCE_GATE = registerBlock("orange_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> ORANGE_WOODEN_SLAB = registerBlock("orange_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);

    public static final RegistryObject<Block> WHITE_WOODEN_STAIRS = registerBlock("white_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> WHITE_WOODEN_FENCE = registerBlock("white_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> WHITE_WOODEN_FENCE_GATE = registerBlock("white_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> WHITE_WOODEN_SLAB = registerBlock("white_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);

    public static final RegistryObject<Block> PINK_WOODEN_STAIRS = registerBlock("pink_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> PINK_WOODEN_FENCE = registerBlock("pink_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> PINK_WOODEN_FENCE_GATE = registerBlock("pink_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> PINK_WOODEN_SLAB = registerBlock("pink_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLUE_WOODEN_STAIRS = registerBlock("blue_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLUE_WOODEN_FENCE = registerBlock("blue_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLUE_WOODEN_FENCE_GATE = registerBlock("blue_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> BLUE_WOODEN_SLAB = registerBlock("blue_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> CYAN_WOODEN_STAIRS = registerBlock("cyan_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> CYAN_WOODEN_FENCE = registerBlock("cyan_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> CYAN_WOODEN_FENCE_GATE = registerBlock("cyan_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> CYAN_WOODEN_SLAB = registerBlock("cyan_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GRAY_WOODEN_STAIRS = registerBlock("gray_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GRAY_WOODEN_FENCE = registerBlock("gray_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GRAY_WOODEN_FENCE_GATE = registerBlock("gray_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> GRAY_WOODEN_SLAB = registerBlock("gray_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_WOODEN_STAIRS = registerBlock("light_blue_wooden_stairs",
            () -> new StairBlock(() -> GREEN_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_WOODEN_FENCE = registerBlock("light_blue_wooden_fence",
            () -> new FenceBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_WOODEN_FENCE_GATE = registerBlock("light_blue_wooden_fence_gate",
            () -> new FenceGateBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_WOODEN_SLAB = registerBlock("light_blue_wooden_slab",
            () -> new SlabBlock( BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.COLORFUL_BLOCKS_TAB);






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack p_40572_, @Nullable Level p_40573_, List<Component> p_40574_, TooltipFlag p_40575_) {
                p_40574_.add(Component.translatable(tooltipKey));
                super.appendHoverText(p_40572_, p_40573_, p_40574_, p_40575_);
            }
        });

    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
