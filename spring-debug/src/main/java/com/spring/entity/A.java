package com.spring.entity;

/**
 * @Author ycb
 * @Date 2021/2/1-20:00
 */
public class A {

	private Integer id;

	private String name;

	private B b;

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

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"id=" + id +
				", name='" + name + '\'' +
				", b=" + b +
				'}';
	}
}
