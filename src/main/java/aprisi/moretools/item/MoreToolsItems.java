package aprisi.moretools.item;

import aprisi.moretools.item.tools.dirt.DirtToolMaterial;
import aprisi.moretools.item.tools.magma.MagmaAxeItem;
import aprisi.moretools.item.tools.magma.MagmaSwordItem;
import aprisi.moretools.item.tools.magma.MagmaToolMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import aprisi.moretools.MoreTools;

public class MoreToolsItems {
    // Dirt Tools
    public static ToolItem DIRT_PICKAXE = RegisterItem("dirt_pickaxe", new PickaxeItem(DirtToolMaterial.INSTANCE, 1, 2.5f, new Item.Settings()));
    public static ToolItem DIRT_HOE = RegisterItem("dirt_hoe", new HoeItem(DirtToolMaterial.INSTANCE, 1, 1.0f, new Item.Settings()));
    public static ToolItem DIRT_AXE = RegisterItem("dirt_axe", new AxeItem(DirtToolMaterial.INSTANCE, 2, 2.5f, new Item.Settings()));
    public static ToolItem DIRT_SWORD = RegisterItem("dirt_sword", new SwordItem(DirtToolMaterial.INSTANCE, 1, 4.5f, new Item.Settings()));
    public static ToolItem DIRT_SHOVEL = RegisterItem("dirt_shovel", new ShovelItem(DirtToolMaterial.INSTANCE, 0, 0.3f, new Item.Settings()));

    // Magma Tools
    public static ToolItem MAGMA_PICKAXE = RegisterItem("magma_pickaxe", new PickaxeItem(MagmaToolMaterial.INSTANCE, 3, 1.2f, new Item.Settings()));
    public static ToolItem MAGMA_HOE = RegisterItem("magma_hoe", new HoeItem(MagmaToolMaterial.INSTANCE, 1, -1.0f, new Item.Settings()));
    public static ToolItem MAGMA_AXE = RegisterItem("magma_axe", new MagmaAxeItem(MagmaToolMaterial.INSTANCE, 5, 1.0f, new Item.Settings()));
    public static ToolItem MAGMA_SWORD = RegisterItem("magma_sword", new MagmaSwordItem(MagmaToolMaterial.INSTANCE, 6, 3.0f, new Item.Settings()));
    public static ToolItem MAGMA_SHOVEL = RegisterItem("magma_shovel", new ShovelItem(MagmaToolMaterial.INSTANCE, 2, 0.8f, new Item.Settings()));


    private static void AddItemsToItemGroup() {}

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreTools.MOD_ID, name), item);
    }

    private static ToolItem RegisterItem(String name, ToolItem tool) {
        AddItemToGroup(ItemGroups.TOOLS, tool);
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
