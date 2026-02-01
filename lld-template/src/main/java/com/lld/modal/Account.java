package com.lld.modal;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Account {
    private UUID id;
    private String name;
    private String email;
}
