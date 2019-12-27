seq = [7,20,11,6,15,7,3,4]

seq = seq[1:]
moves = 0
while len(seq) > 0:
    # delete zero + digits to left
    for x in range(len(seq) - 1, -1, -1):
        if seq[x] == 0:
            seq = seq[x + 1:]
            moves += 1
            break

    # if seq empty, end program
    if len(seq) == 0:
        break

    # sort list temporarily, then calculate median
    temp = list(seq)
    temp.sort()
    if len(seq) % 2 == 1:
        median = temp[len(temp) / 2]
    else:
        median = ((temp[len(temp) / 2]) + (temp[len(temp) / 2 - 1])) / 2

    # if not already, reduce median until it is in sequence
    # (aka largest digit smaller than median)
    while median > 0 and median not in seq:
        median -= 1

    # median is in sequence, so find rightmost occurence
    for x in range(len(seq) - 1, -1, -1):
        if seq[x] == median:
            pos = x
            break

    # now check median and reduce accordingly
    if median % 2 == 0:
        seq[pos] = seq[pos] - 2
        moves += 1
    else:
        seq[pos] = seq[pos] - 1
        moves += 1

print(moves)
