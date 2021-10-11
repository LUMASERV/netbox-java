package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableLocation {

    String name;
    String slug;
    Integer site;
    Integer parent;
    String description;
    AbstractObject customFields;

}
