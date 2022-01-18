package com.lumaserv.netbox.model.extras.writable;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class WritableCustomField {

    String[] contentTypes;
    String name;
    String label;
    String description;
    Boolean required;
    String filterLogic;
    @MapperOptions(name = "default")
    String isDefault;
    Integer weight;
    Integer validationMinimum;
    Integer validationMaximum;
    String validationRegex;
    String choices;

}
