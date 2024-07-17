a, b = tuple(map(int, input().split()))

# 내생각은 배열화
def jak(i):
    arr = str(i)
    hap = 0
    for i in arr:
        hap += int(i)

    if hap % 2 == 0:
        return True

def hamsu(a,b):
    hap=0
    for i in range(a, b+1):
        decision = True

        for j in range(2,i):
            if i % j == 0:
                decision = False

        if decision == True and jak(i):
            hap += 1        

    return hap

print(hamsu(a,b))

# 답지풀이 익히기