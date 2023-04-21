package aprisi.moretools.data;

import aprisi.moretools.item.MoreToolsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MoreToolsEnglishLanguageProvider extends FabricLanguageProvider {
    public MoreToolsEnglishLanguageProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(MoreToolsItems.DIRT_AXE, "Dirt Axe");
        translationBuilder.add(MoreToolsItems.DIRT_PICKAXE, "Dirt Pickaxe");
        translationBuilder.add(MoreToolsItems.DIRT_SWORD, "Dirt Sword");
        translationBuilder.add(MoreToolsItems.DIRT_HOE, "Dirt Hoe");
        translationBuilder.add(MoreToolsItems.DIRT_SHOVEL, "Dirt Shovel");

        translationBuilder.add(MoreToolsItems.MAGMA_AXE, "Magma Axe");
        translationBuilder.add(MoreToolsItems.MAGMA_PICKAXE, "Magma Pickaxe");
        translationBuilder.add(MoreToolsItems.MAGMA_SWORD, "Magma Sword");
        translationBuilder.add(MoreToolsItems.MAGMA_HOE, "Magma Hoe");
        translationBuilder.add(MoreToolsItems.MAGMA_SHOVEL, "Magma Shovel");
    }
}
