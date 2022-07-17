package net.GL_HF_GG.fredventure.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, net.GL_HF_GG.fredventure.fredventure.MOD_ID);

    public static final RegistryObject<Item> ABSORB_CRYSTAL = ITEMS.register("absorb_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> YETI_FUR = ITEMS.register("yeti_fur",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> STONE_CRYSTAL = ITEMS.register("stone_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> MOLTEN_BONE = ITEMS.register("molten_bone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> SNOW_SHARD = ITEMS.register("snow_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> DARK_SOUL = ITEMS.register("dark_soul",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> SLAIM_SOUL = ITEMS.register("slaim_soul",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) );
    public static final RegistryObject<Item> THORN = ITEMS.register("thorn",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEREBIRD_HEART = ITEMS.register("werebird_heart",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WIND_SHARD = ITEMS.register("wind_shard",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ICE_POWER_CRYSTAL = ITEMS.register("ice_power_crystal",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FROSTSHARK_FIN = ITEMS.register("frostshark_fin",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> HAUNTED_SNOW_SHARD = ITEMS.register("haunted_snow_shard",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ICE_THORN = ITEMS.register("ice_thorn",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SHYGUY_EYES = ITEMS.register("shyguy_eyes",
            () -> new Item (new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> EARTHS_WING = ITEMS.register("earths_wing",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CRUSHING_PAW = ITEMS.register("crushing_paw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FAT = ITEMS.register("fat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEREWOLF_JAW = ITEMS.register("werewolf_jaw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WEREWOLF_TEETH = ITEMS.register("werewolf_teeth",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SKELMAGIC_ORB = ITEMS.register("skelmagic_orb",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ZOMBIE_ARM = ITEMS.register("zombie_arm",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2.4F).fast().build())) );
    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(7.0F).build())) );
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(1.2F).fast().build())) );
    public static final RegistryObject<Item> SNAIL = ITEMS.register("snail",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(1.0F).fast().build())) );
    public static final RegistryObject<Item> TURKEY_RAW = ITEMS.register("turkey_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1.4F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1F).build())) );
    public static final RegistryObject<Item> TURKEY_COOKED = ITEMS.register("turkey_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(7.5F).build())) );
    public static final RegistryObject<Item> CHICKEN_LEG_COOKED = ITEMS.register("chicken_leg_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(3.6F).build())) );
    public static final RegistryObject<Item> CHICKEN_LEG_RAW = ITEMS.register("chicken_leg_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.7F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1F).build())));
    public static final RegistryObject<Item> WHALE_RAW = ITEMS.register("whale_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(2.8F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1F).build())));
    public static final RegistryObject<Item> WHALE_COOKED = ITEMS.register("whale_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(20F).build())));
    public static final RegistryObject<Item> DUCK_RAW = ITEMS.register("duck_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(7.2F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1F).build())));
    public static final RegistryObject<Item> DUCK_COOKED = ITEMS.register("duck_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1.2F).build())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
