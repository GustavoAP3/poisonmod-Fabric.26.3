package net.poison.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.poison.block.ModBlocks;
import net.poison.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_END_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AZURITE_NETHER_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_AZURITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.AZURITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_AZURITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.P_POWDER, ModelTemplates.FLAT_ITEM);
    }
}
