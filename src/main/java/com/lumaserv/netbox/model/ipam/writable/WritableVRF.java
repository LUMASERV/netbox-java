package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableVRF {

    String name;
    String rd;
    Integer tenant;
    Boolean enforeUnique;
    String description;
    int[] importTargets;
    int[] exportTargets;
    NestedTag[] tags;
    AbstractObject customFields;

}
