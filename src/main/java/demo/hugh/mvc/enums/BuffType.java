package demo.hugh.mvc.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Think
 *
 */
public enum BuffType {

	ATK("1", "攻击",""),
	ATK_ADD("2","攻击加成","%"),
	CRI("3","暴击","%"),
	CRI_ADD("4","暴击伤害","%"),
	DEF("5","防御",""),
	DEF_ADD("6","防御加成","%"),
	LIFE("7","生命",""),
	LIFE_ADD("8","生命加成","%"),
	SPD("9","速度",""),
	HIT("10","效果命中","%"),
	RES("11", "效果抵抗","%");
	
	private String code; //
	private String name; //
	private String suffix;

	private static Map<String, String> typeMap = null;

	public static Map<String, String> getTypeMap() {
		if (typeMap == null) {
			typeMap = new HashMap<>();
			for (BuffType type : BuffType.values()) {
				typeMap.put(type.getCode(), type.getName());
			}
		}
		return typeMap;
	}

	private BuffType(String code, String name, String suffix) {
		this.code = code;
		this.name = name;
		this.setSuffix(suffix);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
