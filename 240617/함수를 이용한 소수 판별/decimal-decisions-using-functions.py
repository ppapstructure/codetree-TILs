def is_prime(n):
    if n == 1:
        return False

    for i in range(2, n):
        if n % i == 0:
            return False

    return True

a, b = tuple(map(int, input().split()))

hap = 0

for data in range(a,b+1):
    if is_prime(data):
        hap += data

print(hap)