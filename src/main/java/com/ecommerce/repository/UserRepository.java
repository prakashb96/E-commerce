package com.ecommerce.repository;


import com.ecommerce.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

 


public interface UserRepository extends JpaRepository<User,Long>{ // generic class

    Optional <User> findByUsername (String username);
    Optional <User> findByEmail (String email);

    Boolean existsByUsername(String username);
    Boolean existsByEmail( String email);

    @Query("SELECT u FROM User u WHERE u.username = :identfier OR u.email = identifier")
    Optional<User> findByUsernameOrEmail(@Param("identifier") String identifier);




    

    



}
