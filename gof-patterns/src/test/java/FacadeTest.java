import com.venkat.learn.gofpatterns.structural.facade.AWSResourceMetadata;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacadeTest {
    AWSResourceMetadata resourceMetadata;

    @BeforeEach
    public void init(){
        resourceMetadata = new AWSResourceMetadata();
    }

    @Test
    public void ec2NameTest(){
        assert(resourceMetadata.getResourceName("ec2-1").equals("dataProcessingInstance"));
        assert(resourceMetadata.getResourceName("ec2-2").equals("bastion"));
    }

    @Test
    public void roleNameTest(){
        assert(resourceMetadata.getResourceName("arn-1").equals("S3-read-access-role"));
        assert(resourceMetadata.getResourceName("arn-2").equals("RDS-full-access-role"));
    }

    @Test
    public void failureCase(){
        assert(resourceMetadata.getResourceName("random-resource-id").equals("Invalid resourceType"));
        assert(resourceMetadata.getResourceName("ec2-random-id").equals("Invalid EC2 resource ID passed"));
        assert(resourceMetadata.getResourceName("arn-random-role").equals("Invalid Role resourceID passed"));
    }
}
