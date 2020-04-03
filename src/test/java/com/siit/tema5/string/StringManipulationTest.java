//01 Write a method to reverse a given string in place.
//02 Write a method to print duplicate characters from a string.
//03 Write a method to check if two strings are anagrams of each other.
//04 Write a method to find all the permutations of a string.
//05 Write a method to check if a string contains only digits.
//06 Write a method to find duplicate characters in a given string.
//07 Write a method to count a number of vowels and consonants in a given string.
//08 Write a method to count the occurrence of a given character in a string.
//09 Write a method to print the first non-repeated character from a string.
//10 Write a method to convert a given String into int like the atoi().
//11 Write a method to reverse words in a given sentence without using any library method.
//12 Write a method to check if two strings are a rotation of each other.
//13 Write a method to check if a given string is a palindrome.
//14 Write a method to find the length of the longest substring without repeating characters.
//15 Given string str, write a method to find the longest palindromic substring in str.
//16 Write a method to remove the duplicate character from String.
//17 Write a method to remove a given character from String.
//18 Given an array of strings, find the most frequent word in a given array, I mean, the string

package com.siit.tema5.string;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)

public class StringManipulationTest {

        private StringManipulationToBeTested sut;

    @Test
    public void return_something (){
        //Given
        String input= "";

        //When
        String retunredString=sut.reverseWordsOrder(input);

        //Then
        assertThat(retunredString.isEmpty());



    }







}