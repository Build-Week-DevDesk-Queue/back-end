package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackResponse {

    @JsonProperty("text")
    private String text;

    @JsonProperty("response_type")
    private String responseType;

    @JsonProperty("attachments")
    private List<Attachment> attachments;

    public SlackResponse() {
        attachments = new ArrayList<>();
    }

    public SlackResponse(String text) {
        this.text = text;
        attachments = new ArrayList<>();
    }

    public List getAttachments() {
        return attachments;
    }

    public void setAttachments(List attachments) {
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}