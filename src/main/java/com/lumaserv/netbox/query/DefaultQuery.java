package com.lumaserv.netbox.query;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;

@Setter
public class DefaultQuery {

    @SerializedName("q")
    String query;
    @SerializedName("id__n")
    String idN;
    @SerializedName("id__lte")
    String idLTE;
    @SerializedName("id__lt")
    String idLT;
    @SerializedName("id__gte")
    String idGTE;
    @SerializedName("id__gt")
    String idGT;
    String created;
    @SerializedName("created__gte")
    String createdGTE;
    @SerializedName("created__lte")
    String createdLTE;
    String lastUpdated;
    @SerializedName("last_updated__gte")
    String lastUpdatedGTE;
    @SerializedName("last_updated__lte")
    String lastUpdatedLTE;
    Integer limit;
    Integer offset;

}
