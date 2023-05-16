package com.finalwebproject.guardpermissionguaranted.SecurityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalwebproject.guardpermissionguaranted.Model.leavesTB;
import com.finalwebproject.guardpermissionguaranted.SecurityRepos.LeaveRepository;

@Service
public class LeaveServices {
    
    @Autowired
    private LeaveRepository leaveRepo;

    
    public void saveLeave(leavesTB mydata){
        leaveRepo.save(mydata);
    }


}
