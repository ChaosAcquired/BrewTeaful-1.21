package net.chaosacquired.brewteaful.item;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));
    public static final Item TEA_LEAF = registerItem("tea_leaf",new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver",new Item(new Item.Settings()));
    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BrewTeaful.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        BrewTeaful.LOGGER.info("Registering Mod Items for " + BrewTeaful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MYTHRIL_INGOT);
            entries.add(RAW_MYTHRIL);
            entries.add(TEA_LEAF);
            entries.add(SILVER_INGOT);
            entries.add(RAW_SILVER);
        });
    }
}
