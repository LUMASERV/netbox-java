package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedRole;
import com.lumaserv.netbox.model.ipam.nested.NestedVRF;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class IPRange {

    Integer id;
    String url;
    String display;
    LabeledInteger family;
    String startAddress;
    String endAddress;
    Integer size;
    NestedVRF vrf;
    NestedTenant tenant;
    LabeledString status;
    NestedRole role;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer children;

}
