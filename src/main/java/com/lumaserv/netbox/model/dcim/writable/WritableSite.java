package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableSite {

    String name;
    String slug;
    String status;
    Integer region;
    Integer group;
    Integer tenant;
    String facility;
    Integer asn;
    String timeZone;
    String description;
    String physicalAddress;
    String shippingAddress;
    Double latitude;
    Double longitude;
    String contactName;
    String contactPhone;
    String contactEmail;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;

}
