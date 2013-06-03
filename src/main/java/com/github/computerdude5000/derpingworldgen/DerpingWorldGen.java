/*
*copyright
*/
package com.github.computerdude5000.derpingworldgen;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 6/2/13
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */

public class DerpingWorldGen extends JavaPlugin
{

    public void onEnable(){

    }
    public void onDisable(){

    }
    /**
     *
     * @param worldName
     * The name of the world the generator is being applied to
     * @param GenId
     * The id (if any) specified by the user. It can be used if the plugin
     * wants to have multiple generators in one plugin. More on this later.
     * @return
     * The ChunkGenerator that this plugin provides
     */
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String GenId) {
        return new com.github.computerdude5000.derpingworldgen.BasicDerpingGen();
    }
}
