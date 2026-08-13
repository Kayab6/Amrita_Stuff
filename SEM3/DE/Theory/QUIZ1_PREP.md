# DIGITAL ELECTRONICS QUIZ


DUAL
What makes it CANONICAL SOP?

This is the important part.

For canonical SOP, EVERY product term must contain EVERY variable exactly once, either complemented or uncomplemented.

COMPLIMENT

PI
EPI 



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
