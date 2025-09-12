from collections import Counter
import sys

# Read full input
s = sys.stdin.read().strip()

# Split into words
words = s.split()

# Count occurrences
counts = Counter(words)

# Print results (order doesn’t matter)
for word, freq in counts.items():
    print(word, freq)
