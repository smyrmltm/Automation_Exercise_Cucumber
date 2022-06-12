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