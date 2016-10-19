Feature: Gotix Booking flow


Scenario: Go-Tix Booking a movie Happy path
Given I topup my gopay balance for goTixUser with 150000
Given On Home Page User log in using details of goTixUser and tap on GO-TIX
When On Go-Tix Event Page User taps on movies tab and taps on movie Inferno
When On Go-Tix Movie Page User taps on theater
And On Go-Tix Movie Page User selects the Date and Time for movie and taps on pick seat
And On Go-Tix Movie Page User selects the seats and taps on Review Order
And On Go-Tix Order Preview Page User verifies movie ticket price and makes payment
When On Go-Tix Order Confirmation Page User verifies tickets successfully ordered and taps see tickets
Then On Go-Tix My Tickets Page User verifies his movie ticket
