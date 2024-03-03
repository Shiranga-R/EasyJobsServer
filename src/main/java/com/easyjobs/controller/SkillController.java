package com.easyjobs.controller;

import com.easyjobs.entity.Skill;
import com.easyjobs.service.SkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping("/get-all")
    public List<Skill> getAll() {
        return skillService.getAll();
    }

    @PostMapping("/save")
    public Skill save(@RequestBody Skill skill) {
        return skillService.save(skill);
    }
}
