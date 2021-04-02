package com.arvin3108_id.inv_tabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "inv_tabs";

    // Spawn Eggs Tabs
    public static final ItemGroup SPAWN_EGGS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "spawn_eggs"))
            .icon(() -> new ItemStack(Items.CREEPER_SPAWN_EGG))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.BAT_SPAWN_EGG));
                stacks.add(new ItemStack(Items.BEE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.BLAZE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.CAT_SPAWN_EGG));
                stacks.add(new ItemStack(Items.CAVE_SPIDER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.CHICKEN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.COD_SPAWN_EGG));
                stacks.add(new ItemStack(Items.COW_SPAWN_EGG));
                stacks.add(new ItemStack(Items.CREEPER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.DOLPHIN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.DONKEY_SPAWN_EGG));
                stacks.add(new ItemStack(Items.DROWNED_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ELDER_GUARDIAN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ENDERMAN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ENDERMITE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.EVOKER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.FOX_SPAWN_EGG));
                stacks.add(new ItemStack(Items.GHAST_SPAWN_EGG));
                stacks.add(new ItemStack(Items.GUARDIAN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.HOGLIN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.HORSE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.HUSK_SPAWN_EGG));
                stacks.add(new ItemStack(Items.LLAMA_SPAWN_EGG));
                stacks.add(new ItemStack(Items.MAGMA_CUBE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.MOOSHROOM_SPAWN_EGG));
                stacks.add(new ItemStack(Items.MULE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.OCELOT_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PANDA_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PARROT_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PHANTOM_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PIG_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PIGLIN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PIGLIN_BRUTE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PILLAGER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.POLAR_BEAR_SPAWN_EGG));
                stacks.add(new ItemStack(Items.PUFFERFISH_SPAWN_EGG));
                stacks.add(new ItemStack(Items.RABBIT_SPAWN_EGG));
                stacks.add(new ItemStack(Items.RAVAGER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SALMON_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SHEEP_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SHULKER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SILVERFISH_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SKELETON_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SKELETON_HORSE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SLIME_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SPIDER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.SQUID_SPAWN_EGG));
                stacks.add(new ItemStack(Items.STRAY_SPAWN_EGG));
                stacks.add(new ItemStack(Items.STRIDER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.TRADER_LLAMA_SPAWN_EGG));
                stacks.add(new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG));
                stacks.add(new ItemStack(Items.TURTLE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.VEX_SPAWN_EGG));
                stacks.add(new ItemStack(Items.VILLAGER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.VINDICATOR_SPAWN_EGG));
                stacks.add(new ItemStack(Items.WANDERING_TRADER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.WITCH_SPAWN_EGG));
                stacks.add(new ItemStack(Items.WITHER_SKELETON_SPAWN_EGG));
                stacks.add(new ItemStack(Items.WOLF_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ZOGLIN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ZOMBIE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ZOMBIE_HORSE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG));
                stacks.add(new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG));
            }).build();

    // Building Tools Tabs
    public static final ItemGroup BUILDING_TOOLS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "building_tools"))
            .icon(() -> new ItemStack(Items.WOODEN_AXE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.WOODEN_AXE));
                stacks.add(new ItemStack(Items.ARROW));
                stacks.add(new ItemStack(Items.GUNPOWDER));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.CHAIN_COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.REPEATING_COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Items.BARRIER));
                stacks.add(new ItemStack(Items.STRUCTURE_VOID));
                stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Items.JIGSAW));
            }).build();

    // Doors & Trapdoors Tabs
    public static final ItemGroup DOORS_AND_TRAPDOORS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "doors_and_trapdoors"))
            .icon(() -> new ItemStack(Items.OAK_DOOR))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.IRON_DOOR));
                stacks.add(new ItemStack(Items.OAK_DOOR));
                stacks.add(new ItemStack(Items.SPRUCE_DOOR));
                stacks.add(new ItemStack(Items.BIRCH_DOOR));
                stacks.add(new ItemStack(Items.JUNGLE_DOOR));
                stacks.add(new ItemStack(Items.ACACIA_DOOR));
                stacks.add(new ItemStack(Items.DARK_OAK_DOOR));
                stacks.add(new ItemStack(Items.CRIMSON_DOOR));
                stacks.add(new ItemStack(Items.WARPED_DOOR));
                stacks.add(new ItemStack(Items.IRON_TRAPDOOR));
                stacks.add(new ItemStack(Items.OAK_TRAPDOOR));
                stacks.add(new ItemStack(Items.SPRUCE_TRAPDOOR));
                stacks.add(new ItemStack(Items.BIRCH_TRAPDOOR));
                stacks.add(new ItemStack(Items.JUNGLE_TRAPDOOR));
                stacks.add(new ItemStack(Items.ACACIA_TRAPDOOR));
                stacks.add(new ItemStack(Items.DARK_OAK_TRAPDOOR));
                stacks.add(new ItemStack(Items.CRIMSON_TRAPDOOR));
                stacks.add(new ItemStack(Items.WARPED_TRAPDOOR));
            }).build();

    // Pressure Plates Tabs
    public static final ItemGroup PRESSURE_PLATES = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "pressure_plates"))
            .icon(() -> new ItemStack(Items.OAK_PRESSURE_PLATE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.STONE_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.OAK_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.SPRUCE_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.BIRCH_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.JUNGLE_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.ACACIA_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.DARK_OAK_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.CRIMSON_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.WARPED_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.POLISHED_BLACKSTONE_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.LIGHT_WEIGHTED_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.HEAVY_WEIGHTED_PRESSURE_PLATE));
            }).build();

    // Workbenches & Furnaces Tabs
    public static final ItemGroup WORKBENCHES_AND_FURNACES = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "workbenches_and_furnaces"))
            .icon(() -> new ItemStack(Items.CRAFTING_TABLE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.CRAFTING_TABLE));
                stacks.add(new ItemStack(Items.LOOM));
                stacks.add(new ItemStack(Items.CARTOGRAPHY_TABLE));
                stacks.add(new ItemStack(Items.FLETCHING_TABLE));
                stacks.add(new ItemStack(Items.SMITHING_TABLE));
                stacks.add(new ItemStack(Items.GRINDSTONE));
                stacks.add(new ItemStack(Items.ENCHANTING_TABLE));
                stacks.add(new ItemStack(Items.FURNACE));
                stacks.add(new ItemStack(Items.SMOKER));
                stacks.add(new ItemStack(Items.BLAST_FURNACE));
            }).build();

    // Glass & Glass Panes
    public static final ItemGroup GLASS_AND_GLASS_PANES = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "glass_and_glass_panes"))
            .icon(() -> new ItemStack(Items.GLASS))
            .appendItems(stacks -> {

                // Glass
                stacks.add(new ItemStack(Items.GLASS));
                stacks.add(new ItemStack(Items.WHITE_STAINED_GLASS));
                stacks.add(new ItemStack(Items.ORANGE_STAINED_GLASS));
                stacks.add(new ItemStack(Items.MAGENTA_STAINED_GLASS));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_STAINED_GLASS));
                stacks.add(new ItemStack(Items.YELLOW_STAINED_GLASS));
                stacks.add(new ItemStack(Items.LIME_STAINED_GLASS));
                stacks.add(new ItemStack(Items.PINK_STAINED_GLASS));
                stacks.add(new ItemStack(Items.GRAY_STAINED_GLASS));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_STAINED_GLASS));
                stacks.add(new ItemStack(Items.CYAN_STAINED_GLASS));
                stacks.add(new ItemStack(Items.PURPLE_STAINED_GLASS));
                stacks.add(new ItemStack(Items.BLUE_STAINED_GLASS));
                stacks.add(new ItemStack(Items.BROWN_STAINED_GLASS));
                stacks.add(new ItemStack(Items.GREEN_STAINED_GLASS));
                stacks.add(new ItemStack(Items.RED_STAINED_GLASS));
                stacks.add(new ItemStack(Items.BLACK_STAINED_GLASS));

                // Glass Panes
                stacks.add(new ItemStack(Items.GLASS_PANE));
                stacks.add(new ItemStack(Items.WHITE_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.ORANGE_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.MAGENTA_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.YELLOW_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.LIME_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.PINK_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.GRAY_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.CYAN_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.PURPLE_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.BLUE_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.BROWN_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.GREEN_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.RED_STAINED_GLASS_PANE));
                stacks.add(new ItemStack(Items.BLACK_STAINED_GLASS_PANE));
            }).build();

    // Wools & Carpets
    public static final ItemGroup WOOLS_AND_CARPETS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "wools_and_carpets"))
            .icon(() -> new ItemStack(Items.WHITE_WOOL))
            .appendItems(stacks -> {

                // Wools
                stacks.add(new ItemStack(Items.WHITE_WOOL));
                stacks.add(new ItemStack(Items.ORANGE_WOOL));
                stacks.add(new ItemStack(Items.MAGENTA_WOOL));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_WOOL));
                stacks.add(new ItemStack(Items.YELLOW_WOOL));
                stacks.add(new ItemStack(Items.LIME_WOOL));
                stacks.add(new ItemStack(Items.PINK_WOOL));
                stacks.add(new ItemStack(Items.GRAY_WOOL));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_WOOL));
                stacks.add(new ItemStack(Items.CYAN_WOOL));
                stacks.add(new ItemStack(Items.PURPLE_WOOL));
                stacks.add(new ItemStack(Items.BLUE_WOOL));
                stacks.add(new ItemStack(Items.BROWN_WOOL));
                stacks.add(new ItemStack(Items.GREEN_WOOL));
                stacks.add(new ItemStack(Items.RED_WOOL));
                stacks.add(new ItemStack(Items.BLACK_WOOL));

                // Carpets
                stacks.add(new ItemStack(Items.WHITE_CARPET));
                stacks.add(new ItemStack(Items.ORANGE_CARPET));
                stacks.add(new ItemStack(Items.MAGENTA_CARPET));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_CARPET));
                stacks.add(new ItemStack(Items.YELLOW_CARPET));
                stacks.add(new ItemStack(Items.LIME_CARPET));
                stacks.add(new ItemStack(Items.PINK_CARPET));
                stacks.add(new ItemStack(Items.GRAY_CARPET));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_CARPET));
                stacks.add(new ItemStack(Items.CYAN_CARPET));
                stacks.add(new ItemStack(Items.PURPLE_CARPET));
                stacks.add(new ItemStack(Items.BLUE_CARPET));
                stacks.add(new ItemStack(Items.BROWN_CARPET));
                stacks.add(new ItemStack(Items.GREEN_CARPET));
                stacks.add(new ItemStack(Items.RED_CARPET));
                stacks.add(new ItemStack(Items.BLACK_CARPET));
            }).build();

    // Buttons
    public static final ItemGroup BUTTONS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "buttons"))
            .icon(() -> new ItemStack(Items.OAK_BUTTON))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.STONE_BUTTON));
                stacks.add(new ItemStack(Items.OAK_BUTTON));
                stacks.add(new ItemStack(Items.SPRUCE_BUTTON));
                stacks.add(new ItemStack(Items.BIRCH_BUTTON));
                stacks.add(new ItemStack(Items.JUNGLE_BUTTON));
                stacks.add(new ItemStack(Items.ACACIA_BUTTON));
                stacks.add(new ItemStack(Items.DARK_OAK_BUTTON));
                stacks.add(new ItemStack(Items.CRIMSON_BUTTON));
                stacks.add(new ItemStack(Items.WARPED_BUTTON));
                stacks.add(new ItemStack(Items.POLISHED_BLACKSTONE_BUTTON));
            }).build();

    // Powder Concretes & Concretes
    public static final ItemGroup POWDER_CONCRETES_AND_CONCRETES = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "powder_concretes_and_concretes"))
            .icon(() -> new ItemStack(Items.WHITE_CONCRETE))
            .appendItems(stacks -> {

                // Powder Concretes
                stacks.add(new ItemStack(Items.WHITE_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.ORANGE_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.MAGENTA_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.YELLOW_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.LIME_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.PINK_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.GRAY_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.CYAN_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.PURPLE_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.BLUE_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.BROWN_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.GREEN_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.RED_CONCRETE_POWDER));
                stacks.add(new ItemStack(Items.BLACK_CONCRETE_POWDER));

                // Concretes
                stacks.add(new ItemStack(Items.WHITE_CONCRETE));
                stacks.add(new ItemStack(Items.ORANGE_CONCRETE));
                stacks.add(new ItemStack(Items.MAGENTA_CONCRETE));
                stacks.add(new ItemStack(Items.LIGHT_BLUE_CONCRETE));
                stacks.add(new ItemStack(Items.YELLOW_CONCRETE));
                stacks.add(new ItemStack(Items.LIME_CONCRETE));
                stacks.add(new ItemStack(Items.PINK_CONCRETE));
                stacks.add(new ItemStack(Items.GRAY_CONCRETE));
                stacks.add(new ItemStack(Items.LIGHT_GRAY_CONCRETE));
                stacks.add(new ItemStack(Items.CYAN_CONCRETE));
                stacks.add(new ItemStack(Items.PURPLE_CONCRETE));
                stacks.add(new ItemStack(Items.BLUE_CONCRETE));
                stacks.add(new ItemStack(Items.BROWN_CONCRETE));
                stacks.add(new ItemStack(Items.GREEN_CONCRETE));
                stacks.add(new ItemStack(Items.RED_CONCRETE));
                stacks.add(new ItemStack(Items.BLACK_CONCRETE));
            }).build();

    // Terracotta & Glazed Terracotta
    public static final ItemGroup TERRACOTTA_AND_GLAZED_TERRACOTTA = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "terracotta_and_glazed_terracotta"))
            .icon(() -> new ItemStack(Items.TERRACOTTA))
            .appendItems(stacks -> {

            }).build();

    @Override
    public void onInitialize() {
    }
}