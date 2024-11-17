package com.thatmg393.mlu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MakeLichensUseful implements ModInitializer {
	public static final String MOD_ID = "mlu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// TODO: rebrand the whole mod
	public static final TagKey<Block> SPIDER_UNCLIMBABLE = TagKey.of(Registries.BLOCK.getKey(), Identifier.of("minecraft", "spider_unclimbable"));

	@Override
	public void onInitialize() {
		LOGGER.info("lichens was always useful.");
	}
}