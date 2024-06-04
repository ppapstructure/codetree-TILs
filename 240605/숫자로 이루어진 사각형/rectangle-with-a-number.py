n = int(input())

def hamsu(n):
    hap = 1
    for i in range(n):
        for j in range(n):
            print(hap, end=" ")
            hap += 1
            if hap > 9:
                hap = 1
        print()

hamsu(n)