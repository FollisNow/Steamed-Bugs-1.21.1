package net.follis.steamedbugs.item;

import net.follis.steamedbugs.SteamedBugs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SteamedBugs.MOD_ID);

    public static final DeferredItem<Item> PLACEHOLDER_ITEM = ITEMS.register("placeholder_item",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
