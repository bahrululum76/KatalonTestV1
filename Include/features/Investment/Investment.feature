#Investment Example
@tag
Feature: Investment Tab Automate

	  @User_Download_Filter_Data_Investment_1
	  Scenario Outline: User Download filter Data 1 Investment <tab>
	   When  User Download and Filter Data <cell> Investment on <tab>
	   Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |9   |All Deposit Accounts|
	  
	  @User_Download_Filter_Data_Investment_2
	  Scenario Outline: User Download filter Data 2 Investment <tab>
	  When  User Download and Filter Data <cell> Investment on <tab>
	  Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |10  |Matured						 |
	  
	  @User_Download_Filter_Data_Investment_3
	  Scenario Outline: User Download filter Data 3 Investment <tab>
	  When  User Download and Filter Data <cell> Investment on <tab>
	  Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |11  |Failed							 |
	  
	  @User_Download_Filter_Data_Investment_4
	  Scenario Outline: User Download filter Data 4 Investment <tab>
	  When  User Download and Filter Data <cell> Investment on <tab>
	  Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |12  |Closed							 |
	  
	  @User_Download_Filter_Data_Investment_5
	  Scenario Outline: User Download filter Data 5 Investment <tab>
	  When  User Download and Filter Data <cell> Investment on <tab>
	  Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |13  |Active							 |
	  
	  @User_Download_Filter_Data_Investment_6
	  Scenario Outline: User Download filter Data 6 Investment <tab>
	  When  User Download and Filter Data <cell> Investment on <tab>
	  Then  Data Investment Terdownload

    Examples: 
	  |cell|tab								 |
	  |14  |On Process					 |
	  
	  @User_Filter_Data_Investment_1
	  Scenario Outline: User Filter Data 1 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |9   |All Deposit Accounts|
    
    @User_Filter_Data_Investment_2
	  Scenario Outline: User Filter Data 2 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |10   |Matured|
    
    @User_Filter_Data_Investment_3
	  Scenario Outline: User Filter Data 3 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |11   |Failed|
    
    @User_Filter_Data_Investment_4
	  Scenario Outline: User Filter Data 4 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |12   |Closed|
    
    @User_Filter_Data_Investment_5
	  Scenario Outline: User Filter Data 5 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |13   |Active|
    
    @User_Filter_Data_Investment_6
	  Scenario Outline: User Filter Data 6 Investment on Tab <tab>
	  When User Filter Data <cell> on Investment Tab <tab>
	  Then Data Investment Filtered
	  Examples:
	  |cell|tab    |
    |14   |On Process|
	  
	  @User_Search_Data_Investment_1
	  Scenario Outline: User Search Data 1 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab    |
    |9   |All Deposit Accounts|
    
    @User_Search_Data_Investment_2
	  Scenario Outline: User Search Data 2 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab |
    |10  |Matured|
    
    @User_Search_Data_Investment_3
	  Scenario Outline: User Search Data 3 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab |
    |11  |Failed|
    
     @User_Search_Data_Investment_4
	  Scenario Outline: User Search Data 4 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab |
    |12  |Closed|
    
     @User_Search_Data_Investment_5
	  Scenario Outline: User Search Data 5 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab |
    |13  |Active|
    
     @User_Search_Data_Investment_6
	  Scenario Outline: User Search Data 6 Investment on Tab <tab>
	  When User Search Data <cell> on Investment Tab <tab>
	  Then Data Investment Searched
    Examples:
    |cell|tab |
    |14  |On Process|

      @User_Download_Filter_Activity_Log
      Scenario Outline: User Download Filter Activity Log
      Given Login Addson sebagai User <user>
      When User Download and Filter Data <cell> Activity Log
      Then Data Investment Activity Log Terdownload
      
      Examples:
      |user|cell|
      |3   |9   |
      
      @User_Create_Non_Aro_Deposito
      Scenario Outline: User Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |9   |CA			| 1		|
      
      @User_Create_Non_Aro_Deposito_2
      Scenario Outline: User TC 2 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |10  |CA 		|	3		|
      
      @User_Create_Non_Aro_Deposito_3
      Scenario Outline: User TC 3 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |11  |CA			|	6		|
      
      @User_Create_Non_Aro_Deposito_4
      Scenario Outline: User TC 4 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |12  |CA			| 12	|
      
      @User_Create_Non_Aro_Deposito_5
      Scenario Outline: User TC 5 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |13  |SA			| 1		|
      
      @User_Create_Non_Aro_Deposito_6
      Scenario Outline: User TC 6 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |14  |SA			| 3		|
      
      @User_Create_Non_Aro_Deposito_7
      Scenario Outline: User TC 7 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |15  |SA			| 6		|
      
      @User_Create_Non_Aro_Deposito_8
      Scenario Outline: User TC 8 Create Non Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New NON ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data NON ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |16  |SA			| 12	|
      
      @User_Create_Aro_Deposito
      Scenario Outline: User Create Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |9   |CA			| 1		|
      
      @User_Create_Aro_Deposito_2
      Scenario Outline: User Create 2 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |10  |CA 		|	3		|
      
      @User_Create_Aro_Deposito_3
      Scenario Outline: User Create 3 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |11  |CA			|	6		|
      
      @User_Create_Aro_Deposito_4
      Scenario Outline: User Create 4 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |12  |CA			| 12	|
      
      @User_Create_Aro_Deposito_5
      Scenario Outline: User Create 5 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |13  |SA			| 1		|
      
      @User_Create_Aro_Deposito_6
      Scenario Outline: User Create 6 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |14  |SA			| 3		|
      
      @User_Create_Aro_Deposito_7
      Scenario Outline: User Create 7 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |15  |SA			| 6		|
      
      @User_Create_Aro_Deposito_8
      Scenario Outline: User Create 8 Aro Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |16  |SA			| 12	|
      
      @User_Create_Aro_Combo_Deposito
      Scenario Outline: User Create Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |9   |CA			| 1		|
      
      @User_Create_Aro_Combo_Deposito_2
      Scenario Outline: User Create 2 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |10  |CA 		|	3		|
      
      @User_Create_Aro_Combo_Deposito_3
      Scenario Outline: User Create 3 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |11  |CA			|	6		|
      
      @User_Create_Aro_Combo_Deposito_4
      Scenario Outline: User Create 4 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |12  |CA			| 12	|
      
      @User_Create_Aro_Combo_Deposito_5
      Scenario Outline: User Create 5 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |13  |SA			| 1		|
      
      @User_Create_Aro_Combo_Deposito_6
      Scenario Outline: User Create 6 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |14  |SA			| 3		|
      
      @User_Create_Aro_Combo_Deposito_7
      Scenario Outline: User Create 7 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |15  |SA			| 6		|
      
      @User_Create_Aro_Combo_Deposito_8
      Scenario Outline: User Create 8 Aro Combo Deposito Account <account> dengan tenor <tenor> bulan
      When User Create New ARO Combo Deposito <cell> Account <account> dengan tenor <tenor> bulan
      Then Data ARO Combo Terbuat
      
      Examples:
      |user|cell|account|tenor|
      |3   |16  |SA			| 12	|
      
      @User_Approve_Data_Deposito
      Scenario Outline: User Approve Data Deposito
      When User Approve Deposito <cell>
      Then Data Deposito Terapprove
      
      Examples:
      |user|cell|
      |7   |2   |
      
      @User_Reject_Data_Deposito
      Scenario Outline: User Reject Data Deposito
      When User Reject Deposito <cell>
      Then Data Deposito Ter Reject
      
      Examples:
      |user|cell|
      |7   |2   |
      
      @User_Rework_Data_Deposito
      Scenario Outline: User Rework Data Deposito
      When User Rework Deposito <cell>
      Then Data Deposito Ter Rework
      
      Examples:
      |user|cell|
      |7   |2   |
      
      @User_save_as_Draft_deposito
      Scenario Outline: User save as draft deposito
      When Save as Draft Deposito <cell>
      Then Data Deposito Save as Draft
      
      Examples:
      |cell|
      |2   |
      
      @User_delete_draft_deposito
      Scenario Outline: User delete data draft deposito
      When Delete Save as Draft Deposito <cell>
      Then Data Deposito Deleted
      
      Examples:
      |cell|
      |2   |