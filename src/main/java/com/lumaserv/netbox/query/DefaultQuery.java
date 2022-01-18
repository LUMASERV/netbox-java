package com.lumaserv.netbox.query;

import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class DefaultQuery {

    @MapperOptions(name = "q")
    String query;
    @MapperOptions(name = "id__n")
    String idN;
    @MapperOptions(name = "id__lte")
    String idLTE;
    @MapperOptions(name = "id__lt")
    String idLT;
    @MapperOptions(name = "id__gte")
    String idGTE;
    @MapperOptions(name = "id__gt")
    String idGT;
    String created;
    @MapperOptions(name = "created__gte")
    String createdGTE;
    @MapperOptions(name = "created__lte")
    String createdLTE;
    String lastUpdated;
    @MapperOptions(name = "last_updated__gte")
    String lastUpdatedGTE;
    @MapperOptions(name = "last_updated__lte")
    String lastUpdatedLTE;
    Integer limit;
    Integer offset;

}
