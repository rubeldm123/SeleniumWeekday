Feature: User Registration 
Inorder to become a site member
As a site visitor
I want to go to registration page, enter first name, last name,
 phone, email, address, user name, and password to register for the site
 
 Scenario: Positive - User Registration
 
 Given user is visiting homepage
 When user click on register link 
 And user enter FirstName
 And User enter LastName
 And User enter PhoneNumber
 And User Enter EmailID
 And User Enter Address
 And User Enter City
 And User Enter State
 And User ENter PostelCode
 And User Select Country
 And user enter username,
 And  password, 
 And confirm password
 And user click on submit button
 Then user receives confirmation of successful registration
 And user closes the browser
 



