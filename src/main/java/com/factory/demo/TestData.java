package com.factory.demo;

import com.factory.demo.domain.Skill;

import java.util.*;

public class TestData {

    private static int HIGHEST_ID;
    private static Map<Integer, Skill> SKILLS;

    static {
        SKILLS = new LinkedHashMap<>();
        SKILLS.put(1, Skill.builder()
                .id(1)
                .name("Java")
                .build());
        SKILLS.put(2, Skill.builder()
                .id(2)
                .name("CSharp")
                .build());
        SKILLS.put(3, Skill.builder()
                .id(3)
                .name("Rust")
                .build());
        SKILLS.put(4, Skill.builder()
                .id(4)
                .name("Go")
                .build());

        HIGHEST_ID = 4;
    }

    public static List<Skill> skills() {
        return new ArrayList<>(SKILLS.values());
    }

    public static Skill addSkill(Skill skill) {
        Iterator<Map.Entry<Integer, Skill>> it = SKILLS.entrySet().iterator();
        int highestId = 0;
        while (it.hasNext()) {
            Map.Entry<Integer, Skill> entry = it.next();
            highestId = entry.getKey();
        }

        int id = highestId > HIGHEST_ID ? highestId++ : HIGHEST_ID++;
        HIGHEST_ID = id;
        skill.setId(HIGHEST_ID);
        SKILLS.put(HIGHEST_ID, skill);
        return skill;
    }

}
