package com.lumaserv.netbox.model.tenancy.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableTenant {

    String name;
    String slug;
    Integer group;
    String description;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
