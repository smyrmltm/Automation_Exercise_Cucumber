Feature:US1001 Automation Exercise

  @aetc2
  Scenario: TC02 Login User with correct email and password
    Given Launch browser and Navigate to url "automationExerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible

  @aetc3
  Scenario: TC03 Login User with incorrect email and password
    Given Launch browser and Navigate to url "automationExerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter incorrect email address and password
    And Click login button
    And Verify error Your email or password is incorrect is visible

  @aetc1
  Scenario:TC01 Register User
    Given Launch browser and Navigate to url "automationExerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter
    And Select checkbox Receive special offers from our partners
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button


  @aetc4
  Scenario:TC04 Logout User
    And Launch browser and Navigate to url "automationExerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Logout button
    And Verify that user is navigated to login page

  @aetc5
  Scenario: TC05  Register User with existing email
    And Launch browser and Navigate to url "automationExerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist is visible