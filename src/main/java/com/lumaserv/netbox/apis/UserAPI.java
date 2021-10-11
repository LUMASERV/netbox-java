package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.tenancy.Tenant;
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

    public Group getGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/groups/" + id + "/", null, null, Group.class);
    }

    public void deleteGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/groups/" + id + "/", null, null, null);
    }

    public List<ObjectPermission> getPermissions(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/permissions/", query, null, ListResponse.class).getResults(ObjectPermission.class);
    }

    public ObjectPermission getPermission(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/permissions/" + id + "/", null, null, ObjectPermission.class);
    }

    public void deletePermission(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/permissions/" + id + "/", null, null, null);
    }

    public List<Token> getTokens(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/tokens/", query, null, ListResponse.class).getResults(Token.class);
    }

    public Token getToken(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/tokens/" + id + "/", null, null, Token.class);
    }

    public void deleteToken(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/tokens/" + id + "/", null, null, null);
    }

    public List<User> getUsers(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/users/", query, null, ListResponse.class).getResults(User.class);
    }

    public User getUser(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/users/" + id + "/", null, null, User.class);
    }

    public void deleteUser(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/users/" + id + "/", null, null, null);
    }

}
