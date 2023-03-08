package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] arrCopy = Arrays.copyOf(array, array.length);
        Collections.reverse(Arrays.asList(arrCopy));
        return Arrays.equals(array, arrCopy);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentence = Arrays.toString(array).replace(", ","").trim().toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if(sentence.indexOf(letter)<0)
                return false;
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int total = 0;
        for (int i =0; i<array.length; i++) {
            if (array[i].equals(value))
                total ++;
        }
        return total;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] arr = array;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                arr = ArrayUtils.removeElement(array, array[i]);
            }
        }
        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList();
        arr.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                arr.add(array[i]);
            }
        }
        return arr.toArray(new String[arr.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < array.length; i++) {
            if (i == 0) {
                sb.append(array[i]);
            }
            else if (array[i] == array [i -1]) {
                sb.append(array[i]);
            }
            else {
                sb.append(" " + array[i]);
            }

        }
        return sb.toString().split(" ");
    }
}