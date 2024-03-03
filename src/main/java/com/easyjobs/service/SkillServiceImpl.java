package com.easyjobs.service;

import com.easyjobs.entity.Skill;
import com.easyjobs.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }
}
