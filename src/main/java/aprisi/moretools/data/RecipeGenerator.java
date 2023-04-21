package aprisi.moretools.data;

import aprisi.moretools.item.MoreToolsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MoreToolsItems.DIRT_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.DIRT), FabricRecipeProvider.conditionsFromItem(Items.DIRT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MoreToolsItems.DIRT_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MoreToolsItems.DIRT_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('#', Items.STICK)
                .input('X', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.DIRT), FabricRecipeProvider.conditionsFromItem(Items.DIRT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MoreToolsItems.DIRT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MoreToolsItems.DIRT_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('#', Items.STICK)
                .input('X', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.DIRT), FabricRecipeProvider.conditionsFromItem(Items.DIRT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MoreToolsItems.DIRT_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MoreToolsItems.DIRT_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('X', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.DIRT), FabricRecipeProvider.conditionsFromItem(Items.DIRT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MoreToolsItems.DIRT_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MoreToolsItems.DIRT_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.DIRT), FabricRecipeProvider.conditionsFromItem(Items.DIRT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(MoreToolsItems.DIRT_SHOVEL)));
    }
}
