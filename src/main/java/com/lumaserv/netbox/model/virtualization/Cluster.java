package com.lumaserv.netbox.model.virtualization;

import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import com.lumaserv.netbox.model.virtualization.nested.NestedClusterGroup;
import com.lumaserv.netbox.model.virtualization.nested.NestedClusterType;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Cluster {

    Integer id;
    String url;
    String display;
    String name;
    NestedClusterType type;
    NestedClusterGroup group;
    NestedTenant tenant;
    NestedSite site;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer deviceCount;
    Integer virtualmachineCount;

}
