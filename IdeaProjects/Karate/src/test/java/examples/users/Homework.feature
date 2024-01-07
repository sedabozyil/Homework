@Homework

Feature: Get
  Background:
    * url baseUrl

  Scenario: Homework Scenario
    Given params {s: 'Harry Potter'}
    When method get
    And print response
    * def getImdbID = $response.Search[?(@.Title=="Harry Potter and the Sorcerer's Stone")].imdbID
    * print getImdbID
    * params {i: #(getImdbID)}
    * method get
    * print response
    Then status 200
    And  match response.Title == "Harry Potter and the Sorcerer's Stone"
    And match response.Year == "2001"
    And match response.imdbID == "tt0241527"
    And match response.Released == "16 Nov 2001"