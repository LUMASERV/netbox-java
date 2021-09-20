package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedRegion;
import com.lumaserv.netbox.model.dcim.nested.NestedSiteGroup;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Site {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    LabeledString status;
    NestedRegion region;
    NestedSiteGroup group;
    NestedTenant tenant;
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
    Date created;
    Date lastUpdated;
    Integer circuitCount;
    Integer deviceCount;
    Integer prefixCount;
    Integer rackCount;
    Integer virtualmachineCount;
    Integer vlanCount;

}
