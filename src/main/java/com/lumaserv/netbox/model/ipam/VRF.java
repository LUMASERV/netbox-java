package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedRouteTarget;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class VRF {

    Integer id;
    String url;
    String display;
    String name;
    String rd;
    NestedTenant tenant;
    Boolean enforceUnique;
    String description;
    NestedRouteTarget[] importTargets;
    NestedRouteTarget[] exportTargets;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer ipaddressCount;
    Integer prefixCount;

}
