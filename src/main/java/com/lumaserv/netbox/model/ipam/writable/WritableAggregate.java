package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Setter
public class WritableAggregate {

    String prefix;
    Integer rir;
    Integer tenant;
    Date dateAdded;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
