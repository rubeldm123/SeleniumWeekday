Feature: Registration for a new user
Inorder to become a site member
As a site visitor
I want to go to registration page, enter first name, last name,
 phone, email, address, user name, and password to register for the site
 
 Scenario: New user registration process
 
 Given user is visiting homepage
 When user click on register link and enter first name, last name, email, phone, user name, password,confirm password, and submit
 
Then user receives registration confirmation message


