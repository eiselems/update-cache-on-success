package com.example.marcuseisele.updatecacheonsuccess.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubUserDTO implements Serializable {

    private static final long serialVersionUID = 1337L;

    String login;
    String name;
    String url;
    String html_url;
    String blog;
    String location;
    //there is definitely more - but this is a sample right?

}
