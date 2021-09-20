package com.lumaserv.netbox.model.users;

import com.lumaserv.netbox.model.users.nested.NestedGroup;
import com.lumaserv.netbox.model.users.nested.NestedUser;
import lombok.Getter;

@Getter
public class ObjectPermission {

    Integer id;
    String url;
    String display;
    String name;
    String description;
    Boolean enabled;
    String[] objectTypes;
    NestedGroup[] groups;
    NestedUser[] users;
    String[] actions;
    String constraints;

}
