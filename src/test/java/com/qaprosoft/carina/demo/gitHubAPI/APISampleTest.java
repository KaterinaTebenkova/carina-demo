package com.qaprosoft.carina.demo.gitHubAPI;

import com.qaprosoft.carina.demo.api.github.*;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;


public class APISampleTest extends AbstractTest {

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getRepoTest() {
        GetRepoMethod method = new GetRepoMethod();
        method.expectResponseStatus(HttpResponseStatusType.OK_200);
        method.callAPI();
        method.validateResponse();

    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void postTest() throws Exception {
        PostMethod postMethod = new PostMethod();
        postMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postMethod.callAPI();
        postMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void deleteTest(){
        DeleteMethod deleteMethod = new DeleteMethod();
        deleteMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteMethod.callAPI();
        deleteMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void patchTest(){
        PatchMethod patchMethod = new PatchMethod();
        patchMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchMethod.callAPI();
        patchMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void postIssueTest(){
        PostIssueMethod postIssueMethod = new PostIssueMethod();
        postIssueMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postIssueMethod.callAPI();
        postIssueMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void patchIssueTest(){
        PatchIssueMethod patchIssueMethod = new PatchIssueMethod();
        patchIssueMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchIssueMethod.callAPI();
        patchIssueMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void putIssueTest(){
        PutIssueMethod putIssueMethod = new PutIssueMethod();
        putIssueMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        putIssueMethod.callAPI();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void deleteIssueTest() {
        DeleteIssueMethod deleteIssueMethod = new DeleteIssueMethod();
        deleteIssueMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteIssueMethod.callAPI();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getGitignoreTest(){
        GetGitIgnorTemplates getGitignorTemplates = new GetGitIgnorTemplates();
        getGitignorTemplates.expectResponseStatus(HttpResponseStatusType.OK_200);
        getGitignorTemplates.callAPI();
        getGitignorTemplates.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getLicenses(){
        GetLicenses getLicenses = new GetLicenses();
        getLicenses.expectResponseStatus(HttpResponseStatusType.OK_200);
        getLicenses.callAPI();
        getLicenses.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getUser(){
        GetUser getUser = new GetUser();
        getUser.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUser.callAPI();
        getUser.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getEmojis(){
        GetEmojis getEmojis = new GetEmojis();
        getEmojis.expectResponseStatus(HttpResponseStatusType.OK_200);
        getEmojis.callAPI();
        getEmojis.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void getListWatchers(){
        GetListWatchers getListWatchers = new GetListWatchers();
        getListWatchers.expectResponseStatus(HttpResponseStatusType.OK_200);
        getListWatchers.callAPI();
        getListWatchers.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void postCreateRepositoryProject(){
        PostCreateRepositoryProject postCreateRepositoryProject = new PostCreateRepositoryProject();
        postCreateRepositoryProject.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postCreateRepositoryProject.callAPI();
        postCreateRepositoryProject.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "tebenkova")
    public void postCreateRelease(){
        PostCreateRelease postCreateRelease = new PostCreateRelease();
        postCreateRelease.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postCreateRelease.callAPI();
        postCreateRelease.validateResponse();
    }

}
