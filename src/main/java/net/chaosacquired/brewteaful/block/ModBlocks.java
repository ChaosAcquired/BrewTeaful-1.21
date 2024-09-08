package net.chaosacquired.brewteaful.block;

import net.chaosacquired.brewteaful.BrewTeaful;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(AbstractBlock.Settings.create().strength(50f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create().strength(50f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(AbstractBlock.Settings.create().strength(50f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(AbstractBlock.Settings.create().strength(50f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block KETTLE_BLOCK = registerBlock("kettle_block",
            new Block(AbstractBlock.Settings.create().strength(1f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BrewTeaful.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BrewTeaful.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BrewTeaful.LOGGER.info("Registering Mod Blocks for "+ BrewTeaful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.MYTHRIL_BLOCK);
            entries.add(ModBlocks.MYTHRIL_ORE);
            entries.add(ModBlocks.SILVER_ORE);
            entries.add(ModBlocks.SILVER_BLOCK);
            entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
            entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
        });
    }
}
