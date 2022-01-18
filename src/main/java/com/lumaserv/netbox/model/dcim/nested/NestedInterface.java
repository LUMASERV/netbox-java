package com.lumaserv.netbox.model.dcim.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class NestedInterface {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    Integer cable;
    @MapperOptions(name = "_occupied")
    String occupied;

}
