package net.devthedev.testmod.item;

import net.devthedev.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public static final Item WAFFLE = registerItem("waffle", new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        TestMod.LOGGER.debug("Registering items for " + TestMod.MOD_ID);
    }
}
