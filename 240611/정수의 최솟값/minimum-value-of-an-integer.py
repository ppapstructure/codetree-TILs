a, b, c = tuple(map(int, input().split()))

def hamsu(a, b, c):
    result = min(a,b,c)
    return result

print(hamsu(a,b,c))