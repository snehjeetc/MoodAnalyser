package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    MoodAnalyser(){
        message = null;
    }

    MoodAnalyser(String message){
        this.message  = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood(){
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
