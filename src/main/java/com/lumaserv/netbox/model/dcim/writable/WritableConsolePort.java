package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableConsolePort {

    Integer device;
    String name;
    String label;
    String type;
    Integer speed;
    String description;
    Boolean markConnected;
    NestedCable cable;
    NestedTag[] tags;
    AbstractObject customFields;

}
