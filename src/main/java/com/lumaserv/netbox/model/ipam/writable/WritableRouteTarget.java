package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableRouteTarget {

    String name;
    Integer tenant;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
