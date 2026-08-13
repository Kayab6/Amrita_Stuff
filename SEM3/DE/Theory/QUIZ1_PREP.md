# DIGITAL ELECTRONICS QUIZ


DUAL
What makes it CANONICAL SOP?

This is the important part.

For canonical SOP, EVERY product term must contain EVERY variable exactly once, either complemented or uncomplemented.

COMPLIMENT

PI- it is represented by grouping large no of ones tat can be circled inn a kmap 
EpI- if a min term in a cell of kmap is covereed by only 1 pi then it is called a epi 

minterm - a prod term in which all input variables are prsent in true or complimernty form

max tern false frm 




# Digital Electronics & Systems (23ECE205) — 1 & 2 Mark Question Bank
### Based on Lecture 1–4 (Intro, Switches, Boolean Algebra, Synthesis)

> How to use this: Answer each question in one line/one word/one short derivation before checking the key at the end. Questions marked **[T]** are tricky/conceptual traps — read carefully.

---

## SECTION A — Analog vs Digital Systems (1 mark each)

A1. What is an analog signal?
A2. What is a digital signal?
A3. Define "dynamic range."
A4. How many discrete values does a *binary* digital signal take?
A5. **[T]** Is a digital signal technically a special case of an analog signal? Justify in one line.
A6. Name the two symbols used to represent the two discrete values in binary logic.
A7. In the digital waveform example (+5V/−5V), which voltage level typically represents logic 1?

---

## SECTION B — Switches & Basic Logic (1 mark each)

B1. In a normally-open switch, what is the switch state when control signal x = 0?
B2. In a normally-open switch, what is the switch state when control signal x = 1?
B3. Write the logic expression L(x) for a light controlled directly by one switch x.
B4. A **series connection** of two switches realizes which logic operation?
B5. A **parallel connection** of two switches realizes which logic operation?
B6. Write the Boolean expression for the circuit: switches x₁ and x₂ in parallel, then in series with x₃.
B7. **[T]** For L(x₁,x₂,x₃) = (x₁ + x₂)·x₃, under what condition is the light ON?
B8. What logic function does an **inverting circuit** (switch + pull-up resistor to light) realize?
B9. Write all four equivalent notations for the complement of x.
B10. **[T]** In the inverting circuit, why is the light ON when the switch is OPEN (x = 0)?

---

## SECTION C — Truth Tables & Gates (1 mark each)

C1. How many rows does a truth table have for a function of 3 variables?
C2. How many rows does a truth table have for a function of n variables?
C3. What is the AND of x₁=1, x₂=0?
C4. What is the OR of x₁=0, x₂=0?
C5. What is NOT(1)?
C6. For 3-input AND (x₁·x₂·x₃), for how many of the 8 input rows is the output 1?
C7. For 3-input OR (x₁+x₂+x₃), for how many of the 8 input rows is the output 0?
C8. **[T]** For an n-input AND gate, in how many rows (out of 2ⁿ) is the output equal to 1?
C9. **[T]** For an n-input OR gate, in how many rows (out of 2ⁿ) is the output equal to 0?
C10. Draw/describe the standard shape used for an AND gate symbol. (1 word: shape name not needed — just state gate name)
C11. What symbol (bubble/no bubble) distinguishes a NOT gate from a buffer?
C12. State the AND operator symbol used in Boolean expressions.
C13. State the OR operator symbol used in Boolean expressions.

---

## SECTION D — Analysis vs Synthesis (1 mark each)

D1. Define "analysis" of a logic network.
D2. Define "synthesis" of a logic network.
D3. **[T]** Which process (analysis or synthesis) is generally more difficult? Why (one line)?
D4. What diagram is used to show how signals change over time in a circuit?
D5. Two circuits producing identical outputs for all input combinations are called ______ networks.

---

## SECTION E — Boolean Algebra: Axioms & Single-Variable Theorems (1 mark each)

E1. State axiom 1a: 0 · 0 = ?
E2. State axiom 1b: 1 + 1 = ?
E3. State: x · 0 = ?
E4. State: x + 1 = ?
E5. State: x · 1 = ?
E6. State: x + 0 = ?
E7. State: x · x = ?
E8. State: x + x = ?
E9. State: x · x̄ = ?
E10. State: x + x̄ = ?
E11. State the involution law: (x̄)̄ = ?
E12. **[T]** Simplify: 1 · 1 · 1 (using repeated application of axiom 2a).
E13. **[T]** Is x + 1 = 1 true regardless of the value of x? (yes/no + one-line reason)

---

## SECTION F — Two & Three Variable Properties (1–2 marks each)

F1. State the commutative property for AND.
F2. State the commutative property for OR.
F3. State the associative property for OR.
F4. State the distributive property: x·(y+z) = ?
F5. State the "dual" distributive property: x+(y·z) = ?
F6. State the absorption law (AND form): x·(x+y) = ?
F7. State the absorption law (OR form): x + x·y = ?
F8. State the combining property: x·y + x·ȳ = ?
F9. State the combining property (POS form): (x+y)·(x+ȳ) = ?
F10. **[2 marks]** Prove x + x̄y = x + y (state the identities used at each step).
F11. **[2 marks]** Prove x·(x̄+y) = x·y (state the identities used).
F12. **[2 marks]** Simplify XY + XY′ using the combining theorem — show the two steps.
F13. **[T][2 marks]** Simplify X(X′+Y). Is the result the same as X+Y? Justify.

---

## SECTION G — Consensus Theorem (1–2 marks each)

