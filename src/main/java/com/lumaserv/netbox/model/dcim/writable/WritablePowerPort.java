package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import org.javawebstack.abstractdata.AbstractObject;

public class WritablePowerPort {

    Integer device;
    String name;
    String label;
    String type;
    Integer maximumDraw;
    Integer allocatedDraw;
    String description;
    Boolean markConnected;
    NestedCable cable;
    NestedTag[] tags;
    AbstractObject customFields;

}
