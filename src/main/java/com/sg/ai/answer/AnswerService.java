// /sbb/src/main/java/com/sg/ai/anwer/AnswerService.java

package com.sg.ai.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.sg.ai.question.Question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;


    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}