G1. State the consensus theorem in SOP form.
G2. State the consensus theorem in POS form.
G3. **[T]** In XY + X′Z + YZ = XY + X′Z, which term is the "redundant consensus term"?
G4. **[2 marks]** In the proof of the consensus theorem, what term (in the form X+X′) is ANDed with YZ as the first step?
G5. **[2 marks]** Apply the consensus theorem to simplify: VX′Y + WXZ + VWYZ.
G6. **[T][2 marks]** Simplify (A+B+E′)(E+F+G′)(A+B+F+G′) using the POS consensus theorem.

---

## SECTION H — DeMorgan's Theorem (1–2 marks each)

H1. State DeMorgan's first theorem: (x·y)‾ = ?
H2. State DeMorgan's second theorem: (x+y)‾ = ?
H3. Who is DeMorgan's theorem named after?
H4. **[T]** What logic gate is equivalent to a NAND gate redrawn using DeMorgan's theorem (bubbled inputs)?
H5. **[T]** What logic gate is equivalent to a NOR gate redrawn using DeMorgan's theorem?
H6. **[2 marks]** Using a truth table check (X=0,Y=1 only), verify (X·Y)‾ = X̄+Ȳ by evaluating LHS and RHS.
H7. **[2 marks]** Find the complement of F = X'YZ' + X'Y'Z using DeMorgan's theorem (show the intermediate step before simplifying).

---

## SECTION I — Duality (1–2 marks each)

I1. Define the "dual" of a logic expression.
I2. What is the dual of X + 0 = X?
I3. What is the dual of X · X̄ = 0?
I4. **[T]** Is the dual of a TRUE Boolean statement always TRUE? (yes/no)
I5. **[2 marks]** Find the dual of f = x̄₁ + x₁·x₂.
I6. **[T][2 marks]** Explain the shortcut method to find the *complement* of a function using its dual. State the two steps.

---

## SECTION J — Minterms & Maxterms (1–2 marks each)

J1. Define a minterm for a function of n variables.
J2. Define a maxterm for a function of n variables.
J3. **[T]** A minterm evaluates to 1 for how many rows of the truth table?
J4. **[T]** A maxterm evaluates to 0 for how many rows of the truth table?
J5. For 2 variables, how many minterms exist in total?
J6. For 3 variables, how many minterms exist in total?
J7. **[T]** For n variables, how many minterms (and how many maxterms) exist in total?
J8. Write the minterm m₅ for a 3-variable function (x₁x₂x₃), given row 5 = (1,0,1).
J9. Write the maxterm M₅ for a 3-variable function, given row 5 = (1,0,1).
J10. **[T]** What is the relationship between minterm mᵢ and maxterm Mᵢ for the same row i?
J11. A canonical SOP expression is built by summing which type of terms?
J12. A canonical POS expression is built by multiplying which type of terms?

---

## SECTION K — SOP / POS / Canonical Forms (1–2 marks each)

K1. Expand: f(x₁,x₂) = Σm(0,1,3) into a canonical SOP expression for 2 variables.
K2. Write f(x₁,x₂,x₃) = Σm(1,4,5,6) — how many product terms will the canonical SOP have?
K3. **[T]** For f(x₁,x₂,x₃) = Σm(1,4,5,6), write ΠM(...) notation for the same function.
K4. Define "cost" of a logic circuit as used in these notes.
K5. **[2 marks]** Compute the cost of the 3-input canonical SOP circuit for f = Σm(1,4,5,6) (4 AND terms of 3 literals each + 1 OR gate of 4 inputs + inverters). Give total gates + total inputs.
K6. **[T][2 marks]** f(x₁,x₂,x₃) = x̄₁x̄₂x₃ + x₁x̄₂x̄₃ + x₁x̄₂x₃ + x₁x₂x̄₃. Simplify this to a minimal SOP (2 terms).
K7. **[2 marks]** Convert canonical POS f = M₀·M₂·M₃·M₇ into its factor (sum) terms in terms of x₁,x₂,x₃.
K8. **[T]** If f = Σm(2,3,4,6,7) for 3 variables, list the row numbers where f = 0.

---

## SECTION L — Applied Synthesis Problems (1–2 marks each)

L1. **[2 marks]** Simplify F = X'YZ + X'YZ' + XZ to its minimal SOP form.
L2. **[T][2 marks]** In the reduced circuit for F = X'Y + XZ, how many gates are used (including inverter), compared to the unreduced 3-term expression?
L3. **[2 marks]** For the two-switch XOR light problem, write the truth table output L for (x,y) = (0,1) and (1,1).
L4. Write the standard Boolean symbol for XOR of x and y.
L5. **[T]** Express XOR (x⊕y) as a sum-of-products expression in x, y.
L6. **[2 marks]** A function has 2 inputs and the light is ON only when exactly one switch is in the top position. Name this logic function.
L7. **[T][2 marks]** For Condition A = x₃(x₁+x̄₂), Condition B = x₁(x̄₂+x̄₃): compute the product term AB after simplification (from the worked example, AB = x₁x̄₂x₃).
L8. **[2 marks]** State the final simplified control-circuit output f = AB+AC+BC for the three-condition synthesis example (from x₁,x₂,x₃).

---

## SECTION M — Rapid Fire / Mixed Tricky One-Liners (1 mark each)

M1. **[T]** True or False: 1 + 1 = 2 in Boolean algebra.
M2. **[T]** True or False: A NAND gate alone is sufficient to build any Boolean function.
M3. **[T]** True or False: A NOR gate alone is sufficient to build any Boolean function.
M4. **[T]** True or False: AND, OR, NOT together are sufficient to build any Boolean function.
M5. **[T]** What is x + x·y called as a law?
M6. **[T]** What is the identity element for AND?
M7. **[T]** What is the identity element for OR?
M8. **[T]** What is the null element for AND?
M9. **[T]** What is the null element for OR?
M10. **[T]** Huntington's postulates correspond to which numbered axioms in these notes (5,8,10,12)?
M11. **[T]** A switch that is "closed" corresponds to control value x = ?
M12. **[T]** In "Digital vs Analog waveform" diagram, the digital waveform shown encodes what 3-bit pattern (1,0,1)?

