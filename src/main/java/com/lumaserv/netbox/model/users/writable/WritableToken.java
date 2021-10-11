package com.lumaserv.netbox.model.users.writable;

import lombok.Setter;

import java.util.Date;

@Setter
public class WritableToken {

    Integer user;
    Date expires;
    String key;
    Boolean writeEnabled;
    String description;

}
