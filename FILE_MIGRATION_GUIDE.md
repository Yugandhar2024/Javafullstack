# File Migration Guide
## Old Names → New Organized Names

### Basics (src/basics/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `Var.java` | `VariableDemo.java` | Variables, scope, default values |
| `Operator.java` | `OperatorExamples.java` | All operator types |
| `Bitwise.java` | `BitwiseOperations.java` | Bitwise operations deep dive |
| `Comparision.java` | `ComparisonOperators.java` | Comparison operators |
| `Conditional.java` | `ConditionalStatements.java` | if-else and ternary |
| `Loops.java` | `LoopExamples.java` | for, while, do-while loops |

### Algorithms (src/algorithms/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `Armstrong.java` | `ArmstrongNumber.java` | Armstrong number checker |
| `Palindrome.java` | `PalindromeChecker.java` | Palindrome detection |
| `Disarium.java` | `DisariumNumber.java` | Disarium number checker |
| `Strong.java` | `StrongNumber.java` | Strong number checker |
| `PrimPal.java` | `PrimeAndPalindrome.java` | Combined prime & palindrome |
| `SumDig.java` | `SumOfDigits.java` | Sum of digits |
| `ProDig.java` | `ProductOfDigits.java` | Product of digits |
| `Leap.java` | `LeapYearValidator.java` | Leap year checker |
| `Largest.java` | `LargestOfThree.java` | Find largest of 3 numbers |
| `Quadratic.java` | `QuadraticEquation.java` | Solve quadratic equations |
| `AverageCalculator.java` | `AverageCalculator.java` | Calculate average |

### Patterns (src/patterns/)
| Old Files | New File | Purpose |
|-----------|----------|----------|
| `Patt.java`, `Pattern1.java` | `StarPatterns.java` | 25+ star patterns |
| `NumberPatt.java` | `NumberPatterns.java` | Number-based patterns |
| `SquareNumbers.java` | `SquareNumberPatterns.java` | Square & number patterns |

### Recursion (src/recursion/)
| Old Files | New File | Purpose |
|-----------|----------|----------|
| `Recursion.java`, `Recur.java` | `BasicRecursion.java` | Basic recursive concepts |
| `Recur1.java` | `FactorialRecursion.java` | Factorial using recursion |
| `Recur2.java` | `FibonacciRecursion.java` | Fibonacci using recursion |

### OOP (src/oop/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `Static.java` | `StaticVariableDemo.java` | Static variables & methods |
| `Instance.java` | `InstanceVariableDemo.java` | Instance variables |
| `Method.java` | `MethodDemo.java` | Method definitions |
| `Emp.java` | `EmployeeDemo.java` | Employee OOP example |
| `Salary.java` | `SalaryCalculation.java` | Salary calculation logic |

### Exceptions (src/exceptions/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `Multicatch.java` | `MultiCatchExample.java` | Multiple exception handling |

### Web - Forms (web/forms/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `loginform.html` | `LoginForm.html` | Login page |
| `regform.html` | `RegistrationForm.html` | Registration form |
| `resume.html` | `Resume.html` | Resume/CV page |

### Web - Interactive (web/interactive/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `calculator.html` | `Calculator.html` | Interactive calculator |
| `resmenu.html` | `RestaurantMenu.html` | Restaurant menu ordering |
| `resume.html` | `ResponsiveResume.html` | Responsive resume |

### Web - JS Concepts (web/js-concepts/)
| Old File | New File | Purpose |
|----------|----------|----------|
| `basicjs.html` | `BasicJavaScript.html` | Basic JS concepts |
| `arthoper.html` | `ArithmeticOperators.html` | Arithmetic in JS |
| `assignjs.html` | `AssignmentOperators.html` | Assignment operators |
| `evenjs.html` | `EvenNumberChecker.html` | Even/odd checker |

---

## Migration Checklist

### Step 1: Create Folder Structure
```bash
mkdir -p src/basics
mkdir -p src/algorithms
mkdir -p src/patterns
mkdir -p src/recursion
mkdir -p src/oop
mkdir -p src/exceptions
mkdir -p web/forms
mkdir -p web/interactive
mkdir -p web/js-concepts
```

### Step 2: Add Package Declarations
Add to the top of each Java file:
```java
package basics;  // or appropriate package
```

### Step 3: Move and Rename Files
Move files to appropriate folders and rename according to guide above.

### Step 4: Update Class Names
Rename class declaration to match filename:
```java
public class VariableDemo {  // was: public class Var
```

### Step 5: Compile and Test
```bash
cd src/basics
javac VariableDemo.java
java basics.VariableDemo
```

---

## Key Improvements Made

✅ **Systematic Organization**: Files organized by topic/concept  
✅ **Clear Naming**: Files named to reflect their content  
✅ **JavaDoc Comments**: Added comprehensive documentation  
✅ **Package Structure**: Proper package hierarchy  
✅ **Consistent Formatting**: Fixed indentation and style  
✅ **Educational Comments**: Inline comments explaining logic  
✅ **Method Organization**: Related methods grouped together  

---

## Notes

- All files in `src/` directories have package declarations
- Web files remain as-is (already well-organized)
- Some files had duplicate/similar versions (kept intentionally to show progression)
- Class names now match file names (Java convention)
- JavaDoc follows standard documentation format

---

**Migration Status**: Ready for implementation  
**Last Updated**: July 2026