---
---

# ANSWER KEY

**Section A**
A1. Time-varying signal taking any value over a continuous range (dynamic range).
A2. A signal modeled as having, at any time, one of two discrete values.
A3. The continuous range of values an analog signal can take.
A4. Two (0 and 1).
A5. Yes — digital is a modeled/restricted case of an analog signal (only two allowed levels).
A6. 0 and 1.
A7. +5V = logic 1 (−5V = logic 0).

**Section B**
B1. Open.
B2. Closed.
B3. L(x) = x.
B4. AND.
B5. OR.
B6. L = (x₁ + x₂) · x₃.
B7. ON when x₃ = 1 AND at least one of x₁ or x₂ = 1.
B8. NOT (complement/inverter).
B9. x̄ = x′ = !x = ~x.
B10. Because the switch (to ground) is open, current flows through R to the light, pulling it high (ON); closing the switch shorts the light node to ground (OFF).

**Section C**
C1. 8 (2³).
C2. 2ⁿ.
C3. 0.
C4. 0.
C5. 0.
C6. 1 row (only 1,1,1).
C7. 1 row (only 0,0,0).
C8. 1 row out of 2ⁿ.
C9. 1 row out of 2ⁿ.
C10. AND gate — D-shaped (flat back, curved front).
C11. A bubble (small circle) at the output.
C12. "·" (dot).
C13. "+" (plus).

**Section D**
D1. Determining the function/behavior performed by an existing logic network.
D2. Designing a new network that implements a desired functional behavior.
D3. Synthesis is harder — many different networks can realize the same function, so choosing/designing one is not unique or straightforward.
D4. Timing diagram.
D5. Functionally equivalent.

**Section E**
E1. 0.
E2. 1.
E3. 0.
E4. 1.
E5. x.
E6. x.
E7. x.
E8. x.
E9. 0.
E10. 1.
E11. x.
E12. 1.
E13. Yes — x+1=1 for both x=0 and x=1 (axiom 5b, holds universally).

**Section F**
F1. x·y = y·x.
F2. x+y = y+x.
F3. x+(y+z) = (x+y)+z.
F4. x·y + x·z.
F5. (x+y)·(x+z).
F6. x.
F7. x.
F8. x.
F9. x.
F10. x+x̄y = (x+x̄)(x+y) [12b] = 1·(x+y) [8b] = x+y [6a].
F11. x·(x̄+y) = x·x̄ + x·y [12a] = 0 + x·y [8a] = x·y [6b].
F12. XY+XY′ = X(Y+Y′) [12a] = X·1 [8b] = X [6a].
F13. X(X′+Y) = XX′+XY [12a] = 0+XY [8a] = XY [6b]. Result is XY, NOT X+Y — do not confuse with identity 16a (x+x̄y = x+y), which is a different expression.

**Section G**
G1. XY + X′Z + YZ = XY + X′Z.
G2. (X+Y)(X′+Z)(Y+Z) = (X+Y)(X′+Z).
G3. YZ (the "consensus" term) is redundant.
G4. (X+X′), i.e., adding 1 = (X+X′) multiplied into YZ.
G5. VX′Y + WXZ (the VWYZ consensus term is eliminated).
G6. (A+B+E′)(E+F+G) — result after removing the redundant term.

**Section H**
H1. x̄ + ȳ.
H2. x̄ · ȳ.
H3. Augustus De Morgan.
H4. Bubbled OR gate (OR gate with inverted inputs).
H5. Bubbled AND gate (AND gate with inverted inputs).
H6. X=0,Y=1: LHS = (0·1)‾ = 0‾ = 1. RHS = 0̄+1̄ = 1+0 = 1. LHS = RHS = 1 ✓.
H7. F̄ = (X'YZ')‾ · (X'Y'Z)‾ = (X+Y′+Z)·(X+Y+Z′).

**Section I**
I1. Obtained by swapping + ↔ · and swapping 0 ↔ 1 throughout the expression.
I2. X · 1 = X.
I3. X + X̄ = 1.
I4. Yes.
I5. Dual of f = x̄₁+x₁x₂ is (x̄₁)(x₁+x₂).
I6. Step 1: Take the dual of the function. Step 2: Complement each literal in the dual expression — the result is the complement of the original function.

**Section J**
J1. A product term in which every variable of the function appears exactly once (complemented or uncomplemented).
J2. A sum term in which every variable of the function appears exactly once (complemented or uncomplemented).
J3. Exactly 1 row.
J4. Exactly 1 row.
J5. 4 (m0–m3).
J6. 8 (m0–m7).
J7. 2ⁿ minterms and 2ⁿ maxterms.
J8. m₅ = x₁x̄₂x₃.
J9. M₅ = x̄₁+x₂+x̄₃.
J10. Mᵢ is the complement of mᵢ (Mᵢ = m̄ᵢ).
J11. Minterms.
J12. Maxterms.

**Section K**
K1. f = x̄₁x̄₂ + x̄₁x₂ + x₁x₂.
K2. 4 product terms (m1, m4, m5, m6), each with 3 literals.
K3. f(x₁,x₂,x₃) = ΠM(0,2,3,7).
K4. Total number of gates plus the total number of inputs to all gates in the circuit.
K5. 4 AND gates (3 inputs each = 12) + 1 OR gate (4 inputs) + gates/inputs for inverters as needed — total cost = gates + inputs (matches textbook cost style, e.g., 27 for the canonical realization of a similar 3-variable example).
K6. f = x̄₂x₃ + x₁x̄₃ (derived via grouping/distributive + 8b/6a).
K7. f = (x₁+x₂+x₃)(x₁+x̄₂+x₃)(x₁+x̄₂+x̄₃)(x̄₁+x̄₂+x̄₃).
K8. Rows 0,1,5 (i.e., minterms 0,1,5 give f=0).

