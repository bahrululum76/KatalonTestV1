#Cash Pooling
@tag
Feature: Title of your feature
  I want to use this template for my feature file

@EditLMDraft
  Scenario Outline: Edit LM Draf
   Given Login Addson sebagai User <user>
   When  User Edit cashpooling draft <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |2   |

@Create_LM_DailySaveAsDrafCU
  Scenario Outline: Create_LM_DailySaveAsDraf
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab1 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab33 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |2   |

@Create_LM_DailySaveAsDrafBA
  Scenario Outline: Create_LM_DailySaveAsDraf
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab1_BA <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab33 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |9   |2   |
@Create_LM_Daily
  Scenario Outline: Create_LM_Daily
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab1 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |2   |
     
@Create_LM_Pooling_Every
  Scenario Outline: Create_LM_Daily
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab11 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |3   |
      
@Create_LM_Pooling_Weekly
  Scenario Outline: Create_LM_Weekly
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab12 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |4   |
      
@Create_LM_Pooling_Monthly
  Scenario Outline: Create_LM_Monthly
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab13 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |5   |

@Create_LM_Pooling_MonthlyBA
  Scenario Outline: Create_LM_Monthly
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab13 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab3 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |9   |5   |

@Create_LM_Daily_1
  Scenario Outline: Create_LM_Daily
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab1 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab31 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |6   |

@Create_LM_Pooling_Every_1
  Scenario Outline: Create_LM_Daily
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab11 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab31 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |7   |
      
@Create_LM_Pooling_Weekly_1
  Scenario Outline: Create_LM_Weekly
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab12 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab31 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |8   |
      
@Create_LM_Pooling_Monthly_1
  Scenario Outline: Create_LM_Monthly_1
   Given Login Addson sebagai User <user>
   When  User Create cashpooling tab13 <cell>
   And   User Create cashpooling tab2
   And   User Create cashpooling tab31 <cell>
   Then  Cashpooling created

    Examples: 
      |user|cell|
      |3   |9   |
      
  @Filter_CashPooling_CU
  Scenario Outline: Filter BIFAST
   Given Login Addson sebagai User <user>
   When  User Filter CashPooling1 <cell>
   And   User Filter CashPooling2 <cell>
   And   User Filter CashPooling3 <cell>
   Then  Data cashpooling Tampil sesuai Filter

    Examples: 
      |user|cell|
      |3   |2   |      
      
  @Filter_CashPooling_BA
  Scenario Outline: Filter BIFAST
   Given Login Addson sebagai User <user>
   When  User Filter CashPooling1 <cell>
   And   User Filter CashPooling2 <cell>
   And   User Filter CashPooling3 <cell>
   Then  Data cashpooling Tampil sesuai Filter

    Examples: 
      |user|cell|
      |9   |2   |  
      
  @Search_CahPooling
  Scenario Outline: Search_CahPooling
   When  User Search CashPooling
   Then  Data CashPooling Tampil

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Download_CashPooling
  Scenario Outline: Download CashPooling
   When  User Download CashPooling
   Then  Data CashPooling Terdownload

    Examples: 
      |user|cell|
      |7   |2   |

  @Approval_CashPooling
  Scenario Outline: Approval CashPooling
   Given Login Addson sebagai User <user>
   When  User Approve CashPooling
   Then  Data CashPooling Terapprove

    Examples: 
      |user|cell|
      |7   |2   |
      
  @Rejected_CashPooling
  Scenario Outline: Rejected CashPooling
   Given Login Addson sebagai User <user>
   When  User Reject CashPooling
   Then  Data CashPooling Tereject

    Examples: 
      |user|cell|
      |7   |2   |
      
   @Rework_CashPooling
  Scenario Outline: Rework CashPooling
   Given Login Addson sebagai User <user>
   When  User Rework CashPooling
   Then  Data CashPooling Terework

    Examples: 
      |user|cell|
      |7   |2   |