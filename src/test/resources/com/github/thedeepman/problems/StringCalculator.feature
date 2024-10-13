Feature: Basic calculator with one string as input expression. Ignore spaces. PEMDAS math order applies

    Scenario Outline: Basic Calculator
        Given I have a calculator input as "<input>"
        When I give send it to the calculator
        Then the calculator result should be <answer>

        Examples:
            | input     | answer |
            | 3+2* 2    | 7      |
            | 1- 3*6/ 9 | -1     |
            | 2/2 + 3*4 | 13     |
            | 32 - 16/2 | 24     |

