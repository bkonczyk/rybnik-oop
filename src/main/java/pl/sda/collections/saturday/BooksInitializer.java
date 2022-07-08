package pl.sda.collections.saturday;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BooksInitializer {

    public static List<Book> initializeBooks() {
        return new ArrayList<>(
                List.of(
                        new Book(1L, "um G", BigDecimal.valueOf(82.05d), 1462, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(2L, "fMXLUQppsr", BigDecimal.valueOf(77.14d), 387, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(3L, "WYHdHA", BigDecimal.valueOf(24.62d), 746, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(4L, "HLsBYt", BigDecimal.valueOf(53.18d), 1258, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(5L, "kxWRvptd", BigDecimal.valueOf(92.91d), 1192, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(6L, "CRnc", BigDecimal.valueOf(86.05d), 1849, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(7L, "hkm", BigDecimal.valueOf(4.93d), 1558, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(8L, "bcRw", BigDecimal.valueOf(86.17d), 1654, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(9L, "UmEvhRedG", BigDecimal.valueOf(43.16d), 1786, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(10L, "zQsJoyY", BigDecimal.valueOf(52.33d), 1958, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(11L, "TnnV", BigDecimal.valueOf(12.91d), 1046, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(12L, "ndoJl", BigDecimal.valueOf(66.29d), 965, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(13L, "NgbFHlBXVO", BigDecimal.valueOf(9.55d), 942, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(14L, "AKWDZZRCnYvV", BigDecimal.valueOf(26.09d), 684, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(15L, "MxNu", BigDecimal.valueOf(41d), 889, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(16L, "dyyxQlVvLac", BigDecimal.valueOf(3.59d), 401, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(17L, "QdhXOeAVQ", BigDecimal.valueOf(33.79d), 348, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(18L, "jtmci", BigDecimal.valueOf(25.65d), 503, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(19L, "hpBA", BigDecimal.valueOf(11.61d), 1221, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(20L, "TearBFke", BigDecimal.valueOf(81.46d), 1219, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(21L, "woGHpsavhC", BigDecimal.valueOf(73.43d), 770, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(22L, "nvJpyMv", BigDecimal.valueOf(78.74d), 1861, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(23L, "SzyxKly", BigDecimal.valueOf(66.08d), 661, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(24L, "pRtGTORWhmsU", BigDecimal.valueOf(28.13d), 1120, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(25L, "nSuRNNbl", BigDecimal.valueOf(56.69d), 493, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(26L, "xPzDRiigr", BigDecimal.valueOf(45.52d), 17, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(27L, "OMJSAxjfXL", BigDecimal.valueOf(74.43d), 683, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(28L, "mktEYIpExFz", BigDecimal.valueOf(61.02d), 1050, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(29L, "hiYobg", BigDecimal.valueOf(60.54d), 996, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(30L, "eyxQqhjDU", BigDecimal.valueOf(88.53d), 1589, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(31L, "QfbVBT", BigDecimal.valueOf(72.87d), 472, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(32L, "ZxVhIbn", BigDecimal.valueOf(48.37d), 1200, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(33L, "AeHr", BigDecimal.valueOf(45.44d), 1565, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(34L, "aOlxZuMhX", BigDecimal.valueOf(64.47d), 620, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(35L, "XBdLQfz", BigDecimal.valueOf(6.06d), 1236, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(36L, "XDioFIeB", BigDecimal.valueOf(45.3d), 1833, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(37L, "mPUHjghf", BigDecimal.valueOf(46.71d), 1751, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(38L, "xvVbztZeG", BigDecimal.valueOf(94.61d), 220, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(39L, "IefVaIyT", BigDecimal.valueOf(9.26d), 1307, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(40L, "GZHqu", BigDecimal.valueOf(64.76d), 1883, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(41L, "ZUymwEaT il", BigDecimal.valueOf(66.38d), 825, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(42L, "ANMEKMoR", BigDecimal.valueOf(20.36d), 320, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(43L, "wVzMOgAu", BigDecimal.valueOf(47.94d), 764, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(44L, "AOdXNI", BigDecimal.valueOf(40.95d), 724, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(45L, "cijgmnYwCHN", BigDecimal.valueOf(7.71d), 1841, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(46L, "iuVN VfgDAnS", BigDecimal.valueOf(11.96d), 1894, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(47L, "RCEYGf", BigDecimal.valueOf(41.38d), 178, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(48L, "eQFHhEZapVB", BigDecimal.valueOf(7.11d), 1946, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(49L, "JZhlagSF", BigDecimal.valueOf(29.16d), 1477, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(50L, "lWTVyxAwax", BigDecimal.valueOf(12.85d), 1050, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(51L, "wClwyW", BigDecimal.valueOf(26.03d), 531, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(52L, "KGnfhGyoSqg", BigDecimal.valueOf(1.22d), 659, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(53L, "FiAnvTz", BigDecimal.valueOf(98.17d), 32, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(54L, "ZWnOq", BigDecimal.valueOf(9.08d), 595, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(55L, "VMlFjl", BigDecimal.valueOf(55.92d), 1419, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(56L, "zMwBn", BigDecimal.valueOf(81.22d), 1925, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(57L, "yQxpcv", BigDecimal.valueOf(70.25d), 1381, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(58L, "Cp XHMnuJ", BigDecimal.valueOf(64.29d), 1849, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(59L, "DKxsOURVqTx", BigDecimal.valueOf(86.69d), 1204, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(60L, "sWUmQojwkU", BigDecimal.valueOf(91.83d), 429, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(61L, "JXpn UflXFRm", BigDecimal.valueOf(61.64d), 1873, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(62L, "jwqxd", BigDecimal.valueOf(42.67d), 1442, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(63L, "VqQUG", BigDecimal.valueOf(58.09d), 1655, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(64L, "BbAJczDjtsZQ", BigDecimal.valueOf(13.79d), 18, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(65L, "PIoBzAwWi L", BigDecimal.valueOf(68.08d), 1555, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(66L, "whjkbHZdMYDs", BigDecimal.valueOf(42.25d), 1455, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(67L, "ncEjlZUeofX", BigDecimal.valueOf(17.81d), 676, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(68L, "rOpcNKuiw", BigDecimal.valueOf(78.93d), 590, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(69L, "IpYwGeSUcz", BigDecimal.valueOf(83.46d), 1968, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(70L, "BSAzNJtvJb", BigDecimal.valueOf(58.22d), 152, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(71L, "Miunj", BigDecimal.valueOf(42.96d), 375, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(72L, "qjGrT", BigDecimal.valueOf(37.04d), 829, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(73L, "FgJyWrmUPVzy", BigDecimal.valueOf(54.94d), 176, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(74L, "GzAHJVnWYT", BigDecimal.valueOf(88.41d), 162, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(75L, "GkhSHOhj", BigDecimal.valueOf(92.58d), 547, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(76L, "haTRsgoDxP", BigDecimal.valueOf(72.84d), 526, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(77L, "l SGDYXh", BigDecimal.valueOf(76.94d), 1589, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(78L, "qOFXwyMlUzQB", BigDecimal.valueOf(46.27d), 1496, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(79L, "PKKlrJpIcnZF", BigDecimal.valueOf(14.35d), 1619, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(80L, "glsFTffSfoZ", BigDecimal.valueOf(42.58d), 1753, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(81L, "LNNKlsyFAU", BigDecimal.valueOf(28.76d), 1884, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(82L, "BPVxxCvxz", BigDecimal.valueOf(91.76d), 1371, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(83L, "NkaBr dB", BigDecimal.valueOf(93.08d), 1031, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(84L, "rXdBZdZYLJm", BigDecimal.valueOf(58.11d), 58, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(85L, "JPoIpme", BigDecimal.valueOf(22.77d), 667, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(86L, "srEMec", BigDecimal.valueOf(6.83d), 948, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(87L, "diXuqUa", BigDecimal.valueOf(4.67d), 1677, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(88L, "qNsnGpv", BigDecimal.valueOf(60.69d), 502, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(89L, "Bpfes", BigDecimal.valueOf(57.8d), 1098, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(90L, "OpJLFmTkRC", BigDecimal.valueOf(87.32d), 1513, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(91L, "TkGTZlooM", BigDecimal.valueOf(32.34d), 1483, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(92L, "jOuMxYzG", BigDecimal.valueOf(17.61d), 1574, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(93L, "oxrjJnRbIQn", BigDecimal.valueOf(12.18d), 618, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(94L, "TWWuoBIw", BigDecimal.valueOf(92.89d), 1959, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(95L, "hdoA", BigDecimal.valueOf(32.99d), 189, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(96L, "WWrCRqPOA", BigDecimal.valueOf(70.49d), 1445, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(97L, "NmSKjbrx", BigDecimal.valueOf(19.23d), 1888, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(98L, "sdJhOt", BigDecimal.valueOf(51.27d), 1381, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(99L, "dIGUIYoNWBJv", BigDecimal.valueOf(19.54d), 1863, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(100L, "wgRjwWKH ", BigDecimal.valueOf(8.37d), 883, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(101L, "hwcfFqA", BigDecimal.valueOf(64.33d), 530, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(102L, "xqBG", BigDecimal.valueOf(59.71d), 1746, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(103L, "wTmiX", BigDecimal.valueOf(95.46d), 654, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(104L, "uB UjEojl", BigDecimal.valueOf(93.8d), 785, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(105L, "p gOKtEO", BigDecimal.valueOf(49.21d), 936, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(106L, "atywxHo", BigDecimal.valueOf(6.65d), 626, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(107L, "JZFxPNSHpa", BigDecimal.valueOf(38.1d), 1905, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(108L, "yPuJZ", BigDecimal.valueOf(33.38d), 341, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(109L, "ULxhBVs", BigDecimal.valueOf(88.02d), 532, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(110L, "kbpDaYB", BigDecimal.valueOf(46.78d), 1964, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(111L, "h QeCAx", BigDecimal.valueOf(14.99d), 1816, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(112L, "IFuBFqtEl", BigDecimal.valueOf(16.55d), 1589, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(113L, "mAbTL", BigDecimal.valueOf(44.68d), 1107, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(114L, "svEn", BigDecimal.valueOf(7.69d), 631, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(115L, "ZYfzsRtFV", BigDecimal.valueOf(85.63d), 1886, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(116L, "JqIUGxVlwVp", BigDecimal.valueOf(37.83d), 1956, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(117L, "pedpA", BigDecimal.valueOf(44.61d), 1237, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(118L, "KabhVPnLX", BigDecimal.valueOf(36.94d), 789, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(119L, "YvgzQXsJJYQ", BigDecimal.valueOf(6.35d), 1414, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(120L, "KhtspX", BigDecimal.valueOf(72.67d), 1446, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(121L, "HhSRWhP", BigDecimal.valueOf(41.05d), 383, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(122L, "JHBw Tfbz", BigDecimal.valueOf(26.18d), 1360, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(123L, "BGOhaKi", BigDecimal.valueOf(42.65d), 107, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(124L, "NnzuTwxZLdnF", BigDecimal.valueOf(57.91d), 1521, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(125L, "MHfPlzjvt", BigDecimal.valueOf(22.72d), 1603, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(126L, "TFAGGLC", BigDecimal.valueOf(59.85d), 51, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(127L, " kajMpB", BigDecimal.valueOf(91.55d), 932, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(128L, "RxEtaBjNgFBh", BigDecimal.valueOf(40.41d), 567, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(129L, "coExaolewlM", BigDecimal.valueOf(32.17d), 681, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(130L, "pVvFccBxN", BigDecimal.valueOf(90.25d), 1923, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(131L, "oWarmL", BigDecimal.valueOf(9.84d), 1311, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(132L, "xyOwOLGLnvm", BigDecimal.valueOf(66.11d), 1770, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(133L, "fNoBL", BigDecimal.valueOf(5.9d), 883, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(134L, "zvMTicCKpyFs", BigDecimal.valueOf(15.6d), 474, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(135L, "jSVjo", BigDecimal.valueOf(23.59d), 820, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(136L, "ZtXgoQtBf", BigDecimal.valueOf(1.64d), 562, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(137L, "yANqqypLoFkn", BigDecimal.valueOf(59.56d), 1427, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(138L, "PdcuDFKMsXQ", BigDecimal.valueOf(66.78d), 1377, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(139L, "RuCbQAZVw", BigDecimal.valueOf(53.28d), 294, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(140L, "lgXAttv", BigDecimal.valueOf(40.7d), 1825, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(141L, "NPmhvuWzn", BigDecimal.valueOf(2.71d), 1167, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(142L, "SfqNw", BigDecimal.valueOf(1.09d), 1867, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(143L, "shYitnxf", BigDecimal.valueOf(51.15d), 1926, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(144L, "BeZtLrAkaIZ", BigDecimal.valueOf(59d), 1718, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(145L, "HqfMwlLGJvlU", BigDecimal.valueOf(12.48d), 1731, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(146L, "ZAJQHubyzLmy", BigDecimal.valueOf(88.94d), 1526, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(147L, "FCeh", BigDecimal.valueOf(33.03d), 17, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(148L, "SioKTZmhgWF", BigDecimal.valueOf(69.16d), 1215, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(149L, "RbaPJ", BigDecimal.valueOf(43.22d), 1329, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(150L, "te TwD", BigDecimal.valueOf(77.37d), 269, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(151L, "tXceO", BigDecimal.valueOf(16.35d), 1016, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(152L, "IdbLrxnABH", BigDecimal.valueOf(45.83d), 1244, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(153L, "ouTQNoqgFije", BigDecimal.valueOf(12.63d), 1696, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(154L, "VcXJSAzx", BigDecimal.valueOf(18.23d), 625, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(155L, "FwewWIAQn", BigDecimal.valueOf(24.18d), 891, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(156L, "KNgppqWftT", BigDecimal.valueOf(23.57d), 1061, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(157L, "dnfSiaEXd", BigDecimal.valueOf(46.05d), 960, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(158L, "ZpEx", BigDecimal.valueOf(34.53d), 1660, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(159L, "wQNsYg", BigDecimal.valueOf(95.86d), 321, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(160L, "uDeI", BigDecimal.valueOf(89.27d), 996, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(161L, "hYsEKtuEobx", BigDecimal.valueOf(14.07d), 1123, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(162L, "SvTbFxBSDP", BigDecimal.valueOf(60.32d), 1347, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(163L, "wSHfJDYZC", BigDecimal.valueOf(87.29d), 1962, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(164L, "zIKLEjbp", BigDecimal.valueOf(77.74d), 931, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(165L, "lWE haMx", BigDecimal.valueOf(5.24d), 609, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(166L, "sBNfbyZyfKF", BigDecimal.valueOf(27.53d), 17, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(167L, "Qrlrb", BigDecimal.valueOf(35.76d), 1996, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(168L, "qWTZk", BigDecimal.valueOf(25.3d), 837, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(169L, "kLwaMNsw", BigDecimal.valueOf(63.25d), 1063, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(170L, "QbSKZi", BigDecimal.valueOf(13.43d), 1840, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(171L, "FGbz", BigDecimal.valueOf(26.46d), 1017, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(172L, "bdYMY uII", BigDecimal.valueOf(94.02d), 1283, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(173L, "XLlxTOD", BigDecimal.valueOf(70.23d), 1258, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(174L, "yrhAImE", BigDecimal.valueOf(71.67d), 339, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(175L, "ExeKS", BigDecimal.valueOf(66.1d), 1142, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(176L, "wAcaaFTHj", BigDecimal.valueOf(20.06d), 802, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(177L, "chSTf", BigDecimal.valueOf(50.11d), 329, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(178L, "tdLZGlbV", BigDecimal.valueOf(31.44d), 448, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(179L, "KxnDL", BigDecimal.valueOf(88.32d), 227, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(180L, "QLfMmUWOgyY", BigDecimal.valueOf(40.88d), 1760, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(181L, "QFbmSJGXDVan", BigDecimal.valueOf(49.42d), 725, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(182L, "cwTdduUKfIk", BigDecimal.valueOf(38.43d), 2001, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(183L, "Fhdc", BigDecimal.valueOf(69.16d), 754, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(184L, "qVvPAZ", BigDecimal.valueOf(23.37d), 1911, Genre.THRILLER, AuthorsInitializer.genRandomAuthors()),
                        new Book(185L, "uTcXZ svzZE", BigDecimal.valueOf(81.55d), 298, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(186L, "QXZrMWgOPo", BigDecimal.valueOf(23.63d), 667, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(187L, "dnyvQqELxSuJ", BigDecimal.valueOf(32.04d), 949, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(188L, "GxlKEFuti", BigDecimal.valueOf(89.95d), 1885, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(189L, "tPoztsT", BigDecimal.valueOf(88.48d), 1890, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(190L, "VPZKMtUwyLiw", BigDecimal.valueOf(62.48d), 1068, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(191L, "mggtVvUBtG", BigDecimal.valueOf(49.01d), 653, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(192L, "xLAbSI", BigDecimal.valueOf(83.56d), 652, Genre.FICTION, AuthorsInitializer.genRandomAuthors()),
                        new Book(193L, "sytFMsLMMe", BigDecimal.valueOf(55.76d), 1893, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(194L, "hNtoZ", BigDecimal.valueOf(62.17d), 718, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(195L, "VMpyAx", BigDecimal.valueOf(69.17d), 297, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(196L, "hKcsEIwR", BigDecimal.valueOf(71.3d), 630, Genre.DRAMA, AuthorsInitializer.genRandomAuthors()),
                        new Book(197L, "AEDgnaJke", BigDecimal.valueOf(40.93d), 784, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(198L, "JErhJUL", BigDecimal.valueOf(60.72d), 1269, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()),
                        new Book(199L, "RVLRIYs", BigDecimal.valueOf(83.51d), 768, Genre.HORROR, AuthorsInitializer.genRandomAuthors()),
                        new Book(200L, "wjqSJVh", BigDecimal.valueOf(3.37d), 65, Genre.HORROR, AuthorsInitializer.genRandomAuthors())
                ));
    }
}
