package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.users.Group;
import com.lumaserv.netbox.model.users.ObjectPermission;
import com.lumaserv.netbox.model.users.Token;
import com.lumaserv.netbox.model.users.User;
import com.lumaserv.netbox.model.users.writable.WritableObjectPermission;
import com.lumaserv.netbox.model.users.writable.WritableToken;
import com.lumaserv.netbox.model.users.writable.WritableUser;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserAPI {

    final NetBoxClient client;

    public Group createGroup(Group body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/users/groups/", null, body, Group.class);
    }

    public List<Group> getGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/groups/", query, null, ListResponse.class).getResults(Group.class);
    }

    public Group getGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/groups/" + id + "/", null, null, Group.class);
    }

    public Group updateGroup(int id, Group body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/users/groups/" + id + "/", null, body, Group.class);
    }

    public Group patchGroup(int id, Group body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/users/groups/" + id + "/", null, body, Group.class);
    }

    public void deleteGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/groups/" + id + "/", null, null, null);
    }

    public ObjectPermission createPermission(WritableObjectPermission body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/users/permissions/", null, body, ObjectPermission.class);
    }

    public List<ObjectPermission> getPermissions(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/permissions/", query, null, ListResponse.class).getResults(ObjectPermission.class);
    }

    public ObjectPermission getPermission(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/permissions/" + id + "/", null, null, ObjectPermission.class);
    }

    public ObjectPermission updatePermission(int id, WritableObjectPermission body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/users/permissions/" + id + "/", null, body, ObjectPermission.class);
    }

    public ObjectPermission patchPermission(int id, WritableObjectPermission body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/users/permissions/" + id + "/", null, body, ObjectPermission.class);
    }

    public void deletePermission(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/permissions/" + id + "/", null, null, null);
    }

    public Token createToken(WritableToken body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/users/tokens/", null, body, Token.class);
    }

    public List<Token> getTokens(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/tokens/", query, null, ListResponse.class).getResults(Token.class);
    }

    public Token getToken(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/tokens/" + id + "/", null, null, Token.class);
    }

    public Token updateToken(int id, WritableToken body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/users/tokens/" + id + "/", null, body, Token.class);
    }

    public Token patchToken(int id, WritableToken body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/users/tokens/" + id + "/", null, body, Token.class);
    }

    public void deleteToken(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/tokens/" + id + "/", null, null, null);
    }

    public User createUser(WritableUser body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/users/users/", null, body, User.class);
    }

    public List<User> getUsers(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/users/", query, null, ListResponse.class).getResults(User.class);
    }

    public User getUser(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/users/users/" + id + "/", null, null, User.class);
    }

    public User updateUser(int id, WritableUser body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/users/users/" + id + "/", null, body, User.class);
    }

    public User patchUser(int id, WritableUser body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/users/users/" + id + "/", null, body, User.class);
    }

    public void deleteUser(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/users/users/" + id + "/", null, null, null);
    }

}
