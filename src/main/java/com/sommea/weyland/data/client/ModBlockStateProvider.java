package com.sommea.weyland.data.client;

import com.sommea.weyland.setup.ModBlocks;
import com.sommea.weyland.weyland;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, weyland.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.SMALL_CHEST.get());

    }
}
