package com.cq.entity;

import org.junit.Test;

/**
 * hello类测试
 * @author ke
 * @createDate 2019-4-8
 * @version 1.0
 */
public class HelloTest {
	/**
	 * 测试say方法
	 */
	Hello hello=new Hello();
	@Test
	public void say() {
		//调用say方法
		hello.say("Maven");
	}
	/**
	 * 测试out方法
	 */
	@Test
	public void out() {
		String msg=hello.out();
		System.out.println(msg);
	}
}
