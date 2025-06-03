package net.azurune.delicate_dyes.core.mixin;

import net.azurune.delicate_dyes.core.registry.DDItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Unique @Final LivingEntity living = (LivingEntity) (Object) this;

    @Inject(at = @At("TAIL"), method = "dropCustomDeathLoot")
    private void delicateDyes$dropEquipment(DamageSource damageSource, int looting, boolean hitByPlayer, CallbackInfo ci) {
        if (living instanceof Player player) {
            if (hitByPlayer && living.getStringUUID().equals("bc56b2c8-9ef8-4532-b045-00f44804bca4")) {
                player.drop(new ItemStack(DDItems.BLURPLE_DYE.get()), false);
            }
        }
    }
}
