# brs-infogain
This repository contains mvp code for bus reservation system.



---------------------------------------------MVP DESIGN-------------------------------------
## Please consider this as mvp design, Many more improvements as can be added on top of this.
--------------------------------------------------------------------------------------------


Design Details:


Entities Identified:

Mainly there are 3 entities.

USER
TICKET
BUS

All their respective fields are :

##  USER: 
    id
    userName
    passWord
    mobileNumber
    fulLName
##  Ticket:
    id 
    passengerName 
    bus 
    boardingTime 
    arrivalTime 
    bookingTime 
    bookingDate
    travelDate 
    farePrice 
##  Bus:
    id
    departureStation
    arrivalStation
    busNumber
    departureDate
    localTime
    totalSeats
Functionality related to bus
- 1. searching for bus based on departure and arrival location, date is implemented.
  2. to view available bus and routine, just get all bus details
Functionality related to user
- 1. user login is just simulated and can be improved using, jwt, oauth, and other machenism.
-- other functionality are implemented but NOt properly tested.

Principle followed.
- 1. SRP: Every class does not have a more than 1 reason to open it.
  2. Coding to interface: while autowiring Coding to interface principle is followed religiously.
  3. N-layered architecture is followed.


  Avoided code tangling, and loose coupling is comprehended as much as possible.
  Naming conventions are as Industry standard.
  Comments are added as and when required.


  ## how to Run the project ? 
  install required tool. 
  configure databases and make a db called brs, othewrwise make your own name and change it in propertie file.
  Run the project and hit endpoints.
  if there is any data not present, please fill it using sql query in backend.

  
