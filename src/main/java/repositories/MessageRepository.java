package repositories;

import entities.social.SocialMessage;
import entities.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by nchampagne on 2/28/15.
 */
@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessageRepository extends MongoRepository<SocialMessage, User> {
    public List<SocialMessage> findByID(String id);

    public List<SocialMessage> findBy(User key);
}
