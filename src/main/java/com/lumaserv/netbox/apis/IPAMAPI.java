package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.ipam.*;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IPAMAPI {

    final NetBoxClient client;

    public List<Aggregate> getAggregates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/aggregates/", query, null, ListResponse.class).getResults(Aggregate.class);
    }

    public List<IPAddress> getIPAddresses(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-addresses/", query, null, ListResponse.class).getResults(IPAddress.class);
    }

    public List<IPRange> getIPRanges(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-ranges/", query, null, ListResponse.class).getResults(IPRange.class);
    }

    public List<Prefix> getPrefixes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/prefixes/", query, null, ListResponse.class).getResults(Prefix.class);
    }

    public List<RIR> getRIRs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/rirs/", query, null, ListResponse.class).getResults(RIR.class);
    }

    public List<Role> getRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/roles/", query, null, ListResponse.class).getResults(Role.class);
    }

    public List<RouteTarget> getRouteTargets(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/route-targets/", query, null, ListResponse.class).getResults(RouteTarget.class);
    }

    public List<Service> getServices(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/services/", query, null, ListResponse.class).getResults(Service.class);
    }

    public List<VLANGroup> getVLANGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlan-groups/", query, null, ListResponse.class).getResults(VLANGroup.class);
    }

    public List<VLAN> getVLANs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ipams/", query, null, ListResponse.class).getResults(VLAN.class);
    }

    public List<VRF> getVRFs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vrfs/", query, null, ListResponse.class).getResults(VRF.class);
    }

}
