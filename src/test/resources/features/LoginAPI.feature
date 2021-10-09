
Feature: Login to application using login API
  User will be able to login to the Application using the Login API

  Scenario: Generate the OAuth Token with the given Post API
    Given I have the base URI as "https://zxcvbns.cncbinternational.com"
    And resource as "/auth/oauth/v2/token"
    When I add the headers as
      | Header Type   | Header Value                                                                                               |
      | Authorization | Basic MmRkZjYxYTUtZmQyMC00MTAzLTg1ZjYtOGFkMGMyNzMxZWU1OjQ3NTZjMzIzLTU4ZDctNGRiMC05ZTQ4LTVjMDU4YmM3MjkyNw== |
      | Content-Type  | application/x-www-form-urlencoded                                                                          |
    And body as string "grant_type=client_credentials&scope=dbank%20protected"
    And send the Post Request
    Then status code should be 200
    And I get the bearer token by joining the values path "token_type" and "access_token" with a space between them

  Scenario: Generate the Login message using the bearer token
    Given I have the base URI as "https://zxcvbns.cncbinternational.com/directbank/tools"
    When I set the headers as
      | Header Type   | Header Value     |
      | Authorization | BEARER_TOKEN     |
      | Content-Type  | application/json |
      | x-target-env  | OC-SQUAD-4       |
    And I send the Post request using the resuorce "/loginToken?x-token-type=SQUAD-DEV-TRIGGER" and body with username "Robo02" and password "Aa123456"
    Then status code should be 200
    And I fetch the JWT token using path "encoded"

  Scenario: Login to inMotion using the Bearer Token and Login Message.
    Given I have the base URL for Login as "https://zxcvbns.cncbinternational.com"
    And resource path as "/directbank/auth/v1/login"
    When I send the post request with body as
      | authType    | 0          |
      | userCd      | Robo02     |
      | deviceToken | 1234567890 |
      | message     | JWT_Token  |
    And headers as
      | Header Type   | Header Value     |
      | Content-Type  | application/json |
      | Authorization | BEARER_TOKEN     |
      | x-target-env  | OC-SQUAD-4       |
    Then I get the response code as 200