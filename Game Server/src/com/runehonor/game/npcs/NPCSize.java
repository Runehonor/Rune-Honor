package com.runehonor.game.npcs;

/**
 * NPC Sizes.
 * @author Primadude.
 */
public class NPCSize {
        
        /**
         * Gets the size of the specified NPC.
         * @param npcType The type of the NPC.
         * @return The NPC size.
         */
        public static int getNPCSize(int npcType) {
                int NPC_TYPE = 0;
                int NPC_SIZE = 1;
                for (int i = 0; i < NPC_SIZES.length; i++) {
                        if (npcType == NPC_SIZES[i][NPC_TYPE]) {
                                return NPC_SIZES[i][NPC_SIZE];
                        }
                }
                return 1;
        }

        /**
         * NPC Sizes.
         * {NPC TYPE, SIZE}.
         */
        private static final int[][] NPC_SIZES = {
                {49, 2}, {50, 5}, {51, 2}, {52, 2}, {53, 4}, {54, 4}, {55, 4}, {69, 2}, {78, 2}, {79, 2}, {80, 2},
                {81, 2}, {82, 2}, {83, 3}, {84, 3}, {85, 2}, {86, 2}, {87, 2}, {88, 2}, {89, 2}, {95, 2}, {96, 2},
                {97, 2}, {105, 2}, {106, 2}, {107, 2}, {108, 2}, {110, 2}, {111, 2}, {112, 2}, {113, 2}, {114, 2},
                {115, 2}, {116, 2}, {117, 2}, {130, 3}, {133, 2}, {135, 3}, {136, 2}, {137, 2}, {138, 2}, {141, 2},
                {142, 2}, {143, 2}, {144, 2}, {146, 2}, {147, 2}, {148, 2}, {149, 2}, {150, 2}, {269, 2}, {270, 2},
                {271, 2}, {374, 2}, {397, 2}, {446, 2}, {667, 3}, {677, 3}, {742, 4}, {752, 2}, {839, 2}, {840, 2},
                {852, 2}, {853, 2}, {854, 2}, {855, 2}, {856, 2}, {857, 2}, {858, 2}, {859, 2}, {860, 2}, {861, 2},
                {862, 2}, {863, 2}, {864, 2}, {865, 2}, {866, 2}, {867, 2}, {868, 2}, {869, 2}, {870, 2}, {871, 2},
                {873, 2}, {874, 2}, {875, 2}, {876, 2}, {879, 2}, {880, 2}, {899, 2}, {909, 3}, {911, 3}, {934, 3},
                {939, 2}, {941, 4}, {950, 2}, {955, 2}, {978, 2}, {986, 2}, {987, 2}, {991, 2}, {997, 3}, {998, 3},
                {999, 3}, {1000, 3}, {1003, 2}, {1005, 2}, {1010, 2}, {1047, 2}, {1052, 2}, {1053, 2}, {1069, 2},
                {1095, 2}, {1096, 2}, {1097, 2}, {1098, 2}, {1099, 2}, {1100, 2}, {1115, 2}, {1116, 2}, {1117, 2},
                {1125, 3}, {1126, 2}, {1127, 2}, {1128, 2}, {1129, 2}, {1135, 2}, {1136, 2}, {1137, 2}, {1139, 2},
                {1151, 2}, {1153, 2}, {1154, 3}, {1155, 4}, {1156, 2}, {1157, 4}, {1158, 5}, {1159, 5}, {1160, 5},
                {1172, 3}, {1173, 3}, {1179, 2}, {1180, 2}, {1181, 2}, {1195, 2}, {1196, 2}, {1197, 2}, {1198, 2},
                {1213, 2}, {1222, 2}, {1224, 2}, {1326, 2}, {1328, 2}, {1329, 2}, {1330, 2}, {1335, 2}, {1341, 2},
                {1342, 2}, {1343, 2}, {1344, 2}, {1345, 2}, {1346, 2}, {1347, 2}, {1348, 3}, {1349, 3}, {1350, 3},
                {1351, 3}, {1352, 3}, {1353, 3}, {1354, 3}, {1355, 3}, {1356, 3}, {1373, 2}, {1431, 2}, {1432, 2},
                {1438, 2}, {1459, 2}, {1460, 2}, {1461, 2}, {1462, 2}, {1472, 3}, {1505, 2}, {1506, 2}, {1507, 2},
                {1508, 2}, {1509, 2}, {1516, 3}, {1521, 2}, {1522, 2}, {1542, 3}, {1555, 2}, {1556, 2}, {1558, 2},
                {1559, 2}, {1575, 2}, {1578, 3}, {1580, 2}, {1581, 2}, {1582, 2}, {1583, 2}, {1584, 2}, {1585, 2},
                {1586, 2}, {1587, 2}, {1588, 2}, {1589, 2}, {1590, 4}, {1591, 4}, {1592, 4}, {1600, 2}, {1601, 2},
                {1602, 2}, {1603, 2}, {1604, 2}, {1605, 2}, {1606, 2}, {1607, 2}, {1608, 3}, {1609, 3}, {1610, 3},
                {1611, 3}, {1612, 2}, {1616, 2}, {1617, 2}, {1618, 2}, {1619, 2}, {1620, 2}, {1621, 3}, {1627, 2},
                {1628, 2}, {1631, 2}, {1632, 2}, {1653, 2}, {1654, 2}, {1655, 2}, {1656, 2}, {1657, 2}, {1676, 2},
                {1677, 2}, {1681, 2}, {1689, 3}, {1691, 2}, {1693, 2}, {1719, 2}, {1720, 2}, {1721, 2}, {1722, 2},
                {1723, 2}, {1728, 2}, {1730, 2}, {1731, 2}, {1732, 2}, {1733, 2}, {1734, 2}, {1735, 2}, {1736, 2},
                {1737, 2}, {1738, 2}, {1739, 3}, {1740, 3}, {1741, 2}, {1742, 3}, {1743, 3}, {1744, 3}, {1745, 2},
                {1746, 2}, {1747, 3}, {1748, 3}, {1750, 2}, {1766, 2}, {1767, 2}, {1768, 2}, {1778, 2}, {1779, 2},
                {1780, 2}, {1781, 2}, {1782, 2}, {1783, 2}, {1784, 2}, {1785, 2}, {1786, 2}, {1787, 2}, {1792, 2},
                {1802, 2}, {1803, 2}, {1804, 2}, {1811, 2}, {1812, 2}, {1813, 2}, {1821, 2}, {1828, 2}, {1873, 2},
                {1943, 2}, {1944, 2}, {1945, 2}, {1946, 2}, {1951, 2}, {1952, 2}, {1953, 2}, {1954, 2}, {1955, 2},
                {1956, 2}, {1970, 2}, {1971, 2}, {1990, 2}, {1993, 2}, {1996, 2}, {1998, 2}, {1999, 2}, {2000, 2},
                {2022, 3}, {2033, 2}, {2038, 2}, {2039, 2}, {2040, 2}, {2041, 2}, {2042, 2}, {2043, 2}, {2044, 2},
                {2045, 2}, {2046, 2}, {2047, 2}, {2048, 2}, {2049, 2}, {2050, 2}, {2051, 2}, {2052, 2}, {2053, 2},
                {2054, 2}, {2055, 2}, {2056, 2}, {2057, 2}, {2060, 3}, {2063, 2}, {2064, 2}, {2065, 2}, {2240, 2},
                {2252, 2}, {2254, 2}, {2255, 2}, {2289, 2}, {2317, 2}, {2417, 2}, {2418, 2}, {2419, 2}, {2434, 2},
                {2452, 2}, {2453, 2}, {2482, 2}, {2534, 3}, {2554, 3}, {2555, 3}, {2556, 3}, {2557, 3}, {2558, 3},
                {2559, 3}, {2560, 3}, {2561, 3}, {2562, 3}, {2563, 3}, {2629, 2}, {2630, 2}, {2631, 3}, {2632, 3},
                {2637, 2}, {2640, 2}, {2641, 3}, {2642, 5}, {2644, 2}, {2651, 2}, {2722, 2}, {2723, 2}, {2736, 2},
                {2737, 2}, {2739, 3}, {2740, 3}, {2741, 4}, {2742, 4}, {2743, 5}, {2744, 5}, {2745, 5}, {2783, 3},
                {2801, 2}, {2803, 3}, {2804, 2}, {2805, 2}, {2806, 2}, {2809, 2}, {2810, 2}, {2811, 2}, {2812, 2},
                {2813, 2}, {2814, 2}, {2815, 2}, {2849, 2}, {2850, 2}, {2880, 2}, {2881, 3}, {2882, 3}, {2883, 3},
                {2885, 2}, {2886, 2}, {2889, 2}, {2890, 2}, {2919, 3}, {2920, 3}, {2921, 3}, {3051, 2}, {3052, 2},
                {3053, 2}, {3054, 2}, {3055, 2}, {3056, 2}, {3058, 2}, {3063, 2}, {3064, 2}, {3066, 2}, {3068, 3},
                {3069, 3}, {3070, 3}, {3071, 3}, {3072, 2}, {3076, 2}, {3077, 2}, {3100, 2}, {3101, 2}, {3103, 2},
                {3124, 2}, {3125, 2}, {3129, 2}, {3130, 2}, {3132, 2}, {3133, 2}, {3134, 2}, {3135, 2}, {3140, 3},
                {3154, 2}, {3200, 3}, {3203, 3}, {3301, 3}, {3309, 2}, {3332, 5}, {3333, 5}, {3334, 5}, {3337, 3},
                {3338, 3}, {3339, 4}, {3340, 3}, {3347, 2}, {3376, 2}, {3398, 2}, {3419, 2}, {3420, 2}, {3421, 2},
                {3423, 2}, {3443, 2}, {3444, 2}, {3445, 3}, {3446, 2}, {3447, 2}, {3448, 3}, {3463, 2}, {3464, 2},
                {3466, 2}, {3467, 2}, {3468, 2}, {3469, 5}, {3470, 5}, {3471, 5}, {3472, 5}, {3476, 3}, {3477, 3},
                {3484, 2}, {3493, 3}, {3494, 5}, {3497, 3}, {3498, 3}, {3499, 3}, {3500, 3}, {3501, 3}, {3502, 3},
                {3519, 2}, {3530, 3}, {3556, 2}, {3558, 2}, {3585, 2}, {3586, 2}, {3587, 2}, {3588, 2}, {3589, 3},
                {3590, 3}, {3591, 3}, {3592, 3}, {3593, 3}, {3594, 2}, {3599, 3}, {3600, 4}, {3601, 5}, {3602, 3},
                {3603, 3}, {3604, 4}, {3605, 5}, {3606, 2}, {3607, 2}, {3608, 2}, {3609, 2}, {3610, 2}, {3611, 2},
                {3612, 3}, {3613, 3}, {3614, 3}, {3636, 2}, {3637, 4}, {3645, 2}, {3646, 2}, {3647, 2}, {3649, 2},
                {3650, 2}, {3651, 2}, {3652, 2}, {3653, 2}, {3654, 2}, {3655, 2}, {3656, 2}, {3657, 2}, {3658, 3},
                {3659, 3}, {3660, 3}, {3661, 2}, {3662, 2}, {3664, 2}, {3665, 2}, {3666, 2}, {3667, 2}, {3668, 2},
                {3669, 2}, {3670, 2}, {3675, 2}, {3676, 2}, {3681, 3}, {3772, 2}, {3773, 2}, {3774, 2}, {3775, 2},
                {3776, 2}, {6142, 3}, {6143, 3}, {6144, 3}, {6145, 3}, {3808, 3}, {3819, 3}, {3835, 5}, {3836, 5}
        };

}