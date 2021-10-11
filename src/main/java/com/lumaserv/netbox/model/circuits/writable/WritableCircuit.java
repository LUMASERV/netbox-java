package com.lumaserv.netbox.model.circuits.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableCircuit {

    String cid;
    Integer provider;
    Integer type;
    String status;
    Integer tenant;
    String installDate;
    Integer commitRate;
    String description;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
