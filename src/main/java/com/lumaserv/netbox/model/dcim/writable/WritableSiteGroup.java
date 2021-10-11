package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableSiteGroup {

    String name;
    String slug;
    Integer parent;
    String description;
    AbstractObject customFields;

}
