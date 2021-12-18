package com.delta.smallbaazaar.datastores;

import com.delta.smallbaazaar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User, String> {
    public User save(User user);
    public User findByUseridAndPassword(String userid, String password);
}
