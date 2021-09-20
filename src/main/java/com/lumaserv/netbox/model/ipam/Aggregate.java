package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedRIR;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Aggregate {

    Integer id;
    String url;
    String display;
    LabeledInteger family;
    String prefix;
    NestedRIR rir;
    NestedTenant tenant;
    Date dateAdded;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
