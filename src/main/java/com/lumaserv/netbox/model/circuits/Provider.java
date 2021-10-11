package com.lumaserv.netbox.model.circuits;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
public class Provider {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer asn;
    String account;
    String portalUrl;
    String nocContact;
    String adminContact;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer circuitCount;

}
