package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedLocation;
import com.lumaserv.netbox.model.dcim.nested.NestedRackRole;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Rack {

    int id;
    String url;
    String display;
    String name;
    String facilityId;
    NestedSite site;
    NestedLocation location;
    NestedTenant tenant;
    LabeledString status;
    NestedRackRole role;
    String serial;
    String assetTag;
    LabeledString type;
    LabeledInteger width;
    Integer uHeight;
    Boolean descUnits;
    Integer outerWidth;
    Integer outerDepth;
    LabeledString outerUnit;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer deviceCount;
    Integer powerfeedCount;

}
