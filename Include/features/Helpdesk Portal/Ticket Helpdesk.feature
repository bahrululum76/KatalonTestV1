#Helpdesk TicketTemplate
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Download_Ticket
  Scenario Outline: Download Ticket
   Given Login Addson sebagai User <user>
   When  User Download Ticket
   Then  Data ticket Terdownload

    Examples: 
      |user|cell|
      |9   |2   |
      
  @Filter_Ticket
  Scenario Outline: Filter Ticket
   Given Login Addson sebagai User <user>
   When  User Filter Ticket <cell>
   Then  Data Ticket Tampil sesuai Filter

    Examples: 
      |user|cell|
      |9   |2   |
      
  @Update_Ticket
  Scenario Outline: User Update Ticket
   When  User Update Ticket <cell> Status Ticket dari <before> menjadi <after> dengan priority <priority>
   Then  Data Ticket Terupdate 

    Examples: 
  |user|cell|before |after      |priority|
  |9   |2   |open   |in progress|low     |
  |9   |3   |open   |in progress|medium  |
  |9   |4   |open   |in progress|high    |
  |9   |5   |open   |on hold    |low     |
  |9   |6   |open   |on hold    |medium  |
  |9   |7   |open   |on hold    |high    |
      
   @Update_Ticket_Resolve
  Scenario Outline: User Update Ticket Resolve
   When  User Resolve Ticket Number <cell> Status Ticket dari <before> menjadi <after> dengan priority <priority>
   Then  Data Ticket Terupdate Resolve

    Examples: 
      |user|cell|before |after      |priority|
      |9   |8   |open    |Resolved   |Low     |
      |9   |9   |open    |Resolved   |Medium  |
      |9   |10  |open    |Resolved   |High    |
      
    @Update_Ticket_In_Progress
  Scenario Outline: User Update Ticket In Progress
   When  User Update Ticket <cell> Status Ticket dari <before> menjadi <after> dengan priority <priority>
   Then  Data Ticket Terupdate
    Examples: 
  		|user|cell|before      |after      |priority|
      |9   |11  |In Progress |Resolved   | Medium |
      |9   |13  |On Hold     |In Progress| Medium | 
      
     @Update_Ticket_Resolve_In_Progress
  Scenario Outline: User Update Ticket In Progress to Resolve
   When  User Resolve Ticket Number <cell> Status Ticket dari <before> menjadi <after> dengan priority <priority>
   Then  Data Ticket Terupdate Resolve
		Examples: 
      |user|cell|before 		|after      |priority|
      |9   |12  |In Progress|Resolved		|Medium	 |
      
      
      @Download_Ticket_2
  Scenario Outline: Download Ticket
   When  User Download Ticket
   Then  Data ticket Terdownload

    Examples: 
      |user|cell|
      |9   |2   |
      
  @Filter_Ticket_2
  Scenario Outline: Filter Ticket
   When  User Filter Ticket <cell>
   Then  Data Ticket Tampil sesuai Filter
   Examples:
   |cell|
   |2   |
