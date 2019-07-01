package com.holddie.framework.domain.converter;

import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@Converter
public class StringListConverter implements AttributeConverter<Collection<String>, String> {

    @Override
    public String convertToDatabaseColumn(Collection<String> list) {
        if (list == null) {
            return "";
        }
        return String.join(",", list);
    }

    @Override
    public Collection<String> convertToEntityAttribute(String joined) {
        if (StringUtils.isEmpty(joined)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(Arrays.asList(joined.split(",")));
    }
}
