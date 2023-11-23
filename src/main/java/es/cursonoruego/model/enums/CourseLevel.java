package es.cursonoruego.model.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public enum CourseLevel {

	LEVEL1(LevelCefr.A1),
	LEVEL2(LevelCefr.A1),
	LEVEL3(LevelCefr.A1),
	LEVEL4(LevelCefr.A1),
	LEVEL5(LevelCefr.A1),
	LEVEL6(LevelCefr.A1),
	LEVEL7(LevelCefr.A1),
	LEVEL8(LevelCefr.A1),
	LEVEL9(LevelCefr.A1),
	LEVEL10(LevelCefr.A1),
	LEVEL11(LevelCefr.A1),
	LEVEL12(LevelCefr.A1),
	LEVEL13(LevelCefr.A1),
	LEVEL14(LevelCefr.A1),
	LEVEL15(LevelCefr.A1),
	LEVEL16(LevelCefr.A1),
	LEVEL17(LevelCefr.A1),
	LEVEL18(LevelCefr.A1),
	LEVEL19(LevelCefr.A1),
	LEVEL20(LevelCefr.A1),
	LEVEL21(LevelCefr.A1),
	LEVEL22(LevelCefr.A1),
	LEVEL23(LevelCefr.A1),
	LEVEL24(LevelCefr.A2),
	LEVEL25(LevelCefr.A2),
	LEVEL26(LevelCefr.A2),
	LEVEL27(LevelCefr.A2),
	LEVEL28(LevelCefr.A2),
	LEVEL29(LevelCefr.A2),
	LEVEL30(LevelCefr.A2),
	LEVEL31(LevelCefr.A2),
	LEVEL32(LevelCefr.A2),
	LEVEL33(LevelCefr.A2),
	LEVEL34(LevelCefr.A2),
	LEVEL35(LevelCefr.A2),
	LEVEL36(LevelCefr.A2),
	LEVEL37(LevelCefr.A2),
	LEVEL38(LevelCefr.A2),
	LEVEL39(LevelCefr.A2),
	LEVEL40(LevelCefr.A2),
	LEVEL41(LevelCefr.A2),
	LEVEL42(LevelCefr.A2),
	LEVEL43(LevelCefr.A2),
	LEVEL44(LevelCefr.B1),
	LEVEL45(LevelCefr.B1),
	LEVEL46(LevelCefr.B1),
	LEVEL47(LevelCefr.B1),
	LEVEL48(LevelCefr.B1),
	LEVEL49(LevelCefr.B1),
	LEVEL50(LevelCefr.B1),
	LEVEL51(LevelCefr.B1),
	LEVEL52(LevelCefr.B1),
	LEVEL53(LevelCefr.B1),
	LEVEL54(LevelCefr.B1),
	LEVEL55(LevelCefr.B1),
	LEVEL56(LevelCefr.B1),
	LEVEL57(LevelCefr.B1),
	LEVEL58(LevelCefr.B1),
	LEVEL59(LevelCefr.B1),
	LEVEL60(LevelCefr.B1),
	LEVEL61(LevelCefr.B1),
	LEVEL62(LevelCefr.B1),
	LEVEL63(LevelCefr.B1),
	LEVEL64(LevelCefr.B2),
	LEVEL65(LevelCefr.B2),
	LEVEL66(LevelCefr.B2),
	LEVEL67(LevelCefr.B2),
	LEVEL68(LevelCefr.B2),
	LEVEL69(LevelCefr.B2),
	LEVEL70(LevelCefr.B2),
	LEVEL71(LevelCefr.B2),
	LEVEL72(LevelCefr.B2),
	LEVEL73(LevelCefr.B2),
	LEVEL74(LevelCefr.B2),
	LEVEL75(LevelCefr.B2),
	LEVEL76(LevelCefr.B2),
	LEVEL77(LevelCefr.B2),
	LEVEL78(LevelCefr.B2),
	LEVEL79(LevelCefr.B2),
	LEVEL80(LevelCefr.B2),
	LEVEL81(LevelCefr.B2),
	LEVEL82(LevelCefr.B2),
	LEVEL83(LevelCefr.B2);
	
	private LevelCefr levelCefr;

	public static CourseLevel[] values(LevelCefr levelCefr) {
		List<CourseLevel> courseLevelList = new ArrayList<CourseLevel>();
		for (CourseLevel courseLevel : values()) {
			if (courseLevel.levelCefr == levelCefr) {
				courseLevelList.add(courseLevel);
			}
		}
		return courseLevelList.toArray(new CourseLevel[courseLevelList.size()]);
	}

	private CourseLevel(LevelCefr levelCefr) {
		this.levelCefr = levelCefr;
	}

	public LevelCefr getLevelCefr() {
		return levelCefr;
	}
	
	public CourseLevel getNextLevel() {
		boolean isCurrentLevel = false;
		for (CourseLevel courseLevel : values()) {
			if (isCurrentLevel) {
				return courseLevel;
			}
			if (courseLevel == this) {
				isCurrentLevel = true;
			}
		}
		return null;
	}
	
	public int getLevelNumber() {
		return Integer.parseInt(toString().substring(5));
	}
}
