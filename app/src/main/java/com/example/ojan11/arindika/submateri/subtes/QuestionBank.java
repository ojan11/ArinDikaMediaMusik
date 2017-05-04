package com.example.ojan11.arindika.submateri.subtes;

/**
 * Created by ojan11 on 5/4/2017.
 */

public class QuestionBank {
    private String textQuestions [] = {
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",
            "Nama nada pada gambar di bawah ini adalah ...",

    };

    private String multipleChoice [][] = {
            {"B","G","C","F"},
            {"B","G","C","F"},
            {"B","G","C","F"},
            {"F","A","B","G"},
            {"D","A","F","C"},
            {"D","B","A","E"},
            {"C","E","F","B"},
            {"C","E","F","B"},
            {"A","D","G","F"},
            {"D","A","F","C"}
    };

    private String mCorrectAnswers[] = {
            "C",
            "G",
            "B",
            "G",
            "A",
            "A",
            "F",
            "E",
            "D",
            "C"
    };
    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
