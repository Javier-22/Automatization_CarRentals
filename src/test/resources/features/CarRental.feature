Feature: The user want to make a car rental in the Emirates page
  @end_to_end
  Scenario: CarRental
    Given The user has been opened the Emirates car rental page
    Then The user types in pick-up, a date in pick-up date and a date in return date with the next data:
    | pick_up   | pick_up_date | pick_up_time | return_date | return_time |
    | new york  | 2022/02/20   | 18:00        | 2022/03/28  | 20:00       |
    And The user selects the first car in the list
    And The user clicks the button continue
    And The user fills form with the next data:
    | first_name | surname | e_mail         | country_code | phone           | country_region | city   | address                   | card_number      | name          | card_expiration_date | security_code |
    | Camilo     | Suarez  | test@gmail.com | +57          | 3216549870      | Colombia       | Bogota | calle 10 sur 2a-28        | 4646364646464646 | Carlos Suarez | 2027/05              | 489           |
    When The user must see the button Confirm Booking available