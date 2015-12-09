package com.jd.text.classification.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 算法通用类
 * 
 * @author Xu Bin
 *
 */
public class AlgorithmUtilTest {

	@Test
	public void test() {
		List<Double> test = new ArrayList<Double>();
		test.add(6.0);
		test.add(5.92);
		test.add(5.58);
		test.add(5.92);
		double avg = AlgorithmUtil.getAverage(test);
		double var = AlgorithmUtil.getVariance(test, avg);
		System.out.println(avg);
		System.out.println(var);
		System.out.println(AlgorithmUtil.getDensityFunction(test, avg, var, 6.0));
	}

}
