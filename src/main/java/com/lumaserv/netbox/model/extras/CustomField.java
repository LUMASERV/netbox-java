package com.lumaserv.netbox.model.extras;

import com.lumaserv.netbox.model.LabeledString;
import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class CustomField {

    Integer id;
    String url;
    String display;
    String[] contentTypes;
    LabeledString type;
    String name;
    String label;
    String description;
    Boolean required;
    LabeledString filterLogic;
    @MapperOptions(name = "default")
    String defaultValue;
    Integer weight;
    Integer validationMinimum;
    Integer validationMaximum;
    String validationRegex;
    String[] choices;

}
