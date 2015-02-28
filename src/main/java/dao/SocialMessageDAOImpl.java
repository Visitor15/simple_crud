package dao;

import entities.social.SocialMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.List;

/**
 * Created by nchampagne on 2/28/15.
 */
public class SocialMessageDAOImpl implements SocialMessageDAO {

    @Autowired
    private MongoOperations mongoOperations;;

    public SocialMessageDAOImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void createSocialMessage(SocialMessage msg) {
        mongoOperations.save(msg);
    }

    @Override
    public SocialMessage getSocialMessageById(String id) {
        List<SocialMessage> results = mongoOperations.findAll(SocialMessage.class);
        return null;
    }

    @Override
    public List<SocialMessage> getAllSocialMessage() {
        return mongoOperations.findAll(SocialMessage.class);
    }
}
