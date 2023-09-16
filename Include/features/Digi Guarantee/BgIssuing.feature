#Feature BG ISSUING
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  @Save_as_Draf_BgIssuing01
  Scenario Outline: SaveasDraf BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satu <cell>
   And   User Input BgIssuing tab dua <cell>
   And   User Input BgIssuing tab tiga <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing SaveasDraf

    Examples: 
      |user|cell|
      |3   |2   |

  @Create_BgIssuingtunai01
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satudua <cell>
   And   User Input BgIssuing tab duadua <cell>
   And   User Input BgIssuing tab tiga <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |2   |

  @Create_BgIssuingtunai02
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satu <cell>
   And   User Input BgIssuing tab dua <cell>
   And   User Input BgIssuing tab tiga <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |2   |
      
  @Create_BgIssuingNCL01
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satu <cell>
   And   User Input BgIssuing tab dua <cell>
   And   User Input BgIssuing tab tigatiga <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |5   |
      
  @Create_BgIssuingNCL02
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satudua <cell>
   And   User Input BgIssuing tab duadua <cell>
   And   User Input BgIssuing tab tigatiga <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |5   |
      
  @Create_BgIssuingkombinasi01
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satudua <cell>
   And   User Input BgIssuing tab duadua <cell>
   And   User Input BgIssuing tab tigaempat <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |6   |
      
  @Create_BgIssuingkombinasi02
  Scenario Outline: Create BgIssuing
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satu <cell>
   And   User Input BgIssuing tab dua <cell>
   And   User Input BgIssuing tab tigaempat <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |6   |

  @Create_BgIssuingAsuransi01
  Scenario Outline: Create BgIssuingAsuransi
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satu <cell>
   And   User Input BgIssuing tab dua <cell>
   And   User Input BgIssuing tab tigadua <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED
       Examples: 
      |user|cell|
      |3   |3   |
      
  @Create_BgIssuingAsuransi02
  Scenario Outline: Create BgIssuingAsuransi02
   Given Login Addson sebagai User <user>
   When  User Input BgIssuing tab satudua <cell>
   And   User Input BgIssuing tab duadua <cell>
   And   User Input BgIssuing tab tigadua <cell>
   And   User Input BgIssuing tab empat <cell>
   And   User Input BgIssuing tab lima <cell>
   Then  BgIssuing CREATED

    Examples: 
      |user|cell|
      |3   |3   |
      
  @Approval01
  Scenario Outline: Approval01
    Given Login Addson sebagai User <user>
    When User Approve BgIssuing <cell>
    Then BgIssuing Terapprove

    Examples: 
      |user|cell|
      |7   |2   |
      
  @Rejected01
  Scenario Outline: Rejected01
    Given Login Addson sebagai User <user>
    When User Reject BgIssuing <cell>
    Then BgIssuing Tereject

    Examples: 
      |user|cell|
      |7   |2   |
      
  @Rework01
  Scenario Outline: Rework01
    Given Login Addson sebagai User <user>
    When User Rework BgIssuing <cell>
    Then BgIssuing Terework

    Examples: 
      |user|cell|
      |7   |2   |
      
  @Download
  Scenario Outline: Download BgIssuing
   When  User Download BgIssuing
   Then  Data BgIssuing Terdownload
       Examples: 
      |user|cell|
      |3   |2   |
      
  @Filter
  Scenario Outline: Filter BgIssuing
   Given Login Addson sebagai User <user>
   When  User Filter BgIssuing <cell>
   Then  Data BgIssuing Terfilter
       Examples: 
      |user|cell|
      |3   |2   |

  @Search
  Scenario Outline: Search BgIssuing
   When  User Search BgIssuing
   Then  Data BgIssuing ditemukan
       Examples: 
      |user|cell|
      |3   |2   |
      
  @DeleteDraf
  Scenario Outline: DeleteDraf
   Given Login Addson sebagai User <user>
   When  User DeleteDraf <cell>
   Then  Data BgIssuing Terhapus
       Examples: 
      |user|cell|
      |3   |3   |