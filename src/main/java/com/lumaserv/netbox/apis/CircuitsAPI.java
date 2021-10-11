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
        return client.apiRequest("GET", "/circuits/circuit-terminations/", query, null, ListResponse.class).getResults(CircuitTermination.class);
    }

    public CircuitTermination getCircuitTermination(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-terminations/" + id + "/", null, null, CircuitTermination.class);
    }

    public void deleteCircuitTermination(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuit-terminations/" + id + "/", null, null, null);
    }

    public List<CircuitType> getCircuitTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-types/", query, null, ListResponse.class).getResults(CircuitType.class);
    }

    public CircuitType getCircuitType(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-types/" + id + "/", null, null, CircuitType.class);
    }

    public void deleteCircuitType(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuit-types/" + id + "/", null, null, null);
    }

    public List<Circuit> getCircuits(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuits/", query, null, ListResponse.class).getResults(Circuit.class);
    }

    public Circuit getCircuit(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuits/" + id + "/", null, null, Circuit.class);
    }

    public void deleteCircuit(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuits/" + id + "/", null, null, null);
    }

    public List<ProviderNetwork> getProviderNetworks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/provider-networks/", query, null, ListResponse.class).getResults(ProviderNetwork.class);
    }

    public ProviderNetwork getProviderNetwork(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/provider-networks/" + id + "/", null, null, ProviderNetwork.class);
    }

    public void deleteProviderNetwork(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/provider-networks/" + id + "/", null, null, null);
    }

    public List<Provider> getProviders(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/providers/", query, null, ListResponse.class).getResults(Provider.class);
    }

    public Provider getProvider(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/providers/" + id + "/", null, null, Provider.class);
    }

    public void deleteProvider(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/providers/" + id + "/", null, null, null);
    }

}
