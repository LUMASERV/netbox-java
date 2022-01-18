package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedRole;
import com.lumaserv.netbox.model.ipam.nested.NestedVLAN;
import com.lumaserv.netbox.model.ipam.nested.NestedVRF;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class Prefix {

    Integer id;
    String url;
    String display;
    LabeledInteger family;
    String prefix;
    NestedSite site;
    NestedVRF vrf;
    NestedTenant tenant;
    NestedVLAN vlan;
    LabeledString status;
    NestedRole role;
    Boolean isPool;
    Boolean markUtilized;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer children;
    @MapperOptions(name = "_depth")
    Integer depth;

}
