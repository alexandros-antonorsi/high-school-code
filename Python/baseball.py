file = open("baseball.in", "r")
out = open("baseball.out", "w")
n = int(file.readline())
dists = []
for x in range(0, n):
    dists.append(int(file.readline()))
dists.sort()
r = dists[n - 1] - dists[0]
count = 0
for x in range(0, n):
    a = dists[x]
    if a <= r // 2:
        for y in range(x + 1, n):
            b = dists[y]
            max = (b - a) * 2 + b
            for z in range(y + 1, n):
                c = dists[z]
                if c < 2 * b - a:
                    continue
                if c > max:
                    break
                count += 1
    else:
        break
out.write(str(count))
out.close()

