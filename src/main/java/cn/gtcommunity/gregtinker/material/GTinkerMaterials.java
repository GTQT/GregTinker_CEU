package cn.gtcommunity.gregtinker.material;

import cn.gtcommunity.gregtinker.trait.GTinkerTraits;
import cn.gtcommunity.gregtinker.trait.TraitGravitation;
import com.google.common.eventbus.Subscribe;
import gregicality.multiblocks.api.unification.GCYMMaterials;
import gregtech.api.unification.material.Materials;
import keqing.gtqtcore.api.unification.GCYSMaterials;
import keqing.gtqtcore.api.unification.GTQTMaterials;
import keqing.gtqtcore.api.unification.TJMaterials;
import keqing.pollution.api.unification.PollutionMaterials;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.mantle.pulsar.pulse.Pulse;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerMaterials;
import slimeknights.tconstruct.tools.TinkerTraits;

public class GTinkerMaterials
{
    public static Material LAPOTRON;
    public static Material ALMANDINE;
    public static Material PYROPE;
    public static Material GROSSULAR;
    public static Material SPESSARTINE;
    public static Material UVAROVITE;
    public static Material SODALITE;
    public static Material LAZURITE;
    public static Material WROUGHT_IRON;
    public static Material STAINLESS_STEEL;
    public static Material DAMASCUS_STEEL;
    public static Material STERLING_SILVER;
    public static Material ROSE_GOLD;
    public static Material VANADIUM_STEEL;
    public static Material TUNGSTEN_STEEL;
    public static Material BLACK_STEEL;
    public static Material POLYTETRAFLUOROETHYLENE;
    public static Material MANGANESE_PHOSPHIDE;
    public static Material SOLDERING_ALLOY;
    public static Material RURIDIT;
    public static Material BLUE_ALLOY;
    public static Material EPOXY;
    public static Material PLASTIC;
    public static Material RHODIUM_PLATED_PALLADIUM;
    public static Material ULTIMET;
    public static Material URANIUM_TRIPLATINUM;
    public static Material OSMIRIDIUM;
    public static Material HSSG;
    public static Material HSSE;
    public static Material HSSS;
    public static Material NAQUADAH;
    public static Material NAQUADAH_ENRICHED;
    public static Material NEUTRONIUM;

    public static Material AMERICIUM;
    public static Material LUTETIUM;
    public static Material EUROPIUM;
    //  GCYM
    public static Material TANTALUM_CARBIDE;
    public static Material TITANIUM_CARBIDE;
    public static Material ZERON_100;
    public static Material TRINAQUADALLOY;
    public static Material HASTELLOY_X;
    public static Material HASTELLOY_C276;
    public static Material INCOLOY_MA_956;
    public static Material WATERTIGHT_STEEL;
    public static Material MOLYBDENUM_DISILICIDE;
    public static Material STELLITE_100;
    public static Material TITANIUM_TUNGSTEN_CARBIDE;
    public static Material MARAGING_STEEL_300;
    public static Material HSLA_STEEL;

    //GTQT
    public static Material HYPOGEN ;
    public static Material RHUGNOR  ;
    public static Material CELESTIAL_TUNGSTEN;
    public static Material NITINOL;
    public static Material MAGNETO_HYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER;
    public static Material SPACE_TIME;
    public static Material ETERNITY;
    public static Material SOLARIUM;
    public static Material INCONEL625;
    public static Material HastelloyN;
    public static Material Stellite;
    public static Material Hdcs;
    public static Material Lafium;
    public static Material BlackTitanium;
    public static Material Talonite;
    public static Material BlackPlutonium;
    public static Material MaragingSteel250;
    public static Material Staballoy;
    public static Material BabbittAlloy;
    public static Material ZirconiumCarbide;
    public static Material Inconel792;
    public static Material IncoloyMA813;
    public static Material HastelloyX78;
    public static Material HastelloyK243;
    public static Material MARM200Steel;
    public static Material MARM200CeSteel;
    public static Material TanmolyiumBetaC;
    public static Material HastelloyC59;
    public static Material HMS1J79Alloy;
    public static Material HY1301;
    public static Material AusteniticStainlessSteel904L;
    public static Material EglinSteelBase;
    public static Material EglinSteel;
    public static Material Pikyonium64B;
    public static Material IncoloyDS;
    public static Material Inconel690;
    public static Material Tantalloy61;
    public static Material Incoloy020;
    public static Material HG1223;
    public static Material HMS1J22Alloy;
    public static Material SuperheavyHAlloy;
    public static Material SuperheavyLAlloy;
    public static Material GalvanizedSteel;
    public static Material KELVAR;
    public static Material POLYETHERETHERKETONE;
    public static Material POLYBENZIMIDAZOLE;
    public static Material ZYLON;

    public static Material VALONITE;
    public static Material SCABYST;
    public static Material OCTINE;
    public static Material SYRMORITE;
    public static void init()
    {
        Plastic();
        Gemstone();
        InorganicNonMetallic();
        StatueMaterials();
        FusionMaterials();
        Thaumastic();
        //原版
        //大马士革钢
        DAMASCUS_STEEL = new MaterialBuilder("damascus_steel", 0x575757, MaterialForm.METAL, "DamascusSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotDamascusSteel")
                .setCastable(() -> Materials.DamascusSteel.getFluid(), 1200)
                .withStatsHead(1000, 8F, 10F, HarvestLevels.OBSIDIAN)
                .withStatsHandle(1.2F, 300)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.CHOPPING)
                .withTraits(PartType.TOOL, TinkerTraits.sharp)
                .withTraits(PartType.TOOL, TinkerTraits.momentum)
                .build();

        //标准纯银
        STERLING_SILVER = new MaterialBuilder("sterling_silver", 0xFFF5EE, MaterialForm.METAL, "SterlingSilver")
                .requiresMods("gregtech")
                .requiresOres("ingotSterlingSilver")
                .setCastable(() -> Materials.SterlingSilver.getFluid(), 1400)
                .withStatsHead(500, 5F, 5F, HarvestLevels.IRON)
                .withStatsHandle(0.95F, 100)
                .withStatsExtra(200)
                .withTraits(PartType.MAIN, GTinkerTraits.EXORCISM)
                .withTraits(PartType.AUX, TinkerTraits.holy)
                .withTraits(PartType.TOOL, TinkerTraits.endspeed)
                .build();

        //玫瑰金
        ROSE_GOLD = new MaterialBuilder("rose_gold", 0xFFC000, MaterialForm.METAL, "RoseGold")
                .requiresMods("gregtech")
                .requiresOres("ingotRoseGold")
                .setCastable(() -> Materials.RoseGold.getFluid(), 1300)
                .withStatsHead(50, 12F, 3F, HarvestLevels.IRON)
                .withStatsHandle(1.1F, -25)
                .withStatsExtra(250)
                .withTraits(PartType.HEAD, GTinkerTraits.VENEER2)
                .withTraits(PartType.DEFAULT, GTinkerTraits.VENEER)
                .withTraits(PartType.TOOL, TinkerTraits.jagged)
                .build();

