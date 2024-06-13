a, b = tuple(map(int, input().split()))

def is_magic_number(n):
    return n % 3 == 0 or different_number(n)

def different_number(n):
    st = str(n)
    judgement = []

    for su in st:
        if su == '3' or su == '6' or su == '9':
            return True

cnt = 0
for i in range(a, b+1):
    if is_magic_number(i):
        cnt += 1

print(cnt)