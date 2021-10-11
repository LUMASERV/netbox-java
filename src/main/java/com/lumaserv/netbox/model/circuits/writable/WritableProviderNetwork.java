package com.lumaserv.netbox.model.circuits.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableProviderNetwork {

    Integer provider;
    String name;
    String description;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
