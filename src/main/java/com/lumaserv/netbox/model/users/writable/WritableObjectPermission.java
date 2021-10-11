package com.lumaserv.netbox.model.users.writable;

import lombok.Setter;

@Setter
public class WritableObjectPermission {

    String name;
    String description;
    Boolean enabled;
    String[] objectTypes;
    int[] groups;
    int[] users;
    String[] actions;
    String constraints;

}
