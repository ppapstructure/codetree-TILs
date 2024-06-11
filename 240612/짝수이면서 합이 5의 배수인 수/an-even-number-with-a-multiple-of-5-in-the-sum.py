n = int(input())

def is_magic_number(n):
    a = str(n)
    su = int(a[0]) + int(a[1])

    if n % 2 == 0 and su % 5 == 0:
        return True

if is_magic_number(n):
    print("Yes")
else:
    print("No")

# 각 자리수의 합을 구하는 로직을 생각하는데 오래걸림