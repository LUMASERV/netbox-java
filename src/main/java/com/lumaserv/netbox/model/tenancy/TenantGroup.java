package com.lumaserv.netbox.model.tenancy;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenantGroup;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

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
    @SerializedName("_depth")
    Integer depth;

}
