package com.quiz.quizapp.controller;


import com.quiz.quizapp.model.Question;
import com.quiz.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @CrossOrigin
    @RequestMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return questionService.getAllQuestions();
    }
    @CrossOrigin
    @GetMapping("category/{category}")
    public ResponseEntity <List<Question>> getQuestionsByCategory(@PathVariable("category") String category){
        return questionService.getQuestionsByCategory(category);
    }
    @CrossOrigin
    @PostMapping("add")
    public ResponseEntity<String>  addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
