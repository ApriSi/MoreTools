package aprisi.moretools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import aprisi.moretools.MoreTools;

public class MoreToolsItems {
    // Dirt Tools
    public static ToolItem DIRT_PICKAXE = RegisterItem("dirt_pickaxe", new PickaxeBase(DirtToolMaterial.INSTANCE, 1, 2.5f, new Item.Settings()));

    private static void AddItemsToItemGroup() {
        AddItemToGroup(ItemGroups.TOOLS, DIRT_PICKAXE);
    }

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    private static ToolItem RegisterItem(String name, ToolItem tool) {
        return Registry.register(Registries.ITEM, new Identifier(MoreTools.MOD_ID, name), tool);
    }

    private static void AddItemToGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void RegisterItems() {
        MoreTools.LOGGER.info("Registering Mod Items for " + MoreTools.MOD_ID);
        AddItemsToItemGroup();
    }

}
