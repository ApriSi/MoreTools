package aprisi.moretools;

import aprisi.moretools.data.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreToolsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(RecipeGenerator::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(MoreToolsEnglishLanguageProvider::new);
	}
}
