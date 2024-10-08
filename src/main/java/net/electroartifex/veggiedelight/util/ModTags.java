package net.electroartifex.veggiedelight.util;

import net.electroartifex.veggiedelight.VeggieDelight;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> FAKE_MEATS =
                createTag("fake_meats");

        public static final TagKey<Item> SOYBEANS =
                createTag("soybeans");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(VeggieDelight.MOD_ID, name));
        }
    }
}
