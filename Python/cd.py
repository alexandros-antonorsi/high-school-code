while True:
    numcds = input().split(" ")
    numcds[0] = int(numcds[0]); numcds[1] = int(numcds[1])
    if numcds[0] == 0 and numcds[1] == 0:
        break
    else:
        jack =[]
        jill = 0
        for x in range(0,numcds[0]):
            jack.append(int(input()))
        for y in range(0,numcds[1]):
            num = int(input())
            if num in jack:
                jill += 1
        print(jill)