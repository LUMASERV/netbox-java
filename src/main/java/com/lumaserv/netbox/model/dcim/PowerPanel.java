package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedLocation;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

@Getter
public class PowerPanel {

    Integer id;
    String url;
    String display;
    NestedSite site;
    NestedLocation location;
    String name;
    NestedTag[] tags;
    AbstractObject customFields;
    Integer powerfeedCount;

}
