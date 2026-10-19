package net.poison.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.poison.PoisonMod;

import java.util.function.Function;

public class ModBlocks {
    public static final Block AZURITE_BLOCK = registerBlock("azurite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block AZURITE_ORE = registerBlock("azurite_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block RAW_AZURITE_BLOCK = registerBlock("raw_azurite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block AZURITE_DEEPSLATE_ORE = registerBlock("azurite_deepslate_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block AZURITE_END_ORE = registerBlock("azurite_end_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block AZURITE_NETHER_ORE = registerBlock("azurite_nether_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));




    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey
                .create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        PoisonMod.LOGGER.info("Registering Mod Blocks for "+ PoisonMod.MOD_ID);
    }
}
