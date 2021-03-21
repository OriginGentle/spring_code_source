package com.spring.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * @Author ycb
 * @Date 2021/3/12-21:37
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		this.setValue(address);
	}
}
