package com.finalwebproject.guardpermissionguaranted.SecurityRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalwebproject.guardpermissionguaranted.Model.leavesTB;

@Repository
public  interface LeaveRepository extends JpaRepository<leavesTB, Long>  {
    
}
