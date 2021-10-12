package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.extras.*;
import com.lumaserv.netbox.model.extras.writable.WritableConfigContext;
import com.lumaserv.netbox.model.extras.writable.WritableCustomField;
import com.lumaserv.netbox.model.extras.writable.WritableJournalEntry;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ExtrasAPI {

    final NetBoxClient client;

    public ConfigContext createConfigContext(WritableConfigContext body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/config-contexts/", null, body, ConfigContext.class);
    }

    public List<ConfigContext> getConfigContexts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/config-contexts/", query, null, ListResponse.class).getResults(ConfigContext.class);
    }

    public ConfigContext getConfigContext(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/config-contexts/" + id + "/", null, null, ConfigContext.class);
    }

    public ConfigContext updateConfigContext(int id, WritableConfigContext body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/config-contexts/" + id + "/", null, body, ConfigContext.class);
    }

    public ConfigContext patchConfigContext(int id, WritableConfigContext body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/config-contexts/" + id + "/", null, body, ConfigContext.class);
    }

    public void deleteConfigContext(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/config-contexts/" + id + "/", null, null, null);
    }

    public List<ContentType> getContentType(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/content-types/", query, null, ListResponse.class).getResults(ContentType.class);
    }

    public ContentType getContentType(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/content-types/" + id + "/", null, null, ContentType.class);
    }

    public CustomField createCustomField(WritableCustomField body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/custom-fields/", null, body, CustomField.class);
    }

    public List<CustomField> getCustomFields(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/custom-fields/", query, null, ListResponse.class).getResults(CustomField.class);
    }

    public CustomField getCustomField(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/custom-fields/" + id + "/", null, null, CustomField.class);
    }

    public CustomField updateCustomField(int id, WritableCustomField body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/custom-fields/" + id + "/", null, body, CustomField.class);
    }

    public CustomField patchCustomField(int id, WritableCustomField body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/custom-fields/" + id + "/", null, body, CustomField.class);
    }

    public void deleteCustomField(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/custom-fields/" + id + "/", null, null, null);
    }

    public CustomLink createCustomLink(CustomLink body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/custom-links/", null, body, CustomLink.class);
    }

    public List<CustomLink> getCustomLinks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/custom-links/", query, null, ListResponse.class).getResults(CustomLink.class);
    }

    public CustomLink getCustomLink(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/custom-links/" + id + "/", null, null, CustomLink.class);
    }

    public CustomLink updateCustomLink(int id, CustomLink body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/custom-links/" + id + "/", null, body, CustomLink.class);
    }

    public CustomLink patchCustomLink(int id, CustomLink body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/custom-links/" + id + "/", null, body, CustomLink.class);
    }

    public void deleteCustomLink(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/custom-links/" + id + "/", null, null, null);
    }

    public ExportTemplate createExportTemplate(ExportTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/export-templates/", null, body, ExportTemplate.class);
    }

    public List<ExportTemplate> getExportTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/export-templates/", query, null, ListResponse.class).getResults(ExportTemplate.class);
    }

    public ExportTemplate getExportTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/export-templates/" + id + "/", null, null, ExportTemplate.class);
    }

    public ExportTemplate updateExportTemplate(int id, ExportTemplate body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/export-templates/" + id + "/", null, body, ExportTemplate.class);
    }

    public ExportTemplate patchExportTemplate(int id, ExportTemplate body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/export-templates/" + id + "/", null, body, ExportTemplate.class);
    }

    public void deleteExportTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/export-templates/" + id + "/", null, null, null);
    }

    public ImageAttachment createImageAttachment(ImageAttachment body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/image-attachments/", null, body, ImageAttachment.class);
    }

    public List<ImageAttachment> getImageAttachments(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/image-attachments/", query, null, ListResponse.class).getResults(ImageAttachment.class);
    }

    public ImageAttachment getImageAttachment(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/image-attachments/" + id + "/", null, null, ImageAttachment.class);
    }

    public ImageAttachment updateImageAttachment(int id, ImageAttachment body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/image-attachments/" + id + "/", null, body, ImageAttachment.class);
    }

    public ImageAttachment patchImageAttachment(int id, ImageAttachment body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/image-attachments/" + id + "/", null, body, ImageAttachment.class);
    }

    public void deleteImageAttachment(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/image-attachments/" + id + "/", null, null, null);
    }

    public List<JobResult> getJobResults(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/job-results/", query, null, ListResponse.class).getResults(JobResult.class);
    }

    public JobResult getJobResult(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/job-results/" + id + "/", null, null, JobResult.class);
    }

    public JournalEntry createJournalEntry(WritableJournalEntry body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/journal-entries/", null, body, JournalEntry.class);
    }

    public List<JournalEntry> getJournalEntrys(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/journal-entries/", query, null, ListResponse.class).getResults(JournalEntry.class);
    }

    public JournalEntry getJournalEntry(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/journal-entries/" + id + "/", null, null, JournalEntry.class);
    }

    public JournalEntry updateJournalEntry(int id, WritableJournalEntry body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/journal-entries/" + id + "/", null, body, JournalEntry.class);
    }

    public JournalEntry patchJournalEntry(int id, WritableJournalEntry body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/journal-entries/" + id + "/", null, body, JournalEntry.class);
    }

    public void deleteJournalEntry(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/journal-entries/" + id + "/", null, null, null);
    }

    public List<ObjectChange> getObjectChanges(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/object-changes/", query, null, ListResponse.class).getResults(ObjectChange.class);
    }

    public ObjectChange getObjectChange(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/object-changes/" + id + "/", null, null, ObjectChange.class);
    }

    public Tag createTag(Tag body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/tags/", null, body, Tag.class);
    }

    public List<Tag> getTags(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/tags/", query, null, ListResponse.class).getResults(Tag.class);
    }

    public Tag getTag(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/tags/" + id + "/", null, null, Tag.class);
    }

    public Tag updateTag(int id, Tag body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/tags/" + id + "/", null, body, Tag.class);
    }

    public Tag patchTag(int id, Tag body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/tags/" + id + "/", null, body, Tag.class);
    }

    public void deleteTag(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/tags/" + id + "/", null, null, null);
    }

    public Webhook createWebhook(Webhook body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/extras/webhooks/", null, body, Webhook.class);
    }

    public List<Webhook> getWebhooks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/webhooks/", query, null, ListResponse.class).getResults(Webhook.class);
    }

    public Webhook getWebhook(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/extras/webhooks/" + id + "/", null, null, Webhook.class);
    }

    public Webhook updateWebhook(int id, Webhook body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/extras/webhooks/" + id + "/", null, body, Webhook.class);
    }

    public Webhook patchWebhook(int id, Webhook body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/extras/webhooks/" + id + "/", null, body, Webhook.class);
    }

    public void deleteWebhook(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/extras/webhooks/" + id + "/", null, null, null);
    }

}
