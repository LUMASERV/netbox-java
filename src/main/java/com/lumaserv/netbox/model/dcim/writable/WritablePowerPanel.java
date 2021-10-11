package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritablePowerPanel {

    Integer site;
    Integer location;
    String name;
    NestedTag[] tags;
    AbstractObject customFields;

}
