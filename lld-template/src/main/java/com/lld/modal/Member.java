package com.lld.modal;

import java.util.List;

import com.lld.CT.Badges;

import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuperBuilder
public class Member extends Guest {
    private Account account;
    private List<Badges> badges;
}
