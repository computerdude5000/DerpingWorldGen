/*
*copyright
*/
package com.github.computerdude5000.derpingworldgen.populators;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 6/2/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */

public class SaplingsPop
        extends BlockPopulator
{

    @Override
    public void populate(World world, Random rand, Chunk chunk) {
        for (int x=0; x<16; x++) {
            for (int z=0;z<16;z++) {
                int realX = x + chunk.getX() * 16; //find the world location of chunk location x
                int realZ = z + chunk.getZ() * 16;
                world.getBlockAt(realX, 45, realZ).setType(Material.DIRT);
                world.getBlockAt(realX, 46, realZ).setType(Material.DIRT);
                world.getBlockAt(realX, 47, realZ).setType(Material.DIRT);
            }
        }
    }
}