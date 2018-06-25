package com.example.marcuseisele.updatecacheonsuccess.service;

import com.example.marcuseisele.updatecacheonsuccess.api.dto.GitHubUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class GithubService {

    private RestTemplate restTemplate;

    public GithubService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable(value = "gitHubUsers", key = "#accountName")
    public GitHubUserDTO getGitHubUser(String accountName) {
        log.info("Hey I am actually doing something");
        if (Math.random() > 0.5) {
            //it would be cool if the previous entry would get returned instead
            log.error("Snap! Something went wrong!");
            throw new RuntimeException("Whatever it is");
        }
        GitHubUserDTO gitHubUser = restTemplate.getForObject("https://api.github.com/users/" + accountName, GitHubUserDTO.class);
        return gitHubUser;
    }
}
