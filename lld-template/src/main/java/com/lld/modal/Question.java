package com.lld.modal;

import java.util.*;

import com.lld.CT.Tags;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Question extends Entity {

    private List<Tags> tags;
    private List<Comments> cmmnts;
    private List<Answer> answers;

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public void addComments(Comments cmnt) {
        this.cmmnts.add(cmnt);
    }

    public void addTags(Tags tag) {
        this.tags.add(tag);
    }

}
