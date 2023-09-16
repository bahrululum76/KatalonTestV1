#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Feature SWIFT
@tag
Feature: Swift
  I want to use this template for my feature file

@Create_Swift_SaveAsDraf
  Scenario Outline: Create Swift SaveAsDraf
   Given Login Addson sebagai User <user>
   When  User Create SwiftDraft <cell>
   And   User Klik Send&Approval
   Then  User Klik Done

    Examples: 
      |user|cell|
      |3   |2   |

@Create_Swift_USD
  Scenario Outline: Create Swift
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |2   |
      
@Create_Swift_Large
  Scenario Outline: Create Swift Large
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |3   |
      
@Create_Swift_AUD
  Scenario Outline: Create Swift AUD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |4   |
      
@Create_Swift_CAD
  Scenario Outline: Create Swift CAD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |5   |  
     
 @Create_Swift_CHF
  Scenario Outline: Create Swift CHF
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |6   |
 
 @Create_Swift_CNY
  Scenario Outline: Create Swift CNY
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |7   |

 @Create_Swift_EUR
  Scenario Outline: Create Swift EUR
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |8   |     
      
 @Create_Swift_GBP
  Scenario Outline: Create Swift GBP
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |9   |    
    
  @Create_Swift_HKD
  Scenario Outline: Create Swift HKD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |10   |      
      
 @Create_Swift_JPY
  Scenario Outline: Create Swift JPY
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |11  |    
    
 @Create_Swift_NOK
  Scenario Outline: Create Swift NOK
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |12  | 
      
 @Create_Swift_NZD
  Scenario Outline: Create Swift NZD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |13  |
      
 @Create_Swift_SAR
  Scenario Outline: Create Swift SAR
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |14  |
      
  @Create_Swift_SEK
  Scenario Outline: Create Swift SEK
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |15  |
      
  @Create_Swift_SGD
  Scenario Outline: Create Swift SGD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |16  |

  @Create_Swift_SGD_L
  Scenario Outline: Create Swift SGD
   Given Login Addson sebagai User <user>
   When  User Create Swift <cell>
   And   User Klik Send&Approval
   Then  User Klik Submit

    Examples: 
      |user|cell|
      |3   |17  |
      
 @Create_SwiftS_USD_S  
  Scenario Outline: Create Swift Schedule
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |2   |
     
@Create_SwiftS_USD_Large_S  
  Scenario Outline: Create Swift Schedule
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |3   |
     
@Create_Swift_AUD_S
  Scenario Outline: Create Swift AUD_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |4   |     
      
@Create_Swift_CAD_S
  Scenario Outline: Create Swift CAD_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |5   |  
     
 @Create_Swift_CHF_S
  Scenario Outline: Create Swift CHF_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |6   |
 
 @Create_Swift_CNY_S
  Scenario Outline: Create Swift CNY_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |7   |

 @Create_Swift_EUR_S
  Scenario Outline: Create Swift EUR_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |8   |     
      
 @Create_Swift_GBP_S
  Scenario Outline: Create Swift GBP_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |9   |    
    
  @Create_Swift_HKD_S
  Scenario Outline: Create Swift HKD_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |10   |      
      
 @Create_Swift_JPY_S
  Scenario Outline: Create Swift JPY_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |11  |    
    
 @Create_Swift_NOK_S
  Scenario Outline: Create Swift NOK_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |12  | 
      
 @Create_Swift_NZD_S
  Scenario Outline: Create Swift NZD_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |13  |
      
 @Create_Swift_SAR_S
  Scenario Outline: Create Swift SAR_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |14  |
      
  @Create_Swift_SEK_S
  Scenario Outline: Create Swift SEK_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |15  |
      
  @Create_Swift_SGD_S
  Scenario Outline: Create Swift SGD_S
   Given Login Addson sebagai User <user>
   When  User Create SwiftS <cell>
   And   User Klik Send&ApprovalS
   Then  User Klik SubmitS

    Examples: 
      |user|cell|
      |3   |16  |
      
#Filter
  @filter_swift01
  Scenario Outline: Filter
    Given Login Addson sebagai User <user>
    When Filter Tabel by <cell> 
    Then Tampil sesuai filter

    Examples: 
      | user  | cell |
      | 3     |    2 |

#Search
  @Search
  Scenario Outline: Searching History Swift
    When Input Keyword Searching by <cell>
    And Input Kerword Searching Activity Log
    Then Data Tampil sesuai Searching

    Examples: 
      | user  | cell |
      | 3     |    2 |
      
#Download
  @Download_data_table
  Scenario Outline: Download data table 
    When Download by data table 
    Then Data terdownload
    
    Examples: 
      | user  | cell |
      | 3     |    2 |
      
#Approval
  @Approval01
  Scenario Outline: Approval Swift Checker
    Given Login Addson sebagai User <user>
    When User Melakukan Approval <cell>
    Then Transaksi Berhasil di Approve

    Examples: 
      |user|cell|
      |7   |2   |
      
#@Approval02
  #Scenario Outline: Approval Swift Signer
    #Given Login Addson sebagai User <user>
    #When User Melakukan Approval <cell>
    #Then Transaksi Berhasil di Approve
#
    #Examples: 
      #|user|cell|
      #|2   |2   |
#
#@Approval03
  #Scenario Outline: Approval Swift Releaser
    #Given Login Addson sebagai User <user>
    #When User Melakukan Approval <cell>
    #Then Transaksi Berhasil di Approve
#
    #Examples: 
      #|user|cell|
      #|2   |2   |
      
#Rejected
  @Rejected01
  Scenario Outline: Rejected Swift Checker
    Given Login Addson sebagai User <user>
    When User Melakukan Rejected <cell>
    Then Transaksi Berhasil di Reject

    Examples: 
      |user|cell|
      |7   |2   |
 
  #@Rejected02
  #Scenario Outline: Rejected Swift Signer
    #Given Login Addson sebagai User <user>
    #When User Melakukan Rejected <cell>
    #Then Transaksi Berhasil di Reject
#
    #Examples: 
      #|user|cell|
      #|4   |2   |
      #
  #@Rejected03
  #Scenario Outline: Rejected Swift Releaser
    #Given Login Addson sebagai User <user>
    #When User Melakukan Rejected <cell>
    #Then Transaksi Berhasil di Reject
#
    #Examples: 
      #|user|cell|
      #|4   |2   |
      
#Rework

  @Rework01
  Scenario Outline: Rework Swift Checker
    Given Login Addson sebagai User <user>
    When User Melakukan Rework <cell>
    Then Transaksi Berhasil di Rework

    Examples: 
      |user|cell|
      |7   |2   |
  
  #@Rework02
  #Scenario Outline: Rework Swift Signer
    #Given Login Addson sebagai User <user>
    #When User Melakukan Rework <cell>
    #Then Transaksi Berhasil di Rework
#
    #Examples: 
      #|user|cell|
      #|4   |2   |
      #
  #@Rework03
  #Scenario Outline: Rework Swift Releaser
    #Given Login Addson sebagai User <user>
    #When User Melakukan Rework <cell>
    #Then Transaksi Berhasil di Rework
#
    #Examples: 
      #|user|cell|
      #|4   |2   |