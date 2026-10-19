package net.poison.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.poison.PoisonMod;
import net.poison.block.ModBlocks;
import net.poison.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab POISONMOD_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, "poisonmod_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AZURITE))
                    .title(Component.translatable("creativemodetab.poisonmod.poisonmod_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.AZURITE);
                        output.accept(ModItems.RAW_AZURITE);
                        output.accept(ModItems.P_POWDER);
                    })
                    .build());

    public static final CreativeModeTab POISONMOD_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PoisonMod.MOD_ID, "poisonmod_blocks"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.AZURITE_BLOCK))
                    .title(Component.translatable("creativemodetab.poisonmod.poisonmod_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.AZURITE_BLOCK);
                        output.accept(ModBlocks.AZURITE_ORE);
                        output.accept(ModBlocks.AZURITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.AZURITE_END_ORE);
                        output.accept(ModBlocks.AZURITE_NETHER_ORE);
                        output.accept(ModBlocks.RAW_AZURITE_BLOCK);
                    })
                    .build());

    public static void registerModCreativeModeTabs(){
        PoisonMod.LOGGER.info("Registering Creative Mode Tabs for "+ PoisonMod.MOD_ID);
    }
}
