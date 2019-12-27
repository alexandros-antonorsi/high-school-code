board = [[False] * 5]
file = open("text.txt", "r")
for line in file:
    x = 5 - int(line[0:1])
    y = int(line[3:4]) - 1
    n = int(line[-2])
    for r in range(0, 5):
        for c in range(0, 5):
            if r == x:
                if abs(c - y) <= n:
                    board[r][c] = True
            if c == y:
                if abs(x - r) <= n:
                   board[r][c] = True
    r = x - 1
    c = y - 1
    while r > -1 and c > -1:
        board[r][c] = True
        r -= 1
        c -= 1
    r = x - 1
    c = y + 1
    while r > -1 and c < 5:
        board[r][c] = True
        r -= 1
        c += 1
    r = x + 1
    c = y - 1
    while r < 5 and c > -1:
        board[r][c] = True
        r += 1
        c -= 1
    r = x + 1
    c = y + 1
    while r < 5 and c < 5:
        board[r][c] = True
        r += 1
        c += 1
    count = 0
    for r in range(0, 5):
        for c in range(0, 5):
            if not board[r][c]:
                count += 1
    print(count)
