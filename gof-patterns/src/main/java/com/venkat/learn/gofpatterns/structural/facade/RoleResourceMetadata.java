package com.venkat.learn.gofpatterns.structural.facade;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class RoleResourceMetadata {
    private static Map<String, String> resourceIdToInfoMap; // ideally will be map to whole Role metadata

    static {
        resourceIdToInfoMap = new HashMap<String,String>(){
        {
            put("arn-1", "S3-read-access-role");
            put("arn-2", "RDS-full-access-role");
        }};
    }

    public static String getRoleName(String resourceID) {
        return resourceIdToInfoMap.getOrDefault(resourceID, "Invalid Role resourceID passed");
    }
}
