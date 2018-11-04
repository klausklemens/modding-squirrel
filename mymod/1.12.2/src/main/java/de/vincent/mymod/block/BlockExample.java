package de.vincent.mymod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class BlockExample extends Block {
    private static final String UNLOCALIZED_NAME = "mymod_example";
    private static final String REGISTRY_NAME = "example";

    private static BlockExample blockExample;
    private static ItemBlock itemBlockExample;

    public BlockExample() {
        super(Material.WOOD);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    public int quantityDropped(Random random) {
        return 2;
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        blockExample = new BlockExample();
        blockExample.setUnlocalizedName(UNLOCALIZED_NAME);
        blockExample.setRegistryName(REGISTRY_NAME);
        event.getRegistry().register(blockExample);
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        itemBlockExample = new ItemBlock(blockExample);
        itemBlockExample.setRegistryName(REGISTRY_NAME);
        event.getRegistry().register(itemBlockExample);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("mymod:example", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(itemBlockExample, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

    }

    public static void preInitCommon() {

    }
}
