for x in range(0, 5):
    line = input()
    digits = [None] * len(line)
    i = 0
    while i < len(line) and len(line) > 0:
        digits[i] = int(line[i])
        i += 1
    ordered = list(digits)
    ordered.sort()
    if len(digits) % 2 != 0:
        median = ordered[len(digits) // 2]
    else:
        median = (ordered[(len(digits) // 2) - 1] + ordered[(len(digits) // 2)]) / 2
    if str(median) in digits:
        posclosest = digits.find(median)
    else:
        num = int(median)
        while (num not in digits):
            num -= 1
        posclosest = digits.index(num)
    if digits[posclosest] == 0 or digits[posclosest] == 1 or digits[posclosest] == 2:
        digits[posclosest] = ordered[-1]
    elif digits[posclosest] == 3 or digits[posclosest] == 4 or digits[posclosest] == 5:
        digits[posclosest] = ordered[0]
    elif digits[posclosest] == 6 or digits[posclosest] == 7 or digits[posclosest] == 8:
        sum = 0
        for num in digits:
            sum += num
        if sum > 9:
            sum %= 10
        digits[posclosest] = sum
    else:
        digits[posclosest] = 0
    final = "".join(str(item) for item in digits if item != 0)
    print(final)
