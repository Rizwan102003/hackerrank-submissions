import sys

# Read all lines from stdin
lines = sys.stdin.read().splitlines()

# Print only even-numbered lines (1-based, so indices 1, 3, 5,... in 0-based Python)
for i in range(1, len(lines), 2):
    print(lines[i])
