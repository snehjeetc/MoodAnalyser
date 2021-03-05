package com.moodanalyser;

public class MoodAnalysisException extends Exception{
    enum ExceptionType  {
        NULL_MOOD,
        EMPTY_MOOD;
    }
    ExceptionType type;
    public MoodAnalysisException(ExceptionType type, String message) {
        super(type.toString() + ": "+ message);
        this.type = type;
    }
}
