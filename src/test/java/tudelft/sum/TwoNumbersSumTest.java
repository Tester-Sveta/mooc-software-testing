package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    void addTwoSingleDigitsNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(2);
        second_number.add(3);
        expected.add(5);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
    @Test
    void addTwoDigitsNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(2);
        first_number.add(1);
        second_number.add(3);
        second_number.add(2);
        expected.add(5);
        expected.add(3);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
    @Test
    void addTwoDigitsWithCarryOverNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(8); first_number.add(7);
        second_number.add(4); second_number.add(9);
        expected.add(1); expected.add(3); expected.add(6);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
    @Test
    void addThreeDigitsNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(8); first_number.add(7);first_number.add(1);
        second_number.add(1); second_number.add(2);second_number.add(8);
        expected.add(9); expected.add(9); expected.add(9);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }

    @Test
    void addThreeDigitsWithCarryOverNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(9); first_number.add(9);first_number.add(9);
        second_number.add(9); second_number.add(9);second_number.add(9);
        expected.add(1); expected.add(9); expected.add(9); expected.add(8);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
    @Test
    void addZero() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(8); first_number.add(7);
        second_number.add(0);
        expected.add(8); expected.add(7);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
    @Test
    void addDifferentLengthDigitsNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first_number = new ArrayList<>();
        ArrayList<Integer> second_number = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first_number.add(9);
        second_number.add(1); second_number.add(2);second_number.add(8);
        expected.add(1); expected.add(3); expected.add(7);
        ArrayList<Integer> result_array = sum.addTwoNumbers(first_number,second_number);
        Assertions.assertEquals(expected,result_array);
    }
}
