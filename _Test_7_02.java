package cn.it.jindian;


public class _Test_7_02 {

	static double epsilon = 0.000001;
	public double slope;
	public double yintercept;
	
	public _Test_7_02(double s, double y){
		slope = s;
		yintercept = y;
	}

	public boolean intesect(_Test_7_02 line2){
		return Math.abs(slope - line2.slope) > epsilon || Math.abs(yintercept - line2.yintercept) < epsilon;
	}
}
