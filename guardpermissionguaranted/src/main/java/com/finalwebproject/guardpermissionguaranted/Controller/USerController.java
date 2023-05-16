package com.finalwebproject.guardpermissionguaranted.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
import com.finalwebproject.guardpermissionguaranted.Model.Signup;

import com.finalwebproject.guardpermissionguaranted.SecurityRepos.userlogRepo;

import com.finalwebproject.guardpermissionguaranted.SecurityService.SignupService;

import jakarta.servlet.http.HttpSession;

@Controller
public class USerController {

    @Autowired
    private SignupService service;

    @Autowired
    private userlogRepo logRepo;

    @GetMapping("/login")
    public String login(){

        return"login";
    }

    @GetMapping("/signup")
    public String signuppage(){

        return"signup";
    }
    

    @GetMapping("/udateSignup/{id}")
    public String signup(@PathVariable("id") Long id , Model model){
        Signup mydata = service.getUserById(id);
        model.addAttribute("data",mydata);
        return"updatesignup";
    }

    @PostMapping("/saveSignup")
    public String saveUser(@ModelAttribute Signup signup){
        service.saveSignup(signup);
        return"/login";
    }

    @PostMapping("/updateSignup")
    public String updateSignup(@ModelAttribute Signup signup){
        service.saveSignup(signup);
        return "redirect:/showSignup";
    }

    @GetMapping("/dashboard")
    public String dashpage(Model model){
        long totousers = service.getTotalUser();
        model.addAttribute("totalUser",totousers);
        return"dashboard";
    }
    @GetMapping("/showSignup")
    public ModelAndView showsignup(){
        List<Signup> list = service.getAllUsers();

        return new ModelAndView("showsignup", "Signup", list);
    }

    @GetMapping("/userPage")
    public String normaPage(){
        return "userPage";
    }

    
    @GetMapping("/leaves")
    public String leavespage(){
        return "leave";
    }



    @PostMapping("/loginUser")
    public String loginUser(@RequestParam("username") String name, @RequestParam("password") String pass, HttpSession session){
        String admin ="admin";
        Signup userdata = logRepo.findByusername(name);
        if(userdata!=null && userdata.getUsername().equals(admin) && userdata.getPassword().equals(pass)){
            session.setAttribute("name", admin);
            return"redirect:/dashboard";
        }else if(userdata!=null && userdata.getUsername().equals(name) && userdata.getPassword().equals(pass)){
            session.setAttribute("name", name);
            return"redirect:/userPage";
        }else{
            return"errorpage";
        }
        
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        service.deteById(id);
        return "redirect:/showSignup";
    }

   
    



}
