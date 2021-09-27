package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.users.Group;
import com.lumaserv.netbox.model.users.ObjectPermission;
import com.lumaserv.netbox.model.users.Token;
import com.lumaserv.netbox.model.users.User;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserAPI {

    final NetBoxClient client;

    public List<Group> getGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/groups/", query, null, ListResponse.class).getResults(Group.class);
    }

    public List<ObjectPermission> getPermissions(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/permissions/", query, null, ListResponse.class).getResults(ObjectPermission.class);
    }

    public List<Token> getTokens(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/tokens/", query, null, ListResponse.class).getResults(Token.class);
    }

    public List<User> getUsers(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/users/", query, null, ListResponse.class).getResults(User.class);
    }

}
