package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.PrintStream;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Sad Mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        }catch(MoodAnalysisException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldRerturnHappy(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in Happy Mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }catch(MoodAnalysisException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMoodShouldThrowNullMoodException(){
        try {
            ExpectedException exceptionrule = ExpectedException.none();
            exceptionrule.expect(MoodAnalysisException.class);
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }catch(MoodAnalysisException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }

    @Test
    public void givenEmptyMoodShouldThrowEmptyMoodException(){
        try {
            ExpectedException exceptionrule = ExpectedException.none();
            exceptionrule.expect(MoodAnalysisException.class);
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }catch(MoodAnalysisException e){
            PrintStream obj = new PrintStream(System.out);
            e.printStackTrace(obj);
        }
    }
}
