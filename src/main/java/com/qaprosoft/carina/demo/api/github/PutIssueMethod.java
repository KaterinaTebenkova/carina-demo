package com.qaprosoft.carina.demo.api.github;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutIssueMethod extends AbstractApiMethodV2 {

    public PutIssueMethod(){
        super("api.github/_putIssue/rq.json","api.github/_putIssue/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        request.header("Authorization","Bearer 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");
    }
}
