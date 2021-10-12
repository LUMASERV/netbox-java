package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.tenancy.Tenant;
import com.lumaserv.netbox.model.tenancy.TenantGroup;
import com.lumaserv.netbox.model.tenancy.writable.WritableTenant;
import com.lumaserv.netbox.model.tenancy.writable.WritableTenantGroup;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TenancyAPI {

    final NetBoxClient client;

    public TenantGroup createTenantGroup(WritableTenantGroup body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/tenancy/tenant-groups/", null, body, TenantGroup.class);
    }

    public List<TenantGroup> getTenantGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/tenancy/tenant-groups/", query, null, ListResponse.class).getResults(TenantGroup.class);
    }

    public TenantGroup getTenantGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/tenancy/tenant-groups/" + id + "/", null, null, TenantGroup.class);
    }

    public TenantGroup updateTenantGroup(int id, WritableTenantGroup body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/tenancy/tenant-groups/" + id + "/", null, body, TenantGroup.class);
    }

    public TenantGroup patchTenantGroup(int id, WritableTenantGroup body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/tenancy/tenant-groups/" + id + "/", null, body, TenantGroup.class);
    }

    public void deleteTenantGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/tenancy/tenant-groups/" + id + "/", null, null, null);
    }

    public Tenant createTenant(WritableTenant body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/tenancy/tenants/", null, body, Tenant.class);
    }

    public List<Tenant> getTenants(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/tenancy/tenants/", query, null, ListResponse.class).getResults(Tenant.class);
    }

    public Tenant getTenant(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/tenancy/tenants/" + id + "/", null, null, Tenant.class);
    }

    public Tenant updateTenant(int id, WritableTenant body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/tenancy/tenants/" + id + "/", null, body, Tenant.class);
    }

    public Tenant patchTenant(int id, WritableTenant body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/tenancy/tenants/" + id + "/", null, body, Tenant.class);
    }

    public void deleteTenant(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/tenancy/tenants/" + id + "/", null, null, null);
    }

}
