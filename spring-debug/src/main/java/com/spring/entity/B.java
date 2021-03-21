package com.spring.entity;

/**
 * @Author ycb
 * @Date 2021/2/2-9:04
 */
public class B {

	private Integer id;

	private String name;

	private A a;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{" +
				"id=" + id +
				", name='" + name + '\'' +
				", a=" + a +
				'}';
	}
}
