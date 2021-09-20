package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedRack;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import com.lumaserv.netbox.model.users.nested.NestedUser;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class RackReservation {

    Integer id;
    String url;
    String display;
    NestedRack rack;
    int[] units;
    Date created;
    NestedUser user;
    NestedTenant tenant;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
