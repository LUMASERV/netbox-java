package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableVLAN {

    Integer site;
    Integer group;
    Integer vid;
    String name;
    Integer tenant;
    String status;
    Integer role;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
