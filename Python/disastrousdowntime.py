# have a list of all the times, goal is to find maximum amount of programs running
# concurrently, then you divide by amount of requests 1 server can handle (and
# then add 1 if %k!=0, aka theres some requests left over)
# to find this, you have the list ordered least to greatest,
line = input().split(" ")
n = int(line[0])
k = int(line[1])
times = []
for x in range(0, n):
    times.append(int(input()))
max = 1
a = len(times)
for x in range(0, a - 1):
    concurrent = 1
    time = times[x]
    i = x + 1
    while i<a and times[i] < time + 1000:
        concurrent += 1
        i += 1
    if concurrent > max:
        max = concurrent

if max%k!=0:
    print(max//k+1)
else:
    print(max//k)