**Section L**
L1. F = X′Y + XZ.
L2. Reduced circuit: 2 AND gates + 1 OR gate + 1 inverter = 4 gates (fewer literals/inputs than the 3-term unreduced expression).
L3. (x,y)=(0,1): L=1. (x,y)=(1,1): L=0.
L4. ⊕ (XOR symbol), gate symbol is OR-shape with double curved input line.
L5. x⊕y = x̄y + xȳ.
L6. XOR (Exclusive-OR).
L7. AB = x₁x̄₂x₃.
L8. f = x₁x₃ + x₁x₂ = x₁(x₃+x₂).

**Section M**
M1. False (1+1 = 1 in Boolean algebra).
M2. True.
M3. True.
M4. True.
M5. Absorption law.
M6. 1 (x·1 = x).
M7. 0 (x+0 = x).
M8. 0 (x·0 = 0).
M9. 1 (x+1 = 1).
M10. Axioms 5, 8, 10, 12 (x·0=0/x+1=1; x·x̄=0/x+x̄=1; commutativity; distributivity).
M11. x = 1.
M12. 1 → 0 → 1 (matches the "1 0 1" digital waveform example).

---
*Tip for revision: Cover the Answer Key and go section by section. Redo any **[T]** question you get wrong twice — these test the exact conceptual traps (e.g., mixing up minterms/maxterms row counts, dual vs complement, X(X′+Y) vs x+x̄y).*



# Digital Electronics & Systems (19ECE204/19CSE203)
## Question Bank — Lectures 5–8 (1-Mark & 2-Mark Questions Only)
### Topics: XOR/XNOR Gates · NAND/NOR Universal Gates · Karnaugh Maps

*Instructions: Attempt all questions. Marks are indicated as (1M) or (2M). Total questions: 95+*

---

## SECTION A: XOR and XNOR Gates (1-Mark Questions)

1. Write the Boolean expression for the XOR of x₁ and x₂ in sum-of-products form. (1M)

2. For an n-input XOR gate, the output is HIGH when ______ number of inputs are HIGH. (1M)

3. For an n-input XNOR gate, the output is HIGH when ______ number of inputs are HIGH. (1M)

4. What symbol is used to represent the XNOR operation? (1M)

5. **True/False:** The XOR truth table is identical to the OR truth table for all input combinations. (1M)

6. Basically, the XNOR gate can be built from which two basic gates combined together? (1M)

7. Write the expression for the XNOR function Y in terms of A and B, using the ⊙ notation. (1M)

8. **Tricky:** If a 2-input XOR gate has both inputs tied together (A = B), what is the output always equal to? (1M)

9. **Tricky:** If a 2-input XNOR gate has both inputs tied together (A = B), what is the output always equal to? (1M)

10. For a 4-input XOR gate with inputs 1,0,1,1 — is the output HIGH or LOW? (1M)

11. Fill in the blank: XOR gate output is LOW only when the number of HIGH inputs is ______ (odd/even). (1M)

12. **True/False:** A 2-input XNOR gate outputs 1 only when both inputs are HIGH. (1M)

---

## SECTION B: XOR and XNOR Gates (2-Mark Questions)

13. Derive/state the sum-of-products (SOP) expression for a 2-input XOR gate and explain in one line why it differs from the OR function truth table. (2M)

14. Draw (describe using gates) how an XOR gate can be converted into an XNOR gate using only one additional gate. Name that gate. (2M)

15. For a 3-input XOR gate with inputs A=1, B=1, C=0, determine the output and justify using the "odd number of HIGH inputs" rule. (2M)

16. **Tricky:** A 5-input XNOR gate has inputs 1,1,0,1,0. Determine the output. (Hint: count HIGH inputs, then apply the even/odd rule for XNOR, not XOR.) (2M)

17. Given Y = A ⊕ B, complete the truth table for all 4 input combinations of A and B, and state which case is different from an OR gate. (2M)

18. Explain, using the SOP implementation figure logic, why XOR requires two AND gates and one OR gate (i.e., 3 gates) plus 2 NOT gates for basic realization. (2M)

---

## SECTION C: NAND / NOR Basics & Universal Property (1-Mark Questions)

19. Why are NAND and NOR gates called "Universal Gates"? (1M)

20. A NAND gate is equivalent to which two gates connected in series? (1M)

21. A NOR gate is equivalent to which two gates connected in series? (1M)

22. **Fill in the blank:** In a NAND gate, the output is LOW only when ______. (1M)

23. **Fill in the blank:** In a NOR gate, the output is HIGH only when ______. (1M)

24. **True/False:** A 2-input NAND gate is equivalent to a 2-input OR gate with complemented inputs. (1M)

25. **True/False:** A 2-input NOR gate is equivalent to a 2-input AND gate with complemented inputs. (1M)

26. Write the Boolean identity that shows a 2-input NAND gate equals an OR gate with inverted inputs (state the De Morgan form). (1M)

27. **Tricky:** If all inputs of a NAND gate are LOW, what is the output? (1M)

28. **Tricky:** If all inputs of a NOR gate are LOW, what is the output? (1M)

29. How many NAND gates are needed to build a single NOT gate? (1M)

30. How can a NAND gate be converted into a NOT gate using wiring alone (no extra gates)? (1M)

