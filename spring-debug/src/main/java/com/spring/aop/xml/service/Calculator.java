package com.spring.aop.xml.service;

/**
 * @author ycb
 * @since 2022/1/9-16:52
 */
public interface Calculator {

	public Integer add(Integer i, Integer j) throws NoSuchMethodException;

	public Integer sub(Integer i, Integer j) throws NoSuchMethodException;

	public Integer mul(Integer i, Integer j) throws NoSuchMethodException;

	public Integer div(Integer i, Integer j) throws NoSuchMethodException;
}
