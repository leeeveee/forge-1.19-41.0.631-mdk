package net.GL_HF_GG.fredventure.item.costum;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;
//deze class gebruiken als je een fuel wil maken. Gebruik de fueltime parameter als je zo'n item maakt om dit te veranderen.
public class fuelitem extends Item {
    int fueltime;
    public fuelitem(Properties p_41383_, int fueltime) {
        super(p_41383_);
        this.fueltime = fueltime;

    }


    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {

            return this.fueltime;
    }
}