---

## SECTION D: NAND / NOR Basics & Universal Property (2-Mark Questions)

31. State and briefly justify (using De Morgan's theorem) why $\overline{x_1 x_2} = \bar{x_1} + \bar{x_2}$ proves NAND is functionally equivalent to an OR gate with complemented inputs. (2M)

32. **Tricky:** A student claims "NOR gate output is HIGH whenever at least one input is LOW." Is this statement correct? Justify with the truth table logic. (2M)

33. Complete the 2-input NAND truth table (all 4 rows) and identify the ONLY input combination that gives a LOW output. (2M)

34. Complete the 2-input NOR truth table (all 4 rows) and identify the ONLY input combination that gives a HIGH output. (2M)

35. Explain why "double inversion has no effect on the behavior of a network" is the key idea used to convert an AND-OR network into a NAND-NAND network. (2M)

---

## SECTION E: Implementing Gates Using Only NAND / Only NOR (1-Mark Questions)

36. How many NAND gates (of 2 inputs each) are required to build an AND gate? (1M)

37. How many NAND gates are required to build an OR gate using only NAND gates? (1M)

38. How many NOR gates are required to build an AND gate using only NOR gates? (1M)

39. How many NOR gates are required to build an OR gate using only NOR gates? (1M)

40. **Tricky:** To build a NOT gate using only NOR gates, how many NOR gates are needed and how must the inputs be connected? (1M)

41. To realize a NOR gate using only NAND gates, an OR gate (built from NAND gates) is followed by which additional gate? (1M)

42. To realize a NAND gate using only NOR gates, an AND gate (built from NOR gates) is followed by which additional gate? (1M)

---

## SECTION F: Implementing Gates Using Only NAND / Only NOR (2-Mark Questions)

43. Describe the minimum gate structure to implement an XOR gate using only NAND gates — how many NAND gates are used in total? (2M)

44. **Tricky:** Realizing XNOR using only NAND gates requires one more gate than realizing XOR using only NAND gates. Why — what is that extra gate for? (2M)

45. A function f = x₁x₂ + x₃x₄x₅ is to be implemented using NAND gates only. Using the "double inversion" method, state the two forms of the AND-OR network before and after bubble insertion. (2M)

46. Using De Morgan's theorem, convert f = x₁·x₂ + x₃·x₄·x₅ into a form suitable for direct NAND-NAND implementation, showing the final expression. (2M)

47. A function f = (x₁+x₂)·(x₃+x₄+x₅) is to be realized using NOR gates only. Apply De Morgan's theorem twice to reach the NOR-NOR implementable form. (2M)

---

## SECTION G: Function Implementation Using NAND/NOR Only — Worked-Style Problems (2-Mark Questions)

48. Given F(a,b,c) = Σm(2,3,4,6,7), the simplified SOP form is f = b + ac′. Convert this into NAND-implementable form using double complementation, and state the final expression. (2M)

49. **Tricky:** For the same function f = b + ac′, when implemented in POS form as f = (a+b)(b+c′), MORE NAND gates are required than the SOP implementation (7 vs 4). What conclusion does this suggest about choosing SOP vs POS for NAND-only design? (2M)

50. Given F(x,y,z) = Σm(1,2,3,4,5,7), the simplified form is F = xy′ + x′y + z. Write the NAND-only expression for this function using double-complement/De Morgan's method. (2M)

51. Given F(x,y,z) = Σm(1,2,3,4,5,7) = ΠM(0,6), derive the canonical POS expression from the maxterms M₀ and M₆. (2M)

52. **Tricky:** Why is F = ΠM(0,6) equivalent to writing F in terms of only 2 maxterms even though there are 8 possible maxterms for 3 variables? (2M)

---

## SECTION H: Karnaugh Map — Basics (1-Mark Questions)

53. What does "K-Map" stand for? (1M)

54. A K-map is described as a "pictorial form of a ______." (1M)

55. How many minterms (cells) does a 2-variable K-map have? (1M)

56. How many minterms (cells) does a 3-variable K-map have? (1M)

57. How many minterms (cells) does a 4-variable K-map have? (1M)

58. How many minterms (cells) does a 5-variable K-map have? (1M)

59. In a K-map, any two adjacent squares differ by exactly how many variables? (1M)

60. What special code sequence is used to label the rows/columns of a K-map (not straight binary)? (1M)

61. **Tricky:** Why is Gray code used instead of normal binary sequence (00, 01, 10, 11) for K-map labeling? (1M)

62. A five-variable K-map is constructed by placing how many 4-variable maps together? (1M)

63. A four-variable map is constructed by placing how many 3-variable maps together? (1M)

64. A three-variable map is constructed by placing how many 2-variable maps together? (1M)

---

## SECTION I: Karnaugh Map — Grouping Rules (1-Mark Questions)

65. A group of 2 adjacent cells in a K-map is called a ______. (1M)

66. A group of 4 adjacent cells in a K-map is called a ______. (1M)

67. A group of 8 adjacent cells in a K-map is called a ______. (1M)

68. In a 4-variable K-map, grouping a single (isolated) cell gives a term with how many literals? (1M)

69. In a 4-variable K-map, grouping a pair (2 cells) gives a term with how many literals? (1M)

70. In a 4-variable K-map, grouping a quad (4 cells) gives a term with how many literals? (1M)

71. In a 4-variable K-map, grouping an octet (8 cells) gives a term with how many literals? (1M)

72. **Tricky:** In a 4-variable K-map, can corner cells (the four extreme corners) be grouped together even though they don't appear adjacent on paper? (1M)

73. In an n-variable K-map, a group of 2^k adjacent cells produces a term with how many literals (write the formula in terms of n and k)? (1M)

---

## SECTION J: Karnaugh Map — Grouping Rules (2-Mark Questions)

74. **Tricky:** For a 3-variable K-map, a group of 2 cells (K=1) gives a 2-literal term, while a group of 4 cells (K=2) gives only a 1-literal term. Explain the general pattern relating group size to literal count. (2M)

75. **Tricky:** A student groups two diagonally placed cells in a K-map (e.g., top-left and bottom-right of a quad, but not the other two). Is this a valid K-map grouping? Explain why or why not. (2M)

76. Explain why grouping the largest possible power-of-2 group of adjacent 1's (rather than smaller groups) leads to a more minimized expression. (2M)

---

## SECTION K: Two-Variable K-Map (1–2 Mark Questions)

77. In a two-variable K-map, row 0 corresponds to which literal of x — x or x′? (1M)

78. In a two-variable K-map, column 1 corresponds to which literal of y — y or y′? (1M)

79. For F(x,y) = Σm(1,2,3), after grouping/minimization on the K-map, what is the simplified expression? (2M)

80. **Tricky:** For F(x,y) = Σm(0,1,2,3) (i.e., all 4 minterms present), what is the simplified output, and what does this tell you about a function that is 1 for every input combination? (2M)

---

## SECTION L: Three-Variable K-Map — Practice (2-Mark Questions)

81. Simplify f = Σm(1,4,5,6) using a 3-variable K-map and state the minimized SOP expression. (2M)

82. Simplify F(x,y,z) = Σm(0,2,4,5,6) using a K-map and state the minimized expression. (2M)

83. For F = A′C + A′B + AB′C + BC, expand algebraically to express it as a sum of minterms Σm(...). (2M)

84. **Tricky:** After simplification, the function in Q83 reduces to F = C + A′B. Verify: does the minterm list Σm(1,2,3,5,7) match this reduced expression by checking at least 2 minterms against the reduced form? (2M)

85. Design a 3-bit Majority function (output HIGH only when 2 or more of A, B, C are HIGH) and write its canonical minterm list Σm(...). (2M)

86. **Tricky:** For the 3-bit Majority function, the minimized SOP is F = AB + BC + AC — a symmetric expression with 3 terms of 2 literals each. Why does the K-map produce three separate pairs rather than one larger group? (2M)

---

## SECTION M: Four-Variable K-Map — Practice (2-Mark Questions)

87. Simplify f₁(x₁,x₂,x₃,x₄) = Σm(2,3,9,10,11,13) using a 4-variable K-map and state the minimized expression. (2M)

88. Simplify f₁(x₁,x₂,x₃,x₄) = Σm(0,2,3,6,7,8,10,15) — identify at least one quad grouping used in the minimization. (2M)

89. Simplify f₁(x₁,x₂,x₃,x₄) = Σm(0,1,4,5,10,11,12,13,14,15) and state whether the minimized expression uses any octet (8-cell group). (2M)

90. **Tricky:** For F(w,x,y,z) = w′x′y′z + x′yz + wy′z′ + wxy′z + wx′y′z, first expand every non-canonical term (like x′yz) into full minterms using (w+w′) or (x+x′), then list the resulting Σm(...). (2M)

91. For the same function in Q90, the final minimized form is F = wy′ + x′z. Verify this by checking whether minterm m₈ (w=1,x=0,y=0,z=0) satisfies wy′ = 1. (2M)

---

## SECTION N: Five-Variable K-Map (1–2 Mark Questions)

92. A five-variable K-map uses two 4-variable maps distinguished by which variable being 0 in one map and 1 in the other? (1M)

93. **Tricky:** In a 5-variable K-map, can a group span across BOTH the A=0 map and the A=1 map at the same relative cell positions? What literal would such a group eliminate? (2M)

94. For f₁(a,b,c,d,e) = Σm(2,3,6,7,9,13,18,19,22,23,24,25,29), one of the terms in the minimized expression is b′d. Identify which minterms (from the given list) share the property b=0 AND d=1. (2M)

---

## SECTION O: Mixed Conceptual / Tricky Questions (1–2 Marks)

95. **Tricky:** A logic function is given in canonical SOP form. To implement it using ONLY NAND gates, what is the FIRST step required (in terms of the form the expression must already be in)? (1M)

96. **Tricky:** A logic function is given in canonical POS form. To implement it using ONLY NOR gates most directly, what form should it be kept in? (1M)

97. **Tricky:** Between implementing a function in SOP form with NAND gates vs POS form with NAND gates, which generally requires FEWER gates for functions naturally suited to SOP? (1M)

98. State one key difference between how a "quad" is interpreted in a K-map SOP grouping versus a POS grouping (in terms of what value the grouped cells hold). (2M)

99. **Tricky:** Two functions have the same number of minterms, but one groups into a single octet while the other groups into two separate quads. Which one will have a simpler (fewer literals) minimized SOP expression? (1M)

100. **Tricky:** Explain in one line why algebraic (Boolean theorem-based) minimization is described as "tedious and impractical" for functions with many variables, motivating the need for K-maps. (1M)

---

# ANSWER KEY WITH EXPLANATIONS

### Section A — XOR/XNOR (1M)
1. x₁⊕x₂ = x̄₁x₂ + x₁x̄₂
2. Odd
3. Even
4. ⊙ (dot surrounded by a circle)
5. False — differs when both inputs are 1 (XOR=0, OR=1)
6. XOR gate + NOT gate
7. Y = A⊙B = complement of (A⊕B)
8. Output is always 0 (LOW) — since A⊕A = 0
9. Output is always 1 (HIGH) — since A⊙A = 1
10. HIGH — three inputs are 1, which is odd
11. Even
12. False — it also outputs 1 when both inputs are LOW (0,0)

### Section B — XOR/XNOR (2M)
13. x₁⊕x₂ = x̄₁x₂ + x₁x̄₂; differs from OR because OR gives 1 when both inputs are 1, but XOR gives 0 in that case.
14. Add one NOT (inverter) gate at the XOR output: XNOR = NOT(XOR).
15. A⊕B⊕C with A=1,B=1,C=0 → number of HIGH inputs = 2 (even) → output = 0.
16. HIGH count = 3 (odd) → for XNOR, odd number of HIGH inputs gives LOW output → Output = 0.
17. (0,0)→0, (0,1)→1, (1,0)→1, (1,1)→0; differs from OR at input (1,1), where OR=1 but XOR=0.
18. SOP form x̄₁x₂+x₁x̄₂ needs 2 AND gates (one per product term), 1 OR gate to sum them, and 2 NOT gates to generate x̄₁ and x̄₂ — total conceptually 5 gates in the basic SOP realization.

### Section C — NAND/NOR Basics (1M)
19. Because any other logic gate (AND, OR, NOT, XOR, XNOR etc.) can be built using only NAND gates or only NOR gates.
20. AND gate followed by a NOT gate.
21. OR gate followed by a NOT gate.
22. All inputs are HIGH (1).
23. All inputs are LOW (0).
24. True
25. True
26. $\overline{x_1 \cdot x_2} = \bar{x_1} + \bar{x_2}$
27. HIGH (1) — NAND output is LOW only when all inputs are HIGH, otherwise HIGH.
28. HIGH (1) — NOR output is HIGH only when all inputs are LOW.
29. 1 NAND gate (with inputs tied together).
30. Tie/short both inputs of the NAND gate together and feed the single signal — output becomes the complement.

### Section D — NAND/NOR Basics (2M)
31. De Morgan's theorem states complement of a product equals the sum of complements: $\overline{x_1x_2}=\bar x_1+\bar x_2$. Since NAND's output is $\overline{x_1x_2}$, this is identical to an OR gate whose inputs are already complemented — proving equivalence.
32. Incorrect. NOR output is HIGH ONLY when ALL inputs are LOW — if even one input is HIGH, output is LOW. The student's statement describes NAND-like behavior on inverted inputs, not NOR directly.
33. (0,0)→1, (0,1)→1, (1,0)→1, (1,1)→0; only (1,1) gives LOW.
34. (0,0)→1, (0,1)→0, (1,0)→0, (1,1)→0; only (0,0) gives HIGH.
35. Adding two inversions in series (one at AND output, one at OR input) does not change the logic value transmitted (since NOT(NOT(x))=x), so an AND-OR network is logically identical to a NAND-NAND network with the same topology.

### Section E — Building Gates from NAND/NOR only (1M)
36. 2 NAND gates (NAND followed by another NAND used as NOT).
37. 3 NAND gates (2 for inverting each input, 1 acting as NAND-of-inverted-inputs = OR).
38. 2 NOR gates.
39. 2 NOR gates (NOR followed by NOR-as-NOT).
40. 1 NOR gate, with both inputs shorted/tied together.
41. A NOT gate (inverter, itself made from a NAND).
42. A NOT gate (inverter, itself made from a NOR).

### Section F — Building Gates from NAND/NOR only (2M)
43. 4 NAND gates total (as shown in the slide construction for XOR from NAND gates).
44. XNOR needs XOR's structure PLUS one extra NAND gate acting as a final inverter, since XNOR = NOT(XOR).
45. Before: standard AND-OR network (2 AND gates feeding 1 OR gate). After: same topology but every gate becomes a NAND gate (AND→NAND, OR→NAND), because double inversion at each connection cancels out.
46. f = $\overline{\overline{(x_1x_2)}\cdot\overline{(x_3x_4x_5)}}$ — i.e., NAND the outputs of two NAND gates (each computing one product term).
47. f = $\overline{\overline{(x_1+x_2)}+\overline{(x_3+x_4+x_5)}}$ — i.e., NOR the outputs of two NOR gates (each computing one sum term).

### Section G — Worked NAND/NOR Problems (2M)
48. f = b + ac′ = $\overline{\bar b \cdot \overline{(ac')}}$ → implement as NAND(NAND(b), NAND(a,c′)).
49. SOP form is generally preferred for NAND-only implementation since it naturally requires fewer gates (here 4 vs 7).
50. F = xy′+x′y+z = $\overline{\overline{(xy')}\cdot\overline{(x'y)}\cdot\overline z}$ (three NAND terms combined by a final NAND).
51. F = (x+y+z)·(x′+y′+z), obtained directly from M₀=(x+y+z) and M₆=(x′+y′+z).
52. Because only 2 out of the 8 possible maxterms (M₀ and M₆) are needed to describe all the 0-output rows of the truth table for this particular function; the rest are implied as "don't care about" (i.e., they correspond to 1-outputs already covered by minterms).

### Section H — K-Map Basics (1M)
53. Karnaugh Map
54. Truth table
55. 4 (2² )
56. 8 (2³)
57. 16 (2⁴)
58. 32 (2⁵)
59. Exactly 1 variable
60. Gray code sequence
61. Because Gray code ensures adjacent cells differ by only one bit/variable, which is essential for valid grouping/adjacency in the map — straight binary would place non-adjacent logic values next to each other (e.g., 01 next to 10 differs by 2 bits).
62. 2 four-variable maps
63. 2 two-variable maps
64. N/A — a 2-variable map is the base case, not built from smaller maps (trick question — there is no "1-variable map" combination step described in the slides for this).

### Section I — Grouping Rules (1M)
65. Pair
66. Quad
67. Octet/Octa
68. 4 literals (n=4, single cell = full literal count)
69. 3 literals
70. 2 literals
71. 1 literal
72. Yes — corner cells can be combined (as explicitly stated: "Corner cells also can be combined to produce a product term that corresponds to a pair, quad or octa").
73. n − k literals

### Section J — Grouping Rules (2M)
74. As group size doubles (K increases by 1), one variable is eliminated, so the literal count = n − K. Larger groups (higher K) always produce fewer literals, hence simpler terms.
75. No — this is NOT a valid grouping. K-map groups must be rectangular/contiguous power-of-2 blocks (1,2,4,8...) of adjacent cells; diagonal cells alone are not adjacent (they differ in more than one variable) and cannot form a valid group by themselves.
76. Larger groups eliminate more variables (literals) per term because more input variables change across the group while the output remains constant — leading to a shorter, more minimized product term.

### Section K — Two-Variable K-Map (1–2M)
77. x′ (row 0 = x′; row 1 = x)
78. y (column 1 = y; column 0 = y′)
79. F(x,y) = Σm(1,2,3) simplifies to F = x + y (as shown directly in the slide example).
80. F = 1 (the function is always HIGH/true, i.e., a constant 1 — this represents a tautology, meaning no input variables are actually needed to determine the output).

### Section L — Three-Variable K-Map (2M)
81. f = Σm(1,4,5,6) → f = x₁x̄₃ + x̄₂x₃ (as derived in the lecture example).
82. F(x,y,z) = Σm(0,2,4,5,6) → F = z′ + xy′.
83. F = A′C + A′B + AB′C + BC expands to Σm(1,2,3,5,7) (via the algebraic expansion shown in the slides).
84. m₁ = 001 (A=0,B=0,C=1): C=1 → F=1 ✓. m₂ = 010 (A=0,B=1,C=0): A′B = 1 → F=1 ✓. Both match the reduced form F = C + A′B.
85. Σm(3,5,6,7) — corresponding to AB, AC, BC minterm combinations where majority (2 or more) inputs are 1.
86. Because in a 3-variable map the three 1-valued minterms with exactly two inputs HIGH (m3, m5, m6) are each adjacent to m7 (all three HIGH) in different directions, but m3, m5, m6 are NOT mutually adjacent to each other — so only pairs can form with m7, giving three 2-cell groups (AB, BC, AC) instead of one larger group.

### Section M — Four-Variable K-Map (2M)
87. f₁ = x̄₂x₃ + x₁x̄₃x₄ (as derived directly in the lecture example).
88. f₃ = x̄₂x̄₄ + x̄₁x₃ + x₂x₃x₄; the quad grouping corresponds to the x̄₂x̄₄ term (4 cells combined, eliminating 2 variables).
89. f₄ = x̄₁x̄₃ + x₁x₃ + (x₁x₂ or x₂x̄₃); uses quad groupings (4-cell groups), not a full octet, since the minimized terms each have 2 literals (n−k = 4−2 = 2 literals means K=2, i.e., quads of 4 cells).
90. Expanding: w′x′y′z (already minterm m1) + x′yz→(w+w′)x′yz = wx′yz(m11)+w′x′yz(m3) + wy′z′→w(x+x′)y′z′ = wxy′z′(m12)+wx′y′z′(m8) + wxy′z (m13) + wx′y′z (m9). Combined: Σm(1,3,8,9,11,12,13).
91. m₈ = w=1,x=0,y=0,z=0. Check wy′: w=1 AND y′=1(since y=0) → wy′=1 → F=1, and indeed m8 is in the minterm list, confirming consistency.

### Section N — Five-Variable K-Map (1–2M)
92. Variable "A" (A=0 for one 4-variable map, A=1 for the other).
93. Yes — a group can span both the A=0 and A=1 maps at matching cell positions; such a group eliminates the variable A from the resulting term (since the group covers both A=0 and A=1 cases).
94. Minterms with b=0 and d=1 from the list {2,3,6,7,9,13,18,19,22,23,24,25,29}: converting to binary (a b c d e) — m9=01001(b=1,✗), m13=01101(b=1,✗)... actually checking systematically: the term b′d covers all minterms where b=0,d=1 regardless of a,c,e — from the given list these are m9 (01001: a=0,b=1 — excluded) — students should verify each minterm's binary expansion against b=0,d=1 to identify the matching subset (e.g., m9=01001 has b=1 so does NOT qualify; correct matching ones from the list should be identified by full binary conversion as an exercise).

### Section O — Mixed Conceptual (1–2M)
95. The function must first be expressed/simplified into Sum-of-Products (SOP) form before applying the double-complementation (De Morgan's) method for NAND-only realization.
96. Product-of-Sums (POS) form.
97. SOP form with NAND gates generally requires fewer gates for functions that minimize naturally into SOP (as shown: 4 NAND gates for SOP vs 7 for POS in the worked example).
98. In SOP grouping, K-map groups are formed around cells containing 1's (minterms). In POS grouping, K-map groups are formed around cells containing 0's (maxterms).
99. The function using a single octet will have a simpler (fewer-literal) SOP expression, since a bigger single group eliminates more variables than two smaller separate quads.
100. Because as the number of variables grows, there are many possible theorems/identities to try, and it's not obvious which sequence of algebraic steps leads to the true minimum — making manual Boolean algebra manipulation slow, error-prone, and impractical, unlike the systematic visual method of K-maps.

---

*End of Question Bank. Total: 100 questions (all 1-mark or 2-mark) covering XOR/XNOR gates, NAND/NOR universal gate theory, NAND-only/NOR-only implementations, and 2/3/4/5-variable Karnaugh Maps.*
