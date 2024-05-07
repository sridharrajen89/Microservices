package com.skills.skills_service.service;

import com.skills.skills_service.model.Skills;
import com.skills.skills_service.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsRepository skillsRepository;


    // fetching all skills
    public List<Skills> getAllSkills(){
        List<Skills> skills = (List<Skills>)skillsRepository.findAll();
        return skills;
    }

    // inserting skills
    public void addSkills(Skills skills) {
        skillsRepository.save(skills);
    }

    // updating skills by id
    public void updateSkills(Skills skills, int id){
        if(id == skills.getSkill_ID()) {
            skillsRepository.save(skills);
        }
    }

    // deleting all skills
    public void deleteAllSkills(){
        skillsRepository.deleteAll();
    }

    // deleting skills by id
    public void deleteSkillByID(long id){
        skillsRepository.deleteById(id);
    }

    //patching/updating skills by id
    public void patchSkills(Skills skills, int id) {
        if(id == skills.getSkill_ID()) {
            skillsRepository.save(skills);
        }
    }
}
