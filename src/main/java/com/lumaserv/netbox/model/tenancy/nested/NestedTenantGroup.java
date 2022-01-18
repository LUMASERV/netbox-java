package com.lumaserv.netbox.model.tenancy.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class NestedTenantGroup {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer tenantCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
