package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import lombok.Getter;

@Getter
public class RackUnit {

    Integer id;
    String name;
    LabeledString face;
    NestedDevice device;
    Boolean occupied;
    String display;

}
