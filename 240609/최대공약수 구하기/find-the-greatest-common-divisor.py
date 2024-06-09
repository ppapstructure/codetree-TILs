# 내 풀이
'''
n, m = tuple(map(int, input().split()))

def hamsu(n,m):
    a_list = []
    b_list = []

    for i in range(1,n+1):
        if n % i == 0:
            a_list.append(i)
    
    for j in range(1, m+1):
        if m % j == 0:
            b_list. append(j)

    result = 1

    for a in a_list:
        for b in b_list:
            if a == b:
                result = a

    print(result)

hamsu(n,m)
'''

## 답지보고 다시 따라 써봐야 겠다
n, m = tuple(map(int, input().split()))

def find_gcd(n, m):
    gcd = 0
    for i in range(1, min(n,m) + 1):
        if n % i == 0 and m % i == 0:
            gcd = i
    print(gcd)

find_gcd(n,m)