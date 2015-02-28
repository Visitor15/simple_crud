package dao;

import entities.social.SocialMessage;

import java.util.List;

/**
 * Created by nchampagne on 2/28/15.
 */
public interface SocialMessageDAO {
    public void createSocialMessage(SocialMessage msg);

    public SocialMessage getSocialMessageById(String id);

    public List<SocialMessage> getAllSocialMessage();

    /* CRUD */
}
