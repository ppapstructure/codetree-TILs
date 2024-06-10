n = int(input())

def calc(n):
    hap = 0
    result = 0
    for i in range(1,n+1):
        hap += i
    result = hap // 10
    return result

print(calc(n))