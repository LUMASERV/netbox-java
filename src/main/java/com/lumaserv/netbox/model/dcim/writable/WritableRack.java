package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableRack {

    String name;
    String facilityId;
    Integer site;
    Integer location;
    Integer tenant;
    String status;
    Integer role;
    String serial;
    String assetTag;
    String type;
    Integer width;
    Integer uHeight;
    Boolean descUnits;
    Integer outerWidth;
    Integer outerDepth;
    String outerUnit;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
