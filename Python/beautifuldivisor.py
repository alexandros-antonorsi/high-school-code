beautiful = [1, 6, 28, 120, 496, 2016, 8128, 32640]
num = int(input())
for x in range(0, 8):
    if num % beautiful[7-x] == 0:
        print(beautiful[7-x])
        break
