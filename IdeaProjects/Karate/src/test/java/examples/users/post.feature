@post
  Feature: Post
    Background:
      * url 'https://jsonplaceholder.typicode.com'
    Scenario: First Post Scenario
      Given path 'posts'
      * def Body =
    """{
    "userId": 1,
    "id": 90,
    "title": "ww",
    "body": "ww"
    }"""
      And request Body
      When method post
      Then status 201
      And print response