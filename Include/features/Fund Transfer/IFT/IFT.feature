
@IFT
Feature: Modul IFT - Single
  I want to use this template for my feature file

 #Create
 	@Create_IFT_Immediate
 	Scenario Outline: Create IFT Immediate
 	 Given Login Addson sebagai User <user>
 	 When User Create IFT Immediate <cell>
   Then IFT Immediate CREATED
 	
 	  Examples:
 	  	 |user|cell|
       |3   |2   |
       
	@Create_IFT_Schedule
 	Scenario Outline: Create IFT Schedule
 	 Given Login Addson sebagai User <user>
	 When User Create IFT Schedule <cell>
 	 Then IFT Schedule CREATED
 	
 	  Examples:
 	  	 |user|cell|
       |3   |2   |
       
       
  @Create_IFT_Recurring
 	Scenario Outline: Create IFT Recurring
 	 Given Login Addson sebagai User <user>
 	 When User Create IFT Recurring <cell>
 	 Then IFT Recurring CREATED
 	
 	  Examples:
 	  	 |user|cell|
       |3   |2   |
       
       
       @Reject_IFT
       Scenario Outline: Reject IFT Task
       Given Login Addson sebagai User <user>
       When User Reject IFT Task 02 <cell>
       Then IFT Rejected
       Examples: 
       |user|cell|
       |7   |2   |
       
       @Approve_IFT
       Scenario Outline: Approve IFT Task
       Given Login Addson sebagai User <user>
       When User Approve IFT Task 03 <cell>
       Then IFT Approved
       Examples: 
       |user|cell|
       |7   |2   |
       
       @SendToRework_IFT
       Scenario Outline: Send To Rework IFT Task
       Given Login Addson sebagai User <user>
       When User Send to Rework IFT Task 01 <cell>
       Then IFT SendToReworked
       Examples: 
       |user|cell|
       |7   |2   |
       
       
       