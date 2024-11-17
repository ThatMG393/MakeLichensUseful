package com.thatmg393.mlu.datagen.providers;

import java.util.concurrent.CompletableFuture;

import com.thatmg393.mlu.MakeLichensUseful;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class MakeLichensUsefulTagProvider extends BlockTagProvider {
    public MakeLichensUsefulTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(MakeLichensUseful.SPIDER_UNCLIMBABLE)
            .setReplace(false)
            .add(Blocks.GLOW_LICHEN);
    }
}
