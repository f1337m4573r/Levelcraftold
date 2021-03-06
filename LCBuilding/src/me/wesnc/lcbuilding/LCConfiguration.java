package me.wesnc.lcbuilding;

import java.io.IOException;
import java.util.logging.Level;
import me.samkio.levelcraftcore.util.Properties;

public class LCConfiguration
{
  public LCBuilding plugin;
  double PLACED_DIRT_NONGRASSED = 1.0D;
  double PLACED_DIRT_GRASSED = 1.0D;

  double PLACED_STONE = 2.0D;
  double PLACED_COBBLESTONE = 2.0D;
  double PLACED_COBBLESTONE_MOSSY = 2.0D;

  double PLACED_STAIRS = 2.0D;

  double PLACED_HALFBLOCK = 2.0D;

  double PLACED_BOOKCASE = 3.0D;

  double PLACED_SNOWBLOCKS = 2.0D;

  double PLACED_PUMPKINS = 2.0D;
  double PLACED_FURNACE = 2.0D;
  double PLACED_PLANK = 2.0D;
  double PLACED_TRUNK_REG = 2.0D;
  double PLACED_TRUNK_RED = 2.0D;
  double PLACED_TRUNK_BIRCH = 2.0D;

  double PLACED_SAND = 2.0D;
  double PLACED_SANDSTONE = 2.0D;

  double PLACED_GLASS = 6.0D;

  double PLACED_ORE_GOLD = 5.0D;
  double PLACED_ORE_IRON = 4.0D;

  double PLACED_DIAMOND = 6.0D;
  double PLACED_IRON = 4.0D;
  double PLACED_GOLD = 4.0D;

  double PLACED_OBSIDIAN = 300.0D;

  double PLACED_CRAFTING_BENCH = 2.0D;
  double PLACED_CRAFTING_FORGE = 3.0D;
  double PLACED_CRAFTING_CHEST = 2.0D;

  double PLACED_BRICK = 4.0D;

  double PLACED_NETHER_NETHERRACK = 8.0D;
  double PLACED_NETHER_SOULSAND = 6.0D;
  double PLACED_NETHER_GLOWSTONE = 4.0D;

  double PLACED_LADDER = 4.0D;
  double PLACED_WOOL = 2.0D;

  int LEVELNEEDEDFOR_TIER0 = 1;
  int LEVELNEEDEDFOR_TIER1 = 5;
  int LEVELNEEDEDFOR_TIER2 = 10;
  int LEVELNEEDEDFOR_TIER2point5 = 13;
  int LEVELNEEDEDFOR_TIER3 = 20;
  int LEVELNEEDEDFOR_TIER4 = 30;
  int LEVELNEEDEDFOR_TIER5 = 40;

  final String LEVELNEEDEDFOR_TIER1_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER1 + ". That item is Tier 1.";
  final String LEVELNEEDEDFOR_TIER2_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER2 + ". That item is Tier 2.";
  final String LEVELNEEDEDFOR_TIER2point5_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER2point5 + ". That item is Tier 2.5.";
  final String LEVELNEEDEDFOR_TIER3_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER3 + ". That item is Tier 3.";
  final String LEVELNEEDEDFOR_TIER4_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER4 + ". That item is Tier 4.";
  final String LEVELNEEDEDFOR_TIER5_MESSAGE = "Cannot place this block, Level needed " + this.LEVELNEEDEDFOR_TIER5 + ". That item is Tier 5.";

  public LCConfiguration(LCBuilding instance)
  {
    this.plugin = instance;
  }

  public void loadConfig()
  {
    Properties properties = new Properties(this.plugin.CFGFileString);
    try
    {
      properties.load(); } catch (IOException ex) {
      this.plugin.logger.log(Level.SEVERE, "[LC] " + ex);
    }
    this.PLACED_DIRT_NONGRASSED = properties.getDouble("PLACED_DIRT_NONGRASSED", 1.0D);
    this.PLACED_DIRT_GRASSED = properties.getDouble("PLACED_DIRT_GRASSED", 1.0D);

    this.PLACED_STONE = properties.getDouble("PLACED_STONE", 2.0D);
    this.PLACED_COBBLESTONE = properties.getDouble("PLACED_COBBLESTONE", 2.0D);
    this.PLACED_COBBLESTONE_MOSSY = properties.getDouble("PLACED_COBBLESTONE_MOSSY", 2.0D);

    this.PLACED_STAIRS = properties.getDouble("PLACED_STAIRS", 2.0D);

    this.PLACED_HALFBLOCK = properties.getDouble("PLACED_HALFBLOCK", 2.0D);

    this.PLACED_BOOKCASE = properties.getDouble("PLACED_BOOKCASE", 3.0D);

    this.PLACED_SNOWBLOCKS = properties.getDouble("PLACED_SNOWBLOCKS", 2.0D);

    this.PLACED_PUMPKINS = properties.getDouble("PLACED_PUMPKINS", 2.0D);

    this.PLACED_PLANK = properties.getDouble("PLACED_PLANK", 2.0D);
    this.PLACED_TRUNK_REG = properties.getDouble("PLACED_TRUCK_REG", 2.0D);
    this.PLACED_TRUNK_RED = properties.getDouble("PLACED_TRUCK_RED", 2.0D);
    this.PLACED_TRUNK_BIRCH = properties.getDouble("PLACED_TRUCK_BIRCH", 2.0D);

    this.PLACED_SAND = properties.getDouble("PLACED_SAND", 2.0D);
    this.PLACED_SANDSTONE = properties.getDouble("PLACED_SANDSTONE", 2.0D);

    this.PLACED_GLASS = properties.getDouble("PLACED_GLASS", 6.0D);

    this.PLACED_ORE_GOLD = properties.getDouble("PLACED_ORE_GOLD", 5.0D);
    this.PLACED_ORE_IRON = properties.getDouble("PLACED_ORE_IRON", 4.0D);

    this.PLACED_DIAMOND = properties.getDouble("PLACED_DIAMOND", 6.0D);
    this.PLACED_GOLD = properties.getDouble("PLACED_GOLD", 4.0D);
    this.PLACED_IRON = properties.getDouble("PLACED_IRON", 4.0D);

    this.PLACED_OBSIDIAN = properties.getDouble("PLACED_OBSIDIAN", 300.0D);

    this.PLACED_CRAFTING_BENCH = properties.getDouble("PLACED_CRAFTING_BENCH", 2.0D);
    this.PLACED_CRAFTING_FORGE = properties.getDouble("PLACED_CRAFTING_FORGE", 3.0D);
    this.PLACED_CRAFTING_CHEST = properties.getDouble("PLACED_CRAFTING_CHEST", 2.0D);

    this.PLACED_BRICK = properties.getDouble("PLACED_BRICK", 4.0D);

    this.PLACED_NETHER_NETHERRACK = properties.getDouble("PLACED_NETHER_NETHERRACK", 8.0D);
    this.PLACED_NETHER_SOULSAND = properties.getDouble("PLACED_NETHER_SOULSAND", 6.0D);
    this.PLACED_NETHER_GLOWSTONE = properties.getDouble("PLACED_NETHER_GLOWSTONE", 4.0D);

    this.PLACED_LADDER = properties.getDouble("PLACED_LADDER", 4.0D);

    this.PLACED_WOOL = properties.getDouble("PLACED_WOOL", 3.0D);
  }
}