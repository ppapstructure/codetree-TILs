a,b = tuple(map(int, input().split()))


def dvide(val):
    if val % 2 == 0:
        return False
    else:
        return True

def mod(val):
    if val % 10 == 5:
        return False
    else:
        return True

def mod_3(val):
    if val % 3 == 0 and val % 9 != 0:
        return False
    else:
        return True

def on(a,b):
    result = 0

    for val in range(a, b+1):
        if (dvide(val) and mod(val) and mod_3(val)):
            result +=1
    
    return result

print(on(a,b))