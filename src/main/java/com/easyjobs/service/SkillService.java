package com.easyjobs.service;

import com.easyjobs.entity.Skill;

import java.util.List;

public interface SkillService {

    public List<Skill> getAll();

    public Skill save(Skill skill);
}
