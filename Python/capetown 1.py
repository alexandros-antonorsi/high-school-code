volume = int(input()) #integer
risenvolume = volume*2.7
numtins = risenvolume/400
if(int(numtins)<numtins):
    numtins=int(numtins+1)
tinsavailable = int(input()) #integer
if tinsavailable<numtins:
    print("Mixture won't fit")
else:
    print("Mixture will fit")