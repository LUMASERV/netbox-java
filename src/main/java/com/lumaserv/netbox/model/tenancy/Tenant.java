package com.lumaserv.netbox.model.tenancy;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenantGroup;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Tenant {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    NestedTenantGroup group;
    String description;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer circuitCount;
    Integer deviceCount;
    Integer ipaddressCount;
    Integer prefixCount;
    Integer rackCount;
    Integer siteCount;
    Integer virtualmachineCount;
    Integer vlanCount;
    Integer vrfCount;
    Integer clusterCount;

}
