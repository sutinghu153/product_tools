package operation.computes;

import operation.enums.ComputeEnum;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *  四则运算-基本方法
 * @data2021/11/10,15:13
 * @authorsutinghu
 */
public class ComputeBase {

	public static String selectByCode(String code,String a,String b){
		BigDecimal decimalA = new BigDecimal(a);
		BigDecimal decimalB = new BigDecimal(b);
		String result = null;
		if (Objects.equals(code, ComputeEnum.ADD.getDesc())) {
			result = String.valueOf(ComputeBase.addCompute(decimalA,decimalB));
		}
		if (Objects.equals(code, ComputeEnum.REDUCE.getDesc())) {
			result = String.valueOf(ComputeBase.reduceCompute(decimalA,decimalB));
		}
		if (Objects.equals(code, ComputeEnum.RIDE.getDesc())) {
			result = String.valueOf(ComputeBase.rideCompute(decimalA,decimalB));
		}
		if (Objects.equals(code, ComputeEnum.DIVIDE.getDesc())) {
			result = String.valueOf(ComputeBase.divideCompute(decimalA,decimalB));
		}
		return result;
	}

	/**
	 * 功能描述: 将结果输出为小数点后两位
	 * @author sutinghu
	 * @date
	 * @param bg 参数
	 * @return java.math.BigDecimal
	 */
	public static BigDecimal decimal(BigDecimal bg){
		return bg.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 功能描述: 求和
	 * @author sutinghu
	 * @date
	 * @param a
	 * @param b 参数
	 * @return java.math.BigDecimal
	 */
	public static BigDecimal addCompute(BigDecimal a,BigDecimal b){
		return ComputeBase.decimal(a.add(b));
	}

	/**
	 * 功能描述:做差
	 * @author sutinghu
	 * @date
	 * @param a
	 * @param b 参数
	 * @return java.math.BigDecimal
	 */
	public static BigDecimal reduceCompute(BigDecimal a,BigDecimal b){
		return ComputeBase.decimal(a.subtract(b));
	}

	/**
	 * 功能描述:乘法
	 * @author sutinghu
	 * @date
	 * @param a
	 * @param b 参数
	 * @return java.math.BigDecimal
	 */
	public static BigDecimal rideCompute(BigDecimal a,BigDecimal b){
		return ComputeBase.decimal(a.multiply(b));
	}

	/**
	 * 功能描述:除法
	 * @author sutinghu
	 * @date
	 * @param a
	 * @param b 参数
	 * @return java.math.BigDecimal
	 */
	public static BigDecimal divideCompute(BigDecimal a,BigDecimal b){
		return ComputeBase.decimal(a.divide(b));
	}
}
