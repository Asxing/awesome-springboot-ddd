package com.holddie.framework.domain.converter;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.HashMap;
import java.util.Map;

@Converter
public class StringMapConverter implements AttributeConverter<Map<String, String>, String> {
    @Override
    public String convertToDatabaseColumn(Map<String, String> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return "";
        }

        return Joiner.on(",").withKeyValueSeparator(":").join(attribute);
    }

    @Override
    public Map<String, String> convertToEntityAttribute(String dbData) {
        if (StringUtils.isEmpty(dbData)) {
            return new HashMap<>();
        }

        return Splitter.on(",").withKeyValueSeparator(":").split(dbData);
    }
}
