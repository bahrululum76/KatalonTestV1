#Investment Example
@tag
Feature: Login Automate

      @User_Login_Signer
      Scenario Outline: User Login Signer
      Given Login Addson sebagai User <user>
      
      Examples:
      |user|
      |7   |
      
      @User_Login_Maker
      Scenario Outline: User Login Maker
      Given Login Addson sebagai User <user>
      
      Examples:
      |user|
      |3   |
      
       @User_Login_BA
      Scenario Outline: User Login Maker
      Given Login Addson sebagai User <user>
      
      Examples:
      |user|
      |9   |
      
      