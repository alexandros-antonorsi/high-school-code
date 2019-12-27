file = open("speeding.in", "r")
out = open("speeding.out", "w")
l1 = file.readline().split(" ")
n = int(l1[0])
m = int(l1[1])
road = [0]*100
counter = 0
for x in range(0,n):
    line = file.readline().split(" ")
    a = int(line[0])
    limit = int(line[1])
    for y in range(counter,counter+a):
        counter +=1
        road[y] = limit
counter = 0
most = 0
for x in range(0,m):
    line = file.readline().split(" ")
    a = int(line[0])
    speed = int(line[1])
    for y in range(counter, counter+a):
        counter+=1
        if(speed>road[y]):
            most = max(most, speed-road[y])
out.write(str(most))
out.close()
file.close()