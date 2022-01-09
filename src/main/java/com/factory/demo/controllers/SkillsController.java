package com.factory.demo.controllers;

import com.factory.demo.TestData;
import com.factory.demo.domain.Skill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillsController {

    @GetMapping("/skills")
    public List<Skill> getSkills() {
        return TestData.skills();
    }

    @PostMapping("/skills")
    public Skill addSkill(@RequestBody Skill skill) {
        return TestData.addSkill(skill);
    }

}
