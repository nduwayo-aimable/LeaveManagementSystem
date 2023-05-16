package com.finalwebproject.guardpermissionguaranted.Model;


import java.util.*;

import jakarta.persistence.*;

@Entity
public class leavesTB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leave_id;
    private Date leavedate;
    private Date backdate;
    private String reason;
    @JoinColumn(name ="guard_id")
    private Signup pearson;

    
    public leavesTB() {
    }


    public Long getLeave_id() {
        return leave_id;
    }


    public void setLeave_id(Long leave_id) {
        this.leave_id = leave_id;
    }


    public Date getLeavedate() {
        return leavedate;
    }


    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }


    public Date getBackdate() {
        return backdate;
    }


    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }


    public String getReason() {
        return reason;
    }


    public void setReason(String reason) {
        this.reason = reason;
    }


    public Signup getPearson() {
        return pearson;
    }


    public void setPearson(Signup pearson) {
        this.pearson = pearson;
    }






}
