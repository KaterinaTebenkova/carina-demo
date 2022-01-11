package com.qaprosoft.carina.demo.api.github;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUser extends AbstractApiMethodV2 {

    public GetUser(){
        super(null, "api.github/_getUser/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        request.header("Authorization","Bearer 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");
    }
}
