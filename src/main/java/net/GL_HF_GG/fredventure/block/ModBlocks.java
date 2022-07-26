package net.GL_HF_GG.fredventure.block;

import net.GL_HF_GG.fredventure.block.costum.posion_trap_block;
import net.GL_HF_GG.fredventure.fredventure;
import net.GL_HF_GG.fredventure.item.ModCreativeModeTab;
import net.GL_HF_GG.fredventure.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.ApiStatus;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, fredventure.MOD_ID);
    public static final RegistryObject<Block> POSION_TRAP_DIRT =registerBlock("posion_trap_dirt",
            () -> new posion_trap_block(BlockBehaviour.Properties.of(Material.DIRT).strength(1f)), CreativeModeTab.TAB_BREWING);

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




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
