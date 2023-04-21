package aprisi.moretools.data;

import aprisi.moretools.item.MoreToolsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    private static Consumer<RecipeJsonProvider> Exporter;

    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        Exporter = exporter;

        // Dirt Tools
       CreateAxeRecipe(MoreToolsItems.DIRT_AXE, Items.DIRT);
       CreateSwordRecipe(MoreToolsItems.DIRT_SWORD, Items.DIRT);
       CreatePickaxeRecipe(MoreToolsItems.DIRT_PICKAXE, Items.DIRT);
       CreateHoeRecipe(MoreToolsItems.DIRT_HOE, Items.DIRT);
       CreateShovelRecipe(MoreToolsItems.DIRT_SHOVEL, Items.DIRT);

       // Magma Tools
       CreateAxeRecipe(MoreToolsItems.MAGMA_AXE, Items.MAGMA_BLOCK);
       CreateSwordRecipe(MoreToolsItems.MAGMA_SWORD, Items.MAGMA_BLOCK);
       CreatePickaxeRecipe(MoreToolsItems.MAGMA_PICKAXE, Items.MAGMA_BLOCK);
       CreateHoeRecipe(MoreToolsItems.MAGMA_HOE, Items.MAGMA_BLOCK);
       CreateShovelRecipe(MoreToolsItems.MAGMA_SHOVEL, Items.MAGMA_BLOCK);
    }

    private static void CreateAxeRecipe(Item output, Item inputItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern("#X")
                .pattern(" X")
                .input('X', Items.STICK)
                .input('#', inputItem)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(Exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private static void CreatePickaxeRecipe(Item output, Item inputItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', inputItem)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(Exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private static void CreateSwordRecipe(Item output, Item inputItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("#")
                .pattern("X")
                .input('X', Items.STICK)
                .input('#', inputItem)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(Exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private static void CreateShovelRecipe(Item output, Item inputItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("X")
                .pattern("X")
                .input('X', Items.STICK)
                .input('#', inputItem)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(Exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private static void CreateHoeRecipe(Item output, Item inputItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern(" X")
                .pattern(" X")
                .input('X', Items.STICK)
                .input('#', inputItem)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(Exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}
