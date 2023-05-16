package com.finalwebproject.guardpermissionguaranted.SecurityRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalwebproject.guardpermissionguaranted.Model.Signup;

@Repository
public interface userlogRepo extends JpaRepository<Signup, Long> {
    
    Signup findByusername(String name);
}