        //钒钢
        VANADIUM_STEEL = new MaterialBuilder("vanadium_steel", 0xA9A9A9, MaterialForm.METAL, "VanadiumSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotVanadiumSteel")
                .setCastable(() -> Materials.VanadiumSteel.getFluid(), 3900)
                .withStatsHead(1250, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 450)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.jagged)
                .build();

        //黑钢
        BLACK_STEEL = new MaterialBuilder("black_steel", 0x71797E, MaterialForm.METAL, "BlackSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotBlackSteel")
                .setCastable(() -> Materials.BlackSteel.getFluid(), 3900)
                .withStatsHead(1200, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 350)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.dark)
                .withTraits(PartType.TOOL, TinkerTraits.tasty,TinkerTraits.poisonous)
                .build();
        
        //锑化锰
        MANGANESE_PHOSPHIDE = new MaterialBuilder("manganese_phosphide", 0xE1C16E, MaterialForm.METAL, "ManganesePhosphide")
                .requiresMods("gregtech")
                .requiresOres("ingotManganesePhosphide")
                .setCastable(() -> Materials.ManganesePhosphide.getFluid(), 3900)
                .withStatsHead(750, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.cascade)
                .withTraits(PartType.TOOL, TinkerTraits.magnetic2,TinkerTraits.squeaky)
                .build();

        //锌焊料合金
        SOLDERING_ALLOY = new MaterialBuilder("soldering_alloy", 0xA9A9A9, MaterialForm.METAL, "SolderingAlloy")
                .requiresMods("gregtech")
                .requiresOres("ingotSolderingAlloy")
                .setCastable(() -> Materials.SolderingAlloy.getFluid(), 3900)
                .withStatsHead(250, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.arcane)
                .withTraits(PartType.TOOL, TinkerTraits.momentum,TinkerTraits.squeaky)
                .build();

        //钌铱合金
        RURIDIT = new MaterialBuilder("ruridit", 0x93C572, MaterialForm.METAL, "Ruridit")
                .requiresMods("gregtech")
                .requiresOres("ingotRuridit")
                .setCastable(() -> Materials.Ruridit.getFluid(), 3900)
                .withStatsHead(2400, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.fracture)
                .withTraits(PartType.TOOL, TinkerTraits.superheat,TinkerTraits.shocking)
                .build();

        //蓝色合金
        BLUE_ALLOY = new MaterialBuilder("blue_alloy", 0x87CEEB, MaterialForm.METAL, "BlueAlloy")
                .requiresMods("gregtech")
                .requiresOres("ingotBlueAlloy")
                .setCastable(() -> Materials.BlueAlloy.getFluid(), 3900)
                .withStatsHead(1250, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.fragile)
                .withTraits(PartType.TOOL, GTinkerTraits.MALICIOUS_PERCEPTION, TinkerTraits.flammable)
                .build();

        //钴铬镍钼钨合金
        ULTIMET = new MaterialBuilder("ultimet", 0xCCCCFF, MaterialForm.METAL, "Ultimet")
                .requiresMods("gregtech")
                .requiresOres("ingotUltimet")
                .setCastable(() -> Materials.Ultimet.getFluid(), 3900)
                .withStatsHead(1500, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.organizing)
                .withTraits(PartType.TOOL, TinkerTraits.insatiable,TinkerTraits.prickly)
                .build();

        //三铂化铀锭
        URANIUM_TRIPLATINUM = new MaterialBuilder("uranium_triplatinum", 0x00A36C, MaterialForm.METAL, "UraniumTriplatinum")
                .requiresMods("gregtech")
                .requiresOres("ingotUraniumTriplatinum")
                .setCastable(() -> Materials.UraniumTriplatinum.getFluid(), 3900)
                .withStatsHead(1750, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 500)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.pulverizing)
                .withTraits(PartType.TOOL, TinkerTraits.splitting,TinkerTraits.crumbling)
                .build();

        //铱锇合金
        OSMIRIDIUM = new MaterialBuilder("osmiridium", 0x6495ED, MaterialForm.METAL, "Osmiridium")
                .requiresMods("gregtech")
                .requiresOres("ingotOsmiridium")
                .setCastable(() -> Materials.Osmiridium.getFluid(), 3900)
                .withStatsHead(2000, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.resonance)
                .withTraits(PartType.TOOL, TinkerTraits.insatiable,TinkerTraits.freezing)
                .build();

        //HSSG
        HSSG = new MaterialBuilder("hssg", 0xC4B454, MaterialForm.METAL, "Hssg")
                .requiresMods("gregtech")
                .requiresOres("ingotHssg")
                .setCastable(() -> Materials.HSSG.getFluid(), 3900)
                .withStatsHead(2400, 7F, 8F, HarvestLevels.COBALT)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.fragile)
                .withTraits(PartType.TOOL, TinkerTraits.stonebound,TinkerTraits.ecological)
                .build();

        //HSSE
        HSSE = new MaterialBuilder("hsse", 0x4F7942, MaterialForm.METAL, "Hsse")
                .requiresMods("gregtech")
                .requiresOres("ingotHsse")
                .setCastable(() -> Materials.HSSE.getFluid(), 4700)
                .withStatsHead(2800, 7F, 8F, 5)
                .withStatsHandle(1.2F, 400)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.MAGE_HAND)
                .withTraits(PartType.TOOL, TinkerTraits.magnetic2,TinkerTraits.cheapskate)
                .build();

        //HSSS
        HSSS = new MaterialBuilder("hsss", 0x8B0000, MaterialForm.METAL, "Hsss")
                .requiresMods("gregtech")
                .requiresOres("ingotHsss")
                .setCastable(() -> Materials.HSSS.getFluid(), 4700)
                .withStatsHead(3200, 7F, 8F, 5)
                .withStatsHandle(1.2F, 500)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.arcane)
                .withTraits(PartType.TOOL, TinkerTraits.stiff,TinkerTraits.magnetic)
                .build();

        

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //  GCYM
        //碳化钽
        TANTALUM_CARBIDE = new MaterialBuilder("tantalum_carbide", 0x71797E, MaterialForm.METAL, "TantalumCarbide")
                .requiresMods("gcym")
                .requiresOres("ingotTantalumCarbide")
                .setCastable(() -> GCYMMaterials.TantalumCarbide.getFluid(), 6000)
                .withStatsHead(2800, 10F, 8F,5)
                .withStatsHandle(1.1F, 2000)
                .withStatsExtra(600)
                .withTraits(PartType.MAIN, GTinkerTraits.dark)
                .withTraits(PartType.TOOL, TinkerTraits.fractured,TinkerTraits.splitting)
                .build();

        //碳化钛
        TITANIUM_CARBIDE = new MaterialBuilder("titanium_carbide", 0xA42A04, MaterialForm.METAL, "TitaniumCarbide")
                .requiresMods("gcym")
                .requiresOres("ingotTitaniumCarbide")
                .setCastable(() -> GCYMMaterials.TitaniumCarbide.getFluid(), 8000)
                .withStatsHead(2800, 8F, 8F, 6)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(400)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.slimeyBlue)
                .build();

        //赛龙100
        ZERON_100 = new MaterialBuilder("zeron_100", 0x6082B6, MaterialForm.METAL, "Zeron100")
                .requiresMods("gcym")
                .requiresOres("ingotZeron100")
                .setCastable(() -> GCYMMaterials.Zeron100.getFluid(), 7000)
                .withStatsHead(2800, 7F, 8F,5)
                .withStatsHandle(1.4F, 700)
                .withStatsExtra(400)
                .withTraits(PartType.MAIN, GTinkerTraits.EVENLY_MATCHED)
                .withTraits(PartType.TOOL, TinkerTraits.splintering,TinkerTraits.spiky)
                .build();

        //碳化特林-钍瑞铌合金
        TRINAQUADALLOY = new MaterialBuilder("trinaquadalloy", 0x483248, MaterialForm.METAL, "Trinaquadalloy")
                .requiresMods("gcym")
                .requiresOres("ingotTrinaquadalloy")
                .setCastable(() -> GCYMMaterials.Trinaquadalloy.getFluid(), 8000)
                .withStatsHead(3000, 9F, 8F,4)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(450)
                .withTraits(PartType.MAIN, GTinkerTraits.BLOOD_SUCKING)
                .withTraits(PartType.TOOL, TinkerTraits.superheat,TinkerTraits.stiff)
                .build();

        //哈氏合金
        HASTELLOY_X = new MaterialBuilder("hastelloy_x", 0xA7C7E7, MaterialForm.METAL, "HastelloyX")
                .requiresMods("gcym")
                .requiresOres("ingotHastelloyX")
                .setCastable(() -> GCYMMaterials.HastelloyX.getFluid(), 9000)
                .withStatsHead(3600, 10F, 8F, 6)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(600)
                .withTraits(PartType.MAIN, GTinkerTraits.VENEER)
                .withTraits(PartType.TOOL, TinkerTraits.insatiable,TinkerTraits.insatiable)
                .build();

        //哈氏合金C276
        HASTELLOY_C276 = new MaterialBuilder("hastelloy_c276", 0xFA5F55, MaterialForm.METAL, "HastelloyC276")
                .requiresMods("gcym")
                .requiresOres("ingotHastelloyC276")
                .setCastable(() -> GCYMMaterials.HastelloyC276.getFluid(), 8000)
                .withStatsHead(3200, 7F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(420)
                .withTraits(PartType.MAIN, GTinkerTraits.RAPACITY)
                .withTraits(PartType.TOOL, TinkerTraits.autosmelt,TinkerTraits.stiff)
                .build();

        //镍铬合金
        INCOLOY_MA_956 = new MaterialBuilder("incoloy_ma_956", 0x2AAA8A, MaterialForm.METAL, "IncoloyMa956")
                .requiresMods("gcym")
                .requiresOres("ingotIncoloyMa956")
                .setCastable(() -> GCYMMaterials.IncoloyMA956.getFluid(), 7000)
                .withStatsHead(3200, 8F, 8F, 6)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(500)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.petramor,TinkerTraits.crumbling)
                .build();

        //防水钢
        WATERTIGHT_STEEL = new MaterialBuilder("watertight_steel", 0x4682B4, MaterialForm.METAL, "WatertightSteel")
                .requiresMods("gcym")
                .requiresOres("ingotWatertightSteel")
                .setCastable(() -> GCYMMaterials.WatertightSteel.getFluid(), 6000)
                .withStatsHead(3200, 7F, 8F, 6)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(250)
                .withTraits(PartType.MAIN, GTinkerTraits.resonance)
                .withTraits(PartType.TOOL, TinkerTraits.superheat,TinkerTraits.heavy)
                .build();

        //硅化钼
        MOLYBDENUM_DISILICIDE = new MaterialBuilder("molybdenum_disilicide", 0x5D3FD3, MaterialForm.METAL, "MolybdenumDisilicide")
                .requiresMods("gcym")
                .requiresOres("ingotMolybdenumDisilicide")
                .setCastable(() -> GCYMMaterials.MolybdenumDisilicide.getFluid(), 5000)
                .withStatsHead(3600, 7F, 8F, 5)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(740)
                .withTraits(PartType.MAIN, GTinkerTraits.naturebound)
                .withTraits(PartType.TOOL, TinkerTraits.splinters,TinkerTraits.aquadynamic)
                .build();

        //司太立100
        STELLITE_100 = new MaterialBuilder("stellite_100", 0xCCCCFF, MaterialForm.METAL, "Stellite100")
                .requiresMods("gcym")
                .requiresOres("ingotStellite100")
                .setCastable(() -> GCYMMaterials.Stellite100.getFluid(), 6000)
                .withStatsHead(4800, 8F, 8F, 6)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(560)
                .withTraits(PartType.MAIN, GTinkerTraits.MAGE_HAND)
                .withTraits(PartType.TOOL, GTinkerTraits.COUNTER_MEASURES,TinkerTraits.jagged)
                .build();

        //碳化钨钛合金
        TITANIUM_TUNGSTEN_CARBIDE = new MaterialBuilder("titanium_tungsten_carbide", 0x770737, MaterialForm.METAL, "TitaniumTungstenCarbide")
                .requiresMods("gcym")
                .requiresOres("ingotTitaniumTungstenCarbide")
                .setCastable(() -> GCYMMaterials.TitaniumTungstenCarbide.getFluid(), 7000)
                .withStatsHead(5700, 7F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(850)
                .withTraits(PartType.MAIN, GTinkerTraits.glimmer)
                .withTraits(PartType.TOOL, TinkerTraits.unnatural,TinkerTraits.hellish)
                .build();

        //马氏体时效钢
        MARAGING_STEEL_300 = new MaterialBuilder("maraging_steel_300", 0x7393B3, MaterialForm.METAL, "MaragingSteel300")
                .requiresMods("gcym")
                .requiresOres("ingotMaragingSteel300")
                .setCastable(() -> GCYMMaterials.MaragingSteel300.getFluid(), 6000)
                .withStatsHead(4100, 8F, 8F, 5)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(540)
                .withTraits(PartType.MAIN, GTinkerTraits.BLIND)
                .withTraits(PartType.TOOL, GTinkerTraits.COUNTERATTACK,TinkerTraits.jagged)
                .build();

        //HSLA钢
        HSLA_STEEL = new MaterialBuilder("hsla_steel", 0x808080, MaterialForm.METAL, "HslaSteel")
                .requiresMods("gcym")
                .requiresOres("ingotHslaSteel")
                .setCastable(() -> GCYMMaterials.HSLASteel.getFluid(), 7000)
                .withStatsHead(4100, 7F, 8F, 5)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(850)
                .withTraits(PartType.MAIN, GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.crumbling)
                .build();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //GTQT
        //海珀珍
        HYPOGEN = new MaterialBuilder("hypogen", 0xDC784B, MaterialForm.METAL, "Hypogen")
                .requiresMods("gregtech")
                .requiresOres("ingotHypogen")
                .setCastable(() -> GTQTMaterials.Hypogen.getFluid(), 9000)
                .withStatsHead(32000, 15F, 12F, 12)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(1250)
                .withTraits(PartType.MAIN, GTinkerTraits.GRAVITATION)
                .withTraits(PartType.TOOL, TinkerTraits.momentum,TinkerTraits.freezing)
                .build();
        //天体钨
        CELESTIAL_TUNGSTEN = new MaterialBuilder("celestial_tungsten", 0x323232, MaterialForm.METAL, "CelestialTungsten")
                .requiresMods("gregtech")
                .requiresOres("ingotCelestialTungsten")
                .setCastable(() -> GTQTMaterials.CelestialTungsten.getFluid(), 8000)
                .withStatsHead(24000, 10F, 8F, 12)
                .withStatsHandle(3.5F, 700)
                .withStatsExtra(7000)
                .withTraits(PartType.MAIN, GTinkerTraits.SUPERTIGHT)
                .withTraits(PartType.TOOL, TinkerTraits.petramor,TinkerTraits.sharp)
                .build();
        //鲁伯特
        RHUGNOR = new MaterialBuilder("rhugnor", 0xBE00FF, MaterialForm.METAL, "Rhugnor")
                .requiresMods("gregtech")
                .requiresOres("ingotRhugnor")
                .setCastable(() -> GTQTMaterials.Rhugnor.getFluid(), 7000)
                .withStatsHead(11000, 13F, 8F, 12)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(1100)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.autosmelt,TinkerTraits.insatiable)
                .build();

        //磁动力流体
        MAGNETO_HYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER = new MaterialBuilder("magneto_hydrodynamically_constrained_star_matter", 0xFFA500, MaterialForm.METAL, "MagnetoHydrodynamicallyConstrainedStarMatter")
                .requiresMods("gregtech")
                .requiresOres("ingotMagnetoHydrodynamicallyConstrainedStarMatter")
                .setCastable(() -> GTQTMaterials.MagnetoHydrodynamicallyConstrainedStarMatter.getFluid(), 8000)
                .withStatsHead(36000, 12F, 8F, 10)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(4500)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.autosmelt)
                .build();


        //阳光合金
        SOLARIUM = new MaterialBuilder("solarium", 0xFFEC8B, MaterialForm.METAL, "Solarium")
                .requiresMods("gregtech")
                .requiresOres("ingotSolarium")
                .setCastable(() -> GTQTMaterials.Solarium.getFluid(), 7000)
                .withStatsHead(3000, 13F, 8F, 12)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(1100)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.insatiable)
                .build();

        //永恒
        ETERNITY = new MaterialBuilder("eternity", 0x191970, MaterialForm.METAL, "Eternity")
                .requiresMods("gregtech")
                .requiresOres("ingotEternity")
                .setCastable(() -> GTQTMaterials.Eternity.getFluid(), 7000)
                .withStatsHead(32000, 13F, 8F, 12)
                .withStatsHandle(1.1F, 850)
                .withStatsExtra(1000)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, TinkerTraits.alien,TinkerTraits.dense)
                .build();

        //时空
        SPACE_TIME = new MaterialBuilder("spacetime", 0x191970, MaterialForm.METAL, "Spacetime")
                .requiresMods("gregtech")
                .requiresOres("ingotSpacetime")
                .setCastable(() -> GTQTMaterials.Spacetime.getFluid(), 8000)
                .withStatsHead(42000, 13F, 12F, 14)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(1200)
                .withTraits(PartType.MAIN, GTinkerTraits.IRRADIATION)
                .withTraits(PartType.TOOL, GTinkerTraits.MALICIOUS_PERCEPTION,TinkerTraits.insatiable)
                .build();

        //镍钛诺
        NITINOL = new MaterialBuilder("nitinol", 0x1874CD, MaterialForm.METAL, "Nitinol")
                .requiresMods("gregtech")
                .requiresOres("ingotNitinol")
                .setCastable(() -> GTQTMaterials.Nitinol.getFluid(), 4000)
                .withStatsHead(2500, 7F, 8F, 5)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(150)
                .withTraits(PartType.MAIN, GTinkerTraits.resonance)
                .withTraits(PartType.TOOL, GTinkerTraits.pulverizing,TinkerTraits.magnetic)
                .build();
        //镍基合金625
        INCONEL625  = new MaterialBuilder("inconel_625", 0x3fcc60, MaterialForm.METAL, "Inconel625")
                .requiresMods("gregtech")
                .requiresOres("ingotInconel625")
                .setCastable(() -> GTQTMaterials.Inconel625.getFluid(), 7000)
                .withStatsHead(5400, 12F, 8F, 5)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(820)
                .withTraits(PartType.MAIN, GTinkerTraits.glimmer)
                .withTraits(PartType.TOOL, TinkerTraits.jagged,TinkerTraits.alien)
                .build();
        //镍基哈氏高温合金
        HastelloyN   = new MaterialBuilder("hastelloy_n", 0x939554, MaterialForm.METAL, "HastelloyN")
                .requiresMods("gregtech")
                .requiresOres("ingotHastelloyN")
                .setCastable(() -> GTQTMaterials.HastelloyN.getFluid(), 9000)
                .withStatsHead(8500, 8F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(650)
                .withTraits(PartType.MAIN, GTinkerTraits.melting)
                .withTraits(PartType.TOOL, TinkerTraits.dense,TinkerTraits.aquadynamic)
                .build();
        //司太立
        Stellite    = new MaterialBuilder("stellite", 0x939554, MaterialForm.METAL, "Stellite")
                .requiresMods("gregtech")
                .requiresOres("ingotStellite")
                .setCastable(() -> GTQTMaterials.Stellite.getFluid(), 7000)
                .withStatsHead(6000, 10F, 8F, 7)
                .withStatsHandle(1.8F, 600)
                .withStatsExtra(800)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.lightweight,TinkerTraits.jagged)
                .build();
        //HDCS
        Hdcs    = new MaterialBuilder("hdcs", 0x334433, MaterialForm.METAL, "Hdcs")
                .requiresMods("gregtech")
                .requiresOres("ingotHdcs")
                .setCastable(() -> GTQTMaterials.Hdcs.getFluid(), 8000)
                .withStatsHead(9800, 12F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(540)
                .withTraits(PartType.MAIN, GTinkerTraits.pulverizing)
                .withTraits(PartType.TOOL, TinkerTraits.coldblooded,TinkerTraits.aquadynamic)
                .build();
        //路菲恩
        Lafium    = new MaterialBuilder("lafium", 0x0D0D60, MaterialForm.METAL, "Lafium")
                .requiresMods("gregtech")
                .requiresOres("ingotLafium")
                .setCastable(() -> GTQTMaterials.Lafium.getFluid(), 6000)
                .withStatsHead(6500, 10F, 8F, 6)
                .withStatsHandle(1.5F, 500)
                .withStatsExtra(740)
                .withTraits(PartType.MAIN, GTinkerTraits.RAPACITY)
                .withTraits(PartType.TOOL, TinkerTraits.momentum,TinkerTraits.spiky)
                .build();
        //黑钛合金
        BlackTitanium     = new MaterialBuilder("black_titanium", 0x6C003B, MaterialForm.METAL, "BlackTitanium")
                .requiresMods("gregtech")
                .requiresOres("ingotBlackTitanium")
                .setCastable(() -> GTQTMaterials.BlackTitanium.getFluid(), 7000)
                .withStatsHead(8700, 12F, 8F, 10)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(980)
                .withTraits(PartType.MAIN, GTinkerTraits.fragile)
                .withTraits(PartType.TOOL, TinkerTraits.established,TinkerTraits.lightweight)
                .build();
        //铬钴磷酸盐合金
        Talonite = new MaterialBuilder("talonite", 0x9991A5, MaterialForm.METAL, "Talonite")
                .requiresMods("gregtech")
                .requiresOres("ingotTalonite")
                .setCastable(() -> GTQTMaterials.Talonite .getFluid(), 9000)
                .withStatsHead(8900, 8F, 8F, 6)
                .withStatsHandle(1.1F, 900)
                .withStatsExtra(850)
                .withTraits(PartType.MAIN, GTinkerTraits.pulverizing)
                .withTraits(PartType.TOOL, TinkerTraits.hellish,TinkerTraits.jagged)
                .build();
        //黑钚
        BlackPlutonium= new MaterialBuilder("black_plutonium", 0x060606, MaterialForm.METAL, "BlackPlutonium")
                .requiresMods("gregtech")
                .requiresOres("ingotBlackPlutonium")
                .setCastable(() -> GTQTMaterials.BlackPlutonium  .getFluid(), 8000)
                .withStatsHead(9100, 10F, 8F, 7)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(705)
                .withTraits(PartType.MAIN, GTinkerTraits.cascade)
                .withTraits(PartType.TOOL, TinkerTraits.depthdigger,TinkerTraits.insatiable)
                .build();
        //马氏体时效钢250
        MaragingSteel250 = new MaterialBuilder("maraging_steel_250", 0xA5ADB2, MaterialForm.METAL, "MaragingSteel250")
                .requiresMods("gregtech")
                .requiresOres("ingotMaragingSteel250")
                .setCastable(() -> GTQTMaterials.MaragingSteel250.getFluid(), 7000)
                .withStatsHead(8700, 8F, 8F, 5)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(580)
                .withTraits(PartType.MAIN, GTinkerTraits.arcane)
                .withTraits(PartType.TOOL, GTinkerTraits.EXORCISM,TinkerTraits.crude)
                .build();
        //贫铀合金
        Staballoy = new MaterialBuilder("staballoy", 0x444B42, MaterialForm.METAL, "Staballoy")
                .requiresMods("gregtech")
                .requiresOres("ingotStaballoy")
                .setCastable(() -> GTQTMaterials.Staballoy .getFluid(), 10000)
                .withStatsHead(9800, 8F, 8F, 5)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(780)
                .withTraits(PartType.MAIN, GTinkerTraits.dissolving)
                .withTraits(PartType.TOOL, GTinkerTraits.IRRADIATION,TinkerTraits.ecological)
                .build();
        //巴氏合金
        BabbittAlloy  = new MaterialBuilder("babbitt_alloy", 0xA19CA4, MaterialForm.METAL, "BabbittAlloy")
                .requiresMods("gregtech")
                .requiresOres("ingotBabbittAlloy")
                .setCastable(() -> GTQTMaterials.BabbittAlloy .getFluid(), 9000)
                .withStatsHead(7800, 10F, 8F, 6)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(780)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.cascade,TinkerTraits.lightweight)
                .build();
        //碳化锆
        ZirconiumCarbide = new MaterialBuilder("zirconium_carbide", 0xFFDACD, MaterialForm.METAL, "ZirconiumCarbide")
                .requiresMods("gregtech")
                .requiresOres("ingotZirconiumCarbide")
                .setCastable(() -> GTQTMaterials.ZirconiumCarbide.getFluid(), 8000)
                .withStatsHead(8000, 7F, 8F, 5)
                .withStatsHandle(2.0F, 500)
                .withStatsExtra(800)
                .withTraits(PartType.MAIN, GTinkerTraits.heroic)
                .withTraits(PartType.TOOL, GTinkerTraits.EVENLY_MATCHED,TinkerTraits.flammable)
                .build();
        //镍基合金-792
        Inconel792= new MaterialBuilder("inconel_792", 0x6CF076, MaterialForm.METAL, "Inconel792")
                .requiresMods("gregtech")
                .requiresOres("ingotInconel792")
                .setCastable(() -> GTQTMaterials.Inconel792.getFluid(), 7000)
                .withStatsHead(9800, 7F, 8F, 4)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(780)
                .withTraits(PartType.MAIN, GTinkerTraits.melting)
                .withTraits(PartType.TOOL, GTinkerTraits.COUNTERATTACK,TinkerTraits.momentum)
                .build();
        //耐热铬铁合金-MA813
        IncoloyMA813 = new MaterialBuilder("incoloy_ma_813", 0x6CF076, MaterialForm.METAL, "IncoloyMa813")
                .requiresMods("gregtech")
                .requiresOres("ingotIncoloyMa813")
                .setCastable(() -> GTQTMaterials.IncoloyMA813.getFluid(), 6000)
                .withStatsHead(7500, 8F, 8F, 4)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(580)
                .withTraits(PartType.MAIN, GTinkerTraits.GRAVITATION)
                .withTraits(PartType.TOOL, GTinkerTraits.COUNTER_MEASURES,TinkerTraits.spiky)
                .build();
        //哈斯特洛依合金-X78
        HastelloyX78= new MaterialBuilder("hastelloy_x_78", 0x6BA3E3, MaterialForm.METAL, "HastelloyX78")
                .requiresMods("gregtech")
                .requiresOres("ingotHastelloyX78")
                .setCastable(() -> GTQTMaterials.HastelloyX78.getFluid(), 9000)
                .withStatsHead(6800, 7F, 8F, 6)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(780)
                .withTraits(PartType.MAIN, GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, GTinkerTraits.INERTIA,TinkerTraits.baconlicious)
                .build();
        //哈斯特洛依合金-K243
        HastelloyK243= new MaterialBuilder("hastelloy_k_243", 0xa4ff70, MaterialForm.METAL, "HastelloyK243")
                .requiresMods("gregtech")
                .requiresOres("ingotHastelloyK243")
                .setCastable(() -> GTQTMaterials.HastelloyK243.getFluid(), 8000)
                .withStatsHead(8500, 7F, 8F, 5)
                .withStatsHandle(1.1F, 500)
                .withStatsExtra(750)
                .withTraits(PartType.MAIN, GTinkerTraits.MAGE_HAND)
                .withTraits(PartType.TOOL, GTinkerTraits.fracture,TinkerTraits.shocking)
                .build();
        //MAR-M200特种钢
        MARM200Steel= new MaterialBuilder("mar_m_200_steel", 0x515151, MaterialForm.METAL, "MarM200Steel")
                .requiresMods("gregtech")
                .requiresOres("ingotMarM200Steel")
                .setCastable(() -> GTQTMaterials.MARM200Steel.getFluid(), 7000)
                .withStatsHead(5800, 7F, 8F, 7)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(780)
                .withTraits(PartType.MAIN, GTinkerTraits.VENEER)
                .withTraits(PartType.TOOL, GTinkerTraits.MALICIOUS_PERCEPTION,TinkerTraits.splinters)
                .build();
        //MAR-Ce-M200特种钢
        MARM200CeSteel= new MaterialBuilder("mar_m_200_ce_steel", 0x383030, MaterialForm.METAL, "MarM200CeSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotMarM200CeSteel")
                .setCastable(() -> GTQTMaterials.MARM200CeSteel.getFluid(), 10000)
                .withStatsHead(8800, 8F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(880)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.MALICIOUS_PERCEPTION,TinkerTraits.spiky)
                .build();
        //钛钼合金β-C
        TanmolyiumBetaC= new MaterialBuilder("tanmolyium_beta_c", 0xc72fcc, MaterialForm.METAL, "TanmolyiumBetaC")
                .requiresMods("gregtech")
                .requiresOres("ingotTanmolyiumBetaC")
                .setCastable(() -> GTQTMaterials.TanmolyiumBetaC.getFluid(), 8000)
                .withStatsHead(6900, 7F, 8F, 5)
                .withStatsHandle(1.1F, 500)
                .withStatsExtra(450)
                .withTraits(PartType.MAIN, GTinkerTraits.EXORCISM)
                .withTraits(PartType.TOOL, GTinkerTraits.INERTIA,TinkerTraits.stonebound)
                .build();
        //哈斯特洛依合金-C59
        HastelloyC59= new MaterialBuilder("hastelloy_c_59", 0xD6D0F0, MaterialForm.METAL, "HastelloyC59")
                .requiresMods("gregtech")
                .requiresOres("ingotHastelloyC59")
                .setCastable(() -> GTQTMaterials.HastelloyC59.getFluid(), 7000)
                .withStatsHead(8500, 8F, 8F, 5)
                .withStatsHandle(1.9F, 400)
                .withStatsExtra(680)
                .withTraits(PartType.MAIN, GTinkerTraits.CHOPPING)
                .withTraits(PartType.TOOL, GTinkerTraits.bright,TinkerTraits.splinters)
                .build();
        //高饱和磁感应软磁合金-1J79
        HMS1J79Alloy= new MaterialBuilder("hms_1_j_79_alloy", 0xD1CB0B, MaterialForm.METAL, "Hms1J79Alloy")
                .requiresMods("gregtech")
                .requiresOres("ingotHms1J79Alloy")
                .setCastable(() -> GTQTMaterials.HMS1J79Alloy.getFluid(), 9000)
                .withStatsHead(7800, 7F, 8F, 5)
                .withStatsHandle(1.1F, 500)
                .withStatsExtra(870)
                .withTraits(PartType.MAIN, GTinkerTraits.COUNTER_MEASURES)
                .withTraits(PartType.TOOL, GTinkerTraits.cascade,TinkerTraits.magnetic)
                .build();
        //高强度结构钢HY130-1
        HY1301= new MaterialBuilder("hy_1301", 0x6F3E57, MaterialForm.METAL, "Hy1301")
                .requiresMods("gregtech")
                .requiresOres("ingotHy1301")
                .setCastable(() -> GTQTMaterials.HY1301.getFluid(), 8000)
                .withStatsHead(7200, 7F, 8F, 8)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(800)
                .withTraits(PartType.MAIN, GTinkerTraits.OMEGA)
                .withTraits(PartType.TOOL, GTinkerTraits.COUNTERATTACK,TinkerTraits.stiff)
                .build();
        //超级奥氏体不锈钢-904L
        AusteniticStainlessSteel904L= new MaterialBuilder("super_austenitic_stainless_steel_904_l", 0x6F3E57, MaterialForm.METAL, "AusteniticStainlessSteel904L")
                .requiresMods("gregtech")
                .requiresOres("ingotAusteniticStainlessSteel904L")
                .setCastable(() -> GTQTMaterials.AusteniticStainlessSteel904L.getFluid(), 6000)
                .withStatsHead(6400, 7F, 8F, 8)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(850)
                .withTraits(PartType.MAIN, GTinkerTraits.BLIND)
                .withTraits(PartType.TOOL, GTinkerTraits.fracture,TinkerTraits.magnetic)
                .build();
        //埃格林钢粗胚
        EglinSteelBase= new MaterialBuilder("eglin_steel_base", 0x6F3E57, MaterialForm.METAL, "EglinSteelBase")
                .requiresMods("gregtech")
                .requiresOres("ingotEglinSteelBase")
                .setCastable(() -> GTQTMaterials.EglinSteelBase.getFluid(), 7000)
                .withStatsHead(6400, 7F, 8F, 5)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(580)
                .withTraits(PartType.MAIN, GTinkerTraits.GRAVITATION)
                .withTraits(PartType.TOOL, GTinkerTraits.EVENLY_MATCHED,TinkerTraits.stiff)
                .build();
        //埃格林钢
        EglinSteel= new MaterialBuilder("eglin_steel", 0x8B4513, MaterialForm.METAL, "EglinSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotEglinSteel")
                .setCastable(() -> GTQTMaterials.EglinSteelBase.getFluid(), 6000)
                .withStatsHead(6800, 7F, 8F, 6)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(800)
                .withTraits(PartType.MAIN, GTinkerTraits.SUPERTIGHT)
                .withTraits(PartType.TOOL, GTinkerTraits.fracture,TinkerTraits.established)
                .build();
        //皮卡优合金-64B
        Pikyonium64B= new MaterialBuilder("pikyonium_64_b", 0x3467BA, MaterialForm.METAL, "Pikyonium64B")
                .requiresMods("gregtech")
                .requiresOres("ingotPikyonium64B")
                .setCastable(() -> GTQTMaterials.Pikyonium64B.getFluid(), 8000)
                .withStatsHead(7200, 10F, 8F, 8)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(980)
                .withTraits(PartType.MAIN, GTinkerTraits.RAPACITY)
                .withTraits(PartType.TOOL, GTinkerTraits.cascade,TinkerTraits.baconlicious)
                .build();
        //耐热铬铁合金-DS
        IncoloyDS= new MaterialBuilder("incoloy_ds", 0x6746B7, MaterialForm.METAL, "IncoloyDs")
                .requiresMods("gregtech")
                .requiresOres("ingotIncoloyDs")
                .setCastable(() -> GTQTMaterials.IncoloyDS.getFluid(), 7000)
                .withStatsHead(6400, 10F, 8F, 7)
                .withStatsHandle(1.1F, 500)
                .withStatsExtra(800)
                .withTraits(PartType.MAIN, GTinkerTraits.SUPERTIGHT)
                .withTraits(PartType.TOOL, GTinkerTraits.arcane,TinkerTraits.magnetic)
                .build();
        //镍基合金-690
        Inconel690= new MaterialBuilder("inconel_690", 0x4FC050, MaterialForm.METAL, "Inconel690")
                .requiresMods("gregtech")
                .requiresOres("ingotInconel690")
                .setCastable(() -> GTQTMaterials.Inconel690.getFluid(), 8000)
                .withStatsHead(7500, 8F, 8F,7)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(450)
                .withTraits(PartType.MAIN, GTinkerTraits.EVENLY_MATCHED)
                .withTraits(PartType.TOOL, GTinkerTraits.resonance,TinkerTraits.jagged)
                .build();
        //钽钨合金-61
        Tantalloy61= new MaterialBuilder("tantalloy_61", 0x717171, MaterialForm.METAL, "Tantalloy61")
                .requiresMods("gregtech")
                .requiresOres("ingotTantalloy61")
                .setCastable(() -> GTQTMaterials.Tantalloy61.getFluid(), 6000)
                .withStatsHead(8700, 9F, 8F, 6)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(680)
                .withTraits(PartType.MAIN, GTinkerTraits.EVENLY_MATCHED)
                .withTraits(PartType.TOOL, GTinkerTraits.pulverizing,TinkerTraits.shocking)
                .build();
        //耐热铬铁合金-020
        Incoloy020= new MaterialBuilder("incoloy_020", 0xF8BFFC, MaterialForm.METAL, "Incoloy020")
                .requiresMods("gregtech")
                .requiresOres("ingotIncoloy020")
                .setCastable(() -> GTQTMaterials.Incoloy020.getFluid(), 8000)
                .withStatsHead(7800, 8F, 8F, 8)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(680)
                .withTraits(PartType.MAIN, GTinkerTraits.SUPERTIGHT)
                .withTraits(PartType.TOOL, GTinkerTraits.glimmer,TinkerTraits.jagged)
                .build();
        //HG-1223
        HG1223= new MaterialBuilder("hg_1223", 0x235497, MaterialForm.METAL, "Hg1223")
                .requiresMods("gregtech")
                .requiresOres("ingotHg1223")
                .setCastable(() -> GTQTMaterials.HG1223.getFluid(), 8000)
                .withStatsHead(4500, 8F, 8F, 8)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(670)
                .withTraits(PartType.MAIN, GTinkerTraits.EXORCISM)
                .withTraits(PartType.TOOL, GTinkerTraits.heroic,TinkerTraits.slimeyGreen)
                .build();
        //高饱和磁感应软磁合金-1J22
        HMS1J22Alloy= new MaterialBuilder("hms_1_j_22_alloy", 0x9E927D, MaterialForm.METAL, "Hms1J22Alloy")
                .requiresMods("gregtech")
                .requiresOres("ingotHms1J22Alloy")
                .setCastable(() -> GTQTMaterials.HMS1J22Alloy.getFluid(), 8000)
                .withStatsHead(8700, 8F, 8F, 8)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(570)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.melting,TinkerTraits.dense)
                .build();
        //超重元素-重合金
        SuperheavyHAlloy= new MaterialBuilder("superheavy_h_alloy", 0xE84B36, MaterialForm.METAL, "SuperheavyHAlloy")
                .requiresMods("gregtech")
                .requiresOres("ingotSuperheavyHAlloy")
                .setCastable(() -> GTQTMaterials.SuperheavyHAlloy.getFluid(), 10000)
                .withStatsHead(24000, 14F, 8F, 10)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(1800)
                .withTraits(PartType.MAIN, GTinkerTraits.IRRADIATION)
                .withTraits(PartType.TOOL, GTinkerTraits.fracture,TinkerTraits.lightweight)
                .build();
        //超重元素-轻合金
        SuperheavyLAlloy= new MaterialBuilder("superheavy_l_alloy", 0x4D8BE9, MaterialForm.METAL, "SuperheavyLAlloy")
                .requiresMods("gregtech")
                .requiresOres("ingotSuperheavyLAlloy")
                .setCastable(() -> GTQTMaterials.SuperheavyLAlloy.getFluid(), 10000)
                .withStatsHead(18000, 12F, 8F, 10)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(1200)
                .withTraits(PartType.MAIN, GTinkerTraits.RAPACITY)
                .withTraits(PartType.TOOL, GTinkerTraits.glimmer,TinkerTraits.alien)
                .build();
        //镀锌钢
        GalvanizedSteel= new MaterialBuilder("galvanized_steel", 0xb5b5b5, MaterialForm.METAL, "GalvanizedSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotGalvanizedSteel")
                .setCastable(() -> GTQTMaterials.GalvanizedSteel.getFluid(), 1800)
                .withStatsHead(750, 7F, 8F, 3)
                .withStatsHandle(1.1F, 75)
                .withStatsExtra(75)
                .withTraits(PartType.MAIN, GTinkerTraits.INDUCED_LIGHTNING)
                .withTraits(PartType.TOOL, GTinkerTraits.fragile)
                .build();
    }

    private static void Thaumastic() {
        //赛摩铜
        SYRMORITE = new MaterialBuilder("syrmorite", 0x2414B3, MaterialForm.METAL, "Syrmorite")
                .requiresMods("gregtech")
                .requiresOres("ingotSyrmorite")
                .setCastable(() -> PollutionMaterials.syrmorite.getFluid(), 800)
                .withStatsHead(1250, 5F, 6F, 3)
                .withStatsHandle(1.1F, 75)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.heroic,TinkerTraits.jagged)
                .build();

        //炽焰铁
        OCTINE = new MaterialBuilder("octine", 0xFFAE33, MaterialForm.METAL, "Octine")
                .requiresMods("gregtech")
                .requiresOres("ingotOctine")
                .setCastable(() -> PollutionMaterials.octine.getFluid(), 800)
                .withStatsHead(1500, 6F, 7F, 3)
                .withStatsHandle(1.1F, 100)
                .withStatsExtra(125)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.jagged)
                .build();

        //痂壳晶
        SCABYST = new MaterialBuilder("scabyst", 0xFFAE33, MaterialForm.METAL, "Scabyst")
                .requiresMods("gregtech")
                .requiresOres("ingotScabyst")
                .setCastable(() -> PollutionMaterials.scabyst.getFluid(), 800)
                .withStatsHead(1750, 6F, 7F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(150)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.dark,TinkerTraits.jagged)
                .build();

        //法罗钠
        VALONITE = new MaterialBuilder("valonite", 0xFFCCFF, MaterialForm.GEM, "Valonite")
                .requiresMods("gregtech")
                .requiresOres("gemValonite")
                .setCastable(() -> PollutionMaterials.valonite.getFluid(), 800)
                .withStatsHead(2000, 8F, 7F, 4)
                .withStatsHandle(1.1F, 150)
                .withStatsExtra(175)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, GTinkerTraits.dissolving,TinkerTraits.jagged)
                .build();
    }

    private static void FusionMaterials() {
        //镅
        AMERICIUM= new MaterialBuilder("americium", 0x287869, MaterialForm.METAL, "Americium")
                .requiresMods("gregtech")
                .requiresOres("ingotAmericium")
                .setCastable(() -> Materials.Americium.getFluid(), 6000)
                .withStatsHead(7500, 10F, 12F, 8)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(400)
                .withTraits(PartType.MAIN, GTinkerTraits.INDUCED_LIGHTNING)
                .withTraits(PartType.TOOL, GTinkerTraits.arcane,GTinkerTraits.ALPHA)
                .build();
        //镥
        LUTETIUM= new MaterialBuilder("lutetium", 0x00AAFF, MaterialForm.METAL, "Lutetium")
                .requiresMods("gregtech")
                .requiresOres("ingotLutetium")
                .setCastable(() -> Materials.Lutetium.getFluid(), 6000)
                .withStatsHead(7500, 10F, 12F, 8)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(400)
                .withTraits(PartType.MAIN, GTinkerTraits.INDUCED_LIGHTNING)
                .withTraits(PartType.TOOL, GTinkerTraits.glimmer,GTinkerTraits.ALPHA)
                .build();
        //铕
        EUROPIUM= new MaterialBuilder("europium", 0x20FFFF, MaterialForm.METAL, "Europium")
                .requiresMods("gregtech")
                .requiresOres("ingotEuropium")
                .setCastable(() -> Materials.Lutetium.getFluid(), 6000)
                .withStatsHead(7500, 10F, 12F, 8)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(400)
                .withTraits(PartType.MAIN, GTinkerTraits.INDUCED_LIGHTNING)
                .withTraits(PartType.TOOL, TinkerTraits.jagged,GTinkerTraits.ALPHA)
                .build();
    }

    private static void StatueMaterials() {
        //锻铁
        WROUGHT_IRON = new MaterialBuilder("wrought_iron", 0xC4A484, MaterialForm.METAL, "WroughtIron")
                .requiresMods("gregtech")
                .requiresOres("ingotWroughtIron")
                .setCastable(() -> Materials.WroughtIron.getFluid(), 380)
                .withStatsHead(350, 6.5F, 5F, 3)
                .withStatsHandle(0.9F, 125)
                .withStatsExtra(50)
                .withTraits(PartType.MAIN, TinkerTraits.cheap)
                .withTraits(PartType.TOOL, TinkerTraits.depthdigger)
                .build();

        //不锈钢
        STAINLESS_STEEL = new MaterialBuilder("stainless_steel", 0xE5E4E2, MaterialForm.METAL, "StainlessSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotStainlessSteel")
                .setCastable(() -> Materials.StainlessSteel.getFluid(), 1400)
                .withStatsHead(1000, 7F, 8F, 4)
                .withStatsHandle(1.2F, 300)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.CORROSION_RESISTANCE)
                .withTraits(PartType.TOOL, TinkerTraits.flammable)
                .build();

        //钨钢
        TUNGSTEN_STEEL = new MaterialBuilder("tungsten_steel", 0x6F8FAF, MaterialForm.METAL, "TungstenSteel")
                .requiresMods("gregtech")
                .requiresOres("ingotTungstenSteel")
                .setCastable(() -> Materials.TungstenSteel.getFluid(), 3900)
                .withStatsHead(1500, 7F, 8F, 5)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.GRAVITATION)
                .withTraits(PartType.TOOL, TinkerTraits.established,TinkerTraits.fractured)
                .build();

        //镀铑钯
        RHODIUM_PLATED_PALLADIUM = new MaterialBuilder("rhodium_plated_palladium", 0xF2D2BD, MaterialForm.METAL, "RhodiumPlatedPalladium")
                .requiresMods("gregtech")
                .requiresOres("ingotRhodiumPlatedPalladium")
                .setCastable(() -> Materials.RhodiumPlatedPalladium.getFluid(), 3900)
                .withStatsHead(1500, 7F, 8F, 5)
                .withStatsHandle(1.1F, 700)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.naturebound)
                .withTraits(PartType.TOOL, TinkerTraits.duritos,TinkerTraits.poisonous)
                .build();

        //硅岩
        NAQUADAH = new MaterialBuilder("naquadah", 0x28282B, MaterialForm.METAL, "Naquadah")
                .requiresMods("gregtech")
                .requiresOres("ingotNaquadah")
                .setCastable(() -> Materials.Naquadah.getFluid(), 4700)
                .withStatsHead(3000, 10F, 15F, 6)
                .withStatsHandle(6F, 1500)
                .withStatsExtra(500)
                .withTraits(PartType.MAIN, GTinkerTraits.bright,GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, GTinkerTraits.SUPERTIGHT,TinkerTraits.heavy)
                .build();

        //富集硅岩
        NAQUADAH_ENRICHED = new MaterialBuilder("naquadah_enriched", 0x28282B, MaterialForm.METAL, "NaquadahEnriched")
                .requiresMods("gregtech")
                .requiresOres("ingotNaquadahEnriched")
                .setCastable(() -> Materials.NaquadahEnriched.getFluid(), 5700)
                .withStatsHead(3500, 12F, 20F, 7)
                .withStatsHandle(8F, 1750)
                .withStatsExtra(750)
                .withTraits(PartType.MAIN, GTinkerTraits.cascade)
                .withTraits(PartType.TOOL, GTinkerTraits.SUPERTIGHT,TinkerTraits.endspeed)
                .build();

        //中子素
        NEUTRONIUM = new MaterialBuilder("neutronium", 0xC0C0C0, MaterialForm.METAL, "Neutronium")
                .requiresMods("gregtech")
                .requiresOres("ingotNeutronium")
                .setCastable(() -> Materials.Neutronium.getFluid(), 9999)
                .withStatsHead(9000, 15F, 105F, 10)
                .withStatsHandle(10F, 4500)
                .withStatsExtra(1000)
                .withTraits(PartType.MAIN, GTinkerTraits.GRAVITATION)
                .withTraits(PartType.TOOL, GTinkerTraits.UNBREAKABLE,TinkerTraits.splitting)
                .build();
    }

    private static void InorganicNonMetallic() {
        //方钠石
        SODALITE = new MaterialBuilder("sodalite", 0x3F00FF, MaterialForm.GEM, "Sodalite")
                .requiresMods("gregtech")
                .requiresOres("gemSodalite")
                .setCraftable()
                .withStatsHead(750, 5F, 7F, 3)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.CHOPPING)
                .withTraits(PartType.TOOL, TinkerTraits.duritos)
                .build();

        //青金石
        LAZURITE = new MaterialBuilder("lazurite", 0xB6D0E2, MaterialForm.GEM, "Lazurite")
                .requiresMods("gregtech")
                .requiresOres("gemLazurite")
                .setCraftable()
                .withStatsHead(750, 5F, 7F, 3)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.COUNTERATTACK)
                .withTraits(PartType.TOOL, TinkerTraits.duritos)
                .build();
    }

    private static void Gemstone() {
        //兰波顿水晶
        LAPOTRON = new MaterialBuilder("lapotron", 0x0000FF, MaterialForm.GEM, "Lapotron")
                .requiresMods("gregtech")
                .requiresOres("gemLapotron")
                .setCraftable()
                .withStatsHead(2400, 7F, 8F, 4)
                .withStatsHandle(1.1F, 300)
                .withStatsExtra(200)
                .withTraits(PartType.MAIN, GTinkerTraits.BLIND)
                .withTraits(PartType.TOOL, TinkerTraits.duritos)
                .build();

        //铁铝榴石
        ALMANDINE = new MaterialBuilder("almandine", 0xFF0000, MaterialForm.GEM, "Almandine")
                .requiresMods("gregtech")
                .requiresOres("gemAlmandine")
                .setCraftable()
                .withStatsHead(1250, 4F, 5F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.heavy)
                .build();

        //镁铝榴石
        PYROPE = new MaterialBuilder("pyrope", 0x953553, MaterialForm.GEM, "Pyrope")
                .requiresMods("gregtech")
                .requiresOres("gemPyrope")
                .setCraftable()
                .withStatsHead(1250, 4F, 5F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(200)
                .withTraits(PartType.MAIN, GTinkerTraits.ALPHA)
                .withTraits(PartType.TOOL, TinkerTraits.holy)
                .build();

        //钙铝榴石
        GROSSULAR = new MaterialBuilder("grossular", 0xF28C28, MaterialForm.GEM, "Grossular")
                .requiresMods("gregtech")
                .requiresOres("gemGrossular")
                .setCraftable()
                .withStatsHead(1250, 4F, 5F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, TinkerTraits.heavy)
                .build();

        //锰铝榴石
        SPESSARTINE = new MaterialBuilder("spessartine", 0xFF6464, MaterialForm.GEM, "Spessartine")
                .requiresMods("gregtech")
                .requiresOres("gemSpessartine")
                .setCraftable()
                .withStatsHead(1250, 4F, 5F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, TinkerTraits.magnetic2)
                .build();

        //钙铬榴石
        UVAROVITE = new MaterialBuilder("uvarovite", 0xB4ffB4, MaterialForm.GEM, "Uvarovite")
                .requiresMods("gregtech")
                .requiresOres("gemUvarovite")
                .setCraftable()
                .withStatsHead(1250, 4F, 5F, 3)
                .withStatsHandle(1.1F, 125)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.BETA)
                .withTraits(PartType.TOOL, TinkerTraits.flammable)
                .build();
    }

    private static void Plastic() {
        //》》塑料
        //聚乙烯
        PLASTIC = new MaterialBuilder("plastic", 0xD3D3D3, MaterialForm.METAL, "Plastic")
                .requiresMods("gregtech")
                .requiresOres("ingotPlastic")
                .setCastable(() -> Materials.Polyethylene.getFluid(), 100)
                .withStatsHead(1000, 3F, 4F, 3)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(50)
                .withTraits(PartType.MAIN, GTinkerTraits.melting)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.dense)
                .build();

        //环氧树脂
        EPOXY = new MaterialBuilder("epoxy", 0xF4C430, MaterialForm.METAL, "Epoxy")
                .requiresMods("gregtech")
                .requiresOres("ingotEpoxy")
                .setCastable(() -> Materials.Epoxy.getFluid(), 200)
                .withStatsHead(2000, 4F, 4F, 4)
                .withStatsHandle(1.1F, 400)
                .withStatsExtra(100)
                .withTraits(PartType.MAIN, GTinkerTraits.heroic)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.cheap)
                .build();

        //聚四氟乙烯
        POLYTETRAFLUOROETHYLENE = new MaterialBuilder("polytetrafluoroethylene", 0x818589, MaterialForm.METAL, "Polytetrafluoroethylene")
                .requiresMods("gregtech")
                .requiresOres("ingotPolytetrafluoroethylene")
                .setCastable(() -> Materials.Polytetrafluoroethylene.getFluid(), 300)
                .withStatsHead(3000, 5F, 8F, 4)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(125)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.momentum)
                .build();
        //柴隆纤维
        ZYLON = new MaterialBuilder("zylon", 0xFFE000, MaterialForm.METAL, "Zylon")
                .requiresMods("gregtech")
                .requiresOres("ingotZylon")
                .setCastable(() -> GTQTMaterials.Zylon.getFluid(), 400)
                .withStatsHead(3600, 6F, 4F, 5)
                .withStatsHandle(1.1F, 600)
                .withStatsExtra(150)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.alien)
                .build();

        //聚苯并咪唑
        POLYBENZIMIDAZOLE = new MaterialBuilder("polybenzimidazole", 0x818589, MaterialForm.METAL, "Polybenzimidazole")
                .requiresMods("gregtech")
                .requiresOres("ingotPolybenzimidazole")
                .setCastable(() -> Materials.Polybenzimidazole.getFluid(), 400)
                .withStatsHead(4000, 8F, 6F, 5)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(175)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.baconlicious)
                .build();

        //聚芳醚酮
        POLYETHERETHERKETONE = new MaterialBuilder("polyetheretherketone", 0x2b2b2b, MaterialForm.METAL, "Polyetheretherketone")
                .requiresMods("gregtech")
                .requiresOres("ingotPolyetheretherketone")
                .setCastable(() -> TJMaterials.Polyetheretherketone.getFluid(), 400)
                .withStatsHead(4800, 8F, 6F, 6)
                .withStatsHandle(1.1F, 800)
                .withStatsExtra(200)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.autosmelt)
                .build();

        //凯夫拉
        KELVAR = new MaterialBuilder("kevlar", 0xF0F078, MaterialForm.METAL, "Kevlar")
                .requiresMods("gregtech")
                .requiresOres("ingotKevlar")
                .setCastable(() -> GCYSMaterials.Kevlar.getFluid(), 400)
                .withStatsHead(4000, 10F, 6F, 6)
                .withStatsHandle(1.1F, 1000)
                .withStatsExtra(250)
                .withTraits(PartType.MAIN, GTinkerTraits.bright)
                .withTraits(PartType.TOOL, GTinkerTraits.softy,TinkerTraits.aquadynamic)
                .build();
    }
}
