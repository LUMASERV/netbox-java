package com.lumaserv.netbox.model.circuits;

import com.lumaserv.netbox.model.circuits.nested.NestedProvider;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class ProviderNetwork {

    Integer id;
    String url;
    String display;
    NestedProvider provider;
    String name;
    String description;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
