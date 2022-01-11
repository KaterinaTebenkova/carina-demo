package com.qaprosoft.carina.demo.api.github;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostCreateRelease extends AbstractApiMethodV2 {

    public PostCreateRelease(){
        super("api.github/_postCreateRelease/rq.json","api.github/_postCreateRelease/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        request.header("Authorization","Bearer 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");
    }
}
