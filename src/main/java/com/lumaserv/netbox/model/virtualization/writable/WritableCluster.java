package com.lumaserv.netbox.model.virtualization.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableCluster {

    String name;
    Integer type;
    Integer group;
    Integer tenant;
    Integer site;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
