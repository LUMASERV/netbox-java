package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableRegion {

    String name;
    String slug;
    Integer parent;
    String description;
    AbstractObject customFields;

}
