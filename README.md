# Arknights Operator Query with Exception Handling
This Java project demonstrates how to use exception handling (try-catch) with Arknights Operators as query objects. The project provides a basic framework for querying operators by name and handling potential errors, such as when an operator is not found.

## Project Overview
The goal of this project is to create a simple application that allows users to query Arknights Operators by name. The program handles various exceptions that may occur, such as trying to query an operator that does not exist in the list.

## Features
* **Operator Query:** Query Arknights Operators by their name.
* **Exception Handling:** Demonstrates the use of try-catch blocks to manage potential errors during queries.
* **Custom Exception:** Implements a custom exception (OperatorUnavailable) for handling cases where the operator is not found.

## Setup Instructions
**1. Clone the Repository:**
```
git clone https://github.com/pomegranata/Operator-Listing.git
cd Operator-Listing
```
**2. Compile the Project:**
```
javac -d bin src/main/java/exception/OperatorList.java
```
**3. Run the Program:**
```
java -cp bin exception.OperatorList
```

## Usage
The main functionality of the project is encapsulated within the OperatorQuery class. Here’s how the program works:

**1. Operator Query Example:**
* The user can query an operator by name. For example:
```
searchOperator(operator, "SilverAsh")
```
* The program will search for the operator in the arrays and return the operator’s details if found.

**2. Exception Handling:**
* If the operator is not found, the program will catch the OperatorUnavailable and handle it gracefully:
```
try {
        searchOperator(operator, "SilverAsh");
    } catch (OperatorUnavailable e) {
        System.out.println("Operator not found: " + e.getMessage());
    }
```

**3. Sample Output:**
* Searching an operator:
```
Trying to find operator: SilverAsh
```

* If an operator is found:
```
Operator found: Mlynar
```

* If an operator is not found:
```
Operator not found: SilverAsh is unavailable
```