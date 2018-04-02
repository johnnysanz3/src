package veryhardmod;

import veryhardmod.common.StaticBreedingHandler;
import veryhardmod.common.StaticCropGrowthHandler;
import veryhardmod.common.StaticDimensionHandler;
import veryhardmod.common.StaticOreGenerationHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = VeryHardMod.MODID, version = VeryHardMod.VERSION, acceptableRemoteVersions = "*")
public class VeryHardMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(StaticDimensionHandler.class);
        MinecraftForge.EVENT_BUS.register(StaticCropGrowthHandler.class);
        MinecraftForge.EVENT_BUS.register(StaticBreedingHandler.class);
        MinecraftForge.ORE_GEN_BUS.register(StaticOreGenerationHandler.class);
    }
}
