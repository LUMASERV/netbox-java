package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableCable {

    String terminationAType;
    Integer terminationAId;
    String terminationBType;
    Integer terminationBId;
    String type;
    String status;
    String label;
    String color;
    Double length;
    String lengthUnit;
    NestedTag[] tags;
    AbstractObject customFields;

}
