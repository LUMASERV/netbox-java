package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedManufacturer;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class DeviceType {

    Integer id;
    String url;
    String display;
    NestedManufacturer manufacturer;
    String model;
    String slug;
    String partNumber;
    Integer uHeight;
    Boolean isFullDepth;
    LabeledString subdeviceRole;
    String frontImage;
    String rearImage;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer deviceCount;

}
