package com.lld.modal;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Entity {
    private String id;
    private String content;
    private Map<String, Integer> voteTypeCountMap;
    private Member owner;
}
