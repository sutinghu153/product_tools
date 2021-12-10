package operation.enums;

import com.hnup.common.lang.enums.IEnumInt;
import com.hnup.common.lang.exception.DeclareException;
import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 *  计算符枚举类
 * @data2021/11/10,14:55
 * @authorsutinghu
 */
public enum  ComputeEnum implements IEnumInt {

	/**
	 *  加
	 */
	ADD(1,"+"),
	/**
	 *  减
	 */
	REDUCE(2,"-"),
	/**
	 *  乘
	 */
	RIDE(3,"*"),
	/**
	 *  除
	 */
	DIVIDE(4,"/");

	private Integer id;

	private String desc;


	ComputeEnum(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	@Override
	public int getIntValue() {
		return this.id;
	}

	public String getDesc() {
		return this.desc;
	}

	public static Map<Integer, String> dataTypeEnumMap(){
		Map<Integer, String> map = new HashMap<>();
		for (ComputeEnum computeEnum: values()) {
			map.put(computeEnum.id,computeEnum.desc);
		}
		return map;
	}

	public static String getDesc(Integer id){
		String desc = null;
		Map<Integer, String> map = dataTypeEnumMap();
		desc = map.get(id);

		return desc;
	}

}
