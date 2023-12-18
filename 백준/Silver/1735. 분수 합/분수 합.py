a,b = list(map(int,input().split(' ')))
c,d = list(map(int,input().split(' ')))

numerator = (b*c+a*d)
denominator = (b*d)

#최대공약수
def GCD(x,y):
    while y:
        x,y=y,x%y
    return x

gcd = GCD(numerator,denominator)

numerator = int(numerator/gcd)
denominator = int(denominator/gcd)

print(f'{numerator} {denominator}')

"""A/B+C/D=(A∗D+B∗C)/B∗D입니다.
해당 문제에서 중요한 점은 기약분수로 표현하는 것입니다.
기약분수는 더 이상 나눌 수 없는 분수형태로 이는 최대공약수와 밀접한 관련이 있습니다.
분모와 분자를 각각 최대공약수로 나눈 값이 곧 기약분수입니다."""
