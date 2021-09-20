package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedRole;
import com.lumaserv.netbox.model.ipam.nested.NestedVLANGroup;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class VLAN {

    Integer id;
    String url;
    String display;
    NestedSite site;
    NestedVLANGroup group;
    Integer vid;
    String name;
    NestedTenant tenant;
    LabeledString status;
    NestedRole role;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer prefixCount;

}
