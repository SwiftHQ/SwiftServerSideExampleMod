package net.swifthq.example.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class) // this changes code in the TitleScreen class.
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V") //this tells mixin to add the method below at the head of the method init()v
	private void init(CallbackInfo info) {
		System.out.println("This line is printed by an example mod mixin!");
	}
}
