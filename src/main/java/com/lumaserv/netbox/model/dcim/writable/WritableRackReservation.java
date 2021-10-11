package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableRackReservation {

    Integer rack;
    int[] units;
    Integer user;
    Integer tenant;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
