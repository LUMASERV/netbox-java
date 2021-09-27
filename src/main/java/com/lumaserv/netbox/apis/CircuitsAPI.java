package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.circuits.*;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CircuitsAPI {

    final NetBoxClient client;

    public List<CircuitTermination> getCircuitTerminations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/cicuits/circuit-terminations/", query, null, ListResponse.class).getResults(CircuitTermination.class);
    }

    public List<CircuitType> getCircuitTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-types/", query, null, ListResponse.class).getResults(CircuitType.class);
    }

    public List<Circuit> getCircuits(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuits/", query, null, ListResponse.class).getResults(Circuit.class);
    }

    public List<ProviderNetwork> getProviderNetworks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/provider-networks/", query, null, ListResponse.class).getResults(ProviderNetwork.class);
    }

    public List<Provider> getProviders(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/providers/", query, null, ListResponse.class).getResults(Provider.class);
    }

}
