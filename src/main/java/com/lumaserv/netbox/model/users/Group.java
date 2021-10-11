package com.lumaserv.netbox.model.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Group {

    Integer id;
    String url;
    String display;
    String name;
    Integer userCount;

}
