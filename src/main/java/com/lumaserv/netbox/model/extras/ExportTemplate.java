package com.lumaserv.netbox.model.extras;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
