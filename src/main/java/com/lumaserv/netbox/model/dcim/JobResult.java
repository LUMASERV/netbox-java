package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.users.nested.NestedUser;
import lombok.Getter;

import java.util.Date;

@Getter
public class JobResult {

    Integer id;
    String url;
    String display;
    Date created;
    Date completed;
    String name;
    String objType;
    LabeledString status;
    NestedUser user;
    String data;
    String jobId;

}
