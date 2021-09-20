package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.LabeledString;
import lombok.Getter;

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
    @SerializedName("default")
    String defaultValue;
    Integer weight;
    Integer validationMinimum;
    Integer validationMaximum;
    String validationRegex;
    String[] choices;

}
