package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

@Getter
public class Cable {

    Integer id;
    String url;
    String display;
    String terminationAType;
    Integer terminationAId;
    AbstractObject terminationA;
    String terminationBType;
    Integer terminationBId;
    AbstractObject terminationB;
    String type;
    LabeledString status;
    String label;
    String color;
    Double length;
    LabeledString lengthUnit;
    NestedTag[] tags;
    AbstractObject customFields;

}
