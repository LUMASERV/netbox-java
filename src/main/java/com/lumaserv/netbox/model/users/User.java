package com.lumaserv.netbox.model.users;

import com.lumaserv.netbox.model.users.nested.NestedGroup;
import lombok.Getter;

import java.util.Date;

@Getter
public class User {

    Integer id;
    String url;
    String display;
    String username;
    String password;
    String firstName;
    String lastName;
    String email;
    Boolean isStaff;
    Boolean isActive;
    Date dateJoined;
    NestedGroup[] groups;

}
