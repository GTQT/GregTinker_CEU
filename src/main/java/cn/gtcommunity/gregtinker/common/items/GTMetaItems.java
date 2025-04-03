package cn.gtcommunity.gregtinker.common.items;

import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.MetaItem;

public class GTMetaItems {

    public static final MetaItem<?>.MetaValueItem[] SHAPE_EXTRUDERS = new MetaItem.MetaValueItem[24];
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SWORDBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BEHEADER;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_ARROWHEAD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOUGHBINDING;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_GUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_WIDEGUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_CROSSGUARD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_KNIFEBLADE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOOLROD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_TOUGHTOOLROD;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_LARGEPLATE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SHARPENINGKIT;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_BOWLIMB;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_HAMMER;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_KAMA;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_AXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_LUMBERAXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_PICKAXE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SHOVEL;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_EXCAVATOR;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SIGN;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_SCYTHE;
    public static MetaItem<?>.MetaValueItem SHAPE_EXTRUDER_FRYPAN;

    // Process-Specific Components
    public static GTMetaItem1 GREGTINKER_META_ITEM;


    public static void initialization() {
        GREGTINKER_META_ITEM = new GTMetaItem1();

    }

    public static void initSubItems() {
        GTMetaItem1.registerItems();
    }
}
