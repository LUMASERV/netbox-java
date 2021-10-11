package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableVirtualChassis {

    String name;
    String domain;
    Integer master;
    NestedTag[] tags;
    AbstractObject customFields;

}
