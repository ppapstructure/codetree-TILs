n, m = tuple(map(int, input().split()))

def find_g(n, m):

    # 최대공약수
    for i in range(1, min(n,m)+1):
        if n % i == 0 and m % i == 0:
            gcd = i

    # 최소공배수
    g = gcd*(n//gcd)*(m//gcd)

    print(g)

find_g(n,m)