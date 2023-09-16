
@Payroll
Feature: Modul Payroll

 #Download
 	@Download_Data_Payroll
 	Scenario Outline: Download Payroll Data
 	 Given Login Addson sebagai User <user>
 	 When User Download Payroll Data
   Then Data Downloaded
 	
 	  Examples:
 	  	 |user|
       |3   |
       
  @Download_Data_Payroll_Excel
 	Scenario Outline: Download Payroll Data
 	 Given Login Addson sebagai User <user>
 	 When User Download Payroll Data Excel
   Then Data Excel Downloaded
 	
 	  Examples:
 	  	 |user|
       |3   |
       
  @Download_Data_Payroll_CSV
 	Scenario Outline: Download Payroll Data
 	 Given Login Addson sebagai User <user>
 	 When User Download Payroll Data CSV
   Then Data CSV Downloaded
 	
 	  Examples:
 	  	 |user|
       |3   |
	