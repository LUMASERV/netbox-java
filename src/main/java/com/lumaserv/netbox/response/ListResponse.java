package com.lumaserv.netbox.response;

import org.javawebstack.abstractdata.AbstractArray;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractMapper;
import org.javawebstack.abstractdata.NamingPolicy;

import java.util.ArrayList;
import java.util.List;

public class ListResponse {

    private static final AbstractMapper MAPPER = new AbstractMapper().setNamingPolicy(NamingPolicy.SNAKE_CASE);

    Integer count;
    String next;
    String previous;
    AbstractArray results;

    public <T> List<T> getResults(Class<T> type) {
        List<T> list = new ArrayList<>();
        for(AbstractElement e : results)
            list.add(MAPPER.fromAbstract(e, type));
        return list;
    }

}
