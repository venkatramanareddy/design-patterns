package com.venkat.learn.gofpatterns.structural.facade;

public class AWSResourceMetadata {
    public String getResourceName(String resourceID){
        if(resourceID.startsWith("ec2-")){
            return EC2ResourceMetadata.getResourceName(resourceID);
        }
        if(resourceID.startsWith("arn-")){
            return RoleResourceMetadata.getRoleName(resourceID);
        }
        return "Invalid resourceType";
    }
}
