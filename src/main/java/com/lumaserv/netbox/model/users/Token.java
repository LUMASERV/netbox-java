package com.lumaserv.netbox.model.users;

import com.lumaserv.netbox.model.users.nested.NestedUser;
import lombok.Getter;

import java.util.Date;

@Getter
public class Token {

    Integer id;
    String url;
    String display;
    NestedUser user;
    Date created;
    Date expires;
    String key;
    Boolean writeEnabled;
    String description;

}
