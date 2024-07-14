package cn.gtcommunity.gregtinker.village;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class CustomVillageStructures {
    public static void registerVillageComponents() {
        // 注册自定义村庄结构
        VillagerRegistry.instance().registerVillageCreationHandler(new Gt_Customer_Village1.CreationHandler());
        MapGenStructureIO.registerStructureComponent(Gt_Customer_Village1.class, "gregtinker:customer_tinker_village1");
    }
}
