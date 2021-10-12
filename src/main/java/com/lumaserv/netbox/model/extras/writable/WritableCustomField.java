package com.lumaserv.netbox.model.extras.writable;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;

@Setter
public class WritableCustomField {

    String[] contentTypes;
    String name;
    String label;
    String description;
    Boolean required;
    String filterLogic;
    @SerializedName("default")
    String isDefault;
    Integer weight;
    Integer validationMinimum;
    Integer validationMaximum;
    String validationRegex;
    String choices;

}
