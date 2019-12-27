conversions = ["A", "B", "C", "D", "E", "F"]


def convertdigit(hexdigit):  # converts a specific digit to binary
    arr = []
    if hexdigit in conversions:
        num = conversions.index(hexdigit) + 10
    else:
        num = int(hexdigit)
    if num >= 8:  # super inefficient way of converting denary number to binary, i forgot how to do it
        num -= 8
        arr.append(1)
    else:
        arr.append(0)
    if num >= 4:
        num -= 4
        arr.append(1)
    else:
        arr.append(0)
    if num >= 2:
        num -= 2
        arr.append(1)
    else:
        arr.append(0)
    if num >= 1:
        num -= 1
        arr.append(1)
    else:
        arr.append(0)
    return arr


def tobinary(hexnum):  # converts hex number to binary
    newnum = []
    for x in range(0, len(num)):
        dig = convertdigit(num[x])
        for y in range(0, 4):
            newnum.append(dig[y])
    return newnum


def addsum(pos, num):#calculates the sum for each parity value
    total = 0
    start = pos-1
    for x in range(1, pos+1):
        for y in range(start, len(num), pos*2):
            total += num[y]
        start += 1
    return total

line = "12EF,EVEN"

num = line[:line.index(",")]  # parses input
parity = line[(line.index(",") + 1):]

binary = tobinary(num)  # converts to binary

n = 0
while 2 ** n <= len(binary):  # inserts parity bits
    binary.insert(2 ** n - 1, 0)
    n += 1

pos = 1
while pos < len(binary):  # assign each parity bit 0 or 1
    total = addsum(pos, binary)
    if parity == "ODD":
        if total % 2 == 0:
            binary[pos-1] = 1
    if parity == "EVEN":
        if total% 2 == 1:
            binary[pos-1] = 1
    pos *= 2

n = 0
while 2 ** n < len(binary):  # prints parity bits
    print(binary[2**n - 1])
    n += 1

