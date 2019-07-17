Feature: Register Gist

Scenario: Create Public Gist Positif
Given User Home Page Github
When User want to create gist
And have a filename TestGist.java
And put Description sourcecode
And Create Public Gist	
Then User sucessfully create public git

Scenario: Create Public Gist Negatif
Given User Home Page Github
When User want to create gist
And have a filename TestGist.java
And Create Public Gist	
Then Cant Create public Gist

Scenario: See All List of My Gist
Given User Home Page Github
When User want have see list gist
Then List will showing

Scenario: Edit Public Gist
Given User Home Page Github
When User want have see list gist
And Have File TestGist
And Edit File
Then Update File Succesfully

Scenario: Delete Public Gist
Given User Home Page Github
When User want have see list gist
And Have File TestGist
And Delete File
Then Delete File Succesfully










