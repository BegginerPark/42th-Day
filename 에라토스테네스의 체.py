# 소수를 찾는 알고리즘

def is_prime(a):
    b = range(2,a) # 2 부터 a-1까지의 리스트
    c = 0
    for i in b:
        if a % i == 0:
            c += 1
    if c > 0:
        print('{}는 소수가 아니다.'.format(a))
        d = False
    else:
        print('{}는 소수이다.'.format(a))
        d = True
    return d

is_prime(31)


a = range(1,101)
prime_numbers = []
for i in a:
    c = is_prime(i)
    if c == True:
        prime_numbers.append(i)
print(prime_numbers)



# def is_prime(a):
#     b = range(2,a)
#     c = 0
#     for i in b:
#         if a % i == 0:
#             c += 1
#         if c == 0:
#             print(a,end = ' ')

# for k in range(2,101):
#     is_prime(k)



# 소수 갯수 찾기

def solution(n): 
    answer = 0 # 갯수를 담을 변수
    number = [] # n 이하의 수중 소수 파악. 소수가 아니면 -1
    for i in range(n + 1): # i 부터 찾을 값의 수 까지
        number.append(i) # n 이하의 수들을 리스트안에 넣어준다.
    for i in range(2, n + 1, 1): # 2 부터 n갯의 수까지 1개씩 증가하며 찾는다.
        if i == -1:  # 만약 i 가 -1 과 같다면
            continue # 계속 한다.
        j = 0  # 갯수를 담을 변수
        for j in range(i + i, n + 1, i): # i+i 부터 찾을 값의 수까지 i 만큼 증가 하며 반복
            number[j] = -1 # 소수가 아닌 방에는 -1을 담는다.
    for i in range(2, n + 1): # 2 부터 찾을값의 수까지 반복
        if number[i] != -1: # 만약 그방의 숫자가 -1 가 아니면
            answer += 1  # answer 에 1을 추가 
    return answer # 결과 출력

print(solution(31))


### n 이하의 수중 소수 모두 출력

def solution(n): 
    answer = 0 # 갯수를 담을 변수
    number = [] # n 이하의 수중 소수 파악. 소수가 아니면 -1
    find = []
    for i in range(n + 1): # i 부터 찾을 값의 수 까지
        number.append(i) # n 이하의 수들을 리스트안에 넣어준다.
    for i in range(2, n + 1, 1): # 2 부터 n갯의 수까지 1개씩 증가하며 찾는다.
        if i == -1:  # 만약 i 가 -1 과 같다면
            continue # 계속 한다.
        j = 0  # 갯수를 담을 변수
        for j in range(i + i, n + 1, i): # i+i 부터 찾을 값의 수까지 i 만큼 증가 하며 반복
            number[j] = -1 # 소수가 아닌 방에는 -1을 담는다.
    for i in range(2, n+1):
        if number[i] != -1:
            find.append(i)
    return find # 결과 출력

print(solution(10))