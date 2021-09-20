package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

@Getter
public class VirtualChassis {

    Integer id;
    String url;
    String display;
    String name;
    String domain;
    NestedDevice master;
    NestedTag[] tags;
    AbstractObject customFields;
    Integer memberCount;

}
