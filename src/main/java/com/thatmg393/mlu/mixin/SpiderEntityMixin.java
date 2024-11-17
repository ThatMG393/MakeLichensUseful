package com.thatmg393.mlu.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.thatmg393.mlu.MakeLichensUseful;

import net.minecraft.entity.mob.SpiderEntity;

@Mixin(SpiderEntity.class)
public class SpiderEntityMixin {
	@Inject(
		method = "isClimbingWall",
		at = @At("HEAD"),
		cancellable = true
	)
	public void preventClimbing(CallbackInfoReturnable<Boolean> cir) {
		SpiderEntity spider = (SpiderEntity) (Object) this;
		if (spider.getWorld().getBlockState(spider.getBlockPos()).isIn(MakeLichensUseful.SPIDER_UNCLIMBABLE)) {
			cir.setReturnValue(false);
		}
	}
}
