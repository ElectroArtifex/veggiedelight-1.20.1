package net.electroartifex.veggiedelight.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ConventionalTags {

    public static final TagKey<Item> FAKE_MEATS = cItemTag("foods/fake_meats");
    public static final TagKey<Item> FAKE_MEATS_SOYBACON = cItemTag("foods/fake_meats/soybacon");
    public static final TagKey<Item> FAKE_MEATS_SOYBEEF = cItemTag("foods/fake_meats/soybeef");
    public static final TagKey<Item> FAKE_MEATS_SOYCHICKEN = cItemTag("foods/fake_meats/soychicken");
    public static final TagKey<Item> FAKE_MEATS_SOYEGG = cItemTag("foods/fake_meats/soyegg");
    public static final TagKey<Item> FAKE_MEATS_SOYFISH = cItemTag("foods/fake_meats/soyfish");
    public static final TagKey<Item> FAKE_MEATS_SOYHAM = cItemTag("foods/fake_meats/soyham");
    public static final TagKey<Item> FAKE_MEATS_SOYMUTTON = cItemTag("foods/fake_meats/soymutton");
    public static final TagKey<Item> FAKE_MEATS_SOYPORK = cItemTag("foods/fake_meats/soypork");
    public static final TagKey<Item> FAKE_MEATS_SOYRABBIT = cItemTag("foods/fake_meats/soyrabbit");

    public static final TagKey<Item> VEGETABLES = cItemTag("foods/vegetables");
    public static final TagKey<Item> VEGETABLES_SOYBEANS = cItemTag("foods/soybeans");

    private static TagKey<Item> cItemTag(String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("c", path));
    }
}
