package com.qaprosoft.carina.demo.api.github;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PatchMethod extends AbstractApiMethodV2 {

    public PatchMethod(){
        super("api.github/_patch/rq.json","api.github/_patch/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        request.header("Authorization","Bearer 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");
    }
}
