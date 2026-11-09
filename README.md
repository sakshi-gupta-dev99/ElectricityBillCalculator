# Electricity Bill Calculator - Java

Simple Java program to calculate electricity bill using slab rates.

## Features
- Takes Customer ID, Name and Units as input
- Calculates bill slab-wise
- Adds Fixed Charge (Rs. 50) + Tax (5%)
- Shows Invalid Input if units are negative

## Slab Rates
- 0-100 units : Rs. 2/unit
- 101-200 units : Rs. 3/unit
- 201-300 units : Rs. 4/unit
- 301-400 units : Rs. 5/unit
- 401-600 units : Rs. 6/unit
- 600+ units : Rs. 7/unit

## How to Run
javac ElectricityBillCalculator.java
java ElectricityBillCalculator
