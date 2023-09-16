
#Subscription
@tag
Feature: Title of your feature
  I want to use this template for my feature file

@Filter_Subscription
  Scenario Outline: Filter Subscription
   Given Login Addson sebagai User <user>
   When  User Filter Subscription <cell>
   Then  Data Subscription Tampil sesuai Filter

    Examples: 
      |user|cell|
      |9   |2   |  
      
  @Search_Subscription
  Scenario Outline: Search Subscription
   Given Login Addson sebagai User <user>
   When  User Search Subscription <cell>
   Then  Data Subscription Tampil

    Examples: 
      |user|cell|
      |9   |2   |
      
  @Download_Subscription
  Scenario Outline: Download Subscription
   Given Login Addson sebagai User <user>
   When  User Download Subscription
   Then  Data Subscription Terdownload

    Examples: 
      |user|cell|
      |9   |2   |