package com.spring.selfConverter;

import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, com.spring.selfConverter.Student> {
    @Override
    public com.spring.selfConverter.Student convert(String source) {
        System.out.println("-----");
        com.spring.selfConverter.Student s  = new com.spring.selfConverter.Student();
        String[] splits = source.split("_");
        s.setId(Integer.parseInt(splits[0]));
        s.setName(splits[1]);
        return s;
    }
}
