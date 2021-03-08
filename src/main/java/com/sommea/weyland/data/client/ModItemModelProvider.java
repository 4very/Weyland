package com.sommea.weyland.data.client;

import com.sommea.weyland.weyland;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, weyland.MODID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        withExistingParent("silver_ore", modLoc("block/silver_ore"));
        withExistingParent("small_chest", modLoc("block/small_chest"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        itemBuilder(itemGenerated,"hammer");
    }

    private void itemBuilder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0","item/"+name);
    }
}
