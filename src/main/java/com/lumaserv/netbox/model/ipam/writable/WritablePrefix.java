package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritablePrefix {

    String prefix;
    Integer site;
    Integer vrf;
    Integer tenant;
    Integer vlan;
    String status;
    Integer role;
    Boolean isPool;
    Boolean markUtilized;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
