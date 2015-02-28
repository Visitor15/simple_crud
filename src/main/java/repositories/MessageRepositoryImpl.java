package repositories;

import entities.social.SocialMessage;
import entities.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nchampagne on 2/28/15.
 */
@Repository
public class MessageRepositoryImpl implements MessageRepository {

    // SLF4J logger
    private static Logger LOGGER = LoggerFactory.getLogger(MessageRepositoryImpl.class);

    public MessageRepositoryImpl() {}

    @Override
    public List<SocialMessage> findByID(String id) {
        return null;
    }

    @Override
    public List<SocialMessage> findBy(User key) {
        return null;
    }

    @Override
    public <S extends SocialMessage> List<S> save(Iterable<S> ses) {
        return null;
    }

    @Override
    public <S extends SocialMessage> S save(S s) {
        return null;
    }

    @Override
    public <S extends SocialMessage> List<S> insert(Iterable<S> ses) {
        return null;
    }

    @Override
    public <S extends SocialMessage> S insert(S s) {
        LOGGER.debug(getClass().getName(), "Method 'helloWorldLogged has been called!");
        return s;
    }

    @Override
    public SocialMessage findOne(User user) {
        return null;
    }

    @Override
    public boolean exists(User user) {
        return false;
    }

    @Override
    public List<SocialMessage> findAll() {
        return null;
    }

    @Override
    public Iterable<SocialMessage> findAll(Iterable<User> users) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(SocialMessage socialMessage) {

    }

    @Override
    public void delete(Iterable<? extends SocialMessage> socialMessages) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<SocialMessage> findAll(Sort orders) {
        return null;
    }

    @Override
    public Page<SocialMessage> findAll(Pageable pageable) {
        return null;
    }
}
