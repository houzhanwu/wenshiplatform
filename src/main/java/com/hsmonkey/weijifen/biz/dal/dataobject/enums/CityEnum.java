/**
 * 
 */
package com.hsmonkey.weijifen.biz.dal.dataobject.enums;

import com.hsmonkey.weijifen.util.StringsUtil;

/**
 * @author zcy
 * 
 * @date 2016年11月15日
 * 
 * @time 上午11:12:30
 */
public enum CityEnum {
	city_0(0, "全部"), city_1(1, "北京"), city_2(2, "天津"), city_3(3, "石家庄"), city_4(4, "唐山"), city_5(5, "秦皇岛"), city_6(6, "邯郸"), city_7(7, "邢台"), city_8(8, "保定"), city_9(9, "张家口"), city_10(10, "承德"), city_11(
			11, "沧州"), city_12(12, "廊坊"), city_13(13, "衡水"), city_14(14, "太原"), city_15(15, "大同"), city_16(16, "阳泉"), city_17(17, "长治"), city_18(18, "晋城"), city_19(19, "朔州"), city_20(20, "晋中"), city_21(
			21, "运城"), city_22(22, "忻州"), city_23(23, "临汾"), city_24(24, "吕梁"), city_25(25, "呼和浩特"), city_26(26, "包头"), city_27(27, "乌海"), city_28(28, "赤峰"), city_29(29, "通辽"), city_30(30, "鄂尔多斯"), city_31(
			31, "呼伦贝尔"), city_32(32, "巴彦淖尔"), city_33(33, "乌兰察布"), city_34(34, "兴安盟"), city_35(35, "锡林郭勒盟"), city_36(36, "阿拉善盟"), city_37(37, "沈阳"), city_38(38, "大连"), city_39(39, "鞍山"), city_40(40,
			"抚顺"), city_41(41, "本溪"), city_42(42, "丹东"), city_43(43, "锦州"), city_44(44, "营口"), city_45(45, "阜新"), city_46(46, "辽阳"), city_47(47, "盘锦"), city_48(48, "铁岭"), city_49(49, "朝阳"), city_50(
			50, "葫芦岛"), city_51(51, "长春"), city_52(52, "吉林"), city_53(53, "四平"), city_54(54, "辽源"), city_55(55, "通化"), city_56(56, "白山"), city_57(57, "松原"), city_58(58, "白城"), city_59(59, "延边"), city_60(
			60, "哈尔滨"), city_61(61, "齐齐哈尔"), city_62(62, "鸡西"), city_63(63, "鹤岗"), city_64(64, "双鸭山"), city_65(65, "大庆"), city_66(66, "伊春"), city_67(67, "佳木斯"), city_68(68, "七台河"), city_69(69, "牡丹江"), city_70(
			70, "黑河"), city_71(71, "绥化"), city_72(72, "大兴安岭地区"), city_73(73, "上海"), city_74(74, "南京"), city_75(75, "无锡"), city_76(76, "徐州"), city_77(77, "常州"), city_78(78, "苏州"), city_79(79, "南通"), city_80(
			80, "连云港"), city_81(81, "淮安"), city_82(82, "盐城"), city_83(83, "扬州"), city_84(84, "镇江"), city_85(85, "泰州"), city_86(86, "宿迁"), city_87(87, "杭州"), city_88(88, "宁波"), city_89(89, "温州"), city_90(
			90, "嘉兴"), city_91(91, "湖州"), city_92(92, "绍兴"), city_93(93, "金华"), city_94(94, "衢州"), city_95(95, "舟山"), city_96(96, "台州"), city_97(97, "丽水"), city_98(98, "合肥"), city_99(99, "芜湖"), city_100(
			100, "蚌埠"), city_101(101, "淮南"), city_102(102, "马鞍山"), city_103(103, "淮北"), city_104(104, "铜陵"), city_105(105, "安庆"), city_106(106, "黄山"), city_107(107, "滁州"), city_108(108, "阜阳"), city_109(
			109, "宿州"), city_110(110, "巢湖"), city_111(111, "六安"), city_112(112, "亳州"), city_113(113, "池州"), city_114(114, "宣城"), city_115(115, "福州"), city_116(116, "厦门"), city_117(117, "莆田"), city_118(
			118, "三明"), city_119(119, "泉州"), city_120(120, "漳州"), city_121(121, "南平"), city_122(122, "龙岩"), city_123(123, "宁德"), city_124(124, "南昌"), city_125(125, "景德镇"), city_126(126, "萍乡"), city_127(
			127, "九江"), city_128(128, "新余"), city_129(129, "鹰潭"), city_130(130, "赣州"), city_131(131, "吉安"), city_132(132, "宜春"), city_133(133, "抚州"), city_134(134, "上饶"), city_135(135, "济南"), city_136(
			136, "青岛"), city_137(137, "淄博"), city_138(138, "枣庄"), city_139(139, "东营"), city_140(140, "烟台"), city_141(141, "潍坊"), city_142(142, "济宁"), city_143(143, "泰安"), city_144(144, "威海"), city_145(
			145, "日照"), city_146(146, "莱芜"), city_147(147, "临沂"), city_148(148, "德州"), city_149(149, "聊城"), city_150(150, "滨州"), city_151(151, "荷泽"), city_152(152, "郑州"), city_153(153, "开封"), city_154(
			154, "洛阳"), city_155(155, "平顶山"), city_156(156, "安阳"), city_157(157, "鹤壁"), city_158(158, "新乡"), city_159(159, "焦作"), city_160(160, "濮阳"), city_161(161, "许昌"), city_162(162, "漯河"), city_163(
			163, "三门峡"), city_164(164, "南阳"), city_165(165, "商丘"), city_166(166, "信阳"), city_167(167, "周口"), city_168(168, "驻马店"), city_169(169, "武汉"), city_170(170, "黄石"), city_171(171, "十堰"), city_172(
			172, "宜昌"), city_173(173, "襄樊"), city_174(174, "鄂州"), city_175(175, "荆门"), city_176(176, "孝感"), city_177(177, "荆州"), city_178(178, "黄冈"), city_179(179, "咸宁"), city_180(180, "随州"), city_181(
			181, "恩施"), city_182(182, "神农架"), city_183(183, "长沙"), city_184(184, "株洲"), city_185(185, "湘潭"), city_186(186, "衡阳"), city_187(187, "邵阳"), city_188(188, "岳阳"), city_189(189, "常德"), city_190(
			190, "张家界"), city_191(191, "益阳"), city_192(192, "郴州"), city_193(193, "永州"), city_194(194, "怀化"), city_195(195, "娄底"), city_196(196, "湘西"), city_197(197, "广州"), city_198(198, "韶关"), city_199(
			199, "深圳"), city_200(200, "珠海"), city_201(201, "汕头"), city_202(202, "佛山"), city_203(203, "江门"), city_204(204, "湛江"), city_205(205, "茂名"), city_206(206, "肇庆"), city_207(207, "惠州"), city_208(
			208, "梅州"), city_209(209, "汕尾"), city_210(210, "河源"), city_211(211, "阳江"), city_212(212, "清远"), city_213(213, "东莞"), city_214(214, "中山"), city_215(215, "潮州"), city_216(216, "揭阳"), city_217(
			217, "云浮"), city_218(218, "南宁"), city_219(219, "柳州"), city_220(220, "桂林"), city_221(221, "梧州"), city_222(222, "北海"), city_223(223, "防城港"), city_224(224, "钦州"), city_225(225, "贵港"), city_226(
			226, "玉林"), city_227(227, "百色"), city_228(228, "贺州"), city_229(229, "河池"), city_230(230, "来宾"), city_231(231, "崇左"), city_232(232, "海口"), city_233(233, "三亚"), city_234(234, "重庆"), city_235(
			235, "成都"), city_236(236, "自贡"), city_237(237, "攀枝花"), city_238(238, "泸州"), city_239(239, "德阳"), city_240(240, "绵阳"), city_241(241, "广元"), city_242(242, "遂宁"), city_243(243, "内江"), city_244(
			244, "乐山"), city_245(245, "南充"), city_246(246, "眉山"), city_247(247, "宜宾"), city_248(248, "广安"), city_249(249, "达州"), city_250(250, "雅安"), city_251(251, "巴中"), city_252(252, "资阳"), city_253(
			253, "阿坝"), city_254(254, "甘孜"), city_255(255, "凉山"), city_256(256, "贵阳"), city_257(257, "六盘水"), city_258(258, "遵义"), city_259(259, "安顺"), city_260(260, "铜仁地区"), city_261(261, "黔西"), city_262(
			262, "毕节地区"), city_263(263, "黔东"), city_264(264, "黔南"), city_265(265, "昆明"), city_266(266, "曲靖"), city_267(267, "玉溪"), city_268(268, "保山"), city_269(269, "昭通"), city_270(270, "丽江"), city_271(
			271, "思茅"), city_272(272, "临沧"), city_273(273, "楚雄"), city_274(274, "红河"), city_275(275, "文山"), city_276(276, "西双版纳"), city_277(277, "大理"), city_278(278, "德宏"), city_279(279, "怒江"), city_280(
			280, "迪庆"), city_281(281, "拉萨"), city_282(282, "昌都地区"), city_283(283, "山南地区"), city_284(284, "日喀则地区"), city_285(285, "那曲地区"), city_286(286, "阿里地区"), city_287(287, "林芝地区"), city_288(288,
			"西安"), city_289(289, "铜川"), city_290(290, "宝鸡"), city_291(291, "咸阳"), city_292(292, "渭南"), city_293(293, "延安"), city_294(294, "汉中"), city_295(295, "榆林"), city_296(296, "安康"), city_297(
			297, "商洛"), city_298(298, "兰州"), city_299(299, "嘉峪关"), city_300(300, "金昌"), city_301(301, "白银"), city_302(302, "天水"), city_303(303, "武威"), city_304(304, "张掖"), city_305(305, "平凉"), city_306(
			306, "酒泉"), city_307(307, "庆阳"), city_308(308, "定西"), city_309(309, "陇南"), city_310(310, "临夏"), city_311(311, "甘南"), city_312(312, "西宁"), city_313(313, "海东地区"), city_314(314, "海北"), city_315(
			315, "黄南"), city_316(316, "海南"), city_317(317, "果洛"), city_318(318, "玉树"), city_319(319, "海西"), city_320(320, "银川"), city_321(321, "石嘴山"), city_322(322, "吴忠"), city_323(323, "固原"), city_324(
			324, "中卫"), city_325(325, "乌鲁木齐"), city_326(326, "克拉玛依"), city_327(327, "吐鲁番地区"), city_328(328, "哈密地区"), city_329(329, "昌吉"), city_330(330, "博尔塔拉"), city_331(331, "巴音郭楞"), city_332(332,
			"阿克苏地区"), city_333(333, "克孜勒苏柯尔克孜"), city_334(334, "喀什地区"), city_335(335, "和田地区"), city_336(336, "伊犁哈萨克"), city_337(337, "塔城地区"), city_338(338, "阿勒泰地区"), city_339(339, "石河子"), city_340(
			340, "阿拉尔"), city_341(341, "图木舒克"), city_342(342, "五家渠"), city_343(343, "香港"), city_344(344, "澳门"), city_345(345, "台湾");
	private int id;
	private String name;

	private CityEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  static String getNameById(int id){
		for (CityEnum tmp : CityEnum.values()) {
			if(id == tmp.getId()){
				return tmp.getName();
			}
		}
		return null;
	}

	public static CityEnum getByName(String city) {
		if(StringsUtil.isBlank(city)){
			return null;
		}
		
		for(CityEnum tmp :CityEnum.values()){
			if(tmp.getName().contains(city)){
				return tmp;
			}
		}
		return null;
	}
	
}