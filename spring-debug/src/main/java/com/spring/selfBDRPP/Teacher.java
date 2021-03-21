package com.spring.selfBDRPP;

/**
 * @Author ycb
 * @Date 2021/3/18-21:13
 */
public class Teacher {
	private String name;

	public Teacher(){
		System.out.println("创建Teacher对象");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				'}';
	}
}
