package com.kata.fizzbuzz;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FizzbuzzTests {

    @Nested
    @DisplayName("Stage 1: FizzBuzz kata should ")
    class stage1FizzBuzzKataShould {

        @Test
        @DisplayName("not print any Fizz or buzz")
        public void not_print_any_fizz_or_buzz() throws Exception {
            assertThat(Fizzbuzz.stage1(1)).isEqualTo(List.of("1"));
        }

        @Disabled
        @Test
        @DisplayName("print Fizz when number is divisible by 3")
        public void print_fizz_when_number_is_divisible_by_3() {
            assertThat(Fizzbuzz.stage1(3)).isEqualTo(List.of("1", "2", "Fizz"));
        }

        @Disabled
        @Test
        @DisplayName("print Buzz when number is divisible by 5")
        public void print_buzz_when_number_is_divisible_by_5() throws Exception {
            assertThat(Fizzbuzz.stage1(5)).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"));
        }

        @Disabled
        @Test
        @DisplayName("print Buzz when number is divisible by 3 and 5")
        public void print_buzz_when_number_is_divisible_by_3_and_5() throws Exception {
            assertThat(Fizzbuzz.stage1(50)).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        }
    }

    @Nested
    @DisplayName("Stage 2: FizzBuzz kata should ")
    class stage2FizzBuzzKataShould {

        @Disabled
        @Test
        @DisplayName("not print any Fizz or buzz")
        public void not_print_any_fizz_or_buzz() {
            assertThat(Fizzbuzz.stage2(1)).isEqualTo(List.of("1"));
        }

        @Disabled
        @Test
        @DisplayName("print Fizz when number is divisible by 3")
        public void print_fizz_when_number_is_divisible_by_3() throws Exception {
            assertThat(Fizzbuzz.stage2(3)).isEqualTo(List.of("1", "2", "Fizz"));
        }

        @Disabled
        @Test
        @DisplayName("print Buzz when number is divisible by 5")
        public void print_buzz_when_number_is_divisible_by_5() throws Exception {
            assertThat(Fizzbuzz.stage2(5)).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"));
        }

        @Disabled
        @Test
        @DisplayName("print Buzz when number is divisible by 3 and 5")
        public void print_buzz_when_number_is_divisible_by_3_and_5() throws Exception {
            assertThat(Fizzbuzz.stage2(50)).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                                                              "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                                                              "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz"));
            assertThat(Fizzbuzz.stage2(55)).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                                                              "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                                                              "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz"));
        }
    }

}



/*

describe('Stage 2: FizzBuzz kata should ', () => {
    it('not print any Fizz or buzz', () => {
        expect(fizzBuzzStage2(1)).toEqual(["1"])
    })
    it('print Fizz when number is divisible by 3', () => {
        expect(fizzBuzzStage2(3)).toEqual(["1", "2", "Fizz"])
    })
    it('print Buzz when number is divisible by 5', () => {
        expect(fizzBuzzStage2(5)).toEqual(["1", "2", "Fizz", "4", "Buzz"])
    })
    it('print Buzz when number is divisible by 3 and 5', () => {
        expect(fizzBuzzStage2(50)).toEqual(["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
            "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz"])
    })
    it('print Buzz when number is divisible by 3 and 5', () => {
        expect(fizzBuzzStage2(55)).toEqual(["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
            "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz"])
    })
})





 */
