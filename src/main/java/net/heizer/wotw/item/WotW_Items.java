package net.heizer.wotw.item;

import net.heizer.wotw.Winds_of_the_Western;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class WotW_Items {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Winds_of_the_Western.MOD_ID);


    //AGATE ORE RESOURCES
    public static final RegistryObject<Item> RAW_AGATE = ITEMS.register("raw_agate",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> AGATE = ITEMS.register("agate",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    //SPEAR ITEMS
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));

    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new Item(new Item.Properties().tab(WotW_Creative_Mode_Tab.WINDS_OF_THE_WEST)));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}