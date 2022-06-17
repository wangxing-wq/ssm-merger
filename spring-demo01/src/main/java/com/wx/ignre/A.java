package com.wx.ignre;

import lombok.Data;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/12 16:53
 */
//@Data
public class A implements BeanC{

	B b;
	C c;


	@Override
	public void setC(C c) {
		System.out.println("setC " + c);
		this.c = c;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}


	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				", c=" + c +
				'}';
	}


	public static void main(String[] args) {
	}

}
