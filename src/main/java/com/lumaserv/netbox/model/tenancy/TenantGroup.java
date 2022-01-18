package com.lumaserv.netbox.model.tenancy;

import com.lumaserv.netbox.model.tenancy.nested.NestedTenantGroup;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class TenantGroup {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    NestedTenantGroup parent;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer tenantCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
