package com.holddie.framework.domain.converter;

import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.*;


@Converter
public class StringSetConverter implements AttributeConverter<Collection<String>, String> {

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
            return new HashSet<>();
        }
        return new ArrayList<>(Arrays.asList(joined.split(",")));
    }
}
