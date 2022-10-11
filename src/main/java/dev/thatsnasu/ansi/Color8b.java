package dev.thatsnasu.ansi;

/**
 * Predefined 8bit Colors.
 * These ColorCodes follow the 8Bit scheme and only work in environments that support ANSI Escaping.
 */
public enum Color8b {
	/**
	 * Colorizes text in aero blue. Rgb value is 175, 255, 215. Hexadecimal value is #afffd7.
	 */
	AERO_BLUE("Aero_Blue", "158", "#afffd7", new int[] {175, 255, 215}),
	/**
	 * Colorizes text in alto. Rgb value is 208, 208, 208. Hexadecimal value is #d0d0d0.
	 */
	ALTO("Alto", "252", "#d0d0d0", new int[] {208, 208, 208}),
	/**
	 * Colorizes text in anakiwa. Rgb value is 175, 215, 255. Hexadecimal value is #afd7ff.
	 */
	ANAKIWA("Anakiwa", "153", "#afd7ff", new int[] {175, 215, 255}),
	/**
	 * Colorizes text in black. Rgb value is 95, 255, 215. Hexadecimal value is #5fffd7.
	 */
	AQAMARINE("Aquamarine", "86", "#5fffd7", new int[] {95, 255, 215}),
	/**
	 * Colorizes text in azure radiance. Rgb value is 0, 135, 255. Hexadecimal value is #0087ff.
	 */
	AZURE_RADIANCE("Azure_Radiance", "33", "#0087ff", new int[] {0, 135, 255}),
	/**
	 * Colorizes text in bay leaf. Rgb value is 135, 255, 135. Hexadecimal value is #87af87.
	 */
	BAY_LEAF("Bay_Leaf", "108", "#87ff87", new int[] {135, 255, 135}),
	/**
	 * Colorizes text in bermuda. Rgb value is 135, 215, 215. Hexadecimal value is #87d7d7.
	 */
	BERMUDA("Bermuda", "116", "#87d7d7", new int[] {135, 215, 215}),
	/**
	 * Colorizes text in bittersweet. Rgb value is 255, 95, 95. Hexadecimal value is #ff5f5f.
	 */
	BITTERSWEET("Bittersweet", "203", "#ff5f5f", new int[] {255, 95, 95}),
	/**
	 * Colorizes text in black. Rgb value is 0, 0, 0. Hexadecimal value is #000000.
	 */
	BLACK("Black", "0", "#000000", new int[] {0, 0, 0}),
	/**
	 * Colorizes text in blaze orange. Rgb value is 255, 95, 0. Hexadecimal value is #ff5f00.
	 */
	BLAZE_ORANGE("Blaze_Orange", "202", "#ff5f00", new int[] {255, 95, 0}),
	/**
	 * Colorizes text in blue. Rgb value is 0, 0, 255. Hexadecimal value is #0000ff.
	 */
	BLUE("Blue", "21", "#0000ff", new int[] {0, 0, 255}),
	/**
	 * Colorizes text in blue ribbon. Rgb value is 0, 95, 255. Hexadecimal value is #005fff.
	 */
	BLUE_RIBBON("Blue_Ribbon", "27", "#005fff", new int[] {0, 95, 255}),
	/**
	 * Colorizes text in blue stone. Rgb value is 0, 95, 95. Hexadecimal value is #005f5f.
	 */
	BLUE_STONE("Blue_Stone", "23", "#005f5f", new int[] {0, 95, 95}),
	/**
	 * Colorizes text in blush pink. Rgb value is 255, 135, 255. Hexadecimal value is #ff87ff.
	 */
	BLUSH_PINK("Blush_Pink", "213", "ff87ff", new int[] {255, 135, 255}),
	/**
	 * Colorizes text in blondi blue. Rgb value is 0, 175, 175. Hexadecimal value is #00afaf.
	 */
	BLONDI_BLUE("Blondi_Blue", "37", "#00afaf", new int[] {0, 175, 175}),
	/**
	 * Colorizes text in boulder. Rgb value is 118, 118, 118. Hexadecimal value is #767676.
	 */
	BOULDER("Boulder", "243", "#767676", new int[] {118, 118, 118}),
	/**
	 * Colorizes text in bouquet. Rgb value is 175, 135, 175. Hexadecimal value is #af87af.
	 */
	BOUQUET("Bouquet", "139", "#af87af", new int[] {175, 135, 175}),
	/**
	 * Colorizes text in bright green. Rgb value is 95, 255, 0. Hexadecimal value is #5fff00.
	 */
	BRIGHT_GREEN("Bright_Green", "82", "#5fff00", new int[] {95, 255, 0}),
	/**
	 * Colorizes text in bright red. Rgb value is 175, 0, 0. Hexadecimal value is #af0000.
	 */
	BRIGHT_RED("Bright_Red", "124", "#af0000", new int[] {175, 0, 0}),
	/**
	 * Colorizes text in bright turquoise. Rgb value is 0, 255, 215. Hexadecimal value is #00ffd7.
	 */
	BRIGHT_TURQUOISE("Bright_Turquoise", "50", "#00ffd7", new int[] {0, 255, 215}),
	/**
	 * Colorizes text in brown. Rgb value is 135, 95, 0. Hexadecimal value is #875f00.
	 */
	BROWN("Brown", "94", "#875f00", new int[] {135, 95, 0}),
	/**
	 * Colorizes text in buddha gold. Rgb value is 175, 175, 00. Hexadecimal value is #afaf00.
	 */
	BUDDHA_GOLD("Buddha_Gold", "142", "#afaf00", new int[] {175, 175, 0}),
	/**
	 * Colorizes text in camarone. Rgb value is 0, 95, 0. Hexadecimal value is #005f00.
	 */
	CAMARONE("Camarone", "22", "#005f00", new int[] {0, 95, 0}),
	/**
	 * Colorizes text in can can. Rgb value is 215, 135, 175. Hexadecimal value is #d787af.
	 */
	CAN_CAN("Can_Can", "175", "#d787af", new int[] {215, 135, 175}),
	/**
	 * Colorizes text in canary. Rgb value is 215, 255, 95. Hexadecimal value is #d7ff5f.
	 */
	CANARY("Canary", "191", "#d7ff5f", new int[] {215, 255, 95}),
	/**
	 * Colorizes text in caramel. Rgb value is 255, 215, 175. Hexadecimal value is #ffd7af.
	 */
	CARAMEL("Caramel", "223", "#ffd7af", new int[] {255, 215, 175}),
	/**
	 * Colorizes text in caribbean green. Rgb value is 0, 215, 135. Hexadecimal value is #00d787.
	 */
	CARIBBEAN_GREEN("Caribbean_Green", "42", "#00d787", new int[] {0, 215, 135}),
	/**
	 * Colorizes text in cerulean. Rgb value is 0, 175, 215. Hexadecimal value is #00afd7.
	 */
	CERULEAN("Cerulean", "38", "#00afd7", new int[] {0, 175, 215}),
	/**
	 * Colorizes text in charteuse. Rgb value is 135, 255, 0. Hexadecimal value is #87ff00.
	 */
	CHARTEUSE("Charteuse", "118", "#87ff00", new int[] {135, 255, 0}),
	/**
	 * Colorizes text in charteuse yellow. Rgb value is 215, 255, 0. Hexadecimal value is #d7ff00.
	 */
	CHARTEUSE_YELLOW("Charteuse_Yellow", "190", "#d7ff00", new int[] {215, 255, 0}),
	/**
	 * Colorizes text in chelsea cucumber. Rgb value is 135, 175, 95. Hexadecimal value is #87af5f.
	 */
	CHELSEA_CUCUMBER("Chelsea_Cucumber", "107", "#87af5f", new int[] {135, 175, 95}),
	/**
	 * Colorizes text in chetwood blue. Rgb value is 135, 135, 215. Hexadecimal value is #8787d7.
	 */
	CHETWOOD_BLUE("Chetwood_Blue", "104", "#8787d7", new int[] {135, 135, 215}),
	/**
	 * Colorizes text in clam shell. Rgb value is 215, 175, 175. Hexadecimal value is #d7afaf.
	 */
	CLAM_SHELL("Clam_Shell", "181", "#d7afaf", new int[] {215, 175, 175}),
	/**
	 * Colorizes text in clay creek. Rgb value is 135, 135, 95. Hexadecimal value is #87875f.
	 */
	CLAY_CREEK("Clay_Creek", "101", "#87875f", new int[] {135, 135, 95}),
	/**
	 * Colorizes text in cod gray. Rgb value is 18, 18, 18. Hexadecimal value is #121212.
	 */
	COD_GRAY("Cod_Gray", "233", "#121212", new int[] {18, 18, 18}),
	/**
	 * Colorizes text in comet. Rgb value is 95, 95, 135. Hexadecimal value is #5f5f87.
	 */
	COMET("Comet", "60", "#5f5f87", new int[] {95, 95, 135}),
	/**
	 * Colorizes text in conifer. Rgb value is 175, 215, 95. Hexadecimal value is #afd75f.
	 */
	CONIFER("Conifer", "149", "#afd75f", new int[] {175, 215, 95}),
	/**
	 * Colorizes text in copper rose. Rgb value is 135, 95, 95. Hexadecimal value is #875f5f.
	 */
	COPPER_ROSE("Copper_Rose", "95", "#875f5f", new int[] {135, 95, 95}),
	/**
	 * Colorizes text in copperfield. Rgb value is 215, 135, 95. Hexadecimal value is #d7875f.
	 */
	COPPERFIELD("Copperfield", "173", "#d7875f", new int[] {215, 135, 95}),
	/**
	 * Colorizes text in corn. Rgb value is 215, 215, 0. Hexadecimal value is #d7d700.
	 */
	CORN("Corn", "184", "#d7d700", new int[] {215, 215, 0}),
	/**
	 * Colorizes text in cornflower blue. Rgb value is 95, 95, 255. Hexadecimal value is #5f5fff.
	 */
	CORNFLOWER_BLUE("Cornflower_Blue", "63", "#5f5fff", new int[] {95, 95, 255}),
	/**
	 * Colorizes text in cosmos. Rgb value is 255, 215, 215. Hexadecimal value is #ffd7d7.
	 */
	COSMOS("Cosmos", "224", "#ffd7d7", new int[] {255, 215, 215}),
	/**
	 * Colorizes text in cotton candy. Rgb value is 255, 175, 215. Hexadecimal value is #ffafd7.
	 */
	COTTON_CANDY("Cotton_Candy", "218", "#ffafd7", new int[] {255, 175, 215}),
	/**
	 * Colorizes text in cranberry. Rgb value is 215, 95, 135. Hexadecimal value is #d75f87.
	 */
	CRANBERRY("Cranberry", "168", "#d75f87", new int[] {215, 95, 135}),
	/**
	 * Colorizes text in cumulus. Rgb value is 255, 255, 215. Hexadecimal value is #ffffd7.
	 */
	CUMULUS("Cumulus", "230", "#ffffd7", new int[] {255, 255, 215}),
	/**
	 * Colorizes text in cyan. Rgb value is 0, 255, 255. Hexadecimal value is #00ffff.
	 */
	CYAN("Cyan", "14", "#00ffff", new int[] {0, 255, 255}),
	/**
	 * Colorizes text in dandelion. Rgb value is 255, 215, 95. Hexadecimal value is #ffd75f.
	 */
	DANDELION("Dandelion", "221", "#ffd75f", new int[] {255, 215, 95}),
	/**
	 * Colorizes text in dark blue. Rgb value is 0, 0, 175. Hexadecimal value is #0000af.
	 */
	DARK_BLUE("Dark_Blue", "19", "#0000af", new int[] {0, 0, 175}),
	/**
	 * Colorizes text in deco. Rgb value is 215, 215, 135. Hexadecimal value is #d7d787.
	 */
	DECO("Deco", "186", "#d7d787", new int[] {215, 215, 135}),
	/**
	 * Colorizes text in deep cerulean. Rgb value is 0, 135, 175. Hexadecimal value is #0087af.
	 */
	DEEP_CERULEAN("Deep_Cerulean", "31", "#0087af", new int[] {0, 135, 175}),
	/**
	 * Colorizes text in deep sea. Rgb value is 0, 135, 95. Hexadecimal value is #00875f.
	 */
	DEEP_SEA("Deep_Sea", "29", "#00875f", new int[] {0, 135, 95}),
	/**
	 * Colorizes text in deluge. Rgb value is 135, 95, 175. Hexadecimal value is #875faf.
	 */
	DELUGE("Deluge", "97", "#875faf", new int[] {135, 95, 175}),
	/**
	 * Colorizes text in dolly. Rgb value is 255, 255, 135. Hexadecimal value is #ffff87.
	 */
	DOLLY("Dolly", "228", "#ffff87", new int[] {255, 255, 135}),
	/**
	 * Colorizes text in dove gray. Rgb value is 108, 108, 108. Hexadecimal value is #6c6c6c.
	 */
	DOVE_GRAY("Dove_Gray", "242", "#6c6c6c", new int[] {108, 108, 108}),
	/**
	 * Colorizes text in downy. Rgb value is 95, 215, 175. Hexadecimal value is #5fd7af.
	 */
	DOWNY("Downy", "79", "#5fd7af", new int[] {95, 215, 175}),
	/**
	 * Colorizes text in dusty gray. Rgb value is  148, 148, 148. Hexadecimal value is #949494.
	 */
	DUSTY_GRAY("Dusty_Gray", "246", "#949494", new int[] { 148, 148, 148}),
	/**
	 * Colorizes text in electric violet. Rgb value is 175, 0, 215. Hexadecimal value is #af00d7.
	 */
	ELECTRIC_VIOLET("Electric_Violet", "128", "#af00d7", new int[] {175, 0, 215}),
	/**
	 * Colorizes text in endeavour. Rgb value is 0, 95, 175. Hexadecimal value is #005faf.
	 */
	ENDEAVOUR("Endeavour", "25", "#005faf", new int[] {0, 95, 175}),
	/**
	 * Colorizes text in feijoa. Rgb value is 135, 215, 135. Hexadecimal value is #87d787.
	 */
	FEIJOA("Feijoa", "114", "#87d787", new int[] {135, 215, 135}),
	/**
	 * Colorizes text in fern. Rgb value is 95, 175, 95. Hexadecimal value is #5faf5f.
	 */
	FERN("Fern", "71", "#5faf5f", new int[] {95, 175, 95}),
	/**
	 * Colorizes text in flirt. Rgb value is 175, 0, 95. Hexadecimal value is #af005f.
	 */
	FLIRT("Flirt", "125", "#af005f", new int[] {175, 0, 95}),
	/**
	 * Colorizes text in flush orange. Rgb value is 255, 135, 0. Hexadecimal value is #ff8700.
	 */
	FLUSH_ORANGE("Flush_Orange", "208", "#ff8700", new int[] {255, 135, 0}),
	/**
	 * Colorizes text in fog. Rgb value is 215, 215, 255. Hexadecimal value is #d7d7ff.
	 */
	FOG("Fog", "189", "#d7d7ff", new int[] {215, 215, 255}),
	/**
	 * Colorizes text in french pass. Rgb value is 175, 255, 255. Hexadecimal value is #afffff.
	 */
	FRENCH_PASS("French_Pass", "159", "#afffff", new int[] {175, 255, 255}),
	/**
	 * Colorizes text in fresh eggplant. Rgb value is 128, 0, 128. Hexadecimal value is #800080.
	 */
	FRESH_EGGPLANT("Fresh_Eggplant", "5", "#800080", new int[] {128, 0, 128}),
	/**
	 * Colorizes text in fuchsia pink. Rgb value is 175, 95, 175. Hexadecimal value is #af5faf.
	 */
	FUCHSIA_PINK("Fuchsia_Pink", "133", "#af5faf", new int[] {175, 95, 175}),
	/**
	 * Colorizes text in gallery. Rgb value is 238, 238, 238. Hexadecimal value is #eeeeee.
	 */
	GALLERY("Gallery", "255", "#eeeeee", new int[] {238, 238, 238}),
	/**
	 * Colorizes text in glade green. Rgb value is 95, 135, 95. Hexadecimal value is #5f875f.
	 */
	GLADE_GREEN("Glade_Green", "65", "#5f875f", new int[] {95, 135, 95}),
	/**
	 * Colorizes text in gold. Rgb value is 255, 215, 0. Hexadecimal value is #ffd700.
	 */
	GOLD("Gold", "220", "#ffd700", new int[] {255, 215, 0}),
	/**
	 * Colorizes text in grandis. Rgb value is 255, 215, 135. Hexadecimal value is #ffd787.
	 */
	GRANDIS("Grandis", "222", "#ffd787", new int[] {255, 215, 135}),
	/**
	 * Colorizes text in gray. Rgb value is 128, 128, 128. Hexadecimal value is #808080.
	 */
	GRAY("Gray", "8", "#808080", new int[] {128, 128, 128}),
	/**
	 * Colorizes text in green. Rgb value is 0, 255, 0. Hexadecimal value is #00ff00.
	 */
	GREEN("Green", "10", "#00ff00", new int[] {0,255, 0}),
	/**
	 * Colorizes text in green mist. Rgb value is 215, 215, 175. Hexadecimal value is #d7d7af.
	 */
	GREEN_MIST("Green_Mist", "187", "#d7d7af", new int[] {215, 215, 175}),
	/**
	 * Colorizes text in green yellow. Rgb value is 175, 255, 95. Hexadecimal value is #afff5f.
	 */
	GREEN_YELLOW("Green_Yellow", "155", "#afff5f", new int[] {175, 255, 95}),
	/**
	 * Colorizes text in guardsman red. Rgb value is 215, 0, 0. Hexadecimal value is #d70000.
	 */
	GUARDSMAN_RED("Guardsman_Red", "160", "#d70000", new int[] {215, 0, 0}),
	/**
	 * Colorizes text in gulf stream. Rgb value is 135, 175, 175. Hexadecimal value is #87afaf.
	 */
	GULF_STREAM("Gulf_Stream", "109", "#87afaf", new int[] {135, 175, 175}),
	/**
	 * Colorizes text in havelock blue. Rgb value is 95, 135, 215. Hexadecimal value is #5f87d7.
	 */
	HAVELOCK_BLUE("Havelock_Blue", "68", "#5f87d7", new int[] {95, 135, 215}),
	/**
	 * Colorizes text in heliotrope. Rgb value is 175, 95, 255. Hexadecimal value is #af5fff.
	 */
	HELIOTROPE("Heliotrope", "135", "#af5fff", new int[] {175, 95, 255}),
	/**
	 * Colorizes text in hillary. Rgb value is 175, 175, 135. Hexadecimal value is #afaf87.
	 */
	HILLARY("Hillary", "144", "#afaf87", new int[] {175, 175, 135}),
	/**
	 * Colorizes text in hippie blue. Rgb value is 95, 135, 175. Hexadecimal value is #5f87af.
	 */
	HIPPIE_BLUE("Hippie_Blue", "67", "#5f87af", new int[] {95, 135, 175}),
	/**
	 * Colorizes text in hit pink. Rgb value is 255, 175, 135. Hexadecimal value is #ffaf87.
	 */
	HIT_PINK("Hit_Pink", "216", "#ffaf87", new int[] {255, 175, 135}),
	/**
	 * Colorizes text in hollywood cerise. Rgb value is 215, 0, 175. Hexadecimal value is #d700af.
	 */
	HOLLYWOOD_CERISE("Hollywood_Cerise", "163", "#d700af", new int[] {215, 0, 175}),
	/**
	 * Colorizes text in honeysuckle. Rgb value is 215, 255, 135. Hexadecimal value is #d7ff87.
	 */
	HONEYSUCKLE("Honeysuckle", "192", "#d7ff87", new int[] {215, 255, 135}),
	/**
	 * Colorizes text in hopbush. Rgb value is 215, 95, 175. Hexadecimal value is #d75faf.
	 */
	HOPBUSH("Hopbush", "169", "#d75faf", new int[] {215, 95, 175}),
	/**
	 * Colorizes text in hot pink. Rgb value is 255, 95, 175. Hexadecimal value is #ff5faf.
	 */
	HOT_PINK("Hot_Pink", "205", "#ff5faf", new int[] {255, 95, 175}),
	/**
	 * Colorizes text in indigo. Rgb value is 95, 95, 215. Hexadecimal value is #5f5fd7.
	 */
	INDIGO("Indigo", "62", "#5f5fd7", new int[] {95, 95, 215}),
	/**
	 * Colorizes text in jade. Rgb value is 0, 175, 95. Hexadecimal value is #00af5f.
	 */
	JADE("Jade", "35", "#00af5f", new int[] {0, 175, 95}),
	/**
	 * Colorizes text in japanese laurel. Rgb value is 0, 128, 0. Hexadecimal value is #008000.
	 */
	JAPANESE_LAUREL("Japanese_Laurel", "2", "#008000", new int[] {0, 128, 0}),
	/**
	 * Colorizes text in jungle mist. Rgb value is 175, 215, 215. Hexadecimal value is #afd7d7.
	 */
	JUNGLE_MIST("Jungle_Mist", "152", "#afd7d7", new int[] {175, 215, 215}),
	/**
	 * Colorizes text in juniper. Rgb value is 95, 135, 135. Hexadecimal value is #5f8787.
	 */
	JUNIPER("Juniper", "66", "#5f8787", new int[] {95, 135, 135}),
	/**
	 * Colorizes text in laser lemon. Rgb value is 255, 255, 95. Hexadecimal value is #ffff5f.
	 */
	LASER_LEMON("Laser_Lemon", "227", "#ffff5f", new int[] {255, 255, 95}),
	/**
	 * Colorizes text in lavender. Rgb value is 175, 135, 215. Hexadecimal value is #af87d7.
	 */
	LAVENDER("Lavender", "140", "#af87d7", new int[] {175, 135, 215}),
	/**
	 * Colorizes text in lavender rose. Rgb value is  255, 175, 255. Hexadecimal value is #ffafff.
	 */
	LAVENDER_ROSE("Lavender_Rose", "219", "#ffafff", new int[] { 255, 175, 255}),
	/**
	 * Colorizes text in light orchid. Rgb value is 215, 135, 215. Hexadecimal value is #d787d7.
	 */
	LIGHT_ORCHID("Light_Orchid", "176", "#d787d7", new int[] {215, 135, 215}),
	/**
	 * Colorizes text in lime. Rgb value is 175, 255, 0. Hexadecimal value is #afff00.
	 */
	LIME("Lime", "154", "#afff00", new int[] {175, 255, 0}),
	/**
	 * Colorizes text in limeade. Rgb value is 95, 175, 0. Hexadecimal value is #5faf00.
	 */
	LIMEADE("Limeade", "70", "#5faf00", new int[] {95, 175, 0}),
	/**
	 * Colorizes text in lochmara. Rgb value is 0, 135, 215. Hexadecimal value is #0087d7.
	 */
	LOCHMARA("Lochmara", "32", "#0087d7", new int[] {0, 135, 215}),
	/**
	 * Colorizes text in magenta. Rgb value is 255, 0, 255. Hexadecimal value is #ff00ff.
	 */
	MAGENTA("Magenta", "13", "#ff00ff", new int[] {255, 0, 255}),
	/**
	 * Colorizes text in malachite. Rgb value is 0, 215, 95. Hexadecimal value is #00d75f.
	 */
	MALACHITE("Malachite", "41", "#00d75f", new int[] {0, 215, 95}),
	/**
	 * Colorizes text in malibu. Rgb value is 95, 175, 255. Hexadecimal value is #5fafff.
	 */
	MALIBU("Malibu", "75", "#5fafff", new int[] {95, 175, 255}),
	/**
	 * Colorizes text in mango tango. Rgb value is 215, 135, 0. Hexadecimal value is #d78700.
	 */
	MANGO_TANGO("Mango_Tango", "172", "#d78700", new int[] {215, 135, 0}),
	/**
	 * Colorizes text in maroon. Rgb value is 128, 0, 0. Hexadecimal value is #800000.
	 */
	MAROON("Maroon", "1", "#800000", new int[] {128, 0, 0}),
	/**
	 * Colorizes text in matrix. Rgb value is 175, 95, 95. Hexadecimal value is #af5f5f.
	 */
	MATRIX("Matrix", "131", "#af5f5f", new int[] {175, 95, 95}),
	/**
	 * Colorizes text in mauve. Rgb value is 215, 175, 255. Hexadecimal value is #d7afff.
	 */
	MAUVE("Mauve", "183", "#d7afff", new int[] {215, 175, 255}),
	/**
	 * Colorizes text in medium purple. Rgb value is 175, 95, 215. Hexadecimal value is #af5fd7.
	 */
	MEDIUM_PURPLE("Medium_Purple", "134", "#af5fd7", new int[] {175, 95, 215}),
	/**
	 * Colorizes text in melrose. Rgb value is 175, 175, 255. Hexadecimal value is #afafff.
	 */
	MELROSE("Melrose", "147", "#afafff", new int[] {175, 175, 255}),
	/**
	 * Colorizes text in mercury. Rgb value is 228, 228, 228. Hexadecimal value is #e4e4e4.
	 */
	MERCURY("Mercury", "254", "#e4e4e4", new int[] {228, 228, 228}),
	/**
	 * Colorizes text in mine shaft. Rgb value is 48, 48, 48. Hexadecimal value is #303030.
	 */
	MINE_SHAFT("Mine_Shaft", "236", "#303030", new int[] {48, 48, 48}),
	/**
	 * Colorizes text in mint green. Rgb value is 175, 255, 135. Hexadecimal value is #afff87.
	 */
	MINT_GREEN("Mint_Green", "156", "#afff87", new int[] {175, 255, 135}),
	/**
	 * Colorizes text in muesli. Rgb value is 175, 135, 95. Hexadecimal value is #af875f.
	 */
	MUESLI("Muesli", "137", "#af875f", new int[] {175, 135, 95}),
	/**
	 * Colorizes text in my pink. Rgb value is 215, 135, 135. Hexadecimal value is #d78787.
	 */
	MY_PINK("MY_Pink", "174", "#d78787", new int[] {215, 135, 135}),
	/**
	 * Colorizes text in navy blue. Rgb value is 0, 0, 128. Hexadecimal value is #000080.
	 */
	NAVY_BLUE("Navy_Blue", "4", "#000080", new int[] {0, 0, 128}),
	/**
	 * Colorizes text in olive. Rgb value is 128, 128, 0. Hexadecimal value is #808000.
	 */
	OLIVE("Olive", "3", "#808000", new int[] {128, 128, 0}),
	/**
	 * Colorizes text in olive green. Rgb value is 175, 175, 95. Hexadecimal value is #afaf5f.
	 */
	OLIVE_GREEN("Olive_Green", "143", "#afaf5f", new int[] {175, 175, 95}),
	/**
	 * Colorizes text in orchid. Rgb value is 215, 95, 215. Hexadecimal value is #d75fd7.
	 */
	ORCHID("Orchid", "170", "#d75fd7", new int[] {215, 95, 215}),
	/**
	 * Colorizes text in orient. Rgb value is 0, 95, 135. Hexadecimal value is #005f87.
	 */
	ORIENT("Orient", "24", "#005f87", new int[] {0, 95, 135}),
	/**
	 * Colorizes text in oyster bay. Rgb value is 215, 255, 255. Hexadecimal value is #d7ffff.
	 */
	OYSTER_BAY("Oyster_Bay", "195", "#d7ffff", new int[] {215, 255, 255}),
	/**
	 * Colorizes text in pastel green. Rgb value is 95, 215, 95. Hexadecimal value is #5fd75f.
	 */
	PASTEL_GREEN("Pastel_Green", "77", "#5fd75f", new int[] {95, 215, 95}),
	/**
	 * Colorizes text in persian green. Rgb value is 0, 175, 135. Hexadecimal value is #00af87.
	 */
	PERSIAN_GREEN("Persian_Green", "36", "#00af87", new int[] {0, 175, 135}),
	/**
	 * Colorizes text in pharlap. Rgb value is 175, 135, 135. Hexadecimal value is #af8787.
	 */
	PHARLAP("Pharlap", "138", "#af8787", new int[] {175, 135, 135}),
	/**
	 * Colorizes text in pigment indigo. Rgb value is 95, 0, 135. Hexadecimal value is #5f0087.
	 */
	PIGMENT_INDIGO("Pigment_Indigo", "54", "#5f0087", new int[] {95, 0, 135}),
	/**
	 * Colorizes text in pink flamingo. Rgb value is 255, 95, 255. Hexadecimal value is #ff5fff.
	 */
	PINK_FLAMINGO("Pink_Flamingo", "207", "#ff5fff", new int[] {255, 95, 255}),
	/**
	 * Colorizes text in pink lace. Rgb value is 255, 215, 255. Hexadecimal value is #ffd7ff.
	 */
	PINK_LACE("Pink_Lace", "225", "#ffd7ff", new int[] {255, 215, 255}),
	/**
	 * Colorizes text in pink salmon. Rgb value is 255, 135, 175. Hexadecimal value is #ff87af.
	 */
	PINK_SALMON("Pink_Salmon", "211", "#ff87af", new int[] {255, 135, 175}),
	/**
	 * Colorizes text in pirate gold. Rgb value is 175, 135, 0. Hexadecimal value is #af8700.
	 */
	PIRATE_GOLD("Pirate_Gold", "136", "#af8700", new int[] {175, 135, 0}),
	/**
	 * Colorizes text in pistachio. Rgb value is 135, 215, 0. Hexadecimal value is #87d700.
	 */
	PISTACHIO("Pistachio", "112", "#87d700", new int[] {135, 215, 0}),
	/**
	 * Colorizes text in pixie green. Rgb value is 175, 215, 175. Hexadecimal value is #afd7af.
	 */
	PIXIE_GREEN("Pixie_Green", "151", "#afd7af", new int[] {175, 215, 175}),
	/**
	 * Colorizes text in polo blue. Rgb value is 135, 175, 215. Hexadecimal value is #87afd7.
	 */
	POLO_BLUE("Polo_Blue", "110", "#87afd7", new int[] {135, 175, 215}),
	/**
	 * Colorizes text in pompadour. Rgb value is 95, 0, 95. Hexadecimal value is #5f005f.
	 */
	POMPADOUR("Pompadour", "53", "#5f005f", new int[] {95, 0, 95}),
	/**
	 * Colorizes text in portafino. Rgb value is 255, 255, 175. Hexadecimal value is #ffffaf.
	 */
	PORTAFINO("Portafino", "229", "#ffffaf", new int[] {255, 255, 175}),
	/**
	 * Colorizes text in purple. Rgb value is 95, 0, 175. Hexadecimal value is #5f00af.
	 */
	PURPLE("Purple", "55", "#5f00af", new int[] {95, 0, 175}),
	/**
	 * Colorizes text in purple pizzazz. Rgb value is 255, 0, 215. Hexadecimal value is #ff00d7.
	 */
	PURPLE_PIZZAZZ("Purple_Pizzazz", "200", "#ff00d7", new int[] {255, 0, 215}),
	/**
	 * Colorizes text in razzmatazz. Rgb value is 215, 0, 95. Hexadecimal value is #d7005f.
	 */
	RAZZMATAZZ("Razzmatazz", "161", "#d7005f", new int[] {215, 0, 95}),
	/**
	 * Colorizes text in red. Rgb value is 255, 0, 0. Hexadecimal value is #ff0000.
	 */
	RED("Red", "9", "#ff0000", new int[] {255, 0, 0}),
	/**
	 * Colorizes text in reef. Rgb value is 215, 255, 175. Hexadecimal value is #d7ffaf.
	 */
	REEF("Reef", "193", "#d7ffaf", new int[] {215, 255, 175}),
	/**
	 * Colorizes text in rio grande. Rgb value is 175, 215, 0. Hexadecimal value is #afd700.
	 */
	RIO_GRANDE("rio_Grande", "148", "#afd700", new int[] {175, 215, 0}),
	/**
	 * Colorizes text in robins egg blue. Rgb value is 0, 215, 215. Hexadecimal value is #00d7d7.
	 */
	ROBINS_EGG_BLUE("Robins_Egg_Blue", "44", "#00d7d7", new int[] {0, 215, 215}),
	/**
	 * Colorizes text in roman. Rgb value is 215, 95, 95. Hexadecimal value is #d75f5f.
	 */
	ROMAN("Roman", "167", "#d75f5f", new int[] {215, 95, 95}),
	/**
	 * Colorizes text in rose. Rgb value is 255, 0, 95. Hexadecimal value is #ff005f.
	 */
	ROSE("Rose", "197", "#ff005f", new int[] {255, 0, 95}),
	/**
	 * Colorizes text in rose of sharon. Rgb value is 175, 95, 0. Hexadecimal value is #af5f00.
	 */
	ROSE_OF_SHARON("Rose_Of_Sharon", "130", "#af5f00", new int[] {175, 95, 0}),
	/**
	 * Colorizes text in rosewood. Rgb value is 95, 0, 0. Hexadecimal value is #5f0000.
	 */
	ROSEWOOD("Rosewood", "52", "#5f0000", new int[] {95, 0, 0}),
	/**
	 * Colorizes text in salmon. Rgb value is 255, 135, 95. Hexadecimal value is #ff875f.
	 */
	SALMON("Salmon", "209", "#ff875f", new int[] {255, 135, 95}),
	/**
	 * Colorizes text in scampi. Rgb value is 95, 95, 1750. Hexadecimal value is #5f5faf.
	 */
	SCAMPI("Scampi", "61", "#5f5faf", new int[] {95, 95, 175}),
	/**
	 * Colorizes text in science blue. Rgb value is 0, 95, 215. Hexadecimal value is #005fd7.
	 */
	SCIENCE_BLUE("Science_Blue", "26", "#005fd7", new int[] {0, 95, 215}),
	/**
	 * Colorizes text in scorpion. Rgb value is 88, 88, 88. Hexadecimal value is #585858.
	 */
	SCORPION("Scorpion", "240", "#585858", new int[] {88, 88, 88}),
	/**
	 * Colorizes text in screamin green. Rgb value is 95, 255, 95. Hexadecimal value is #5fff5f.
	 */
	SCREAMIN_GREEN("Screamin_Green", "83", "#5fff5f", new int[] {95, 255, 95}),
	/**
	 * Colorizes text in shakespeare. Rgb value is 95, 175, 215. Hexadecimal value is #5fafd7.
	 */
	SHAKESPEARE("Shakespeare", "74", "#5fafd7", new int[] {95, 175, 215}),
	/**
	 * Colorizes text in silver. Rgb value is 192, 192, 192. Hexadecimal value is #c0c0c0.
	 */
	SILVER("Silver", "7", "#c0c0c0", new int[] {192, 192, 192}),
	/**
	 * Colorizes text in silver chalice. Rgb value is 168, 168, 168. Hexadecimal value is #a8a8a8.
	 */
	SILVER_CHALICE("Silver_Chalice", "248", "#a8a8a8", new int[] {168, 168, 168}),
	/**
	 * Colorizes text in silver tree. Rgb value is 95, 175, 135. Hexadecimal value is #5faf87.
	 */
	SILVER_TREE("Silver_Tree", "72", "#5faf87", new int[] {95, 175, 135}),
	/**
	 * Colorizes text in snowy mint. Rgb value is 215, 255, 215. Hexadecimal value is #d7ffd7.
	 */
	SNOWY_MINT("Snowy_Mint", "194", "#d7ffd7", new int[] {215, 255, 215}),
	/**
	 * Colorizes text in spring green. Rgb value is 0, 255, 135. Hexadecimal value is #00ff87.
	 */
	SPRING_GREEN("Spring_Green", "48", "#00ff87", new int[] {0, 255, 135}),
	/**
	 * Colorizes text in stratos. Rgb value is 0, 0, 95. Hexadecimal value is #00005f.
	 */
	STRATOS("Stratos", "17", "#00005f", new int[] {0, 0, 95}),
	/**
	 * Colorizes text in strikemaster. Rgb value is 135, 95, 135. Hexadecimal value is #875f87.
	 */
	STRIKEMASTER("Strikemaster", "96", "#875f87", new int[] {135, 95, 135}),
	/**
	 * Colorizes text in sundown. Rgb value is 255, 175, 175. Hexadecimal value is #ffafaf.
	 */
	SUNDOWN("Sundown", "217", "#ffafaf", new int[] {255, 175, 175}),
	/**
	 * Colorizes text in tacha. Rgb value is 215, 175, 95. Hexadecimal value is #d7af5f.
	 */
	TACHA("Tacha", "179", "#d7af5f", new int[] {215, 175, 95}),
	/**
	 * Colorizes text in tan. Rgb value is 215, 175, 135. Hexadecimal value is #d7af87.
	 */
	TAN("Tan", "180", "#d7af87", new int[] {215, 175, 135}),
	/**
	 * Colorizes text in tapestry. Rgb value is 175, 95, 135. Hexadecimal value is #af5f87.
	 */
	TAPESTRY("Tapestry", "132", "#af5f87", new int[] {175, 95, 135}),
	/**
	 * Colorizes text in teal. Rgb value is 0, 128, 128. Hexadecimal value is #008080.
	 */
	TEAL("Teal", "6", "#008080", new int[] {0, 128, 128}),
	/**
	 * Colorizes text in tenn. Rgb value is 215, 95, 0. Hexadecimal value is #d75f00.
	 */
	TENN("Tenn", "166", "#d75f00", new int[] {215, 95, 0}),
	/**
	 * Colorizes text in texas rose. Rgb value is 255, 175, 95. Hexadecimal value is #ffaf5f.
	 */
	TEXAS_ROSE("Texas_Rose", "215", "#ffaf5f", new int[] {255, 175, 95}),
	/**
	 * Colorizes text in thistle. Rgb value is 215, 175, 215. Hexadecimal value is #d7afd7.
	 */
	THISTLE("Thistle", "182", "#d7afd7", new int[] {215, 175, 215}),
	/**
	 * Colorizes text in tradewind. Rgb value is 95, 175, 175. Hexadecimal value is #5fafaf.
	 */
	TRADEWIND("Tradewind", "73", "#5fafaf", new int[] {95, 175, 175}),
	/**
	 * Colorizes text in tundora. Rgb value is 78, 78, 78. Hexadecimal value is #4e4e4e.
	 */
	TUNDORA("Tundora", "239", "#4e4e4e", new int[] {78, 78, 78}),
	/**
	 * Colorizes text in verdun green. Rgb value is 95, 95, 0. Hexadecimal value is #5f5f00.
	 */
	VERDUN_GREEN("Verdun_Green", "58", "#5f5f00", new int[] {95, 95, 0}),
	/**
	 * Colorizes text in viking. Rgb value is 95, 215, 215. Hexadecimal value is #5fd7d7.
	 */
	VIKING("Viking", "80", "#5fd7d7", new int[] {95, 215, 215}),
	/**
	 * Colorizes text in vista blue. Rgb value is 0, 255, 0. Hexadecimal value is #87d7af.
	 */
	VISTA_BLUE("Vista_Blue", "115", "#87d7af", new int[] {135, 215, 175}),
	/**
	 * Colorizes text in vivid tangerine. Rgb value is 255, 135, 135. Hexadecimal value is #ff8787.
	 */
	VIVID_TANGERINE("Vivid_Tangerine", "210", "#ff8787", new int[] {255, 135, 135}),
	/**
	 * Colorizes text in white. Rgb value is 255, 255, 255. Hexadecimal value is #ffffff.
	 */
	WHITE("White", "15", "#ffffff", new int[] {255, 255, 255}),
	/**
	 * Colorizes text in wild blue yonder. Rgb value is 135, 135, 175. Hexadecimal value is #8787af.
	 */
	WILD_BLUE_YONDER("Wild_Blue_Yonder", "103", "#8787af", new int[] {135, 135, 175}),
	/**
	 * Colorizes text in wild watermelon. Rgb value is 255, 95, 135. Hexadecimal value is #ff5f87.
	 */
	WILD_WATERMELON("Wild_Watermelon", "204", "#ff5f87", new int[] {255, 95, 135}),
	/**
	 * Colorizes text in wistful. Rgb value is 175, 175, 215. Hexadecimal value is #afafd7.
	 */
	WISTFUL("Wistful", "146", "#afafd7", new int[] {175, 175, 215}),
	/**
	 * Colorizes text in yellow. Rgb value is 255, 255, 0. Hexadecimal value is #ffff00.
	 */
	YELLOW("Yellow", "11", "#ffff00", new int[] {255, 255, 0}),
	/**
	 * Colorizes text in yellow sea. Rgb value is 255, 175, 0. Hexadecimal value is #ffaf00.
	 */
	YELLOW_SEA("Yellow_Sea", "214", "#ffaf00", new int[] {255, 175, 0});
	
	
	private final String name;
	private final String colorCode;
	private final String hexCode;
	private final int[] rgb;
	
	Color8b(String name, String colorCode, String hexCode, int[] rgb) {
		this.name = name;
		this.colorCode = colorCode;
		this.hexCode = hexCode;
		this.rgb = rgb;
	}
	
	/**
	 * Returns the name of the color associated with a given {@link Color8b}.
	 * @return name as String.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color8b}.
	 * @return colorCode as ANSI Escape Sequence String part.
	 */
	public String getColorCode() {
		return this.colorCode;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color8b} as Hexadecimal value.
	 * @return colorCode as Hex.
	 */
	public String getHexCode() {
		return this.hexCode;
	}
	
	/**
	 * Returns the RGB representation of the colorCode associated with a given {@link Color8b} as int[].
	 * @return colorCode as int[].
	 */
	public int[] getRGB() {
		return this.rgb;
	}
	
	/**
	 * Returns the String representation of the ANSI Escape value associated with a given {@link Color8b}.
	 * @return colorCode as full ANSI Escape Sequence String.
	 */
	@Override
	public String toString() {
		return "\u001b[38;5;"+this.colorCode+"m";
	}
}
