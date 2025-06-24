package cn.gtcommunity.gregtinker.loader.recipes;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import keqing.gtqtcore.common.items.GTQTMetaItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.mantle.util.RecipeMatch;
import slimeknights.tconstruct.library.smeltery.CastingRecipe;

import java.util.Collection;

import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.common.items.MetaItems.*;
import static keqing.gtqtcore.api.unification.ore.GTQTOrePrefix.*;
import static slimeknights.tconstruct.library.TinkerRegistry.registerMelting;
import static slimeknights.tconstruct.library.TinkerRegistry.registerTableCasting;

public class CastingHandler {
    public static void init() {
        Collection<Material> materials = GregTechAPI.materialManager.getRegisteredMaterials();
        for (Material material : materials) {
            if (!material.hasFluid()) continue;
            if (material.hasFlag(GENERATE_PLATE)) {
                CastingRecipe(material, cylinder, GTQTMetaItems.MOLD_GAS.getStackForm(), 1224);
                CastingRecipe(material, motor_stick, GTQTMetaItems.MOLD_MOTOR.getStackForm(), 1620);
                CastingRecipe(material, valve, GTQTMetaItems.MOLD_VALUE.getStackForm(), 1692);
            }
            if (material.hasFlag(GENERATE_SMALL_GEAR))
                CastingRecipe(material, OrePrefix.gearSmall, MetaItems.SHAPE_MOLD_GEAR_SMALL.getStackForm(), 144);
            if (material.hasFlag(GENERATE_GEAR))
                CastingRecipe(material, OrePrefix.gear, MetaItems.SHAPE_MOLD_GEAR.getStackForm(), 576);
            if (material.hasFlag(GENERATE_PLATE))
                CastingRecipe(material, OrePrefix.plate, MetaItems.SHAPE_MOLD_PLATE.getStackForm(), 144);
            if (material.hasFlag(GENERATE_BOLT_SCREW)) {
                CastingRecipe(material, OrePrefix.screw, SHAPE_MOLD_SCREW.getStackForm(), 18);
                CastingRecipe(material, OrePrefix.bolt, SHAPE_MOLD_BOLT.getStackForm(), 18);
            }
            if (material.hasFlag(GENERATE_ROD))
                CastingRecipe(material, OrePrefix.stick, SHAPE_MOLD_ROD.getStackForm(), 72);
            if (material.hasFlag(GENERATE_RING))
                CastingRecipe(material, OrePrefix.ring, SHAPE_MOLD_RING.getStackForm(), 36);
            if (material.hasFlag(GENERATE_LONG_ROD))
                CastingRecipe(material, OrePrefix.stickLong, SHAPE_MOLD_ROD_LONG.getStackForm(), 144);
            if (material.hasFlag(GENERATE_ROTOR))
                CastingRecipe(material, OrePrefix.rotor, MetaItems.SHAPE_MOLD_ROTOR.getStackForm(), 576);
            if (material.hasFlag(GENERATE_ROUND))
                CastingRecipe(material, OrePrefix.round, SHAPE_MOLD_ROUND.getStackForm(), 18);

        }
    }

    public static void CastingRecipe(Material material, OrePrefix orePrefix, ItemStack cast, int amount) {
        ItemStack output = OreDictUnifier.get(orePrefix, material, 1);
        if (output == ItemStack.EMPTY) return;
        RecipeMatch rm = null;
        FluidStack fluid = material.getFluid(amount);
        if (cast != ItemStack.EMPTY) {
            rm = RecipeMatch.ofNBT(cast);
        }

        registerMelting(output, fluid.getFluid(), amount);
        registerTableCasting(new CastingRecipe(output, rm, fluid, calcCooldownTime(fluid.getFluid(), amount), false, false));
    }

    public static int calcCooldownTime(Fluid fluid, int amount) {
        int time = 120;
        int temperature = fluid.getTemperature() - 300;
        return time + temperature * amount / 1200;
    }
}
