#Feature BIFAST
@Bifast
Feature: Title of your feature
  I want to use this template for my feature file

#Create
  @Create_BIFAST_Immediate
  Scenario Outline: Create BI FAST Immediate
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Immediate <cell>
   Then  BIFAST Immediate CREATED

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Create_BIFAST_saveasdraf
  Scenario Outline: Create BI FAST Immediate
   Given Login Addson sebagai User <user>
   When  User Create BI FAST SaveAsDraf <cell>
   Then  BIFAST SaveAsDraf CREATED

    Examples: 
      |user|cell|
      |3   |2   |
      
@Create_BIFAST_min
  Scenario Outline: Create BI FAST Immediate
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Min <cell>
   Then  BIFAST Immediate CREATED

    Examples: 
      |user|cell|
      |3   |3   |
      
@Create_BIFAST_max
  Scenario Outline: Create BI FAST Immediate
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Max <cell>
   Then  BIFAST Immediate CREATED

    Examples: 
      |user|cell|
      |3   |4   |      
     
  @Create_BIFAST_Schedule
  Scenario Outline: Create BI FAST Schedule
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Schedule <cell>
   Then  BIFAST Schedule CREATED

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Create_BIFAST_Recurring_daily
  Scenario Outline: Create BI FAST Recurring daily
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Recurring Daily <cell>
   Then  BIFAST Recurring Daily CREATED

    Examples: 
      |user|cell|
      |3   |2   |
 
   @Create_BIFAST_Recurring_weekly
  Scenario Outline: Create BI FAST Recurring weekly
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Recurring weekly <cell>
   Then  BIFAST Recurring weekly CREATED

    Examples: 
      |user|cell|
      |3   |2   |

   @Create_BIFAST_Recurring_Monthly
   Scenario Outline: Create BI FAST Recurring monthly
   Given Login Addson sebagai User <user>
   When  User Create BI FAST Recurring Monthly <cell>
   Then  BIFAST Recurring monthly CREATED

    Examples: 
      |user|cell|
      |3   |2   |

#Approval
  @Approval01
  Scenario Outline: Approval01
    Given Login Addson sebagai User <user>
    When User Approve Transaksi BIFAST <cell>
    Then Transaksi BIFAST Terapprove

    Examples: 
      |user|cell|
      |7   |2   |
 
  #@Approval02
  #Scenario Outline: Approval02
    #Given Login Addson sebagai User <user>
    #When User Approve Transaksi BIFAST <cell>
    #Then Transaksi BIFAST Terapprove
#
    #Examples: 
      #|user|cell|
      #|7   |2   |
#
  #@Approval03
  #Scenario Outline: Approval03
    #Given Login Addson sebagai User <user>
    #When User Approve Transaksi BIFAST <cell>
    #Then Transaksi BIFAST Terapprove
#
    #Examples: 
      #|user|cell|
      #|7   |2   |
      
  @Rejected01
  Scenario Outline: Rejected01
    Given Login Addson sebagai User <user>
    When User Rejected Transaksi BIFAST <cell>
    Then Transaksi BIFAST Tereject

    Examples: 
      |user|cell|
      |7   |2   |
      
   #@Rejected02
  #Scenario Outline: Rejected02
    #Given Login Addson sebagai User <user>
    #When User Rejected Transaksi BIFAST <cell>
    #Then Transaksi BIFAST Tereject
#
    #Examples: 
      #|user|cell|
      #|7   |2   |
#
  #@Rejected03
  #Scenario Outline: Rejected03
    #Given Login Addson sebagai User <user>
    #When User Rejected Transaksi BIFAST <cell>
    #Then Transaksi BIFAST Tereject
#
    #Examples: 
      #|user|cell|
      #|7   |2   |
      
  @Rework01
  Scenario Outline: Rework01
    Given Login Addson sebagai User <user>
    When User Kirim Transaksi BIFAST ke Rework <cell>
    Then Transaksi BIFAST di kirim ke Rework

    Examples: 
      |user|cell|
      |7   |2   |
      
#History
  @Search_BIFAST
  Scenario Outline: Search BIFAST
   When  User Search BIFAST <cell>
   Then  Data Tampil sesuai Search

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Filter_BIFAST
  Scenario Outline: Filter BIFAST
   Given Login Addson sebagai User <user>
   When  User Filter BIFAST <cell>
   Then  Data Tampil sesuai Filter

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Download_BIFAST
  Scenario Outline: Download BIFAST
   When  User Download BIFAST
   Then  Data Terdownload

    Examples: 
      |user|cell|
      |3   |2   |


  @Delete_BIFAST_Draf
  Scenario Outline: Delete BIFAST Draft
   Given Login Addson sebagai User <user>
   When  User Delete BIFAST Draft <cell>
   Then  Data Terhapus

    Examples: 
      |user|cell|
      |3   |6   |
      