queue = []
string = input()
good = True
for x in range(0,len(string)):
    if string[x] == "[" or string[x] == "(":
        queue += string[x]
    elif string[x] == "]":
        if len(queue) == 0 or queue[-1] != "[":
            good = False
        else:
            queue.pop()
    elif string[x] == ")":
        if len(queue) == 0 or queue[-1] != "(":
            good = False
        else:
            queue.pop()

if len(queue) !=0:
    good = False

if(good):
    print("yes")
else:
    print("no")



