for x in range(0, 5):
    line = input()
    vals = line.split(",")
    nums = [0] * 5
    i = 2
    for z in range(0, int(vals[1])):
        if i == 2:
            endpos = 1
        else:
            endpos = int(vals[i - 1]) + 1
        if int(vals[i]) - endpos >= 5:
            nums[4] += 1
        if int(vals[i]) - endpos >= 4:
            nums[3] += 1
        if int(vals[i]) - endpos >= 3:
            nums[2] += 1
        if int(vals[i]) - endpos >= 2:
            nums[1] += 1
        if int(vals[i]) - endpos >= 1:
            nums[0] += 1
        i += 1
    final = ",".join(str(item) for item in nums)
    print(final)
