package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableInventoryItem {

    Integer device;
    Integer parent;
    String name;
    String label;
    Integer manufacturer;
    String partId;
    String serial;
    String assetTag;
    Boolean discovered;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
