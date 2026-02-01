package com.lld.modal;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class Answer extends Entity {
    private List<Comments> cmnts;

    public void addComment(Comments cmnt){
        this.cmnts.add(cmnt);
    }
}
