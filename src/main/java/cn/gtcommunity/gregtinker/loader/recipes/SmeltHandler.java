package cn.gtcommunity.gregtinker.loader.recipes;

import com.cleanroommc.groovyscript.core.mixin.tconstruct.TinkerRegistryAccessor;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import keqing.gtqtcore.api.utils.GTQTLog;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.tconstruct.library.smeltery.MeltingRecipe;

import java.util.Collection;

import static gregtech.api.unification.ore.OrePrefix.*;


public class SmeltHandler {
    public static void init() {
        GTQTLog.logger.info("Removing Smelting Recipes for Materials with Blast Temperature >= 1200");
        Collection<Material> materials = GregTechAPI.materialManager.getRegisteredMaterials();
        for (Material material : materials) {
            if (material != null && material.hasFluid() && material.getBlastTemperature() >= 1200) {
                GTQTLog.logger.info("remove now!");
                removeRecipesForMaterial(material);
            }
        }
    }

    private static void removeRecipesForMaterial(Material material) {
        ItemStack dustStack = OreDictUnifier.get(dust, material);
        ItemStack dustSmallStack = OreDictUnifier.get(dustSmall, material);
        ItemStack dustTinyStack = OreDictUnifier.get(dustTiny, material);
        ItemStack nuggetStack = OreDictUnifier.get(nugget, material);

        FluidStack fluid144 = material.getFluid(144);
        FluidStack fluid36 = material.getFluid(36);
        FluidStack fluid16 = material.getFluid(16);

        removeByInputAndOutput(dustStack, fluid144);
        removeByInputAndOutput(dustSmallStack, fluid36);
        removeByInputAndOutput(dustTinyStack, fluid16);
        removeByInputAndOutput(nuggetStack, fluid16);
    }

    public static void removeByInputAndOutput(ItemStack input, FluidStack output) {
        if (input == null || output == null) {
            return;
        }
        NonNullList<ItemStack> matching = createMatchingList(input);
        TinkerRegistryAccessor.getMeltingRegistry().removeIf(recipe -> matchesRecipe(recipe, matching, output));

    }

    private static NonNullList<ItemStack> createMatchingList(ItemStack input) {
        NonNullList<ItemStack> matching = NonNullList.create();
        matching.add(input);
        return matching;
    }

    private static boolean matchesRecipe(MeltingRecipe recipe, NonNullList<ItemStack> matching, FluidStack output) {
        boolean matchesInput = recipe.input.matches(matching).isPresent();
        boolean matchesOutput = recipe.getResult().isFluidEqual(output);
        return matchesInput && matchesOutput;
    }
}
