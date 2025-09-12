# Read input
s = input().strip()
a, b, c, d = map(int, input().split())

# Extract slices (inclusive ranges, so +1)
first = s[a:b+1]
second = s[c:d+1]

print(first, second)
