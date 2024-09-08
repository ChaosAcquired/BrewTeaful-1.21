package net.chaosacquired.brewteaful.item;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.chaosacquired.brewteaful.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static  final ItemGroup BREWTEAFUL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BrewTeaful.MOD_ID, "brewteaful_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEA_LEAF))
                    .displayName(Text.translatable("itemgroup.brewteaful.brewteaful_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModItems.TEA_LEAF);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModBlocks.MYTHRIL_ORE);
                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                    }).build());



    public static void registerItemGroups() {
        BrewTeaful.LOGGER.info("Registering Item Groups for "+ BrewTeaful.MOD_ID);
    }
}
