Feature: The user want to make a car rental in the Emirates page
  @smoke
  Scenario: CarRentalWithFilters
    Given The user has been opened the Emirates car rental page
    Then The user types in pick-up, a date in pick-up date, a date in return date and age with the next data:
      | pick_up   | pick_up_date | pick_up_time | return_date | return_time | age | return_location |
      | new york  | 2022/03/26   | 18:00        | 2022/04/28  | 20:00       | 26  | central park    |
    Then The user selects some filters and selects the first car in the list
    Then The user picks some extras and clicks the button continue
    Then The user fills form with the next data:
      | first_name | surname | e_mail         | country_code | phone           | country_region | city   | address                   | card_number      | name          | card_expiration_date | security_code |
      | Camilo     | Suarez  | test@gmail.com | +57          | 3216549870      | Colombia       | Bogota | calle 10 sur 2a-28        | 4646364646464646 | Carlos Suarez | 2027/05              | 489           |
    When The user must see the button Confirm Booking available