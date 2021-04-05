package com.spring.entity;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author ycb
 * @Date 2021/3/28-20:50
 */

@Component
public class Person {
	private Integer id;
	private String name;

	public Person() {
		System.out.println("构造方法");
	}

//	@Autowired
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

//	@Autowired
	public Person(Integer id) {
		this.id = id;
	}

	@PostConstruct
	public void init(){
		System.out.println("init...");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("destroy...");
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

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
}
