Feature: Add Address 
Scenario Outline: To validate add address functionality
Given user is on login page
When user enters "<username>" and "<password>" and click login button 

Then user clicks on My Account then Address
Then user enters "<firstname>" , "<lastName>" , "<Email>"  , "<cityname>" , "<addressCity>" , "<postalCode>" and "<pNumber>" and click save button




Examples:
|username|password|firstname|lastName|Email|cityname|addressCity|postalCode|pNumber|
|shubhamtange167@gmail.com|Shubham@123|Gaurav|Ghadge|gauravghadge@gmail.com|Pune|wipro-street,chennai|600119|6393848333|