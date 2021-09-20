package com.lumaserv.netbox.model.dcim;

import lombok.Getter;

@Getter
public class ExportTemplate {

    Integer id;
    String url;
    String display;
    String contentType;
    String name;
    String description;
    String templateCode;
    String mimeType;
    String fileExtension;
    Boolean asAttachment;

}
