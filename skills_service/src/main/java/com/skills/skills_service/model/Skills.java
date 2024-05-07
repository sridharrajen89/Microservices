package com.skills.skills_service.model;

import jakarta.persistence.*;

@Entity
@Table(name="skills")
public class Skills {
    @Id
    @Column(name="skill_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int skill_ID;
    private String skill_Name;

    public Skills(int skill_ID, String skill_Name) {
        this.skill_ID = skill_ID;
        this.skill_Name = skill_Name;
    }

    public int getSkill_ID() {
        return skill_ID;
    }

    public void setSkill_ID(int skill_ID) {
        this.skill_ID = skill_ID;
    }

    public String getSkill_Name() {
        return skill_Name;
    }

    public void setSkill_Name(String skill_Name) {
        this.skill_Name = skill_Name;
    }


}
