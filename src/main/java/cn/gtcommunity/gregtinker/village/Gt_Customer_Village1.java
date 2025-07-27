package cn.gtcommunity.gregtinker.village;

import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.smeltery.block.BlockFaucet;
import slimeknights.tconstruct.smeltery.block.BlockSmelteryController;

import java.util.List;
import java.util.Random;

public class Gt_Customer_Village1 extends StructureVillagePieces.Village {
    private int averageGroundLevel = -1;

    public Gt_Customer_Village1() {
    }

    public Gt_Customer_Village1(StructureVillagePieces.Start start, int type, Random rand, StructureBoundingBox boundingBox, EnumFacing facing) {
        super();
        this.setCoordBaseMode(facing);
        this.boundingBox = boundingBox;
    }

    /**
     * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes Mineshafts at
     * the end, it adds Fences...
     *
     * @param world
     * @param randomIn
     * @param sbb
     */
    @Override
    public boolean addComponentParts(World world, Random randomIn, StructureBoundingBox sbb) {
        if (this.averageGroundLevel < 0) {
            this.averageGroundLevel = this.getAverageGroundLevel(world, sbb);

            if (this.averageGroundLevel < 0) {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 8, 0);
        }
        EnumFacing facing = this.getCoordBaseMode();
        if (facing == null) {
            facing = EnumFacing.NORTH;
        }

        this.fillWithBlocks(world, sbb, 1, 0, 0, 7, 0, 6, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 0, 0, 1, 0, 0, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 8, 0, 1, 8, 0, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 0, 1, 0, 9, 3, 7, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 2, 0, 1, 6, 6, 5, TinkerSmeltery.searedBlock.getStateFromMeta(3), TinkerSmeltery.searedBlock.getStateFromMeta(3), false);
        this.fillWithBlocks(world, sbb, 3, 1, 2, 5, 6, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 4, 1, 1, 4, 1, 1, TinkerSmeltery.smelteryController.getDefaultState().withProperty(BlockSmelteryController.FACING, facing.getOpposite()), TinkerSmeltery.smelteryController.getDefaultState().withProperty(BlockSmelteryController.FACING, facing.getOpposite()), false);
        this.fillWithBlocks(world, sbb, 5, 1, 1, 5, 1, 1, TinkerSmeltery.searedTank.getDefaultState(), TinkerSmeltery.searedTank.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 4, 2, 5, 5, 2, 5, TinkerSmeltery.smelteryIO.getDefaultState(), TinkerSmeltery.smelteryIO.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 4, 2, 6, 5, 2, 6, TinkerSmeltery.faucet.getDefaultState().withProperty(BlockFaucet.FACING, facing.getOpposite()), TinkerSmeltery.faucet.getDefaultState().withProperty(BlockFaucet.FACING, facing.getOpposite()), false);
        this.fillWithBlocks(world, sbb, 4, 1, 6, 4, 1, 6, TinkerSmeltery.castingBlock.getStateFromMeta(0), TinkerSmeltery.faucet.getDefaultState(), false);
        this.fillWithBlocks(world, sbb, 5, 1, 6, 5, 1, 6, TinkerSmeltery.castingBlock.getStateFromMeta(1), TinkerSmeltery.faucet.getDefaultState(), false);
        return true;
    }

    public static class CreationHandler implements VillagerRegistry.IVillageCreationHandler {
        @Override
        public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random random, int i) {
            return new StructureVillagePieces.PieceWeight(Gt_Customer_Village1.class, 1, 1);
        }

        @Override
        public Class<?> getComponentClass() {
            return Gt_Customer_Village1.class;
        }

        @Override
        public StructureVillagePieces.Village buildComponent(StructureVillagePieces.PieceWeight pieceWeight, StructureVillagePieces.Start start, List<StructureComponent> components, Random random, int x, int y, int z, EnumFacing facing, int type) {
            StructureBoundingBox boundingBox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 10, 10, 10, facing);
            return canVillageGoDeeper(boundingBox) ? new Gt_Customer_Village1(start, type, random, boundingBox, facing) : null;
        }
    }
}
