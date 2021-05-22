package com.venkat.learn.gofpatterns.structural.facade;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EC2ResourceMetadata {
    private static Map<String, String> resourceIdToInfoMap; // ideally will be map to whole EC2 metadata

    static {
        resourceIdToInfoMap = new HashMap<String,String>(){
        {
            put("ec2-1", "dataProcessingInstance");
            put("ec2-2", "bastion");
        }};
    }
    public static String getResourceName(String resourceID) {
        return resourceIdToInfoMap.getOrDefault(resourceID, "Invalid EC2 resource ID passed");
    }
}
