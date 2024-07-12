def plus(a, c):
    print(f'{a} + {c} = {a+c}')

def minus(a,c):
    print(f'{a} - {c} = {a-c}')

def multiple(a,c):
    print(f'{a} * {c} = {a*c}')

def divide(a,c):
    print(f'{a} / {c} = {a/c}')

a,o,c = tuple(input().split())
a = int(a)
c = int(c)
if o == '+':
    plus(a,c)
elif o == '-':
    minus(a,c)
elif o == '*':
    multiple(a,c)
elif o == '/':
    divide(a,c)
else:
    print('False')