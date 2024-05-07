package com.skills.skills_service.controller;

import com.skills.skills_service.model.Skills;
import com.skills.skills_service.service.SkillsService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.Logger;

import java.util.List;

@RestController
public class SkillsController {

    static final Logger logger  = LogManager.getLogger(SkillsController.class.getName());

    @Autowired
    private SkillsService skillsService;

    // displaying list of all skills
    @GetMapping("/skills")
    public List<Skills> getAllSkills(){
        return skillsService.getAllSkills();
    }

    // inserting skills
    @PostMapping("/skills")
    public void addDepartment(@RequestBody Skills skills){
        skillsService.addSkills(skills);
    }

    //updating skill by id
    @PutMapping("/skills/{id}")
    public void updateSkills(@RequestBody Skills skills, @PathVariable int id){
        skillsService.updateSkills(skills, id);
    }

    // deleting all skill
    @DeleteMapping("/skills")
    public void deleteAllSkills(){
        skillsService.deleteAllSkills();
    }

    // deleting skills by id
    @DeleteMapping("skills/{id}")
    public void deleteSkillsByID(@RequestBody Skills skills, @PathVariable int id){
        skillsService.deleteSkillByID(id);
    }

    // updating/ patching skills by id
    @PatchMapping("skills/{id}")
    public void patchSkillsByID(@RequestBody Skills skills, @PathVariable int id) {
        skillsService.patchSkills(skills, id);
    }
}
