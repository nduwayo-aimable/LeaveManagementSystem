package com.finalwebproject.guardpermissionguaranted.SecurityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalwebproject.guardpermissionguaranted.Model.Signup;
import com.finalwebproject.guardpermissionguaranted.SecurityRepos.UserRepository;

@Service
public class SignupService {
    @Autowired
    private UserRepository userRepo;


    public void saveSignup(Signup signup){

        userRepo.save(signup);

    }

    public Long getTotalUser(){
        return userRepo.count();
    }

    public List<Signup> getAllUsers (){
        return userRepo.findAll();
    }

    public void deteById(Long id){
        userRepo.deleteById(id);
    }

    public Signup getUserById(Long id){

        return userRepo.findById(id).get();
    }

}
