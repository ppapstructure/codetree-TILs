y = int(input())

def is_yoon_nyeon(n):
    if n % 4 == 0:
        if n % 100 == 0 and n % 400 != 0:
            return False
        return True
    else:
        return False

if is_yoon_nyeon(y):
    print('true')
else:
    print('false')