package cn.gtcommunity.gregtinker.common.items;

import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.unification.stack.RecyclingData;
import gregtech.common.creativetab.GTCreativeTabs;

import static cn.gtcommunity.gregtinker.common.items.GTMetaItems.*;
import static gregtech.api.GTValues.M;

public class GTMetaItem1 extends StandardMetaItem {

    public GTMetaItem1() {
        this.setRegistryName("gregtinker_meta_item_1");
        setCreativeTab(GTCreativeTabs.TAB_GREGTECH);
    }


    public void registerSubItems() {
        SHAPE_EXTRUDERS[0] = SHAPE_EXTRUDER_SWORDBLADE = addItem(1, "shape.extruder.swordblade")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[1] = SHAPE_EXTRUDER_BEHEADER = addItem(2, "shape.extruder.beheader")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[2] = SHAPE_EXTRUDER_ARROWHEAD = addItem(3, "shape.extruder.arrowhead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[3] = SHAPE_EXTRUDER_BINDING = addItem(4, "shape.extruder.binding")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[4] = SHAPE_EXTRUDER_TOUGHBINDING = addItem(5, "shape.extruder.toughbinding")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[5] = SHAPE_EXTRUDER_GUARD = addItem(6, "shape.extruder.guard")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[6] = SHAPE_EXTRUDER_WIDEGUARD = addItem(7, "shape.extruder.wideguard")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[7] = SHAPE_EXTRUDER_CROSSGUARD = addItem(8, "shape.extruder.crossguard")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[8] = SHAPE_EXTRUDER_KNIFEBLADE = addItem(9, "shape.extruder.knifeblade")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[9] = SHAPE_EXTRUDER_TOOLROD = addItem(10, "shape.extruder.toolrod")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[10] = SHAPE_EXTRUDER_TOUGHTOOLROD = addItem(11, "shape.extruder.toughtoolrod")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[11] = SHAPE_EXTRUDER_LARGEPLATE = addItem(12, "shape.extruder.largeplate")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[12] = SHAPE_EXTRUDER_SHARPENINGKIT = addItem(13, "shape.extruder.sharpeningkit")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[13] = SHAPE_EXTRUDER_BOWLIMB = addItem(14, "shape.extruder.bowlimb")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[14] = SHAPE_EXTRUDER_HAMMER = addItem(15, "shape.extruder.hammerhead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[15] = SHAPE_EXTRUDER_KAMA = addItem(16, "shape.extruder.kama")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[16] = SHAPE_EXTRUDER_AXE = addItem(17, "shape.extruder.axehead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[17] = SHAPE_EXTRUDER_LUMBERAXE = addItem(18, "shape.extruder.lumberaxe")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[18] = SHAPE_EXTRUDER_PICKAXE = addItem(19, "shape.extruder.pickaxehead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[19] = SHAPE_EXTRUDER_SHOVEL = addItem(20, "shape.extruder.shovelhead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[20] = SHAPE_EXTRUDER_EXCAVATOR = addItem(21, "shape.extruder.excavator")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[21] = SHAPE_EXTRUDER_SIGN = addItem(22, "shape.extruder.sign")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[22] = SHAPE_EXTRUDER_SCYTHE = addItem(23, "shape.extruder.scythehead")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
        SHAPE_EXTRUDERS[23] = SHAPE_EXTRUDER_FRYPAN = addItem(24, "shape.extruder.pan")
                .setRecyclingData(new RecyclingData(new MaterialStack(Materials.Steel, M * 4)));
    }
}
