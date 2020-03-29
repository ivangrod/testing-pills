# Money Example Guide

## Multi-Currency Money
* f4d0862 Init WyCash application
* af20c5a Added multiplication test with compile errors
* ac6bc62 Add small change that cause out test pass
* 615e0a3 Remove duplication step 1
* 3284caa Remove duplication step 2
* f07dff3 Remove duplication step 3
* 3fc6b85 Remove duplication step 4

## Degenerate Objects
* e0ad41b Add next step of the test to eliminate Dollar side effects
* d9430af Change the test cause of changing the Dollar interface
* 37e9843 Change the Dollar interface to eliminate compile errors in test
* a7436aa Make green test. Eliminate Dollar side effects

## Equality for All
* 5368ee4 Add equality test based on **Value Object** implementation: https://sourcemaking.com/refactoring/change-reference-to-value
* 8499cd8 Add test case using **Triangulation TDD style**
* d9da78c Make green test

## Privacy
* 94e86b4 Rewrite test to reduce coupling between real code and test through amount field
* d358bae Make amount field privacy

## Franc-ly Speaking
* 7a9664f Add Franc class creating ugly duplication

## Equality for All, Redux
* ea5633d Add Money superclass with the purpose of eliminating duplication
* a4f2efb Extract equals method to the superclass
* 5b2cd2a Adapt Franc to the superclass

## Apples and Oranges
* 533e062 Add test to compare Dollars with Francs

## Makin' Objects
* 460220a Add factory method in superclass
* 6013246 Add intention to eliminate references to Dollars
* 39e31a1 Declare superclass as an abstract class
* ab14c9e Change the declaration of the factory method with the purpose of eliminating references to the Dollar class
* b89f0fb Use factory method along the tests
* 5db28be Add Franc factory method to eliminate subclass references in client code

## Times We're Livin' In
* 55ea690 Add currency test
* 2d63979 Add currency implementation in subclasses
* e21c8e6 Adapt identical implementations of currency methods in both subclasses
* 9c5548a Push up the declaration of the variable and the implementation of currency method
* 4544260 Add currency parameter in Franc constructor
* 9775592 Call to factory method instead of constructor
* 9a63e12 Instance Franc through factory method using currency parameter correctly
* c3de9b7 Implement analogous steps with Dollar class
* 8db87ee Push up the constructor to the superclass Money

## Interesting Times

* 1a81869 Inline factory methods again
* afb8d44 Exchange Money by Franc comparing both
* 808e333 Add test for comparing purpose between Money and Franc
* c5a518a Add currency in equality method. Remove class as a equality criteria
* 1f871da Push up two identical implementations of times() method

## The Root of All Evil

* adb396b Replace references to the subclasses with references to the superclass
* 7b64265 Delete subclasses and redundant test with the new code structure

## Addition, Finally

* e0b0893 Add simple addition test
* d6c3342 Add plus method in Money class
* b77c06c Add a new metaphor for our computation

## Make It

* 3af33da Add test for returning a real Expression - Sum
* cb899d3 Green bar test returning a real Expression - Sum
* b1ef97d Implement reduce sum operation for the same currencies
* 98e492a Move reduce operation to Sum class
* c5447fa Introduce **polymorphism** to eliminate explicit class checking






