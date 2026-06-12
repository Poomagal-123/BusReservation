# Bus Reservation System

## Overview

The Bus Reservation System is a simple Java application developed using JDBC and MySQL. It allows users to enter passenger details and stores the information in a MySQL database.

## Technologies Used

* Java
* JDBC
* MySQL

## Features

* Add passenger details
* Store reservation data in MySQL
* JDBC database connectivity
* Simple console-based interface
* Easy record management

## Database Setup

### Create Database

```sql
CREATE DATABASE busreservation;
```

### Create Table

```sql
CREATE TABLE reservation (
    passenger_name VARCHAR(100),
    bus_no INT,
    date_of_birth DATE
);
```

## How to Run

1. Create the MySQL database and table.
2. Add the MySQL JDBC Driver (`mysql-connector-j.jar`) to the project.
3. Update database credentials in the Java code.
4. Compile and run the application.
5. Enter passenger details when prompted.

## Sample Input

```
Passenger Name : Nirmal
Bus Number : 101
Date of Birth : 2007-05-15
```

## Sample Output

```
Your booking is confirmed.
Passenger details saved in MySQL Database.
```

## Advantages

* Reduces manual record keeping
* Secure data storage
* Fast data management
* Easy to learn JDBC concepts

## Conclusion

This project demonstrates how Java applications connect with MySQL using JDBC to store and manage passenger reservation details efficiently.

## Author

POOMAGAL E
