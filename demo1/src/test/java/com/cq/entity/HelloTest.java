package com.cq.entity;

import org.junit.Test;

/**
 * hello�����
 * @author ke
 * @createDate 2019-4-8
 * @version 1.0
 */
public class HelloTest {
	/**
	 * ����say����
	 */
	Hello hello=new Hello();
	@Test
	public void say() {
		//����say����
		hello.say("Maven");
	}
	/**
	 * ����out����
	 */
	@Test
	public void out() {
		String msg=hello.out();
		System.out.println(msg);
	}
}
