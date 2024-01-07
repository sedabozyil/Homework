@get

Feature: Get
  Background:
    * url 'https://jsonplaceholder.typicode.com/'

  Scenario: First Get Scenario
    Given path 'posts'
    When method get
    And print response
    * def first = response[0]
    * print first
    * def firstTitle = first.title
    * print firstTitle
    * def id = get response [?(@.id=="1")]
    * print id
    Then status 200
