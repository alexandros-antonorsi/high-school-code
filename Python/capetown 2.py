print("Name of file to open")
filename = input() #string
newfilename = ""
for charcount in range(0,len(filename)):
    if filename[charcount] is "\\":
        newfilename+="\\\\"
    else:
        newfilename+= filename[charcount]

def updatefile(filename):
    ...
    return newfilename

totalvolume = 0.0 #float
for x in range(0,ReadingCount):
    totalvolume += Volume[x]
print(totalvolume/ReadingCount)