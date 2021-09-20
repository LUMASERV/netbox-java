package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.users.nested.NestedUser;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class ObjectChange {

    Integer id;
    String url;
    String display;
    Date time;
    NestedUser user;
    String userName;
    String requestId;
    LabeledString action;
    String changedObjectType;
    Integer changedObjectId;
    AbstractObject changedObject;
    String prechangeData;
    String postchangeData;

}
