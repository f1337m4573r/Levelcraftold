package me.wesnc.lcbuilding;

import me.samkio.levelcraftcore.LCChat;
import me.samkio.levelcraftcore.LevelFunctions;
import me.samkio.levelcraftcore.Whitelist;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;

public class LCBlockListener extends BlockListener
{
  public LCBuilding plugin;

  public LCBlockListener(LCBuilding instance)
  {
    this.plugin = instance;
  }

  public void onBlockPlace(BlockPlaceEvent event)
  {
    if (event.isCancelled()) {
      return;
    }
    if (!Whitelist.worldCheck(event.getBlock().getWorld())) {
      return;
    }
    Player player = event.getPlayer();
    Material m = event.getBlock().getType();
    int level = LevelFunctions.getLevel(player, this.plugin.thisPlug);

    Block b = event.getBlock();
    byte halfblock_cob = 3;
    byte halfblock_wood = 2;
    byte halfblock_sandstone = 1;
    byte halfblock_slab = 0;

    if (!Whitelist.hasLevel(player, this.plugin.thisPlug)) {
      return;
    }
    double gained = 0.0D;

    if (level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER1 && ((m == Material.STONE) || (m == Material.FURNACE)))
    {
    
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER1_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if (((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER1) && (b.getType() == Material.STEP) && (b.getData() == halfblock_cob)) || ((b.getType() == Material.STEP) && (b.getData() == halfblock_wood)))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER1_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if (level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2 && ((m == Material.SANDSTONE) || (m == Material.FURNACE) || (m == Material.SNOW_BLOCK) || (m == Material.PUMPKIN)))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if ((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2) && (b.getType() == Material.STEP) && (b.getData() == halfblock_slab))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if ((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2point5) && (m == Material.WOOL))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2point5_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if ((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2point5) && (b.getType() == Material.STEP) && (b.getData() == halfblock_sandstone))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER2point5_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if (((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER3) && (m == Material.GLASS)) || (m == Material.BOOKSHELF) || (m == Material.BRICK) || (m == Material.WOOD_STAIRS) || (m == Material.COBBLESTONE_STAIRS))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER3_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if ((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER4) && (m == Material.GOLD_BLOCK) && (m == Material.DIAMOND_BLOCK) && (m == Material.IRON_BLOCK) && (m == Material.IRON_ORE) && (m == Material.GOLD_ORE))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER4_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if ((level < this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER5) && (m == Material.OBSIDIAN) && (m == Material.NETHERRACK) && (m == Material.SOUL_SAND) && (m == Material.GLOWSTONE))
    {
      LCChat.warn(player, this.plugin.LCConfiguration.LEVELNEEDEDFOR_TIER5_MESSAGE);
      event.setCancelled(true);
      return;
    }

    if (m == Material.DIRT) {
      gained = this.plugin.LCConfiguration.PLACED_DIRT_NONGRASSED;
    }
    if (m == Material.GRASS) {
      gained = this.plugin.LCConfiguration.PLACED_DIRT_GRASSED;
    }
    if (m == Material.WORKBENCH) {
      gained = this.plugin.LCConfiguration.PLACED_CRAFTING_BENCH;
    }
    if (m == Material.CHEST) {
      gained = this.plugin.LCConfiguration.PLACED_CRAFTING_CHEST;
    }
    if (m == Material.WOOD) {
      gained = this.plugin.LCConfiguration.PLACED_PLANK;
    }

    if (m == Material.STONE) {
      gained = this.plugin.LCConfiguration.PLACED_STONE;
    }
    if (m == Material.SNOW_BLOCK) {
      gained = this.plugin.LCConfiguration.PLACED_SNOWBLOCKS;
    }
    if (m == Material.PUMPKIN) {
      gained = this.plugin.LCConfiguration.PLACED_PUMPKINS;
    }

    if (m == Material.SANDSTONE) {
      gained = this.plugin.LCConfiguration.PLACED_SANDSTONE;
    }

    if (m == Material.WOOL) {
      gained = this.plugin.LCConfiguration.PLACED_WOOL;
    }

    if (m == Material.GLASS) {
      gained = this.plugin.LCConfiguration.PLACED_GLASS;
    }
    if (m == Material.BOOKSHELF) {
      gained = this.plugin.LCConfiguration.PLACED_BOOKCASE;
    }
    if (m == Material.BRICK) {
      gained = this.plugin.LCConfiguration.PLACED_BRICK;
    }

    if (m == Material.GOLD_BLOCK) {
      gained = this.plugin.LCConfiguration.PLACED_GOLD;
    }
    if (m == Material.DIAMOND_BLOCK) {
      gained = this.plugin.LCConfiguration.PLACED_DIAMOND;
    }
    if (m == Material.IRON_BLOCK) {
      gained = this.plugin.LCConfiguration.PLACED_IRON;
    }
    if (m == Material.IRON_ORE) {
      gained = this.plugin.LCConfiguration.PLACED_ORE_IRON;
    }
    if (m == Material.GOLD_ORE) {
      gained = this.plugin.LCConfiguration.PLACED_ORE_GOLD;
    }

    if (m == Material.NETHERRACK) {
      gained = this.plugin.LCConfiguration.PLACED_NETHER_NETHERRACK;
    }
    if (m == Material.SOUL_SAND) {
      gained = this.plugin.LCConfiguration.PLACED_NETHER_SOULSAND;
    }
    if (m == Material.GLOWSTONE) {
      gained = this.plugin.LCConfiguration.PLACED_NETHER_GLOWSTONE;
    }
    if (m == Material.OBSIDIAN) {
      gained = this.plugin.LCConfiguration.PLACED_OBSIDIAN;
    }

    if (m == Material.STEP) {
      gained = this.plugin.LCConfiguration.PLACED_HALFBLOCK;
    }
    if (m == Material.FURNACE) {
        gained = this.plugin.LCConfiguration.PLACED_FURNACE;
      }

    LevelFunctions.addExp(player, this.plugin.thisPlug, gained);
  }
}