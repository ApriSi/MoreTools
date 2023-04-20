package aprisi.moretools.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     * @param material
     * @param attackDamage
     * @param attackSpeed
     * @param settings
     */
    public PickaxeBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
