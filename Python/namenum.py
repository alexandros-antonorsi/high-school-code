dict = open("dict.txt", "r")
numpad = {'2':"ABC",'3':"DEF",'4':"GHI",'5':"JKL",'6':"MNO",'7':"PRS",'8':"TUV",'9':"WXY"}
names = []
f = open("namenum.in", "r")
out = open("namenum.out","w")
num = f.readline()
for name in dict:
    valid = True
    if name[-1:]=="\n":
        name = name[:-1]
    if not len(name) == len(num):
        continue
    for x in range(0,len(name)):
        let = name[x]
        if let not in numpad[num[x]]:
            valid = False
            break
    if valid:
        names.append(name)
print(names)