package com.example.social.dbRepository;

import com.example.social.dbCollection.UserCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserRepository extends MongoRepository<UserCollection,String> {
}
