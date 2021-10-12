package com.lumaserv.netbox.model.extras;

import com.lumaserv.netbox.model.dcim.nested.*;
import com.lumaserv.netbox.model.ipam.nested.NestedRole;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenantGroup;
import com.lumaserv.netbox.model.virtualization.nested.NestedCluster;
import com.lumaserv.netbox.model.virtualization.nested.NestedClusterGroup;
import lombok.Getter;

import java.util.Date;

@Getter
public class ConfigContext {

    Integer id;
    String url;
    String display;
    String name;
    Integer weight;
    String description;
    Boolean isActive;
    NestedRegion[] regions;
    NestedSiteGroup[] siteGroups;
    NestedSite[] sites;
    NestedDeviceType[] deviceTypes;
    NestedRole[] roles;
    NestedPlatform[] platforms;
    NestedClusterGroup[] clusterGroups;
    NestedCluster[] clusters;
    NestedTenantGroup[] tenantGroups;
    NestedTenant[] tenants;
    String[] tags;
    String data;
    Date created;
    Date lastUpdated;

}
