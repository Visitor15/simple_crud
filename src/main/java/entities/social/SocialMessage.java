package entities.social;

import entities.SerializedEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.query.Param;

/**
 * Created by nchampagne on 2/28/15.
 */
@Document(collection = "messages")
public class SocialMessage implements SerializedEntity {

    @Id
    private String id;

    private String message;

    public SocialMessage(@Param("message") String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
