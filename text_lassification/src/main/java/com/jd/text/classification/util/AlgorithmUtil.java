package com.jd.text.classification.util;

import java.util.ArrayList;
import java.util.List;

/**
 * �㷨ͨ����
 *
 * @author Xu Bin searchmodel@163.com
 * @version v1.0
 *
 */
public class AlgorithmUtil {

	// ��С������
	private static final int MIN_CALCULATION_NUMBER = 1;

	/**
	 * �����ֵ
	 * 
	 * @param numbers
	 * @return ��ֵ
	 */
	public static double getAverage(List<Double> numbers) {
		if (numbers != null && numbers.size() > MIN_CALCULATION_NUMBER) {
			int n = 0;
			double total = 0;
			for (Double num : numbers) {
				if (num != null) {
					n++;
					total += num;
				}
			}
			return total / n;
		}
		return 0;
	}

	/**
	 * ���㷽��-������׼ƫ��ķ���
	 * 
	 * @param numbers
	 * @param avg
	 * @return ����ֵ
	 */
	public static double getVariance(List<Double> numbers, Double avg) {

		if (numbers != null && numbers.size() > MIN_CALCULATION_NUMBER
				&& avg != null) {
			int n = 0;
			double total = 0;
			for (Double num : numbers) {
				if (num != null) {
					n++;
					total += (num - avg) * (num - avg);
				}
			}
			return total / (n - 1);
		}
		return 0;
	}

	/**
	 * �����ܶȺ��������ܶ�ֵ
	 * 
	 * @param numbers
	 * @param avg
	 * @param variance
	 * @return
	 */
	public static double getDensityFunction(List<Double> numbers, Double avg,
			Double variance, Double value) {
		if (numbers != null && numbers.size() > MIN_CALCULATION_NUMBER
				&& avg != null && variance != null && variance != 0) {
			double a = Math
					.exp(-(value - avg) * (value - avg) / (2 * variance));
			double b = Math.sqrt(2 * Math.PI * variance);
			if (b != 0) {
				return a / b;
			}
		}
		return 0;
	}

}
