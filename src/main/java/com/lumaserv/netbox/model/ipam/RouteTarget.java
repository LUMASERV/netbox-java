package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class RouteTarget {

    Integer id;
    String url;
    String display;
    String name;
    NestedTenant tenant;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
