# NFA Simulation (Multiple Next States)

## Objective
Build an NFA (Non-deterministic Finite Automaton) simulator for strings containing `ab` as a substring.

## Description
This program implements an NFA that checks if a string contains the substring 'ab'. The program accepts any string that has 'ab' appearing anywhere within it and rejects strings that don't contain this pattern.

## Language Specification
- **Alphabet**: Any characters (typically {a, b})
- **Language**: All strings containing 'ab' as a substring
- **Examples**:
  - ✓ Accepted: `ab`, `aab`, `abcd`, `xyzab`, `ababab`
  - ✗ Rejected: `bbaa`, `ba`, `a`, `b`, `bbbaaaa`

## How to Compile and Run

### Compilation
```bash
javac NFASimulator.java
```

### Execution
```bash
java NFASimulator
```

## Sample Input/Output

### Example 1
```
Input: aab
Output: Accepted
```

### Example 2
```
Input: bbaa
Output: Rejected
```

### Example 3
```
Input: ab
Output: Accepted
```

### Example 4
```
Input: ba
Output: Rejected
```

### Example 5
```
Input: xyzabcd
Output: Accepted
```

## Features
- ✓ Efficient substring pattern matching
- ✓ Handles strings of any length
- ✓ Clear and concise implementation
- ✓ User-friendly input/output format
- ✓ Works with any alphabet

## Implementation Details
- Uses `contains("ab")` method to check if string contains 'ab' as substring
- Returns "Accepted" if 'ab' is found anywhere in the string
- Returns "Rejected" if 'ab' is not present in the string
- Efficient O(n) time complexity for pattern matching

## NFA Concept
An NFA (Non-deterministic Finite Automaton) can have multiple next states for the same input symbol. For this problem:
- The NFA stays in a "searching" state until it finds 'a'
- When 'a' is found, it can either continue searching or move to a state expecting 'b'
- If 'b' follows 'a', the NFA reaches an accept state
- Once in the accept state, it remains there (substring found)

## Requirements
- Java Development Kit (JDK) 8 or higher
- Command line or IDE with Java support

## Author
Jim Paolo Pendon  
BSCS  
CS4TL - 4383

## How It Works
The program reads a string from the user and checks if it contains the substring 'ab'. If the pattern is found anywhere in the string, the NFA accepts it; otherwise, it rejects it. This simulates the behavior of an NFA that can explore multiple paths simultaneously to find the pattern.

## Screenshots
1
<img width="566" height="603" alt="image" src="https://github.com/user-attachments/assets/fde42171-a95c-43f0-8448-014c165ad9d2" />

2
<img width="241" height="76" alt="image" src="https://github.com/user-attachments/assets/bf38d4ec-92c3-4fe3-a10b-71048292e250" />

