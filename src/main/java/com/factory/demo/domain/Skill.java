package com.factory.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Skill {

    private int id;
    private String name;
}
