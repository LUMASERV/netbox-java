package com.lumaserv.netbox;

import com.lumaserv.netbox.model.tenancy.Tenant;
import com.lumaserv.netbox.model.tenancy.writable.WritableTenant;
import com.lumaserv.netbox.query.DefaultQuery;

public class Test {

    // Just a simple class for testing out methods by hand
    public static void main(String[] args) throws NetBoxAPIException {
        NetBoxClient client = new NetBoxClient(System.getenv("NETBOX_URL"), System.getenv("NETBOX_TOKEN"));
        Tenant tenant = client.tenancy().createTenant(new WritableTenant()
                .setName("Test")
                .setSlug("test")
        );
        System.out.println(tenant.getId());
    }

}
