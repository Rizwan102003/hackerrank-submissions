a, b = map(int, input().split())

# First odd ≥ a
if a % 2 == 0:
    a += 1

# Last odd ≤ b
if b % 2 == 0:
    b -= 1

# Number of odd terms
n = ((b - a) // 2) + 1

# Sum of AP: n * (first + last) / 2
total = n * (a + b) // 2

print(total)
