# HOSTEL-MANAGEMENT-SYSTEM
USING OOPS CONCEPTS IN JAVA AND SWING API

Hostels of KLE TECH university are managed manually and records are all kept in the books and paper. These observations made lead to the creation of the problem statement.<br>
The program aims at using the application of object-oriented programming using JAVA.Program finds the best possible way to manage a hostel of this university and its functionalities in an efficient manner. 
It manages students and managers. List of all the students and managers is taken as input from the given file.
First it allocates all the students into the rooms and later other changes can be done using various functions provided.
This program is a model of 40 students,20 rooms and 10 managers. 
It aims at keeping the records online i.e leave applications, allocating the rooms, fee payment and the attendance to be managed online.

## CLASSES IDENTIFIED

STUDENT:  Student class has the record of each student that is name, branch, department, room number, hostel number, attendance, mobile number etc. Input of each student is taken from the file.<br>
MANAGER: Manager class has the details of each manager like name, hostel number, phone number etc.<br>
ROOMS: Room class has room number, hostel number etc. This class allocates students to the room either randomly or as per the office user. Students can also mutually exchange the rooms as per their convenience.<br>
CALENDER: This class holds the calendar details such as date day and month and the student array to mark the attendance of each student for date.<br>
ATTENDANCE_BOOK: This class has array of calendar of 31 dates which form a month and hence the attendance details of 31 days is obtained in the attendance book. This keeps the record of attendance of each student and displays the record as per our requirement. It also used to marks attendance of students in various ways.<br>
