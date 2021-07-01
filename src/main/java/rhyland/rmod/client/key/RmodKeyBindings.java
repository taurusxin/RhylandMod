package rhyland.rmod.client.key;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;
import rhyland.rmod.client.ClientProxy;

import static rhyland.rmod.client.ClientProxy.keyBindings;

public class RmodKeyBindings {
    public static void clientInit() {
        keyBindings = new KeyBinding[1];

        keyBindings[0] = new KeyBinding("key.effects.desc", Keyboard.KEY_B, "key.rmod");

        for (int i = 0; i < keyBindings.length; ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
    }
}
