##BUS RESERVATION SYSTEM USING JAVA, JDBC AND MYSQL
PROJECT OVERVIEW

--The Bus Reservation System is a simple Java application developed using JDBC and MySQL. 
--This application allows users to enter passenger details such as Passenger Name, Bus Number, and Date of Birth. 
--The entered details are stored in a MySQL database using JDBC connectivity.

#TECHNOLOGIES USED
• Java
• JDBC (Java Database Connectivity)
• MySQL Database

STEP 1: CREATE DATABASE
--Create a MySQL database named "busreservation".

STEP 2: CREATE TABLE
--Create a table named "reservation" to store passenger details such as passenger name, bus number, and date of birth.

STEP 3: ADD JDBC DRIVER
--Download and add the MySQL JDBC Driver (mysql-connector-j.jar) to the Java project.

STEP 4: ESTABLISH DATABASE CONNECTION
--Use JDBC API to connect the Java application with the MySQL database.

STEP 5: RUN THE APPLICATION
--Compile and execute the Java program.

STEP 6: ENTER PASSENGER DETAILS
The application asks the user to enter:
• Passenger Name
• Bus Number
• Date of Birth

**Example:
Passenger Name : Nirmal
Bus Number : 101
Date of Birth : 2007-05-15

STEP 7: STORE DATA IN DATABASE
--After entering the details, JDBC executes an SQL INSERT query and stores the information in the MySQL database.

STEP 8: DISPLAY SUCCESS MESSAGE
--If the reservation is successful, the application displays:
Your booking is confirmed
Enter 1 to Book and 2 to exit.
Passenger details saved in MySQL Database.

STEP 9: VERIFY STORED DATA
--The saved records can be viewed from the MySQL database using a SELECT query.
**FEATURES
• Add passenger details
• Store reservation data in MySQL
• JDBC database connectivity
• Simple and user-friendly interface
• Easy record management

#ADVANTAGES
• Reduces manual record keeping
• Secure data storage
• Fast and efficient data management
• Helps understand Java and Database connectivity concepts

#CONCLUSION
The Bus Reservation System is a database-driven application developed using Java, JDBC, and MySQL. It demonstrates how Java applications interact with MySQL databases to store and manage passenger reservation details efficiently. This project is useful for learning JDBC connectivity and database operations in Java.
