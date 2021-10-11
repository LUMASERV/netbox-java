package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableDeviceType {

    Integer manufacturer;
    String model;
    String slug;
    String partNumber;
    Integer uHeight;
    Boolean isFullDepth;
    String subdeviceRole;
    String comments;
    NestedTag tags;
    AbstractObject customFields;

}
