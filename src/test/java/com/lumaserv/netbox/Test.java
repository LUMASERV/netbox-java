package com.lumaserv.netbox;

import com.lumaserv.netbox.query.dcim.RackQuery;

public class Test {

    // Just a simple class for testing out methods by hand
    public static void main(String[] args) throws NetBoxAPIException {
        NetBoxClient client = new NetBoxClient(System.getenv("NETBOX_URL"), System.getenv("NETBOX_TOKEN"));
        client.dcim().getRacks(new RackQuery()).forEach(rack -> {
            System.out.println(rack.getName());
        });
    }

}
