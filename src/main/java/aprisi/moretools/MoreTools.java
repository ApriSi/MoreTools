package aprisi.moretools;

import net.fabricmc.api.ModInitializer;
import aprisi.moretools.item.MoreToolsItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTools implements ModInitializer {
    public static final String MOD_ID = "moretools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MoreToolsItems.RegisterItems();
    }
}
