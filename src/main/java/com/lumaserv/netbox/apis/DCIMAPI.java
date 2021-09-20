package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.dcim.Rack;
import com.lumaserv.netbox.query.dcim.RackQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DCIMAPI {

    final NetBoxClient client;

    public List<Rack> getRacks(RackQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/racks/", query, null, ListResponse.class).getResults(Rack.class);
    }

}
