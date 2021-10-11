package com.lumaserv.netbox.model.users.writable;

import lombok.Setter;

import java.util.Date;

@Setter
public class WritableUser {

    String username;
    String password;
    String firstName;
    String lastName;
    String email;
    Boolean isStaff;
    Boolean isActive;
    Date dateJoined;
    int[] groups;

}
