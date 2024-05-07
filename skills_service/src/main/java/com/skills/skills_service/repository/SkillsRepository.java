package com.skills.skills_service.repository;

import com.skills.skills_service.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
