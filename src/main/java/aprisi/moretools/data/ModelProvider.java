package aprisi.moretools.data;

import aprisi.moretools.item.MoreToolsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MoreToolsItems.DIRT_AXE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.DIRT_HOE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.DIRT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.DIRT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.DIRT_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(MoreToolsItems.MAGMA_AXE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.MAGMA_HOE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.MAGMA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.MAGMA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MoreToolsItems.MAGMA_SHOVEL, Models.HANDHELD);
    }
}
