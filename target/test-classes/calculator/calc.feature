#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: calculator verification
 
   
   
    @tag1
  Scenario Outline: verify Add function
    Given user inputs two int values to add <input1> and <input2>
    When user calls add method
    Then user should get addition output as <output>
    
    Examples:
    |input1|input2|output|
    |5     |     6|    11|
    |20    |     8|    28|
    |100   |   200|   300|
   
    @tag2
  Scenario Outline: verify subtract function
    Given user inputs two int values to subtract <input1> and <input2>
    When user calls subtract method
    Then user should get subtraction output as <output>
    
     Examples:
    |input1|input2|output|
    |5     |     6|    -1|
    |20    |     8|    12|
    |100   |   200|  -100|
    
     
     @tag1 @tag2
  Scenario Outline: verify multiply function
    Given user inputs two int values to multiply <input1> and <input2>
    When user calls multiply method
    Then user should get multiplication output as <output>
    
     Examples:
    |input1|input2|output|
    |5     |     6|    30|
    |20    |     8|   160|
    |100   |   200| 20000|
    
     @c
  Scenario Outline: verify Division function
    Given user inputs two int values to div <input1> and <input2>
    When user calls div method
    Then user should get division output as <output>
    
     Examples:
    |input1|input2|output|
    |6    |     6|      1|
    |8    |     2|      4|
    |200  |   100|      2|
  
  