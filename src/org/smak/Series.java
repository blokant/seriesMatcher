package org.smak;

/**
 * Created by smak on 22.02.16.
 */
public class Series {
    private final int ABC_LENGTH = 31; // for the russians
    private final char FIRST_LETTER = 'А'; // first latter in regional abc
    private char[] data = new char[2];
    private void initArray(){
        data[0] = data[1] = 'А';
    }
    public Series(){
        initArray();
    }
    public String getFirst(){
        initArray();
        return new String(data);
    }
    private  String getStringSeriesFor2Numbers(int firstLetter, int secondLetter){
        return String.valueOf((char) firstLetter) + String.valueOf((char) secondLetter);
    }
    private void saveNewLetters(int firstLetter, int secondLetter){
        data[0] = (char)secondLetter;
        data[1] = (char)firstLetter;
    }
    public String getNext(){
        int firstLetter = data[1];
        int secondLetter = data[0]; // AB  A-first, B - second
        if(secondLetter >= FIRST_LETTER + ABC_LENGTH){
            if(firstLetter >= FIRST_LETTER + ABC_LENGTH)
                return  getStringSeriesFor2Numbers(firstLetter,secondLetter); // return same series for all numbers greater than MAX
            firstLetter++;
            secondLetter = FIRST_LETTER;
            saveNewLetters(firstLetter, secondLetter);
            return getStringSeriesFor2Numbers(firstLetter,secondLetter);
        }
        secondLetter++;
        saveNewLetters(firstLetter,secondLetter);
        return getStringSeriesFor2Numbers(firstLetter,secondLetter);
    }
}
