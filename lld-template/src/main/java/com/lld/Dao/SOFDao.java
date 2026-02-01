package com.lld.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTML.Tag;

import com.lld.CT.Tags;
import com.lld.modal.Answer;
import com.lld.modal.Comments;
import com.lld.modal.Question;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class SOFDao {
    private final Map<String, Question> questionIdToQuestionMap;
    private final Map<String, Answer> answerIdToAnswerMap;
    private final Map<String, Comments> commentIdToCommentMap;

   public List<Question> getALLQuestions(){
       return new ArrayList<>(this.questionIdToQuestionMap.values());
   }
   public Question getQuestion(String questionId) {
        return this.questionIdToQuestionMap.get(questionId);
   }

   public synchronized void addQuestion(Question question){
       this.questionIdToQuestionMap.put(question.getId(), question);
   }

   public void addAnswer(Question question, Answer answer){
    answerIdToAnswerMap.put(answer.getId() , answer);
    question.addAnswer(answer);
   }

   public void addComments(Question question , Comments cmnt){
      this.commentIdToCommentMap.put(question.getId(), cmnt);
      question.addComments(cmnt);
   }

   public void addCommentstoAnswer(Answer ans , Comments cmnt){
       ans.addComment(cmnt);
       this.commentIdToCommentMap.put(cmnt.getId(), cmnt);
   }

   public void addTag(Question question , Tags tag){
      question.addTags(tag);
   }
}
