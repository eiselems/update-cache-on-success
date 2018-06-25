package com.example.marcuseisele.updatecacheonsuccess.api;

import com.example.marcuseisele.updatecacheonsuccess.api.dto.GitHubUserDTO;
import com.example.marcuseisele.updatecacheonsuccess.service.GithubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

    private GithubService githubService;

    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/{accountName}")
    public GitHubUserDTO getUser(@PathVariable("accountName") String accountName) {
        return githubService.getGitHubUser(accountName);
    }
}
