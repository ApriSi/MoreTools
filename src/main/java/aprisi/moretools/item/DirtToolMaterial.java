package aprisi.moretools.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DirtToolMaterial implements ToolMaterial {
    public static final DirtToolMaterial INSTANCE = new DirtToolMaterial();

    @Override
    public int getDurability() {
        return 2;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.5f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
