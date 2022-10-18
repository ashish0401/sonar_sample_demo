Feature: Search item on ebay
  As a non registered user
  I should be able to search on ebay website
  like adding item and verify cart


  @search
  Scenario: Search Bike on Ebay
    Given User can open Ebay Home Page
    When User search for the bike keyword
    Then User select the first search result and add to cart and verify it
