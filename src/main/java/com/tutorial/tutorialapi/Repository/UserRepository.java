package com.tutorial.tutorialapi.Repository;

import com.tutorial.tutorialapi.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User , Long>{

    @RestResource(path = "by-name")
    Collection<User> findByName(@Param("name") String name);
}
