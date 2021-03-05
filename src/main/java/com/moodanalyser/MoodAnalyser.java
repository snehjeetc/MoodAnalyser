package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    MoodAnalyser(){
        message = null;
    }

    MoodAnalyser(String message){
        this.message  = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException{
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException{
        try {
            if(message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD, "Please enter proper mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD, "Please enter proper mood");
        }
    }
}
